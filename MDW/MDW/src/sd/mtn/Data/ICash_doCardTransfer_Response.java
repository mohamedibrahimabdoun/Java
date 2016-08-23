package sd.mtn.Data;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class ICash_doCardTransfer_Response {
    private String balance;
    private String tranAmount;
    private String tranCurrency;
    private String mbr;
    private String issuerTranFee;
    private String acqTranFee;
    private String fromAccountType;
    private String toCard;
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
    private String responseStatus;
    private String responseMessage;
    private String responseCode;
    private String availablebalance;

    public ICash_doCardTransfer_Response() {
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
  public void setbalance(String balance) {
   String fullbalance = balance;
           JSONObject json = null ; 
       try {
             json =  new JSONObject(fullbalance);
        } catch (JSONException e) {
        }
        
      try {
            String availablebalance = json.getString("available");


            this.setavailablebalance(availablebalance);

            String Ledgerbalance = json.getString("ledger");
        } catch (JSONException e) {
      }
      
    }

  public void setavailablebalance(String availablebalance) {
  this.availablebalance = availablebalance;
  }
  public String getbalance() {
    return balance;
  }
  
  public void setapplicationid(String applicationid) {
  this.applicationid = applicationid;
  }
  
  

  public String getapplicationid() {
  return applicationid;
  }
  public String getavailablebalance() {
  return availablebalance;
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
  
  
  public void settoCard(String toCard) {
  this.toCard = toCard;
  }

  public String gettoCard() {
  return toCard;
  }
  
  public void setfromAccountType(String fromAccountType) {
  this.fromAccountType = fromAccountType;
  }

  public String getfromAccountType() {
  return fromAccountType;}
  public void setacqTranFee(String acqTranFee) {
  this.acqTranFee = acqTranFee;
  }

  public String getacqTranFee() {
  return acqTranFee;
  }
  
  public void setissuerTranFee(String issuerTranFee) {
  this.issuerTranFee = issuerTranFee;
  }

  public String getissuerTranFee() {
  return issuerTranFee;
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
  public void settranAmount(String tranAmount) {
  this.tranAmount = tranAmount;
  }

  public String gettranAmount() {
  return tranAmount;
  }
  
}
