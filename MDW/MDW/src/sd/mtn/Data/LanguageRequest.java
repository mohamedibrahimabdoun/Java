package sd.mtn.Data;

public class LanguageRequest {
  String Lang;
  String MSISDN;
  //String SMSLang;

    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    public String getLang() {
        return Lang;
    }

    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN.substring(3,MSISDN.length());
    }

    public String getMSISDN() {
        return MSISDN;
    }

   /* public void setSMSLang(String SMSLang) {
        this.SMSLang = SMSLang;
    }

    public String getSMSLang() {
        return SMSLang;
    }*/
}
