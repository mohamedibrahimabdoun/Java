package sd.mtn.Data;

public class SuperWiFiUserResponse {
    String ResultCode;
    String ResultDesc;
    String Serial;
    String username;
    String password;
    String Validity;
    String Expiry;
    String Quota;
    String Bandwidth;

    public void setResultCode(String ResultCode) {
        this.ResultCode = ResultCode;
    }

    public String getResultCode() {
        return ResultCode;
    }

    public void setResultDesc(String ResultDesc) {
        this.ResultDesc = ResultDesc;
    }

    public String getResultDesc() {
        return ResultDesc;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    public String getSerial() {
        return Serial;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setValidity(String Validity) {
        this.Validity = Validity;
    }

    public String getValidity() {
        return Validity;
    }

    public void setExpiry(String Expiry) {
        this.Expiry = Expiry;
    }

    public String getExpiry() {
        return Expiry;
    }

    public void setQuota(String Quota) {
        this.Quota = Quota;
    }

    public String getQuota() {
        return Quota;
    }

    public void setBandwidth(String Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public String getBandwidth() {
        return Bandwidth;
    }
}


