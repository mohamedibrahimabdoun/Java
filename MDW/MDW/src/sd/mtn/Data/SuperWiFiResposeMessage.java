package sd.mtn.Data;

public class SuperWiFiResposeMessage {
  ResponseHeader resultHeader;
  Response WiFiReponse;




    public void setWiFiReponse(Response WiFiReponse) {
        this.WiFiReponse = WiFiReponse;
    }

    public Response getWiFiReponse() {
        return WiFiReponse;
    }

    public void setResultHeader(ResponseHeader resultHeader) {
        this.resultHeader = resultHeader;
    }

    public ResponseHeader getResultHeader() {
        return resultHeader;
    }
}
