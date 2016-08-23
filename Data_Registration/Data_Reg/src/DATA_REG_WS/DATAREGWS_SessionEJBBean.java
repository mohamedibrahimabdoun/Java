package DATA_REG_WS;

import data_reg.DATAREGSessionEJB;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Hashtable;

import javax.ejb.Stateless;

import javax.jws.WebParam;
import javax.jws.WebService;

import javax.naming.Context;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "DATAREGWS_SessionEJB",
           mappedName = "OLD_Data_Registration-Data_Reg-DATAREGWS_SessionEJB")
@WebService(name = "DataRegistrationWebService",
            serviceName = "DataRegistrationWebService",
            targetNamespace = "http://tempuri.org/",
            portName = "DataRegistrationWebServicePort")
public class DATAREGWS_SessionEJBBean implements DATAREGWS_SessionEJB {
    @PersistenceContext(unitName = "Data_Reg")
    private EntityManager em;

    public DATAREGWS_SessionEJBBean() {
    }


    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "weblogic.jndi.WLInitialContextFactory");
        env.put(Context.PROVIDER_URL, "t3://localhost:7001");
        return new InitialContext(env);
    }


    public String SaveData(@WebParam(name = "FISRTNAME")
        String firstName, @WebParam(name = "SECONDNAME")
        String secondName, @WebParam(name = "THIRDNAME")
        String thirdName, @WebParam(name = "LASTNAME")
        String lastName, @WebParam(name = "IMAGENAME")
        String imageName, @WebParam(name = "MSISDN")
        String msisdn, @WebParam(name = "IMSI")
        String imsi, @WebParam(name = "IDTYPE")
        Long idType, @WebParam(name = "myarry")
        byte[] img) {
        String res = null;

        String imgPath = "/export/home/weblogic/imgs/" + imageName + ".PNG";
        String fullname =
            firstName + " " + secondName + " " + thirdName + " " + lastName;
        try {
            final Context context = getInitialContext();
            DATAREGSessionEJB dATAREGSessionEJB =
                (DATAREGSessionEJB)context.lookup("Data_Registration-Data_Reg-DATAREGSessionEJB#data_reg.DATAREGSessionEJB");
            res =
dATAREGSessionEJB.Save(firstName, secondName, thirdName, lastName, fullname,
                       imageName, imgPath, msisdn, imsi, idType, img);

        } catch (Exception ex) {
            res = ex.getMessage();

        }
        return res;
    }
}
