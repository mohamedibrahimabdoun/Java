package sd.mtn.Data;

public class ICash_IsAlive_ResponseMsg {
  ResponseHeader resultHeader;
  ICash_IsAlive_Response ICashIsAliveResp;
  
  

    public void setResultHeader(ResponseHeader resultHeader) {
        this.resultHeader = resultHeader;
    }

    public ResponseHeader getResultHeader() {
        return resultHeader;
    }

    public void setICashIsAliveResp(ICash_IsAlive_Response ICashIsAliveResp) {
        this.ICashIsAliveResp = ICashIsAliveResp;
    }

    public ICash_IsAlive_Response getICashIsAliveResp() {
        return ICashIsAliveResp;
    }
}
