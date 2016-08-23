package sd.mtn.Data;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class ICash_payment_Response {
    private String fromAccountType;
    private String tranAmount;
    private String tranCurrency;
    private String mbr;
    private String issuerTranFee;
    private String acqTranFee;
    private String balance;
    private String paymentInfo;
    private String payeeId;
    private String IPIN;
    private String expDate;
    private String entityType;
    private String PAN;
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
    private String customerName;
    private String unitsInKWh;
    private String  waterFees;
    private String  opertorMessage;
    private String  meterFees;
    private String token;
    private String accountNo;
    private String meterNumber;
    private String netAmount;
   private String ReceiptNo;
 
    public ICash_payment_Response() {
        super();
    }
    
  String billInfo;
   
  public void setcustomerName(String customerName) {
  this.customerName = customerName;
  }
  
  
  public void setReceiptNo(String ReceiptNo) {
  this.ReceiptNo = ReceiptNo;
  }
  public void setunitsInKWh(String unitsInKWh) {
  this.unitsInKWh = unitsInKWh;
  } 

  public void setwaterFees(String waterFees) {
  this.waterFees = waterFees;
  } 
  public void setopertorMessage(String opertorMessage) {
  this.opertorMessage = opertorMessage;
  } 
  public void setmeterFees(String meterFees) {
  this.meterFees = meterFees;
  } 
  public void settoken(String token) {
  this.token = token;
  }
  
 
  
  public void setmeterNumber(String meterNumber) {
  this.meterNumber = meterNumber;
  }
  public void setaccountNo(String accountNo) {
  this.accountNo = accountNo;
  }
  public void setnetAmount(String netAmount) {
  this.netAmount = netAmount;
  }
  public void setbillInfo(String billInfo)  {
     String fullbillInfo = billInfo;
    JSONObject json = null ; 
        try {
              json =  new JSONObject(fullbillInfo);
         } catch (JSONException e) {
         }


        try {
            if(json.getString("customerName") != null){
       try {
          customerName = json.getString("customerName");
             this.setcustomerName(customerName);

                    } catch (JSONException e) {
       }}
        } catch (JSONException e) {
        }
        try {
            if(json.getString("unitsInKWh") != null){
    try {
       unitsInKWh = json.getString("unitsInKWh");
          this.setunitsInKWh(unitsInKWh);
                 } catch (JSONException e) {
    }}
        } catch (JSONException e) {
        }

        try {
            if(json.getString("waterFees") != null){
    try {
       waterFees = json.getString("waterFees");
          this.setwaterFees(waterFees);
                 } catch (JSONException e) {
    }}
        } catch (JSONException e) {
        }
        try {
            if(json.getString("opertorMessage") != null){
    try {
       opertorMessage = json.getString("opertorMessage");
          this.setopertorMessage(opertorMessage);
                 } catch (JSONException e) {
    }}
        } catch (JSONException e) {
        }
        try {
            if(json.getString("meterFees") != null){
    try {
       meterFees = json.getString("meterFees");
          this.setmeterFees(meterFees);
                 } catch (JSONException e) {
    }}
        } catch (JSONException e) {
        }
        try {
            if(json.getString("token") != null){
    try {
       token = json.getString("token");
          this.settoken(token);
                 } catch (JSONException e) {
    }}
        } catch (JSONException e) {
        }
        try {
            if(json.getString("accountNo") != null){
    try {
       accountNo = json.getString("accountNo");
          this.setaccountNo(accountNo);
                 } catch (JSONException e) {
    }}
        } catch (JSONException e) {
        }
        try {
            if(json.getString("meterNumber") != null){
    try {
       meterNumber = json.getString("meterNumber");
          this.setmeterNumber(meterNumber);
                 } catch (JSONException e) {
    }}
        } catch (JSONException e) {
        }

        try {
            if(json.getString("netAmount") != null){
    try {
       netAmount = json.getString("netAmount");
          this.setnetAmount(netAmount);
                 } catch (JSONException e) {
    }}
        } catch (JSONException e) {
        }


        try {
            if(json.getString("ReceiptNo") != null){
    try {
       ReceiptNo = json.getString("ReceiptNo");
          this.setReceiptNo(ReceiptNo);
                 } catch (JSONException e) {
    }}
        } catch (JSONException e) {
        }
    }

  public String getbillInfo() {
    return billInfo;
  }
  
  
  
  public String gettoken() {
      
        return token;
  }
  
  public String getcustomerName() {
      
        return customerName;
  }
  
  public String getReceiptNo() {
      
        return ReceiptNo;
  }
  public String getunitsInKWh() {
      
        return unitsInKWh;
  }
  public String getwaterFees() {
      
        return waterFees;
  }
  public String getopertorMessage() {
      
        return opertorMessage;
  }
  public String getmeterFees() {
      
        return meterFees;
  }
  
  public String getmeterNumber() {
      
        return meterNumber;
  }
  public String getaccountNo() {
      
        return accountNo;
  }
  public String getnetAmount() {
      
        return netAmount;
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
  
  public void setacqTranFee(String acqTranFee) {
  this.acqTranFee = acqTranFee;
  }

  public String getacqTranFee() {
  return acqTranFee;
  }
  
  
  public String getavailablebalance() {
  return availablebalance;
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
  
  
  public void setfromAccountType(String fromAccountType) {
  this.fromAccountType = fromAccountType;
  }

  public String getfromAccountType() {
  return fromAccountType;
  }
}
