package posscan.mtn;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MapDetailsSessionEJBClient {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            MapDetailsSessionEJB mapDetailsSessionEJB = (MapDetailsSessionEJB)context.lookup("POSScan-POSScanProject-MapDetailsSessionEJB#posscan.mtn.MapDetailsSessionEJB");
            for (TraderClassification traderclassification : (List<TraderClassification>)mapDetailsSessionEJB.getTraderClassificationFindAll()) {
                printTraderClassification(traderclassification);
            }
            for (MapDetails mapdetails : (List<MapDetails>)mapDetailsSessionEJB.getMapDetailsFindAll()) {
                printMapDetails(mapdetails);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void printTraderClassification(TraderClassification traderclassification) {
        System.out.println( "classid = " + traderclassification.getClassid() );
        System.out.println( "classname = " + traderclassification.getClassname() );
        System.out.println( "status = " + traderclassification.getStatus() );
    }

    private static void printMapDetails(MapDetails mapdetails) {
        System.out.println( "address = " + mapdetails.getAddress() );
        System.out.println( "classification = " + mapdetails.getClassification() );
        System.out.println( "id = " + mapdetails.getId() );
        System.out.println( "imei = " + mapdetails.getImei() );
        System.out.println( "latitude = " + mapdetails.getLatitude() );
        System.out.println( "longitude = " + mapdetails.getLongitude() );
        System.out.println( "msisdn = " + mapdetails.getMsisdn() );
        System.out.println( "ownerName = " + mapdetails.getOwnerName() );
        System.out.println( "posName = " + mapdetails.getPosName() );
        System.out.println( "posType = " + mapdetails.getPosType() );
        System.out.println( "requestdate = " + mapdetails.getRequestdate() );
        System.out.println( "simSelling = " + mapdetails.getSimSelling() );
        System.out.println( "transdate = " + mapdetails.getTransdate() );
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        env.put(Context.PROVIDER_URL, "t3://172.17.10.60:7001");
        return new InitialContext( env );
    }
}
