package mtn.salescare.ServicesClass;

public class Resultset {
    public Resultset() {
        super();
    }
    
  private String MSISDN;
  private String CREDIT;


  public String getMSISDN() {
      return MSISDN;
  }

  public void setMSISDN(String MSISDN) {
      this.MSISDN = MSISDN;
  }

  public String getCREDIT() {
      return CREDIT;
  }

  public void setCREDIT(String CREDIT) {
      this.CREDIT = CREDIT;
  }


  public String getRECEIVERAMNT() {
      return RECEIVERAMNT;
  }

  public void setRECEIVERAMNT(String RECEIVERAMNT) {
      this.RECEIVERAMNT = RECEIVERAMNT;
  }

  public String getSENDERAMNT() {
      return SENDERAMNT;
  }

  public void setSENDERAMNT(String SENDERAMNT) {
      this.SENDERAMNT = SENDERAMNT;
  }
  private String SENDERAMNT;
  private String RECEIVERAMNT;
}
