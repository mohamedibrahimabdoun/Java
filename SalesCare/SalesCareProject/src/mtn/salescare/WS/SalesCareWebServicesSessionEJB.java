package mtn.salescare.WS;

import java.util.List;

import javax.ejb.Remote;

import mtn.salescare.beans.NtcRegistration;
import mtn.salescare.beans.Types;
import mtn.salescare.ServicesClass.Electricity;
import mtn.salescare.ServicesClass.Resultset;
import mtn.salescare.ServicesClass.Services;
import mtn.salescare.ServicesClass.Tree;

@Remote
public interface SalesCareWebServicesSessionEJB {
    NtcRegistration persistNtcRegistration(NtcRegistration ntcRegistration);

    NtcRegistration mergeNtcRegistration(NtcRegistration ntcRegistration);

    List<NtcRegistration> getNtcRegistrationFindAll();
    
  //=============================   Sales Care Serivces Web methods
    
  public String activation(String sender, String subno, String puk);

  public String transfer(String sender, String msgstr);

  public Electricity purchase(String msisdn, String txt);

  public  Services Get_PERMISSION(String imsi, String pin);

  public List<Resultset> Get_RecieversReport(String sender, String fromdate,
                                             String top);
  public String IsRegistered (String MSISDN,String SERAIL); 
  
  public List<Tree> Get_Recievers(String sender);

  public String Get_LoginResult(String imsi, String pin);
  
  public int Get_TP_PERMISSION (String username, String password);
    
  //=============================   Data Registration Web methods
  public List<Types> getTypesFindAll();
  
  public String SaveData(String NAME, String MSISDN, String ADDRESS,
                             String SERAIL, String FrontImageName,
                             String BackImageName, String IMSI, Long idType,
                             byte[] FrontImage, byte[] BackImage,String SOURCE,String latitude,String longitude,String IMEI, String IDNUMBER, byte[] VIDEO,String IP_ADDRESS, String SENDER);
}
