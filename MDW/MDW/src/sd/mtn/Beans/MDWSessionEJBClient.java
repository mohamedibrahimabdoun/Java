package sd.mtn.Beans;

import com.bea.logging.DateFormatter;

import com.gemalto.ggs.cbos.wswrapper.ws.GetSVABalanceResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.GmppResponse;

import com.huawei.bme.cbsinterface.querymgr.QueryCustomerResultMsg;

import java.lang.instrument.Instrumentation;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import sd.mtn.Billing.CcmGetData;
import sd.mtn.Billing.TabsSessionEJB;
import sd.mtn.BusinessLogic.CBOS_APIs;
import sd.mtn.BusinessLogic.Commviva_APIs;
import sd.mtn.BusinessLogic.ICash_APIs;
import sd.mtn.BusinessLogic.NOR_APIs;
import sd.mtn.BusinessLogic.OCS_APIs;
import sd.mtn.BusinessLogic.TABS_APIs;
import sd.mtn.Data.CustomerResponseMsg;
import sd.mtn.Data.DestinationResultMSG;
import sd.mtn.Data.ICash_IsAlive_Response;
import sd.mtn.Data.ICash_IsAlive_Request;
import sd.mtn.Data.ICash_getBalance_Request;
import sd.mtn.Data.ICash_getBalance_Response;
import sd.mtn.Data.ICash_getBill_Request;
import sd.mtn.Data.ICash_getBill_Response;
import sd.mtn.Data.ICash_register_Request;
import sd.mtn.Data.ICash_register_Response;
import sd.mtn.Data.LanguageRequest;
import sd.mtn.Data.LanguageResposeMessage;
import sd.mtn.Data.Pamaeters;
import sd.mtn.Data.Postpaid_BillInfo;
import sd.mtn.Data.QueryInfoRequest;
import sd.mtn.Data.RequestHDR;
import sd.mtn.Data.Customer_Reqest;


import sd.mtn.Data.Customer_Resp;

import sd.mtn.Data.ICash_doCardTransfer_Request;
import sd.mtn.Data.ICash_doCardTransfer_Response;
import sd.mtn.Data.ICash_payment_Request;
import sd.mtn.Data.ICash_payment_Response;
import sd.mtn.Data.QueryGSM;

import weblogic.security.SSL.HostnameVerifier;

import weblogic.workarea.NoWorkContextException;

public class MDWSessionEJBClient {

    static {
        //for localhost testing only
        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(new javax.net.ssl.HostnameVerifier() {

                @Override
                public boolean verify(String hostname,
                                      javax.net.ssl.SSLSession sslSession) {
                    if (hostname.equals("172.16.198.12")) {
                        return true;
                    }
                    return false;
                }
            });
    }


