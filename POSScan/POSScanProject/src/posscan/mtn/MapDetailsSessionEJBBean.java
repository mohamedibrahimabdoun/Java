package posscan.mtn;

import java.util.List;

import javax.ejb.Stateless;

import javax.jws.WebMethod;
import javax.jws.WebService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "MapDetailsSessionEJB", mappedName = "POSScan-POSScanProject-MapDetailsSessionEJB")
@WebService(name = "POSScanService", serviceName = "POSScanService", targetNamespace = "http://tempuri.org/", portName = "POSScanServicePort")
public class MapDetailsSessionEJBBean implements MapDetailsSessionEJB {
    @PersistenceContext(unitName="POSScanProject")
    private EntityManager em;

    public MapDetailsSessionEJBBean() {
    }

    @WebMethod(exclude = true)
    public Brands persistBrands(Brands brands) {
        em.persist(brands);
        return brands;
    }

    @WebMethod(exclude = true)
    public Brands mergeBrands(Brands brands) {
        return em.merge(brands);
    }

    @WebMethod(exclude = true)
    public void removeBrands(Brands brands) {
        brands = em.find(Brands.class, brands.getBrid());
        em.remove(brands);
    }

    @WebMethod(exclude = true)
    public TraderClassification persistTraderClassification(TraderClassification traderClassification) {
        em.persist(traderClassification);
        return traderClassification;
    }

    @WebMethod(exclude = true)
    public TraderClassification mergeTraderClassification(TraderClassification traderClassification) {
        return em.merge(traderClassification);
    }

    @WebMethod(exclude = true)
    public void removeTraderClassification(TraderClassification traderClassification) {
        traderClassification = em.find(TraderClassification.class, traderClassification.getClassid());
        em.remove(traderClassification);
    }

    /** <code>select o from TraderClassification o</code> */
    public List<TraderClassification> getTraderClassificationFindAll() {
        return em.createNamedQuery("TraderClassification.findAll").getResultList();
    }


//----------------
    
      /** <code>select o from Brands o</code> */
  public List<Brands> getBrandsFindAll() {
      return em.createNamedQuery("Brands.findAll").getResultList();
  }

    @WebMethod(exclude = true)
    public MapDetails persistMapDetails(MapDetails mapDetails) {
        em.persist(mapDetails);
        return mapDetails;
    }

    @WebMethod(exclude = true)
    public MapDetails mergeMapDetails(MapDetails mapDetails) {
        return em.merge(mapDetails);
    }

    @WebMethod(exclude = true)
    public void removeMapDetails(MapDetails mapDetails) {
        mapDetails = em.find(MapDetails.class, mapDetails.getId());
        em.remove(mapDetails);
    }

    /** <code>select o from MapDetails o</code> */
    @WebMethod(exclude = true)
    public List<MapDetails> getMapDetailsFindAll() {
        return em.createNamedQuery("MapDetails.findAll").getResultList();
    }
    
        
  public String SendPosinfo(String date, String imei, String lat, String lng,
                            String postype, String posname, String owner,
                            String mobile, String brand, String address,
                            String simSelling) {
       MapDetails posinfo  = new MapDetails();
       posinfo.setAddress(address);
       posinfo.setClassification(brand);
       posinfo.setRequestdate(date);
       posinfo.setImei(imei);
       posinfo.setLatitude(lat);
       posinfo.setLongitude(lng);
       posinfo.setMsisdn(mobile);
       posinfo.setOwnerName(owner);
       posinfo.setPosName(posname);
       posinfo.setPosType(postype);
       posinfo.setSimSelling(simSelling);
       
        em.persist(posinfo);
       //System.out.print();
       return "Data Saved";
  }
}
