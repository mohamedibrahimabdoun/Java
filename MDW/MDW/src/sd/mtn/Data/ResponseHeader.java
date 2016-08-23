package sd.mtn.Data;

public class ResponseHeader {
  String ResultCode;
    String ResultDesc;
    String Serial;

    public String toString() {
               StringBuffer sb = new StringBuffer();
               sb.append(" ResponseHeader Details ");
               sb.append("ResultCode:" + getResultCode());
               sb.append(", ");
               sb.append("ResultDesc:" + getResultDesc());
               sb.append(", ");
               sb.append("Serial:" + getSerial());
               sb.append(".");

               return sb.toString();
        }

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
}


/*<ResponseHeader>		
<ResultCode>null</ResultCode>                        	
<ResultDesc>Success</ResultDesc>                      
<Serial>423423</Serial>                        		
</ResponseHeader>  */
