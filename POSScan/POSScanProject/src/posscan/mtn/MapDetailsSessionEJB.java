package posscan.mtn;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface MapDetailsSessionEJB {
    Brands persistBrands(Brands brands);

    Brands mergeBrands(Brands brands);

    void removeBrands(Brands brands);
    
  public List<Brands> getBrandsFindAll();

    TraderClassification persistTraderClassification(TraderClassification traderClassification);

    TraderClassification mergeTraderClassification(TraderClassification traderClassification);

    void removeTraderClassification(TraderClassification traderClassification);

    List<TraderClassification> getTraderClassificationFindAll();

    MapDetails persistMapDetails(MapDetails mapDetails);

    MapDetails mergeMapDetails(MapDetails mapDetails);

    void removeMapDetails(MapDetails mapDetails);

    List<MapDetails> getMapDetailsFindAll();
    
   String SendPosinfo(String date, String imei, String lat, String lng,
                              String postype, String posname, String owner,
                              String mobile, String brand, String address,
                              String simSelling); 
}
