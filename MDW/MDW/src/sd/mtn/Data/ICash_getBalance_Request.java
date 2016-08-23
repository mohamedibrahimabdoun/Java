package sd.mtn.Data;

public class ICash_getBalance_Request {
    public ICash_getBalance_Request() {
        super();
    }
    
    
    
  String applicationid ;
  String tranDateTime ;
  String UUID ;
  String userName ;
  String userPassword ;
  String entityId ;
  String entityType ;
  String PAN ;
  String mbr ;
  String expDate ;
  String IPIN ;
 
  String authenticationType ;
  String tranCurrency;
  
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
  
  
  public void setuserName(String userName) {
  this.userName = userName;
  }

  public String getuserName() {
  return userName;
  }
  
  
  public void setuserPassword(String userPassword) {
  this.userPassword = userPassword;
  }

  public String getuserPassword() {
  return userPassword;
  }
  
  public void setentityId(String entityId) {
  this.entityId = entityId;
  }

  public String getentityId() {
  return entityId;}
  
  public void setentityType(String entityType) {
  this.entityType = entityType;
  }

  public String getentityType() {
  return entityType;
  }
  
  
  public void setPAN(String PAN) {
  this.PAN = PAN;
  }

  public String getPAN() {
  return PAN;
  }
  
  public void setexpDate(String expDate) {
  this.PAN = expDate;
  }

  public String getexpDate() {
  return expDate;}
  public void setIPIN(String IPIN) {
  this.IPIN = IPIN;
  }

  public String getIPIN() {
  return IPIN;
  }
  
  
 
 
  public void setauthenticationType(String authenticationType) {
  this.authenticationType = authenticationType;
  }

  public String getauthenticationType() {
  return authenticationType;
  }
  
  
  public void setmbr(String mbr) {
  this.mbr = mbr;
  }

  public String getmbr() {
  return mbr;
  }
  
  public void settranCurrency(String tranCurrency) {
  this.tranCurrency = tranCurrency;
  }

  public String gettranCurrency() {
  return tranCurrency;}
 
  
  
    
}
