package sd.mtn.Billing;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface TabsSessionEJB {
    List<CrmUserEquipments> getCrmUserEquipments(String p_subno);
    
  public List<CcmGetData> getCcmGetData(String p_subno);
  
  public List<VwMdwPospaidBasciinfo> getPostpaidBasicInfo(String p_subno);
  

}
