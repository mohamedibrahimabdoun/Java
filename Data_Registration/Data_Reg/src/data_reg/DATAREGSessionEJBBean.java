package data_reg;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.sql.Timestamp;

import java.util.List;

import javax.ejb.Stateless;

import javax.jws.WebParam;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "DATAREGSessionEJB",
           mappedName = "Data_Registration-Data_Reg-DATAREGSessionEJB")
public class DATAREGSessionEJBBean implements DATAREGSessionEJB {
    @PersistenceContext(unitName = "Data_Reg")
    private EntityManager em;

    public DATAREGSessionEJBBean() {
    }

    public Registration persistRegistration(Registration registration) {
        em.persist(registration);
        return registration;
    }

    /** <code>select o from Registration o</code> */
    public List<Registration> getRegistrationFindAll() {
        return em.createNamedQuery("Registration.findAll").getResultList();
    }

    public String UploadImage(byte[] img, String img_path) throws IOException {
        try {
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


    public String Save(String firstName, String secondName, String thirdName,
                       String lastName, String name, String imageName,
                       String imagePath, String msisdn, String imsi,
                       Long idType, byte[] img) {
        String msg = null;
        try {
            if (img.length != 0) {

                Registration reg = new Registration();
                reg.setFirstName(firstName);
                reg.setSecondName(secondName);
                reg.setThirdName(thirdName);
                reg.setLastName(lastName);
                reg.setMsisdn(msisdn);
                reg.setImsi(imsi);
                reg.setIdType(idType);
                String vname =
                    reg.getFirstName() + " " + reg.getSecondName() + " " +
                    reg.getThirdName() + " " + reg.getLastName();
                reg.setName(vname);
                String imgName = reg.getImsi() + "_" + reg.getMsisdn();
                reg.setImageName(imgName);
                String imgPath =
                    //"C:/imgs/" + imageName + ".PNG";
                    "/export/home/weblogic/imgs/" + imageName + ".jpg";
                reg.setImagePath(imgPath);
                reg.setImage(img);


                String Result;
                try {
                    Result = UploadImage(img, imgPath);
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


}
