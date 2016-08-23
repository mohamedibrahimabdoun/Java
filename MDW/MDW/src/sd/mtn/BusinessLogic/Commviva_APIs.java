package sd.mtn.BusinessLogic;

import com.bea.common.security.xacml.context.Request;

import com.huawei.bme.cbsinterface.common.RequestHeader;

import com.huawei.bme.cbsinterface.common.SimpleProperty;
import com.huawei.bme.cbsinterface.common.Subscriber;
import com.huawei.bme.cbsinterface.query.BalanceType;
import com.huawei.bme.cbsinterface.query.ProductOrderInfo;
import com.huawei.bme.cbsinterface.querymgr.QueryCustomerResultMsg;
import com.huawei.bme.cbsinterface.submgrtmgr.ChangeSubscriberBasicInforResultMsg;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import java.text.ParseException;

import oracle.jdbc.pool.OracleDataSource;

import java.util.logging.Level;
import java.util.logging.Logger;


import oracle.jdbc.OracleTypes;
import oracle.jdbc.*;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;

import javax.xml.bind.JAXBElement;

import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;



import oracle.jdbc.oracore.OracleTypeREF;
import oracle.jdbc.oracore.OracleTypeSINT32;

import sd.mtn.Data.DestinationResponse;
import sd.mtn.Data.DestinationResultMSG;
import sd.mtn.Data.ExternalNodeReplayRequest;
import sd.mtn.Data.ExternalNodeReplayResponse;
import sd.mtn.Data.ExternalNodeReplayResultMsg;
import sd.mtn.Data.LanguageRequest;
import sd.mtn.Data.LanguageRespose;
import sd.mtn.Data.LanguageResposeMessage;
import sd.mtn.Data.Menu;
import sd.mtn.Data.Pamaeters;
import sd.mtn.Data.QueryInfoRequest;
import sd.mtn.Data.QueryInfoResponse;
import sd.mtn.Data.ReplayMessages;
import sd.mtn.Data.RequestHDR;
import sd.mtn.Data.ResultHDR;
import sd.mtn.Data.SubscrState;

public class Commviva_APIs {
    public static LanguageResposeMessage ChangeSubscriberInfo(RequestHDR requestheader,
                                                              LanguageRequest languagerequest) throws ParseException {

        ChangeSubscriberBasicInforResultMsg tempresult =
            new ChangeSubscriberBasicInforResultMsg();
        OCS_APIs OCS_object = new OCS_APIs();
        tempresult =
                OCS_object.ChangeSubscriberInfo(requestheader, languagerequest);


        //Create LanguageResposeMessage
        LanguageResposeMessage finalResult = new LanguageResposeMessage();

        ResultHDR Sd_ResultHeader = new ResultHDR();
        if (tempresult.getResultHeader().getResultCode().equals("102010248")) {
            TABS_APIs tabsobj = new TABS_APIs();
            finalResult =
                    tabsobj.ChangePostpaidLang(requestheader, languagerequest.getMSISDN(),
                                               languagerequest.getLang());

        } else {
            Sd_ResultHeader.setResultCode(tempresult.getResultHeader().getResultCode());
            Sd_ResultHeader.setResultDesc(tempresult.getResultHeader().getResultDesc());
            Sd_ResultHeader.setTransserial(tempresult.getResultHeader().getTransactionId());
            Sd_ResultHeader.setCommandId(tempresult.getResultHeader().getCommandId());
            Sd_ResultHeader.setFinalResult(true);


            //  finalResult.setResultHeader();
            finalResult.setResultHeader(Sd_ResultHeader);
        }
        return finalResult;
    }

