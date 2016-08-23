package scanwebservices.mtn;

import java.util.List;

import javax.ejb.Remote;

import posscan.mtn.Brands;
import posscan.mtn.MapDetails;
import posscan.mtn.TraderClassification;

@Remote
public interface POSScanWebservicesSessionEJB {
    MapDetails persistMapDetails(MapDetails mapDetails);

    MapDetails mergeMapDetails(MapDetails mapDetails);

    void removeMapDetails(MapDetails mapDetails);

    List<MapDetails> getMapDetailsFindAll();
    
  List<TraderClassification> getAllPosTypes();
  
  List<Brands> getBrandsFindAll();
  public String SendPosinfo( String date, String imei,
                                    String lat, String lng, String postype,
                                    String posname, String owner,
                                    String mobile, String brand,
                                    String address, String stock);
  
}
