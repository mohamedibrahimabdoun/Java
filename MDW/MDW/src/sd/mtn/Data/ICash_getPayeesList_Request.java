package sd.mtn.Data;

public class ICash_getPayeesList_Request {
  String applicationid ;
  String tranDateTime ;
  String UUID ;
  
  
  public ICash_getPayeesList_Request() {
      super();
  }
  
  
  public void setapplicationid(String applicationid) {
    this.applicationid = applicationid;
  }

  public String getapplicationid() {
    return applicationid;
  }
  
  
  public void settranDateTime(String tranDateTime) {
    this.tranDateTime = tranDateTime;
  }

  public String gettranDateTimed() {
    return tranDateTime;
  }
  
  public void setUUID(String UUID) {
    this.UUID = UUID;
  }

  public String getUUID() {
    return UUID;
  }
}
