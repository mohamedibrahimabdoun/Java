package posscan.mtn;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TraderClassificationSessionEJBClient {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            TraderClassificationSessionEJB traderClassificationSessionEJB = (TraderClassificationSessionEJB)context.lookup("POSScan-POSScanProject-TraderClassificationSessionEJB#posscan.mtn.TraderClassificationSessionEJB");
            for (TraderClassification traderclassification : (List<TraderClassification>)traderClassificationSessionEJB.getTraderClassificationFindAll()) {
                printTraderClassification(traderclassification);
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

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        env.put(Context.PROVIDER_URL, "t3://172.17.10.60:7001");
        return new InitialContext( env );
    }
}
