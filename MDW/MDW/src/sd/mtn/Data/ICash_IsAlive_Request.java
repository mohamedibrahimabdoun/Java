package sd.mtn.Data;

public class ICash_IsAlive_Request {
    String applicationid="" ;
  String UUID="" ;
    String tranDateTime="" ;

 
    
    public ICash_IsAlive_Request() {
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
