package DATA_REG_WS;

import javax.ejb.Remote;

@Remote
public interface DATAREGWS_SessionEJB {
  public String SaveData(String firstName,String secondName , String thirdName, String lastName,
                String imageName ,String msisdn,
                String imsi ,Long idType,byte[] img);
}
