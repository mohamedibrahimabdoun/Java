package sd.mtn.Billing;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface DirectTabsSessionEJB {
    List<CrmUserInfo> getCrmUserInfoFindAll();
    
  public int changepostpaidLang(String p_subno,String p_lang);

}
