package sd.mtn.Billing;

import java.util.Hashtable;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TabsSessionEJBClient {
    public static void main(String[] args) {
        try {
            final Context context = getInitialContext();
            TabsSessionEJB tabsSessionEJB =
                (TabsSessionEJB)context.lookup("MDW-MDW-TabsSessionEJB#sd.mtn.Billing.TabsSessionEJB");
            //=============== PREPAID ==========
          /*  List<VwMdwPospaidBasciinfo> postpaid =
                tabsSessionEJB.getPostpaidBasicInfo("928038956");
            System.out.print(postpaid);
            tabsSessionEJB.getCrmUserEquipments("928038956");
            tabsSessionEJB.getPostpaidBasicInfo("928038956");
            tabsSessionEJB.getCcmGetData("928038956");
            System.out.print(postpaid);*/
            //============= POSTPAID ==========
         /*   List<VwMdwPospaidBasciinfo> post =
                tabsSessionEJB.getPostpaidBasicInfo("922902677");
            System.out.print(post);
            tabsSessionEJB.getPostpaidBasicInfo("922902677");
            tabsSessionEJB.getCcmGetData("922902677");
            tabsSessionEJB.getCcmGetData("922902677");
            tabsSessionEJB.getCrmUserEquipments("922902677");*/

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        /*ex  EJB Exception: ; nested exception is:
        java.lang.IllegalArgumentException: You have attempted to set a parameter value using a name of p_subno that does not exist in the query string select o from CcmGetData o. EJBException*/
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "weblogic.jndi.WLInitialContextFactory");
        env.put(Context.PROVIDER_URL, "t3://172.17.10.60:7001");
        return new InitialContext(env);
    }
}
