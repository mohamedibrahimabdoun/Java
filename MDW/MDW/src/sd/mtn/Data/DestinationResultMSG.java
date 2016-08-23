package sd.mtn.Data;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DestinationResultMSG", propOrder = {
    "requestHeaderResponse",
    "destinationresponse"    
})
public class DestinationResultMSG {
  List<DestinationResponse>  destinationresponse ;
  ResultHDR  requestHeaderResponse;

  
  public void setRequestHeaderResponse(ResultHDR requestHeaderResponse) {
      this.requestHeaderResponse = requestHeaderResponse;
  }

  public ResultHDR getRequestHeaderResponse() {
      return requestHeaderResponse;
  }

  public void setDestinationresponse(List<DestinationResponse> destinationresponse) {
      this.destinationresponse = destinationresponse;
  }

  public List<DestinationResponse> getDestinationresponse() {
      return destinationresponse;
  }
}
