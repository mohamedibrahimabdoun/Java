package Data_RegistrationWS;

import DataRegistration.Registration;

import DataRegistration.Types;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface DataRegistSessionEJB {
    Registration persistRegistration(Registration registration);

    Registration mergeRegistration(Registration registration);

    List<Registration> getRegistrationFindAll();
    
    List<Types> getTypesFindAll();
    public String SaveData(String NAME,String MSISDN , String ADDRESS, String SERAIL,
                String FrontImageName,   String BackImageName ,
                String IMSI ,Long idType,byte[] FrontImage,byte[] BackImage);
}
