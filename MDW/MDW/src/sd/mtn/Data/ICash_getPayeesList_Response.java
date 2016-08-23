package sd.mtn.Data;

public class ICash_getPayeesList_Response {
    private String UUID;
    private String tranDateTime;
    private String applicationid;
    private String responseStatus;
    private String responseMessage;
    private String responseCode;

    public ICash_getPayeesList_Response() {
        super();
    }
  String Payees;
   
  
  public void setPayees(String Payees) {
    this.Payees = Payees;
  }

  public String getPayees() {
    return Payees;
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
    return UUID;
  }
  
}
