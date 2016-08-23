package sd.mtn.Data;

import java.util.List;

public class QueryInfoRequest {
    List<Pamaeters> paramList;
  LanguageResposeMessage languageResposeMessage;

      public void setParamList(List<Pamaeters> paramList) {
          this.paramList = paramList;
      }

      public List<Pamaeters> getParamList() {
          return paramList;
      }

    public void setLanguageResposeMessage(LanguageResposeMessage languageResposeMessage) {
        this.languageResposeMessage = languageResposeMessage;
    }

    public LanguageResposeMessage getLanguageResposeMessage() {
        return languageResposeMessage;
    }
}
