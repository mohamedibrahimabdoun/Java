package scanwebservices.mtn;

import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

import javax.ejb.Stateless;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import javax.jws.WebService;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import posscan.mtn.Brands;
import posscan.mtn.BrandsSessionEJB;
import posscan.mtn.MapDetails;
import posscan.mtn.MapDetailsSessionEJB;
import posscan.mtn.TraderClassification;
import posscan.mtn.TraderClassificationSessionEJB;

@Stateless(name = "POSScanWebservicesSessionEJB", mappedName = "POSScan-POSScanProject-POSScanWebservicesSessionEJB")
@WebService(serviceName = "POSScanProjectService", portName = "POSScanProjectServicePort", endpointInterface = "scanwebservices.mtn.POSScanService")
//http://tempuri.org/
public class POSScanWebservicesSessionEJBBean implements POSScanWebservicesSessionEJB {
    @PersistenceContext(unitName="POSScanProject")
    private EntityManager em;

    public POSScanWebservicesSessionEJBBean() {
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

    public List<TraderClassification> getAllPosTypes() {
    final Context context;
      try {
          context = getInitialContext();
        TraderClassificationSessionEJB traderClassificationSessionEJB = (TraderClassificationSessionEJB)context.lookup("POSScan-POSScanProject-TraderClassificationSessionEJB#posscan.mtn.TraderClassificationSessionEJB");
               return traderClassificationSessionEJB.getTraderClassificationFindAll();
          
      } catch (NamingException e) {
        return Collections.emptyList();
      }   
  }


    public List<Brands> getBrandsFindAll() {
    final Context context;
      try {
          context = getInitialContext();
        BrandsSessionEJB brandsSessionEJB = (BrandsSessionEJB)context.lookup("POSScan-POSScanProject-BrandsSessionEJB#posscan.mtn.BrandsSessionEJB");
                        return brandsSessionEJB.getBrandsFindAll();
          
      } catch (NamingException e) {
        return Collections.emptyList();
      }
  }

    public String SendPosinfo(String date, String imei, String lat, String lng,
                              String postype, String posname, String owner,
                              String mobile, String brand, String address,
                              String stock) {
    final Context context;
      try {
          context = getInitialContext();
        MapDetailsSessionEJB mapDetailsSessionEJB = (MapDetailsSessionEJB)context.lookup("POSScan-POSScanProject-MapDetailsSessionEJB#posscan.mtn.MapDetailsSessionEJB");
        
        //SessionEJB sessionEJB = (SessionEJB)context.lookup("POSWSProject-Project1-SessionEJB#project1.SessionEJB");
        return mapDetailsSessionEJB.SendPosinfo(date, imei, lat, lng, postype, posname, owner, mobile, brand, address, stock);
          
      } catch (NamingException e) {
        return e.getMessage();
      }
}

     private static Context getInitialContext() throws NamingException {
      Hashtable env = new Hashtable();
      // WebLogic Server 10.x connection details
      env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
      env.put(Context.PROVIDER_URL, "t3://172.17.10.60:7001");
       
      return new InitialContext( env );
    }
}
