package data_reg;

import java.io.IOException;

import java.sql.Timestamp;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface DATAREGSessionEJB {
    Registration persistRegistration(Registration registration);

    List<Registration> getRegistrationFindAll();
    public String UploadImage(byte[] img, String img_path) throws IOException;
    public String Save(String firstName,String secondName , String thirdName, String lastName,
                  String name,String imageName ,String imagePath,String msisdn,
                  String imsi ,Long idType,byte[] img);

}