    public static LanguageResposeMessage QueryCustomer(RequestHDR requestheader,
                                                       String msisdn) {
        LanguageResposeMessage finalResult = new LanguageResposeMessage();
        QueryCustomerResultMsg tempResult = new QueryCustomerResultMsg();
        OCS_APIs OCS_object = new OCS_APIs();
        tempResult = OCS_object.QueryCustomer(requestheader, msisdn.substring(3, msisdn.length()));
        //Create LanguageResposeMessage


        ResultHDR Sd_ResultHeader = new ResultHDR();

        if (tempResult.getResultHeader().getResultCode().equals("405000000")) {
            Sd_ResultHeader.setResultCode(tempResult.getResultHeader().getResultCode());
            Sd_ResultHeader.setResultDesc(tempResult.getResultHeader().getResultDesc());
            Sd_ResultHeader.setTransserial(tempResult.getResultHeader().getTransactionId());
            Sd_ResultHeader.setCommandId(tempResult.getResultHeader().getCommandId());
            Sd_ResultHeader.setFinalResult(true);
            List<SimpleProperty> SimpleProp = new ArrayList<SimpleProperty>();
            String TempLang = "";
            String TempLangDescr = "";
            SimpleProp =
                    tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberInfo().getSimpleProperty();
            for (SimpleProperty SmplProp : SimpleProp) {
                if (SmplProp.getId().equals("SMSLangType")) {
                    TempLang = SmplProp.getValue();
                    TempLangDescr = getLanDescription(TempLang);

                }

            }
            LanguageRespose langResp = new LanguageRespose();
            langResp.setLang(TempLang);
            langResp.setLangDescription(TempLangDescr);
            langResp.setMSISDN(msisdn);
            langResp.setPrePost_Paid("PREP");
            langResp.setProfile(Integer.toString(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberInfo().getMainProductId()));
            //  langResp.setAcivationDate (tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getFirstActiveDate());

            //Set our Custom Subscriber State Class :HINT: OCS SubscriberState is static class this is the reason why we create our own class version
            SubscrState substat = new SubscrState();
            substat.setFirstActiveDate(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getFirstActiveDate());
            substat.setLastRechargeTime(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getLastRechargeTime());
            substat.setActiveCAC(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getActiveCAC());
            substat.setActiveStop(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getActiveStop());
            substat.setSuspendStop(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getSuspendStop());
            substat.setDisableStop(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getDisableStop());
            substat.setLifeCycleState(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getLifeCycleState().getValue());
            substat.setDpFlag(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getDPFlag());
            substat.setFraudState(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getFraudState());
            substat.setActiveCAC(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getActiveCAC());
            substat.setLossFlag(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getLossFlag().getValue());
            substat.setDpEndDate(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getDPEndDate());
            substat.setDpFlag1(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getDPFlag1().getValue());
            substat.setDpFlag2(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getDPFlag1().getValue());
            substat.setLastActiveDate(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getLastActiveDate());
            substat.setPosUserState(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getPOSUserState().getValue());
            // substat.setEtuFraudState (tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberState().getETUFraudState().getValue());
            //etuFraudState

            //Setting LanguageResposeMessage Feilds
            finalResult.setResultHeader(Sd_ResultHeader);
            finalResult.setLanguageReponse(langResp);
            finalResult.setSubscriberInfo(tempResult.getQueryCustomerResult().getSubscriber().get(0).getSubscriberInfo());
            finalResult.setSubscrState(substat);
            finalResult.setBalanceType((ArrayList<BalanceType>)tempResult.getQueryCustomerResult().getAccount().get(0).getBalanceRecordList().getBalance());
            finalResult.setProductOrderInfo((ArrayList<ProductOrderInfo>)tempResult.getQueryCustomerResult().getSubscriber().get(0).getProductList().getProduct());
        } else if (tempResult.getResultHeader().getResultCode().equals("102010248")) {
            //Postpaid
            TABS_APIs tabsobj = new TABS_APIs();
            LanguageRespose languageReponse_obj = new LanguageRespose();

            finalResult = tabsobj.getPostPaidProfile(requestheader, msisdn.substring(3, msisdn.length()));

            languageReponse_obj.setLang(finalResult.getPostpaid_Profile().getLang());
            languageReponse_obj.setMSISDN(finalResult.getPostpaid_Profile().getSubno());
            languageReponse_obj.setPrePost_Paid("POST");
            languageReponse_obj.setProfile(finalResult.getPostpaid_Profile().getTariff_profile());
            languageReponse_obj.setLangDescription(getLanDescription(finalResult.getPostpaid_Profile().getLang()));
            finalResult.setLanguageReponse(languageReponse_obj);


        } else {
            Sd_ResultHeader.setResultCode(tempResult.getResultHeader().getResultCode());
            Sd_ResultHeader.setResultDesc(tempResult.getResultHeader().getResultDesc());
            Sd_ResultHeader.setTransserial(tempResult.getResultHeader().getTransactionId());
            Sd_ResultHeader.setCommandId(tempResult.getResultHeader().getCommandId());
            Sd_ResultHeader.setFinalResult(true);
            finalResult.setResultHeader(Sd_ResultHeader);
        }

        return finalResult;

    }

