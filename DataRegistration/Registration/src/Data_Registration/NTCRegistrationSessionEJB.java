package Data_Registration;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface NTCRegistrationSessionEJB {
    NtcRegistration persistNtcRegistration(NtcRegistration ntcRegistration);

    NtcRegistration mergeNtcRegistration(NtcRegistration ntcRegistration);

    void removeNtcRegistration(NtcRegistration ntcRegistration);

    List<NtcRegistration> getNtcRegistrationFindAll();
    
  public String SaveData(String NAME, String MSISDN, String ADDRESS,
                             String SERAIL, String FrontImageName,
                             String BackImageName, String IMSI, Long idType,
                             byte[] FrontImage, byte[] BackImage,byte[] SignatureImage,String SOURCE,long status,String CustomerID,String NewSIM);
  
}
