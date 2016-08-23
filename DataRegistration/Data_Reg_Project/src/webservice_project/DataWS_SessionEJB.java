package webservice_project;

import java.io.IOException;

import javax.ejb.Remote;

@Remote
public interface DataWS_SessionEJB {
    
  public String UploadImg(byte[] img,String img_path)  throws IOException;
  public String Save(String firstName,String secondName , String thirdName, String lastName,
                  String name,String imageName ,String imagePath,String msisdn,
                 String imsi ,Long idType,byte[] img);
}
