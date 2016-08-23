package data_reg_project;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.sql.Timestamp;

import java.util.List;

import javax.ejb.Stateless;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "RegSessionEJB",
           mappedName = "DataRegistration-Data_Reg_Project-RegSessionEJB")
@WebService(name = "DataRegService", serviceName = "DataReg_WebService",
            targetNamespace = "http://tempuri.org/",
            portName = "DataReg_WebServicePort")
public class RegSessionEJBBean implements RegSessionEJB {
    @PersistenceContext(unitName = "Data_Reg_Project")
    private EntityManager em;

    public RegSessionEJBBean() {
    }

    @WebMethod(exclude = true)
    public Registration persistRegistration(Registration registration) {
        em.persist(registration);
        return registration;
    }

    /** <code>select o from Registration o</code> */
    @WebMethod(exclude = true)
    public List<Registration> getRegistrationFindAll() {
        return em.createNamedQuery("Registration.findAll").getResultList();
    }


    @WebMethod
    public String UploadImg(byte[] img, String img_path) throws IOException {
        try {
            // Registration registration=new Registration();
            // img_path= "C:/ID_IMAGES/" + registration.getImageName() + ".png";
            //  registration.setImagePath(img_path);
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

    @WebMethod(action = "Save")
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
        try {
            if (img.length != 0) {
                Registration reg = new Registration();
                reg.setFirstName(firstName);
                reg.setSecondName(secondName);
                reg.setThirdName(thirdName);
                reg.setLastName(lastName);
                reg.setName(name);
                reg.setMsisdn(msisdn);
                reg.setImsi(imsi);
                reg.setIdType(idType);
                String vname =
                    reg.getFirstName() + " " + reg.getSecondName() + " " +
                    reg.getThirdName() + " " + reg.getLastName();
                reg.setName(vname);
                imageName = reg.getImsi() + "_" + reg.getMsisdn();
                reg.setImageName(imageName);

                String imgPath =
                    "/export/home/weblogic/imgs/" + imageName + ".PNG";
                reg.setImagePath(imgPath);
                String Result;
                try {
                    Result = UploadImg(img, imgPath);
                    if (Result == "success") {
                        em.persist(reg);
                        msg = "Data Saved";
                    } else
                        return Result;
                } catch (IOException e) {
                    msg = e.getMessage();
                }
            } else
                msg = "Please Take picture First";
        } catch (NullPointerException e) {
            msg = "Please Take Picture First";

        } catch (Exception x) {
            msg = x.getMessage();
        }

        return msg;
    }

    @WebMethod(exclude = true)
    public String UploadImage(byte[] img, String img_path, String img_name) {

        return "Null";
    }
}

  // public String Upload(byte[] img,Registration registration);
   /* public String Upload(byte[] img,
                         Registration registration) throws IOException {
        try {
            String path = "c:/imgs/" + registration.getImageName() + ".png";
            registration.setImagePath(path);
            File myfile = new File();
            BufferedOutputStream bos = null;
            FileOutputStream fos = new FileOutputStream(myfile);
            bos = new BufferedOutputStream(fos);
            bos.write(img);
            bos.flush();
            bos.close();
            em.persist(registration);

        } catch (FileNotFoundException e) {
        }
        return null;
    } */
