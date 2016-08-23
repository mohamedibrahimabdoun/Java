package sd.mtn.Data;

public class ICash_getBill_Response {
    
    String Response ;
    private String responseCode;
    private String responseMessage;
    private String responseStatus;
    private String mbr;
    private String authenticationType;
    private String paymentInfo;
    private String payeeId;
    private String IPIN;
    private String PAN;
    private String expDate;
    private String entityType;
    private String entityId;
    private String userPassword;
    private String userName;
    private String UUID;
    private String tranDateTime;
    private String applicationid;
    private String balance;
    private String issuerTranFee;
    private String billInfo;
    private String acqTranFee;

    public ICash_getBill_Response() {
        super();
    }
  public void setresponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public String getresponseCode() {
    return responseCode;
  }
  
  
  public void setresponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  public String getresponseMessage() {
    return responseMessage;
  }
  
  public void setresponseStatus(String responseStatus) {
    this.responseStatus = responseStatus;
  }

  public String getresponseStatus() {
    return responseStatus;
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
      this.expDate = expDate;
  }

  public String getexpDate() {
      return expDate;}
  public void setIPIN(String IPIN) {
      this.IPIN = IPIN;
  }

  public String getIPIN() {
      return IPIN;
  }
    
    
  public void setpayeeId(String payeeId) {
      this.payeeId = payeeId;
  }

  public String getpayeeId() {
      return payeeId;
  }
    
  public void setpaymentInfo(String paymentInfo) {
      this.paymentInfo = paymentInfo;
  }

  public String getpaymentInfo() {
      return paymentInfo;}
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
  
  public void setissuerTranFee(String issuerTranFee) {
      this.issuerTranFee = issuerTranFee;
  }

  public String getissuerTranFee() {
      return issuerTranFee;}
  public void setacqTranFee(String acqTranFee) {
      this.acqTranFee = acqTranFee;
  }

  public String getacqTranFee() {
      return acqTranFee;
  }
    
    
  public void setbalance(String balance) {
      this.balance = balance;
  }

  public String getbalance() {
      return balance;
  }
  
    
  public void setbillInfo(String balance) {
      this.billInfo = billInfo;
  }

  public String getbillInfo() {
      return billInfo;
  }
   
  
}
