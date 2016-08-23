package sd.mtn.Data;

import java.util.List;

public class ExternalNodeReplayResponse {
  List<ReplayMessages> MessageList;
  

  public void setMessageList(List<ReplayMessages> MessageList) {
      this.MessageList = MessageList;
  }

  public List<ReplayMessages> getMessageList() {
      return MessageList;
  }
}
