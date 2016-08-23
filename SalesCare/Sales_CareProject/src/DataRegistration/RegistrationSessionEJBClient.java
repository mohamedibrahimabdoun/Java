package DataRegistration;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class RegistrationSessionEJBClient {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            RegistrationSessionEJB registrationSessionEJB = (RegistrationSessionEJB)context.lookup("SalesCare-Sales_CareProject-RegistrationSessionEJB#DataRegistration.RegistrationSessionEJB");
            for (Registration registration : (List<Registration>)registrationSessionEJB.getRegistrationFindAll()) {
                printRegistration(registration);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void printRegistration(Registration registration) {
        System.out.println( "address = " + registration.getAddress() );
        System.out.println( "backImage = " + registration.getBackImage() );
        System.out.println( "backImagename = " + registration.getBackImagename() );
        System.out.println( "frontImage = " + registration.getFrontImage() );
        System.out.println( "frontImagename = " + registration.getFrontImagename() );
        System.out.println( "id = " + registration.getId() );
        System.out.println( "idType = " + registration.getIdType() );
        System.out.println( "imsi = " + registration.getImsi() );
        System.out.println( "msisdn = " + registration.getMsisdn() );
        System.out.println( "name = " + registration.getName() );
        System.out.println( "serail = " + registration.getSerail() );
        System.out.println( "transdate = " + registration.getTransdate() );
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        env.put(Context.PROVIDER_URL, "t3://localhost:7001");
        return new InitialContext( env );
    }
}
