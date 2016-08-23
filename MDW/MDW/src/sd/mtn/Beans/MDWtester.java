package sd.mtn.Beans;

import com.bea.logging.DateFormatter;

import com.gemalto.ggs.cbos.wswrapper.ws.GetSVABalanceResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.GmppResponse;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import sd.mtn.BusinessLogic.Commviva_APIs;
import sd.mtn.BusinessLogic.NOR_APIs;
import sd.mtn.Data.CustomerResponseMsg;
import sd.mtn.Data.DestinationResultMSG;
import sd.mtn.Data.LanguageResposeMessage;
import sd.mtn.Data.Pamaeters;
import sd.mtn.Data.QueryInfoRequest;
import sd.mtn.Data.RequestHDR;

public class MDWtester {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            MDWSessionEJB mDWSessionEJB = (MDWSessionEJB)context.lookup("MDW-MDW-MDWSessionEJB#sd.mtn.Beans.MDWSessionEJB");
          DateFormatter formatter=new DateFormatter("yyyyMMddHHmmss");
          String dt=formatter.formatDate(new Date());
            
          RequestHDR reqsthdr = new RequestHDR();
            
          NOR_APIs NorObj = new NOR_APIs();
          /*reqsthdr.setCommandId("GetConsumerInfo");
          reqsthdr.setPassword("CB0$#14@5_%ntm");
          reqsthdr.setSerial("APQY"+dt);
          reqsthdr.setUserName("CBOS");*/
            
          reqsthdr.setCommandId("CreateCampaign");
          reqsthdr.setPassword("Vas$254");
          reqsthdr.setSerial("APQY" + dt);
          reqsthdr.setUserName("VAS");
            
          String StartDate = "20140526000000";
          String EndDate = "20140528121015";
          String Create = NorObj.NorCreateCampaign(reqsthdr, "88888", "TEST88888", StartDate, EndDate);
          
            
      // CustomerResponseMsg m= mDWSessionEJB.CustInfoQryReq(reqsthdr, "928038956");
            
        //CustomerResponseMsg Resp= mDWSessionEJB.GetConsumerInfo(reqsthdr, "928038956");
          //System.out.print(Resp.toString());
            
          //GmppResponse cashInResp = mDWSessionEJB.cashIn("928038956", "2", "123", "1456");
          //String BalanceResp = mDWSessionEJB.getSVABalance(reqsthdr,"test", "123", true);
          //String BalanceResp = mDWSessionEJB.Distribute(reqsthdr, "123", "10000", "123", "1191119", true);
          //String GetResp = mDWSessionEJB.GetLastTransactions(reqsthdr, "249119779119", "0000", true);
          //String Pay = mDWSessionEJB.PayBill(reqsthdr, "1", "1", "1", "123", "922902677", "Pay");
          
          //System.out.print(BalanceResp.toString());
/*
        Pamaeters obj = null;
          List<Pamaeters> paramList = new ArrayList<Pamaeters>();
          obj = new Pamaeters();
          obj.setParamName("shortcode");
          obj.setParamValue("123");
          paramList.add(obj);
          obj = new Pamaeters();
          obj.setParamName("input");
          obj.setParamValue("123*1");
          paramList.add(obj);
          obj = new Pamaeters();
          obj.setParamName("src");
          obj.setParamValue("USSD");
          paramList.add(obj);
          obj = new Pamaeters();
          obj.setParamName("node");
          obj.setParamValue("USSD01");
          paramList.add(obj);
          obj = new Pamaeters();
          obj.setParamName("user");
          obj.setParamValue("VAS");
          paramList.add(obj);
          Commviva_APIs comm_obj=new Commviva_APIs();
          
          LanguageResposeMessage LANGRESPONSE =
              comm_obj.QueryCustomer(reqsthdr, "928038956");
          QueryInfoRequest QRYINFORQST = new QueryInfoRequest();
          QRYINFORQST.setLanguageResposeMessage(LANGRESPONSE);
          QRYINFORQST.setParamList(paramList);
          DestinationResultMSG RESULT =
              mDWSessionEJB.getRequestInfo(reqsthdr, QRYINFORQST);*/        
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        //env.put(Context.PROVIDER_URL, "t3://172.26.1.73:7001");
        env.put(Context.PROVIDER_URL, "t3://localhost:7001");
        return new InitialContext( env );
    }
}
