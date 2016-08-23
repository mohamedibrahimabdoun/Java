package DataRegistration;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface RegistrationSessionEJB {
    Registration persistRegistration(Registration registration);

    Registration mergeRegistration(Registration registration);

    void removeRegistration(Registration registration);

    List<Registration> getRegistrationFindAll();
    
  public String SaveData(String NAME,String MSISDN , String ADDRESS, String SERAIL,
                String FrontImageName,   String BackImageName ,
                String IMSI ,Long idType,byte[] FrontImage,byte[] BackImage);
}