    public static String getLanDescription(String Lang) {
        String LangDescr = "";
        switch (Integer.parseInt(Lang)) {
        case 1:
            LangDescr = "Arabic";
            break;
        case 2:
            LangDescr = "English";
            break;
        case 3:
            LangDescr = "Chinese";
            break;
        case 4:
            LangDescr = "Ethiopian";
            break;
        }

        return LangDescr;
    }


    public DestinationResultMSG getRequestInfo(RequestHDR rHeader,
                                               QueryInfoRequest qryinfoReqst) {
        String MenuString = "Menu";
        String xmlText =
            "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sub=\"http://www.huawei.com/bme/cbsinterface/subscribemgr\" xmlns:com=\"http://www.huawei.com/bme/cbsinterface/common\" xmlns:sub1=\"http://www.huawei.com/bme/cbsinterface/subscribe\">\n" +
            "   <soapenv:Header/>\n" +
            "   <soapenv:Body>\n" +
            "      <sub:ChangeOptionalOfferRequestMsg>\n" +
            "         <RequestHeader>\n" +
            "            <com:CommandId>ChangeOptionalOfferRequestMsg</com:CommandId>\n" +
            "            <com:Version>3.3</com:Version>\n" +
            "            <com:TransactionId>APTS2013012210073252</com:TransactionId>\n" +
            "            <com:SequenceId>APTS2013012210073252</com:SequenceId>\n" +
            "            <com:RequestType>Event</com:RequestType>\n" +
            "            <com:SerialNo>APTS2013012210073252</com:SerialNo>\n" +
            "            <com:Remark>Test Remarks 1 </com:Remark>\n" +
            "         </RequestHeader>\n" +
            "         <ChangeOptionalOfferRequest>\n" +
            "            <sub1:SubscriberNo>928038956</sub1:SubscriberNo>\n" +
            "            <sub1:OptionalOffer>\n" +
            "               <sub1:Id>400017</sub1:Id>\n" +
            "               <sub1:OperationType>1</sub1:OperationType>\n" +
            "               <sub1:ValidMode>\n" +
            "                  <sub1:Mode>4050000</sub1:Mode>\n" +
            "                <sub1:ExpireDate>20130123000000</sub1:ExpireDate>\n" +
            "             </sub1:ValidMode>\n" +
            "            </sub1:OptionalOffer>\n" +
            "            <sub1:HandleChargeFlag>0</sub1:HandleChargeFlag>\n" +
            "         </ChangeOptionalOfferRequest>\n" +
            "      </sub:ChangeOptionalOfferRequestMsg>\n" +
            "   </soapenv:Body>\n" +
            "</soapenv:Envelope>\n";

        ResultHDR resultmsg = new ResultHDR();
        DestinationResponse DestinationResponseObject =
            new DestinationResponse();
        List<DestinationResponse> DestinationResponseList =
            new ArrayList<DestinationResponse>();


        resultmsg.setResultCode("40500000");
        resultmsg.setResultDesc("My ResultDesc");
        resultmsg.setCommandId(rHeader.getCommandId());
        resultmsg.setTransserial(rHeader.getSerial());
        resultmsg.setFinalResult(false);

        List<String> msgLst = new ArrayList<String>();
        List<Menu> menuList = new ArrayList<Menu>();


        if (resultmsg.getCommandId().equals("menu")) {
            for (int i = 0; i < 1; i++) {

                for (int x = 0; x < 3; x++) {
                    Menu m = new Menu();
                    m.setMenuName("MenuName" + x);
                    m.setMenuDisplayName("DisplayName" + x);
                    menuList.add(m);
                }
                DestinationResponseObject.setDestinationMenuList(menuList);
                DestinationResponseObject.setDestintionRequestSequance(i);
                DestinationResponseObject.setDestintionEndPointUrl("N/A");


                DestinationResponseList.add(DestinationResponseObject);
                DestinationResponseObject.setDestintionRequestType("MENU");

            }


        } else {
            for (int i = 0; i < 3; i++) {


                DestinationResponseObject.setDestintionRequestSequance(i);
                DestinationResponseObject.setDestintionEndPointUrl("http://172.21.24." +
                                                                   Integer.toString(i) +
                                                                   ":" +
                                                                   Integer.toString(i) +
                                                                   "/services/SubscribeMgrService");
                DestinationResponseObject.setDestintionRequestType("HTTP");
                DestinationResponseObject.setDestinationContentMsg(xmlText);

                DestinationResponseList.add(DestinationResponseObject);

            }
            //msgLst.add(xmlText );

            //DestinationResponseObject.setDestinationContentMsgList(msgLst);
        }

        DestinationResultMSG finalresultmsg = new DestinationResultMSG();
        finalresultmsg.setDestinationresponse(DestinationResponseList);
        finalresultmsg.setRequestHeaderResponse(resultmsg);
        return finalresultmsg;
    }


