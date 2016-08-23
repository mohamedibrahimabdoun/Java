package sd.mtn.Data;

public class ICash_reverse_Response {
    private String responseStatus;
    private String responseMessage;
    private String responseCode;
    private String originalTranDateTime;
    private String originalTranUUID;
    private String UUID;
    private String tranDateTime;
    private String applicationid;

    public ICash_reverse_Response() {
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

