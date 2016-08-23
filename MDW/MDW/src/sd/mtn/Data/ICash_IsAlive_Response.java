package sd.mtn.Data;

public class ICash_IsAlive_Response {
    String Response;
    public ICash_IsAlive_Response() {
        super();
    }
  String applicationid ;
  String tranDateTime ;
  String UUID ;
  String responseCode;
  String responseMessage;
  String responseStatus;
  
  public void setResponse(String Response) {
    this.Response = Response;
  }

  public String getResponse() {
    return Response;
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


}