    public static void main(String[] args) {
        try {
            final Context context = getInitialContext();
            MDWSessionEJB mDWSessionEJB =
                (MDWSessionEJB)context.lookup("MDW-MDW-MDWSessionEJB#sd.mtn.Beans.MDWSessionEJB");
            DateFormatter formatter = new DateFormatter("yyyyMMddHHmmss");
            String dt = formatter.formatDate(new Date());
            LanguageResposeMessage finalResul = new LanguageResposeMessage();
            RequestHDR reqsthdr = new RequestHDR();

            reqsthdr.setCommandId("BillInquiry");
            reqsthdr.setPassword("BAe8$521");
            reqsthdr.setSerial("APQY" + dt);
            reqsthdr.setUserName("EBS");
            // finalResul=mDWSessionEJB.QueryCustomer(reqsthdr, "928038956");
            /*LanguageRequest lang_Req = new LanguageRequest();
            lang_Req.setMSISDN("249922902670");
            lang_Req.setLang("2");*/
            // lang_Req.setSMSLang("2");
            /*Commviva_APIs ocs_object = new Commviva_APIs();
          LanguageResposeMessage resul= ocs_object.ChangeSubscriberInfo(reqsthdr, lang_Req) ;//QueryCustomer(reqsthdr, "928038956");*/
            TABS_APIs obj = new TABS_APIs();
            NOR_APIs NorObj = new NOR_APIs();
            Customer_Resp Resp;
            String Resp2;
            Customer_Reqest PayReq = new Customer_Reqest();
          QueryGSM Qreq = new QueryGSM();
          Qreq.setMSISDN("922902677");
                    PayReq.setAMOUNT("100");
                    PayReq.setCLIENTCODE("BOK");
                    PayReq.setMSISDN("922902680");
                    PayReq.setORDERID("1");
                    PayReq.setREQUESTAUTHID("72254");
                    PayReq.setREQUESTCHANNEL("BOK");
                    PayReq.setREQUESTCHANNELID("BOKMOBAPP");
                    PayReq.setREQUESTCURRENCY("SDG");
                    PayReq.setREQUESTDATE("07-Aug-14");
                    PayReq.setREQUESTLOCATION("NA");
                    PayReq.setREQUESTPAN("999995959");
                    PayReq.setREQUESTREF("TE111");
                    PayReq.setREQUESTTYPE("BillInquiry");
                    PayReq.setSESSIONID("NA");
          //Resp2 = obj.QueryGSM(reqsthdr, Qreq);
            Resp = obj.PaymentRequest(reqsthdr, PayReq);

/*            RequestHDR ICash_reqsthdr = new RequestHDR();
            reqsthdr.setCommandId("ICash_register");
            reqsthdr.setPassword("BAe8$521");
            reqsthdr.setSerial("APQY" + dt);
            reqsthdr.setUserName("EBS");
           ICash_APIs cashApi = new ICash_APIs();
          ICash_register_Response CashResp = new ICash_register_Response();
           String applicationid = "MTN";
           String tranDateTime = "200414000000";
           String UUID = "550e8400-e29b-41d4-a786-446655440000";
           ICash_register_Request req = new ICash_register_Request();
           req.setUUID(UUID);
           req.setapplicationid(applicationid);
           req.settranDateTime(tranDateTime);
           CashResp = cashApi.ICash_register(ICash_reqsthdr, req) ;*/
            
            
            ///*********** ICASH TESTER *******************///
                  RequestHDR ICash_reqsthdr = new RequestHDR();
            
                  ICash_reqsthdr.setCommandId("ICash_IsAlive");
                  ICash_reqsthdr.setPassword("BAe8$521");
                  ICash_reqsthdr.setSerial("4654651");
                  ICash_reqsthdr.setUserName("EBS");
                /* ICash_APIs cashApi = new ICash_APIs();
                ICash_register_Response CashResp = new ICash_register_Response();
                 String applicationid = "MTN";
                 String tranDateTime = "200414000000";
                 String UUID = "550e8400-e29b-41d4-a786-446655440000";
                 ICash_register_Request req = new ICash_register_Request();
                 req.setUUID(UUID);
                 req.setapplicationid(applicationid);
                 req.settranDateTime(tranDateTime);
                 CashResp = cashApi.ICash_register(ICash_reqsthdr, req) ;*/
          ICash_APIs cashApi = new ICash_APIs();
        ICash_payment_Response CashResp = new ICash_payment_Response();
           String applicationid = "MTNQA";
           String tranDateTime = "200414000000";
           String UUID = "ef88f9b1-7dad-40a4-ab37-4624dd5edee6";
          String entityID = "922902777";
          String entityType = "Phone No";
          String iPIN = "BLZNZycrqM0db9Mo1fKfHTrt3HYVm26lnxDmZg80Mu8G/COtZSs9hqrqgxvtqxFOuvWJZBOOHs1IBOcBFG1jTg==" ;
        String  authType = "10";
            String userPassword = "BAe8$521";
            String userName = "EBS";
            String payeeId = "0010020001";
            String phoneNo = "0922536006";
            String tranCurrency = "SDG";
          int tranamuont  = 1;
       ICash_payment_Request req = new ICash_payment_Request();
           req.setUUID(UUID);
           req.setapplicationid(applicationid);
           req.settranDateTime(tranDateTime);
          req.setentityId(entityID);
          req.setentityType(entityType);
          req.setpayeeId(payeeId);
          req.setpaymentInfo("041111111111");
          req.settranCurrency(tranCurrency);
           req.setIPIN(iPIN);
            req.settranAmount(tranamuont);
            req.setfromAccountType("00");
           // req.setfullName("tset");
      
           // req.settranAmount(tranamuont);
         //   req.setpaymentInfo(paymentInfo);
        //    req.setpayeeId(payeeId);
           CashResp = cashApi.ICash_payment(ICash_reqsthdr, req) ;
          
        //  System.out.print(CashResp.getavailablebalance());
          System.out.print(CashResp.getresponseMessage());
          System.out.print(CashResp.getresponseCode());
            
            ///*********** END ICASH TESTER *******************///


            /*GregorianCalendar gregorianCalendar = new GregorianCalendar();
          DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
          XMLGregorianCalendar Startdate = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
          XMLGregorianCalendar Enddate = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);*/

            /*Startdate.setYear(2014);
            Startdate.setMonth(05);
            Startdate.setDay(21);
            Startdate.setTime(12, 00, 00);


          Enddate.setYear(2014);
          Enddate.setMonth(05);
          Enddate.setDay(22);
          Enddate.setTime(12, 00, 00);*/

            //String StartDate = "20140526000000";
            //String EndDate = "20140528121015";
            //String Create = NorObj.NorCreateCampaign(reqsthdr, "88888", "TEST88888", StartDate, EndDate);

            // CustomerResponseMsg res=obj.CustInfoQryReq(reqsthdr, "928038956");
            //CustomerResponseMsg res=obj.GetConsumerInfo(reqsthdr, "928038956");
            /*RequestHDR reqsthdr = new RequestHDR();
          DateFormatter formatter = new DateFormatter("yyyyMMddHHmmss");
          String dt = formatter.formatDate(new Date());
          reqsthdr.setCommandId("GetConsumerInfo");
          reqsthdr.setPassword("CBOS#14");
          reqsthdr.setSerial("APQY" + dt);
          reqsthdr.setUserName("CBOS");
          */
            //CBOS_APIs CObj = new CBOS_APIs();
            //GmppResponse cashInResp = CObj.cashIn("928038956", "2", "123", "1456");
            //String Pay = CObj.PayBill(reqsthdr, "1", "1", "1", "123", "922902677", "Pay");

            //String getBalanceInfo = CObj.getBalance(reqsthdr,"1", "1", true);
            //String BalanceResp = CObj.Distribute(reqsthdr, "123", "10000", "123", "1191119", true);
            //String GetResp = CObj.GetLastTransactions(reqsthdr, "249119779119", "0000", true);

            //  TabsSessionEJB tabsSessionEJB = (TabsSessionEJB)context.lookup("MDW-MDW-TabsSessionEJB#sd.mtn.Billing.TabsSessionEJB");
            //    List<CcmGetData> templist = new ArrayList<CcmGetData>();
            //   templist = tabsSessionEJB.getCcmGetData("249922902670");

            //  LanguageResposeMessage resul=null;
            /* List<Postpaid_BillInfo> templist =
                new ArrayList<Postpaid_BillInfo>();*/
            // resul = obj.getPostPaidProfile(reqsthdr, "249922902670");

            /*LanguageResposeMessage resul =
                ocs_object.QueryCustomer(reqsthdr, "249922902670");*/
            //System.out.print(resul.getResultHeader().getResultCode());
            //System.out.print(resul.getResultHeader().getResultDesc());
            /*   RequestHDR reqsthdr = new RequestHDR();
            reqsthdr.setCommandId("comm");
            reqsthdr.setPassword("pass");
            reqsthdr.setSerial("APQY"+dt);
            reqsthdr.setUserName("user");

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
            /*  TABS_APIs obj=new TABS_APIs();
          LanguageResposeMessage result=obj.getPostPaidProfile(reqsthdr,"922902672");
          LanguageResposeMessage result1=obj.ChangePostpaidLang(reqsthdr,"922902672","2");

          TABS_APIs obj3=new TABS_APIs();
          LanguageResposeMessage result33=obj3.getPostPaidProfile(reqsthdr,"922902672");
          Commviva_APIs obj2=new Commviva_APIs();
          LanguageResposeMessage result3=obj2.QueryCustomer(reqsthdr,"922902672");*/

            // Commviva_APIs Commviva_object=new Commviva_APIs();
            //LanguageResposeMessage resul= Commviva_object.QueryCustomer(reqsthdr, "928038956");
            //finalResul=mDWSessionEJB.QuerySubscriberInfor(reqsthdr, "928038956");
            //fnlResul.getResultHeader().getResultCode()

        } catch (Exception ex) {
 
            ex.printStackTrace();
        }
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "weblogic.jndi.WLInitialContextFactory");
        //env.put(Context.PROVIDER_URL, "t3://172.17.10.60:7001");
        env.put(Context.PROVIDER_URL, "t3://localhost:7001");
        return new InitialContext(env);
    }
}


