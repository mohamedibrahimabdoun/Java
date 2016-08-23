package sd.mtn.Data;

import java.util.List;

public class DestinationResponse {
  int DestintionRequestSequance;
  String DestintionRequestType;
  String DestintionEndPointUrl;
  String DestinationContentMsg;
  List<String> DestinationContentMsgList;
  List<Menu> DestinationMenuList;


    public void setDestintionRequestSequance(int DestintionRequestSequance) {
        this.DestintionRequestSequance = DestintionRequestSequance;
    }

    public int getDestintionRequestSequance() {
        return DestintionRequestSequance;
    }

    public void setDestintionRequestType(String DestintionRequestType) {
        this.DestintionRequestType = DestintionRequestType;
    }

    public String getDestintionRequestType() {
        return DestintionRequestType;
    }

    public void setDestintionEndPointUrl(String DestintionEndPointUrl) {
        this.DestintionEndPointUrl = DestintionEndPointUrl;
    }

    public String getDestintionEndPointUrl() {
        return DestintionEndPointUrl;
    }

    public void setDestinationContentMsg(String DestinationContentMsg) {
        this.DestinationContentMsg = DestinationContentMsg;
    }

    public String getDestinationContentMsg() {
        return DestinationContentMsg;
    }

    public void setDestinationContentMsgList(List<String> ListDestinationContentMsg) {
        this.DestinationContentMsgList = ListDestinationContentMsg;
    }

    public List<String> getDestinationContentMsgList() {
        return DestinationContentMsgList;
    }

    public void setDestinationMenuList(List<Menu> DestinationMenuList) {
        this.DestinationMenuList = DestinationMenuList;
    }

    public List<Menu> getDestinationMenuList() {
        return DestinationMenuList;
    }
}
