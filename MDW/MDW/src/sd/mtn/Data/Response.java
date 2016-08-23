package sd.mtn.Data;

public class Response {
    String username;
    String password;
    String  Validity;
    String Expiry;
    String  Quota;
    String Bandwidth;

    public Response() {
        super();
    }

    public Response(String username, String password, String Validity,
                    String Expiry, String Quota, String Bandwidth) {
        super();
        this.username = username;
        this.password = password;
        this.Validity = Validity;
        this.Expiry = Expiry;
        this.Quota = Quota;
        this.Bandwidth = Bandwidth;
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


    public void setExpiry(String Expiry) {
        this.Expiry = Expiry;
    }

    public String getExpiry() {
        return Expiry;
    }



    public void setBandwidth(String Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public String getBandwidth() {
        return Bandwidth;
    }

    public void setValidity(String Validity) {
        this.Validity = Validity;
    }

    public String getValidity() {
        return Validity;
    }

    public void setQuota(String Quota) {
        this.Quota = Quota;
    }

    public String getQuota() {
        return Quota;
    }
}




/*<Response>            
<username>5wmDJV</username>                    
<password>uuYhEzWv</password>            
<Validity>86400.0000</Validity>             
<Expiry>2013-04-25</Expiry>              
<Quota>1073741824.0000</Quota>          
<Bandwidth>512kbps</Bandwidth>                     
</Response>*/