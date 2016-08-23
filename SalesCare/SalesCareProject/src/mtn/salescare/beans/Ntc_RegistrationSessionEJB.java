package mtn.salescare.beans;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface Ntc_RegistrationSessionEJB {
    NtcRegistration persistNtcRegistration(NtcRegistration ntcRegistration);

    NtcRegistration mergeNtcRegistration(NtcRegistration ntcRegistration);

    public List<Types> getTypesFindAll();

    List<NtcRegistration> getNtcRegistrationFindAll();

    public String SaveData(String NAME, String MSISDN, String ADDRESS,
                           String SERAIL, String FrontImageName,
                           String BackImageName, String IMSI, Long idType,
                           byte[] FrontImage, byte[] BackImage, String SOURCE,
                           long status,String latitude,String longitude,String IMEI, String IDNUMBER, byte[] VIDEO, String IP_ADDRESS,String SENDER);
    
  public String transfer_vtu(String sender, String msgstr);
}
