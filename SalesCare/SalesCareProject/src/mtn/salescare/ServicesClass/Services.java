package mtn.salescare.ServicesClass;

public class Services {
    public Services() {
        super();
    }
    
  int ELEC;
  int DATAREG;
  String MSISDN;
  String PIN;
  String IMSI;
  int TID;
  int VTU;
  int ACT;
  int TYPEID;
  String TYPENAME;
  String LOGINSTATUS;
  String msg;

  public int getACT() {
      return ACT;
  }

  public void setACT(int ACT) {
      this.ACT = ACT;
  }

  public int getDATAREG() {
      return DATAREG;
  }

  public void setDATAREG(int DATAREG) {
      this.DATAREG = DATAREG;
  }

  public int getELEC() {
      return ELEC;
  }

  public void setELEC(int ELEC) {
      this.ELEC = ELEC;
  }

  public String getIMSI() {
      return IMSI;
  }

  public void setIMSI(String IMSI) {
      this.IMSI = IMSI;
  }

  public String getMSISDN() {
      return MSISDN;
  }

  public void setMSISDN(String MSISDN) {
      this.MSISDN = MSISDN;
  }

  public String getPIN() {
      return PIN;
  }

  public void setPIN(String PIN) {
      this.PIN = PIN;
  }

  public int getTID() {
      return TID;
  }

  public void setTID(int TID) {
      this.TID = TID;
  }

  public int getVTU() {
      return VTU;
  }

  public void setVTU(int VTU) {
      this.VTU = VTU;
  }

  public void setMsg(String msg) {
      this.msg = msg;
  }

  public String getMsg() {
      return msg;
  }

  public void setLOGINSTATUS(String LOGINSTATUS) {
      this.LOGINSTATUS = LOGINSTATUS;
  }

  public String getLOGINSTATUS() {
      return LOGINSTATUS;
  }

    public void setTYPEID(int TYPEID) {
        this.TYPEID = TYPEID;
    }

    public int getTYPEID() {
        return TYPEID;
    }

    public void setTYEPENAME(String TYEPENAME) {
        this.TYPENAME = TYEPENAME;
    }

    public String getTYEPENAME() {
        return TYPENAME;
    }
}
