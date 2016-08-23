package sd.mtn.Data;

public class ResultHDR {
  String ResultCode;
  String ResultDesc;
  String Transserial;
  String CommandId;
  boolean FinalResult;

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

    public void setTransserial(String Transserial) {
        this.Transserial = Transserial;
    }

    public String getTransserial() {
        return Transserial;
    }

    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    public String getCommandId() {
        return CommandId;
    }

    public void setFinalResult(boolean FinalResult) {
        this.FinalResult = FinalResult;
    }

    public boolean isFinalResult() {
        return FinalResult;
    }
}
