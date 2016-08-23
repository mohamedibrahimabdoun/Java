package sd.mtn.Data;

public class Cbos_compCashOutAtAgentReq {
  String managerMSISDN;
  String pin;
  String MSISDN;
  String transactionid;
  String tan;


    public void setManagerMSISDN(String managerMSISDN) {
        this.managerMSISDN = managerMSISDN;
    }

    public String getManagerMSISDN() {
        return managerMSISDN;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }

    public String getMSISDN() {
        return MSISDN;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTan(String tan) {
        this.tan = tan;
    }

    public String getTan() {
        return tan;
    }
}
