package Data_Registration;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class NtcRegistrationSegmentSessionEJBBeanClient {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            NtcRegistrationSegmentSessionEJBBean ntcRegistrationSegmentSessionEJBBean = (NtcRegistrationSegmentSessionEJBBean)context.lookup("DataRegistration-Registration-NtcRegistrationSegmentSessionEJBBean#Data_Registration.NtcRegistrationSegmentSessionEJBBean");
           /*for (NtcRegistrationSegment ntcregistrationsegment : (List<NtcRegistrationSegment>)ntcRegistrationSegmentSessionEJBBean.getNtcRegistrationSegmentFindAll()) {
                printNtcRegistrationSegment(ntcregistrationsegment);
            }*/
            
     //    String x="89249020422215687988"   ;
         //   x.substring(12, 20);
      //    System.out.println("subsctr :" + x.substring(12, 20));
            
            //"997607976","16078139"
        String x=  ntcRegistrationSegmentSessionEJBBean.ValidateMSISDN_Vs_Serail("928038956","16078139");
        //int x=  ntcRegistrationSegmentSessionEJBBean.UpdateSegment("928038956");
             System.out.println(x);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void printNtcRegistrationSegment(NtcRegistrationSegment ntcregistrationsegment) {
        System.out.println( "msisdn = " + ntcregistrationsegment.getMsisdn() );
        System.out.println( "status = " + ntcregistrationsegment.getStatus() );
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        env.put(Context.PROVIDER_URL, "t3://172.17.10.60:7001");
        return new InitialContext( env );
    }
}