    public ExternalNodeReplayResultMsg SubmitResponse(RequestHDR rHeader,
                                                      List<ExternalNodeReplayRequest> externalnodereplayRequest) {
        ExternalNodeReplayResultMsg responseMSG =
            new ExternalNodeReplayResultMsg();
        ExternalNodeReplayResponse result = new ExternalNodeReplayResponse();
        ResultHDR resultHeaderresp = new ResultHDR();
        resultHeaderresp.setCommandId(rHeader.getCommandId());
        resultHeaderresp.setResultCode("405000000");
        resultHeaderresp.setResultDesc("My Result Desc");
        resultHeaderresp.setFinalResult(true);
        rHeader.setSerial(rHeader.getSerial());

        List<ReplayMessages> msglst = new ArrayList<ReplayMessages>();
        for (int i = 0; i < 3; i++) {
            ReplayMessages mymsgobj = new ReplayMessages();
            mymsgobj.setMsgNo(i);
            mymsgobj.setMsgHeader("MTN");
            mymsgobj.setMsgText("MsgText" + (i + 1));
            mymsgobj.setMsgType("SMS");
            msglst.add(mymsgobj);
            mymsgobj = null;
        }
        ReplayMessages mymsgobj = new ReplayMessages();
        mymsgobj.setMsgNo(0);
        mymsgobj.setMsgHeader("");
        mymsgobj.setMsgText("USSD Flash Message");
        mymsgobj.setMsgType("USSD");
        msglst.add(mymsgobj);
        mymsgobj = null;


        result.setMessageList(msglst);

        responseMSG.setExternalnodereplayresponse(result);
        responseMSG.setRequestheaderresponse(resultHeaderresp);
        return responseMSG;
    }


