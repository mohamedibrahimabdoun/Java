package sd.mtn.Data;

import java.util.List;

public class ExternalNodeReplayRequest {
  int DestintionRequestSequance_Response;
  String DestintionRequestType_Response;
  String DestintionEndPointUrl_Response;
  String DestinationContentMsg_Response;
  List<Menu> DestinationMenuList_Response;

  public void setDestintionRequestSequance_Response(int DestintionRequestSequance_Response) {
      this.DestintionRequestSequance_Response = DestintionRequestSequance_Response;
  }

  public int getDestintionRequestSequance_Response() {
      return DestintionRequestSequance_Response;
  }

  public void setDestintionRequestType_Response(String DestintionRequestType_Response) {
      this.DestintionRequestType_Response = DestintionRequestType_Response;
  }

  public String getDestintionRequestType_Response() {
      return DestintionRequestType_Response;
  }

  public void setDestintionEndPointUrl_Response(String DestintionEndPointUrl_Response) {
      this.DestintionEndPointUrl_Response = DestintionEndPointUrl_Response;
  }

  public String getDestintionEndPointUrl_Response() {
      return DestintionEndPointUrl_Response;
  }

  public void setDestinationContentMsg_Response(String DestinationContentMsg_Response) {
      this.DestinationContentMsg_Response = DestinationContentMsg_Response;
  }

  public String getDestinationContentMsg_Response() {
      return DestinationContentMsg_Response;
  }

  public void setDestinationMenuList_Response(List<Menu> DestinationMenuList_Response) {
      this.DestinationMenuList_Response = DestinationMenuList_Response;
  }

  public List<Menu> getDestinationMenuList_Response() {
      return DestinationMenuList_Response;
  }

}
