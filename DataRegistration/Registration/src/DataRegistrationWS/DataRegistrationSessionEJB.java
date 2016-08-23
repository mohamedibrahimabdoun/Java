package DataRegistrationWS;

import Data_Registration.NtcRegistration;

import Data_Registration.Types;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface DataRegistrationSessionEJB {
    NtcRegistration persistNtcRegistration(NtcRegistration ntcRegistration);

    NtcRegistration mergeNtcRegistration(NtcRegistration ntcRegistration);

    List<NtcRegistration> getNtcRegistrationFindAll();
    
    List<Types> getTypesFindAll();
  
    public String IsRegistered (String MSISDN,String SERAIL); 
   
    public String SaveData(String NAME,String MSISDN , String ADDRESS, String SERAIL,
              String FrontImageName,   String BackImageName ,
              String IMSI ,Long idType,byte[] FrontImage,byte[] BackImage,byte[] SignatureImage,String SOURCE,String CustomerID,String NewSIM);
    public int getMaxLimit();
}
