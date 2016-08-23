package Data_Registration;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class NTC_REG_LIMIT_SessionEJBClient {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            NTC_REG_LIMIT_SessionEJB nTC_REG_LIMIT_SessionEJB = (NTC_REG_LIMIT_SessionEJB)context.lookup("DataRegistration-Registration-NTC_REG_LIMIT_SessionEJB#Data_Registration.NTC_REG_LIMIT_SessionEJB");
            for (NtcRegLimit ntcreglimit : (List<NtcRegLimit>)nTC_REG_LIMIT_SessionEJB.getNtcRegLimitFindAll()) {
                printNtcRegLimit(ntcreglimit);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void printNtcRegLimit(NtcRegLimit ntcreglimit) {
        System.out.println( "maxrownumber = " + ntcreglimit.getMaxrownumber() );
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        env.put(Context.PROVIDER_URL, "t3://172.17.10.25:7001");
        return new InitialContext( env );
    }
}
