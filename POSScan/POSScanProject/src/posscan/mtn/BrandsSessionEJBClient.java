package posscan.mtn;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class BrandsSessionEJBClient {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            BrandsSessionEJB brandsSessionEJB = (BrandsSessionEJB)context.lookup("POSScan-POSScanProject-BrandsSessionEJB#posscan.mtn.BrandsSessionEJB");
            for (Brands brands : (List<Brands>)brandsSessionEJB.getBrandsFindAll()) {
                printBrands(brands);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void printBrands(Brands brands) {
        System.out.println( "brand = " + brands.getBrand() );
        System.out.println( "brid = " + brands.getBrid() );
        System.out.println( "status = " + brands.getStatus() );
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        env.put(Context.PROVIDER_URL, "t3://172.17.10.60:7001");
        return new InitialContext( env );
    }
}
