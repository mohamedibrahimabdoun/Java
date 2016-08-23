package Data_Registration;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface NtcRegistrationSegmentSessionEJBBean {
    NtcRegistrationSegment persistNtcRegistrationSegment(NtcRegistrationSegment ntcRegistrationSegment);

    NtcRegistrationSegment mergeNtcRegistrationSegment(NtcRegistrationSegment ntcRegistrationSegment);

    List<NtcRegistrationSegment> getNtcRegistrationSegmentFindAll();
    
  public String IsRegistered (String MSISDN); 
  public int UpdateSegment(String MSISDN);
  
  public String ValidateMSISDN_Vs_Serail(String msisdn,String Serial_PUK);
  
  public String CheckSResitrationStatus(String MSISDN);

}
