package sd.mtn.Data;

public class LanguageRespose {
  String Lang;
  String LangDescription;
  String MSISDN;
  String PrePost_Paid;
  String Profile;
  String acivationDate;
  

    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    public String getLang() {
        return Lang;
    }

    public void setLangDescription(String LangDescription) {
        this.LangDescription = LangDescription;
    }

    public String getLangDescription() {
        return LangDescription;
    }

    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }

    public String getMSISDN() {
        return MSISDN;
    }

    public void setPrePost_Paid(String PrePost_Paid) {
        this.PrePost_Paid = PrePost_Paid;
    }

    public String getPrePost_Paid() {
        return PrePost_Paid;
    }

    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public String getProfile() {
        return Profile;
    }


    public void setAcivationDate(String acivationDate) {
        this.acivationDate = acivationDate;
    }

    public String getAcivationDate() {
        return acivationDate;
    }
}
