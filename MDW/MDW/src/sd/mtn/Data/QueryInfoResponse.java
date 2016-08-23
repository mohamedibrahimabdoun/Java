package sd.mtn.Data;

import java.util.List;

public class QueryInfoResponse {
  ResultHDR resp;
  List<Pamaeters> paramList ;

  public void setResp(ResultHDR resp) {
      this.resp = resp;
  }

  public ResultHDR getResp() {
      return resp;
  }

  public void setParamList(List<Pamaeters> paramList) {
      this.paramList = paramList;
  }

  public List<Pamaeters> getParamList() {
      return paramList;
  }
}
