package sd.mtn.Data;

public class ICash_reverse_Request {
    
  String applicationid ;
  String tranDateTime ;
  String UUID ;
  String originalTranUUID ;
  String originalTranDateTime ;
    
    public ICash_reverse_Request() {
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
      return UUID;}
    
    
  public void setoriginalTranUUID(String originalTranUUID) {
      this.originalTranUUID = originalTranUUID;
  }

  public String getoriginalTranUUID() {
      return originalTranUUID;
  }
    
    
  public void setoriginalTranDateTime(String originalTranDateTime) {
      this.originalTranDateTime = originalTranDateTime;
  }

  public String getoriginalTranDateTime() {
      return originalTranDateTime;
  }
}
