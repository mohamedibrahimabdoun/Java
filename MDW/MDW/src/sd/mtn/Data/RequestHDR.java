package sd.mtn.Data;

public class RequestHDR {
  String UserName;
  String Password;
  String Serial;
  String CommandId;

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    public String getSerial() {
        return Serial;
    }

    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    public String getCommandId() {
        return CommandId;
    }
}
