package sd.mtn.Data;

public class ExternalNodeReplayResultMsg {
  ExternalNodeReplayResponse externalnodereplayresponse;
  ResultHDR requestheaderresponse;


    public void setExternalnodereplayresponse(ExternalNodeReplayResponse externalnodereplayresponse) {
        this.externalnodereplayresponse = externalnodereplayresponse;
    }

    public ExternalNodeReplayResponse getExternalnodereplayresponse() {
        return externalnodereplayresponse;
    }

    public void setRequestheaderresponse(ResultHDR requestheaderresponse) {
        this.requestheaderresponse = requestheaderresponse;
    }

    public ResultHDR getRequestheaderresponse() {
        return requestheaderresponse;
    }
}
