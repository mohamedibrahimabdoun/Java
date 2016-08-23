package webservice_project;

import data_reg_project.RegSessionEJB;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;

import java.util.Hashtable;

import javax.ejb.Stateless;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import javax.jws.WebService;

import javax.naming.Context;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "DataWS_SessionEJB",
           mappedName = "DataRegistration-Data_Reg_Project-DataWS_SessionEJB")
@WebService(name = "DataRegWS_Service", serviceName = "DataRegWS_Service",
            targetNamespace = "http://tempuri.org/",
            portName = "DataRegWS_ServicePort")
public class DataWS_SessionEJBBean implements DataWS_SessionEJB {
    @PersistenceContext(unitName = "Data_Reg_Project")
    private EntityManager em;

    public DataWS_SessionEJBBean() {
    }


    @WebMethod
    public String UploadImg(byte[] img, String img_path) throws IOException {
        try {
            // img_path= "C:/ID_IMAGES/" + registration.getImageName() + ".png";
            File myfile = new File(img_path);
            BufferedOutputStream bos = null;
            FileOutputStream fos = new FileOutputStream(myfile);
            bos = new BufferedOutputStream(fos);
            bos.write(img);
            bos.flush();
            bos.close();
            return "success";
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }

    }

    @WebMethod
    public String Save(@WebParam(name = "FISRTNAME")
        String firstName, @WebParam(name = "SECONDNAME")
        String secondName, @WebParam(name = "THIRDNAME")
        String thirdName, @WebParam(name = "LASTNAME")
        String lastName, @WebParam(name = "NAME")
        String name, @WebParam(name = "IMAGENAME")
        String imageName, @WebParam(name = "IMAGEPATH")
        String imagePath, @WebParam(name = "MSISDN")
        String msisdn, @WebParam(name = "IMSI")
        String imsi, @WebParam(name = "IDTYPE")
        Long idType, @WebParam(name = "myarry")
        byte[] img) {
        String msg = null;
        final Context context;

        try {
            context = getInitialContext();
            RegSessionEJB regSessionEJB =
                (RegSessionEJB)context.lookup("DataRegistration-Data_Reg_Project-RegSessionEJB#data_reg_project.RegSessionEJB");
            // RegSessionEJB regSessionEJB2 =(RegSessionEJB)context.lookup("DataRegistration-Data_Reg_Project-RegSessionEJB#data_reg_project.RegSessionEJB");

            long idtype = 1L;
            msg =
                regSessionEJB.Save(firstName, secondName, thirdName, lastName, name, imageName,
                   imagePath, msisdn, imsi, idType, img);

        } catch (NamingException e) {

        }
        return msg;
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "weblogic.jndi.WLInitialContextFactory");
        env.put(Context.PROVIDER_URL, "t3://172.17.10.25:7001");
        // env.put(Context.PROVIDER_URL, "t3://172.17.10.25:7001");
        return new InitialContext(env);
    }
}