    public List<DestinationResponse> getExternalNodesCode(String P_MSISDN,
                                                          String P_LANG,
                                                          String P_PREPOST_PAID,
                                                          String P_PROFILE,
                                                          String P_FAD,
                                                          String P_SHORTCODE,
                                                          String P_INPUT,
                                                          String P_SRC,
                                                          String P_NODE,
                                                          String P_USER) {
        /*
        P_MSISDN         IN VARCHAR2,
        P_LANG           IN VARCHAR2,
        P_PREPOST_PAID   IN VARCHAR2,
        P_PROFILE        IN VARCHAR2,
        P_FAD            IN VARCHAR2,
        P_SHORTCODE      IN VARCHAR2,
        P_INPUT          IN VARCHAR2,
        P_SRC            IN VARCHAR2,
        P_NODE           IN VARCHAR2,
        P_USER           IN VARCHAR2)
          */

        List<DestinationResponse> destinationResponseList =
            new ArrayList<DestinationResponse>();
        DestinationResponse destinationResponse_Obj = null;
        String callspstr = "{? =call  FN_GET_PARMATERS(?,?,?,?,?,?,?,?,?,?)}";
        OracleDataSource ods = null;
        Connection conn = null;
        ResultSet rset = null;
        String E_MSG;
        String E_RESULTCODE;
        String E_Result;

        try {

            ods.setURL("jdbc:oracle:thin:@172.17.10.80:1521:gwdb1");
            ods.setUser("GATEWAY");
            ods.setPassword("GATEWAY10.7");
            conn = ods.getConnection();

            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            /* cn =
            DriverManager.getConnection("jdbc:oracle:thin:@172.17.10.80:1521:gwdb1",
                               "GATEWAY", "GATEWAY10.7");*/
            CallableStatement callStatement = null;

            callStatement = (CallableStatement)conn.prepareCall(callspstr);

            callStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callStatement.setString(2, P_MSISDN);
            callStatement.setString(3, P_LANG);
            callStatement.setString(4, P_PREPOST_PAID);
            callStatement.setString(5, P_PROFILE);
            callStatement.setString(6, P_FAD);
            callStatement.setString(7, P_SHORTCODE);
            callStatement.setString(8, P_INPUT);
            callStatement.setString(9, P_SRC);
            callStatement.setString(10, P_NODE);
            callStatement.setString(11, P_USER);

            callStatement.executeQuery();

            ResultSet rs =
                ((oracle.jdbc.OracleCallableStatement)callStatement).getCursor(1);
            while (rs.next()) {
                destinationResponse_Obj = new DestinationResponse();

                destinationResponse_Obj.setDestintionRequestSequance(Integer.parseInt(rs.getString("CAS_ACTION_PRIORITY")));
                destinationResponse_Obj.setDestinationContentMsg(rs.getString("ACTUAL_TXT"));
                destinationResponse_Obj.setDestintionEndPointUrl(rs.getString("CCS_ENDPOINT_ADDRESS"));
                destinationResponse_Obj.setDestintionRequestType(rs.getString("CAS_EXTERNAL_NODE_TYPE"));
                destinationResponseList.add(destinationResponse_Obj);
                destinationResponse_Obj = null;
                /*     String CAS_EXTERNAL_NODE_TYPE =
                    rs.getString("CAS_EXTERNAL_NODE_TYPE");

                  String CAS_ACTION_PRIORITY =
                      rs.getString("CAS_ACTION_PRIORITY");
                  String CAS_COMMAND_SETTING_ID =
                      rs.getString("CAS_COMMAND_SETTING_ID");
                  String CAS_PARAM_SETTING_ID =
                      rs.getString("CAS_PARAM_SETTING_ID");
                  String CO_SHORTCODE = rs.getString("CO_SHORTCODE");
                  String CO_SHORTCODE_OPTION =
                      rs.getString("CO_SHORTCODE_OPTION");
                  String CO_PREPOST_PAID = rs.getString("CO_PREPOST_PAID");
                  String CO_ACTION_ID = rs.getString("CO_ACTION_ID");
                  String CCS_COMMAND_SETTING_ID =
                      rs.getString("CCS_COMMAND_SETTING_ID");
                  String CCS_COMMAND_SETTING_DESCR =
                      rs.getString("CCS_COMMAND_SETTING_DESCR");
                  String CCS_DB_USER_NAME = rs.getString("CCS_DB_USER_NAME");
                  String CCS_DB_USER_PASSWORD =
                      rs.getString("CCS_DB_USER_PASSWORD");

                  String ACTUAL_TXT = rs.getString("ACTUAL_TXT");
                  String CCS_ENDPOINT_ADDRESS =
                      rs.getString("CCS_ENDPOINT_ADDRESS");


                  System.out.print("CAS_ACTION_PRIORITY : " +
                                   CAS_ACTION_PRIORITY + "\n");
                  System.out.print("CAS_COMMAND_SETTING_ID : " +
                                   CAS_COMMAND_SETTING_ID + "\n");
                  System.out.print("CAS_PARAM_SETTING_ID : " +
                                   CAS_PARAM_SETTING_ID + "\n");
                  System.out.print("CAS_PARAM_SETTING_ID : " +
                                   CAS_PARAM_SETTING_ID + "\n");
                  System.out.print("CO_SHORTCODE : " + CO_SHORTCODE + "\n");
                  System.out.print("CO_SHORTCODE_OPTION : " +
                                   CO_SHORTCODE_OPTION + "\n");
                  System.out.print("CO_PREPOST_PAID : " + CO_PREPOST_PAID +
                                   "\n");
                  System.out.print("CO_ACTION_ID : " + CO_ACTION_ID + "\n");
                  System.out.print("CCS_COMMAND_SETTING_ID : " +
                                   CCS_COMMAND_SETTING_ID + "\n");
                  System.out.print("CCS_COMMAND_SETTING_DESCR : " +
                                   CCS_COMMAND_SETTING_DESCR + "\n");
                  System.out.print("CCS_ENDPOINT_ADDRESS: " +
                                   CCS_ENDPOINT_ADDRESS + "\n");
                  System.out.print("CCS_DB_USER_NAME: " + CCS_DB_USER_NAME +
                                   "\n");

                  System.out.print("CCS_DB_USER_PASSWORD : " +
                                   CCS_DB_USER_PASSWORD + "\n");
                  System.out.print("ACTUAL_TXT : " + ACTUAL_TXT + "\n");
                  System.out.print("-----------------------------------------------------------------" +
                                   "\n");
                  System.out.print("-----------------------------------------------------------------" +
                                   "\n");

*/
            }
            rs.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


        return destinationResponseList;
    }

}
