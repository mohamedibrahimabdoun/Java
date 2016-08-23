package mtn.salescare.beans;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface NtcRegistrationSegmentSessionEJB {
    NtcRegistration persistNtcRegistration(NtcRegistration ntcRegistration);

    NtcRegistration mergeNtcRegistration(NtcRegistration ntcRegistration);

    List<NtcRegistration> getNtcRegistrationFindAll();
    
  public String IsRegistered (String MSISDN); 
  public int UpdateSegment(String MSISDN);
  
  public String ValidateMSISDN_Vs_Serail(String msisdn,String Serial_PUK);
  
  public String CheckSResitrationStatus(String MSISDN);
}
