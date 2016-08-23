package sd.mtn.Beans;

import com.gemalto.ggs.cbos.wswrapper.ws.GetSVABalanceResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.GmppResponse;

import com.huawei.bme.cbsinterface.common.RequestHeader;

import java.text.ParseException;

import java.util.List;

import javax.ejb.Stateless;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import sd.mtn.BusinessLogic.CBOS_APIs;
import sd.mtn.BusinessLogic.Commviva_APIs;
import sd.mtn.BusinessLogic.ICash_APIs;
import sd.mtn.BusinessLogic.NOR_APIs;
import sd.mtn.BusinessLogic.SuperWiFi_APIs;
import sd.mtn.BusinessLogic.TABS_APIs;
import sd.mtn.Data.CustomerResponseMsg;
import sd.mtn.Data.DestinationResponse;
import sd.mtn.Data.DestinationResultMSG;
import sd.mtn.Data.ExternalNodeReplayRequest;
import sd.mtn.Data.ExternalNodeReplayResultMsg;
import sd.mtn.Data.ICash_getBill_Request;
import sd.mtn.Data.ICash_IsAlive_Response;
import sd.mtn.Data.ICash_IsAlive_Request;
import sd.mtn.Data.ICash_IsAlive_ResponseMsg;
import sd.mtn.Data.ICash_doCardTransfer_Request;
import sd.mtn.Data.ICash_doCardTransfer_Response;
import sd.mtn.Data.ICash_getBalance_Request;
import sd.mtn.Data.ICash_getBalance_Response;
import sd.mtn.Data.ICash_getBill_Response;
import sd.mtn.Data.ICash_getPayeesList_Request;
import sd.mtn.Data.ICash_getPayeesList_Response;
import sd.mtn.Data.ICash_getPublicKey_Request;
import sd.mtn.Data.ICash_getPublicKey_Response;
import sd.mtn.Data.ICash_payment_Request;
import sd.mtn.Data.ICash_payment_Response;
import sd.mtn.Data.ICash_register_Request;
import sd.mtn.Data.ICash_register_Response;
import sd.mtn.Data.ICash_reverse_Request;
import sd.mtn.Data.ICash_reverse_Response;
import sd.mtn.Data.LanguageRequest;
import sd.mtn.Data.LanguageResposeMessage;
import sd.mtn.Data.QueryGSM;
import sd.mtn.Data.QueryInfoRequest;
import sd.mtn.Data.QueryInfoResponse;
import sd.mtn.Data.RequestHDR;
import sd.mtn.Data.SuperWiFiResposeMessage;
import sd.mtn.Data.SuperWiFiUserRequest;
import sd.mtn.Data.Customer_Reqest;
import sd.mtn.Data.Customer_Resp;


@Stateless(name="MDWSessionEJB", mappedName = "MDW-MDW-MDWSessionEJB")
@WebService(name = "mdw", serviceName = "mdw", portName = "mdwPort",
            targetNamespace = "http://MTN.SD/MDW")
public class MDWSessionEJBBean implements MDWSessionEJB {
    public MDWSessionEJBBean() {
    }

    @WebMethod(operationName = "ChangeLanguage",
               action = "http://MTN.SD/MDW/ChangeLanguage")
    @WebResult(name = "ChangeLanguageResponse")
    public LanguageResposeMessage ChangeSubscriberInfo(@WebParam(name =
                                                                 "RequestHeader")
        RequestHDR requestheader, @WebParam(name = "LanguageRequest")
        LanguageRequest languagerequest) {

        LanguageResposeMessage finalResul = new LanguageResposeMessage();
        Commviva_APIs Commviva_object = new Commviva_APIs();
        try {
            finalResul =
                    Commviva_object.ChangeSubscriberInfo(requestheader, languagerequest);
        } catch (ParseException e) {
        }
        return finalResul;
    }

    @WebMethod(operationName = "QuerySubscriberInfor",
               action = "http://MTN.SD/MDW/QuerySubscriberInfor")
    @WebResult(name = "LanguageResposeMessage")
    public LanguageResposeMessage QuerySubscriberInfor(@WebParam(name =
                                                                 "RequestHeader")
        RequestHDR requestheader, @WebParam(name = "SubscriberNo")
        String msisdn) {

        LanguageResposeMessage finalResul = new LanguageResposeMessage();
        Commviva_APIs Commviva_object = new Commviva_APIs();
        finalResul = Commviva_object.QueryCustomer(requestheader, msisdn);
        return finalResul;

    }


    @WebMethod(operationName = "SuperWiFiReqUser",
               action = "http://MTN.SD/MDW/SuperWiFiReqUser")
    @WebResult(name = "SuperWiFiResposeMessage")
    public SuperWiFiResposeMessage SuperWiFi(@WebParam(name = "RequestHeader")
        RequestHDR requestheader, @WebParam(name = "RequestInfo")
        SuperWiFiUserRequest SuR) {

        SuperWiFiResposeMessage finalResul = new SuperWiFiResposeMessage();
        SuperWiFi_APIs Super_object = new SuperWiFi_APIs();
        finalResul = Super_object.SuperWiFiRequestMsg(requestheader, SuR);
        return finalResul;

    }

    @WebMethod(operationName = "getRequestInfo")
    @WebResult(name = "DestinationReSultMSG")
    public DestinationResultMSG getRequestInfo(@WebParam(name =
                                                         "RequestHeaderRequest")
        RequestHDR rHeader, @WebParam(name = "QueryInfoRequest")
        QueryInfoRequest qryinfoReqst) {

        Commviva_APIs commviva_Object = new Commviva_APIs();
        String P_MSISDN =
            qryinfoReqst.getLanguageResposeMessage().getLanguageReponse().getMSISDN();
        String P_LANG =
            qryinfoReqst.getLanguageResposeMessage().getLanguageReponse().getLang();
        String P_PREPOST_PAID =
            qryinfoReqst.getLanguageResposeMessage().getLanguageReponse().getPrePost_Paid();
        String P_PROFILE =
            qryinfoReqst.getLanguageResposeMessage().getLanguageReponse().getProfile();
        String P_FAD =
            qryinfoReqst.getLanguageResposeMessage().getLanguageReponse().getAcivationDate();

        String P_SHORTCODE = "";
        String P_INPUT = "";
        String P_SRC = "";
        String P_NODE = "";
        String P_USER = "";
        for (int i = 0; i < qryinfoReqst.getParamList().size(); i++) {
            if (qryinfoReqst.getParamList().get(i).getParamName().equals("Shortcode")) {
                P_SHORTCODE =
                        qryinfoReqst.getParamList().get(i).getParamValue();
            } else if (qryinfoReqst.getParamList().get(i).getParamName().equals("input")) {
                P_INPUT = qryinfoReqst.getParamList().get(i).getParamValue();
            } else if (qryinfoReqst.getParamList().get(i).getParamName().equals("src")) {
                P_SRC = qryinfoReqst.getParamList().get(i).getParamValue();
            } else if (qryinfoReqst.getParamList().get(i).getParamName().equals("node")) {
                P_NODE = qryinfoReqst.getParamList().get(i).getParamValue();
            } else if (qryinfoReqst.getParamList().get(i).getParamName().equals("user")) {
                P_USER = qryinfoReqst.getParamList().get(i).getParamValue();
            }

        }


        List<DestinationResponse> destRspList =
            commviva_Object.getExternalNodesCode(P_MSISDN, P_LANG,
                                                 P_PREPOST_PAID, P_PROFILE,
                                                 P_FAD, P_SHORTCODE, P_INPUT,
                                                 P_SRC, P_NODE, P_USER);
        return commviva_Object.getRequestInfo(rHeader, qryinfoReqst);
    }


    @WebMethod(operationName = "SubmitResponse")
    @WebResult(name = "ExternalNodeReplayResultMsg")
    public ExternalNodeReplayResultMsg SubmitResponse(@WebParam(name =
                                                                "RequestHeaderRequest")
        RequestHDR rHeader, @WebParam(name = "ExternalNodRreplayRequestList")
        List<ExternalNodeReplayRequest> externalnodereplayRequest) {

        Commviva_APIs commviva_Object = new Commviva_APIs();


        return commviva_Object.SubmitResponse(rHeader,
                                              externalnodereplayRequest);

    }

    public CustomerResponseMsg CustInfoQryReq(@WebParam(name =
                                                        "RequestHeaderRequest")
        RequestHDR resultHeader, @WebParam(name = "MSISND")
        String pMSISDN) {
        TABS_APIs TABS_APIs_Object = new TABS_APIs();
        return TABS_APIs_Object.CustInfoQryReq(resultHeader, pMSISDN);
    }


    public CustomerResponseMsg GetConsumerInfo(@WebParam(name =
                                                         "RequestHeaderRequest")
        RequestHDR resultHeader, @WebParam(name = "MSISND")
        String MSISDN) {
        CustomerResponseMsg ressult = null;
        TABS_APIs obj = new TABS_APIs();
        ressult = obj.GetConsumerInfo(resultHeader, MSISDN);
        return ressult;
    }


    //////////////////////////////////////////////////////////
    //////////CBOS APIs/////////////
    //////////////////////////////////////////////////////////

    @WebMethod(operationName = "Distribute",
               action = "http://MTN.SD/MDW/Distribute")
    @WebResult(name = "String")
    public String Distribute(@WebParam(name = "RequestHeaderRequest")
        RequestHDR resultHeader, @WebParam(name = "sourceIdentifier")
        String sourceIdentifier, @WebParam(name = "amount")
        String amount, @WebParam(name = "pin")
        String pin, @WebParam(name = "destinationIdentifier")
        String destinationIdentifier) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.Distribute(resultHeader, sourceIdentifier, amount, pin,
                              destinationIdentifier);
    }

    @WebMethod(operationName = "Recharge",
               action = "http://MTN.SD/MDW/Recharge")
    @WebResult(name = "String")
    public String Recharge(@WebParam(name = "RequestHeaderRequest")
        RequestHDR resultHeader, @WebParam(name = "sourceIdentifier")
        String sourceIdentifier, @WebParam(name = "amount")
        String amount, @WebParam(name = "pin")
        String pin, @WebParam(name = "payeeId")
        String payeeId, @WebParam(name = "customerPayeeId")
        String customerPayeeId, @WebParam(name = "transactionName")
        String transactionName) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.Recharge(resultHeader, sourceIdentifier, amount, pin,
                            payeeId, customerPayeeId, transactionName);
    }

    @WebMethod(operationName = "ConsumerRegistration",
               action = "http://MTN.SD/MDW/ConsumerRegistration")
    @WebResult(name = "String")
    public String ConsumerRegistration(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "serviceProviderId")
        String serviceProviderId, @WebParam(name = "consumerIdentifier")
        String consumerIdentifier, @WebParam(name = "kycType")
        String kycType, @WebParam(name = "kycValue")
        String kycValue) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.ConsumerRegistration(requestheader, serviceProviderId,
                                        consumerIdentifier, kycType, kycValue);
    }


    @WebMethod(operationName = "RegisterConsumerAtMerchant",
               action = "http://MTN.SD/MDW/RegisterConsumerAtMerchant")
    @WebResult(name = "String")
    public String RegisterConsumerAtMerchant(@WebParam(name =
                                                       "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "consumerIdentifier")
        String consumerIdentifier, @WebParam(name = "managerMSISDN")
        String managerMSISDN, @WebParam(name = "pin")
        String pin) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.RegisterConsumerAtMerchant(requestheader,
                                              consumerIdentifier,
                                              managerMSISDN, pin);
    }

    @WebMethod(operationName = "CompleteConsumerRegistration",
               action = "http://MTN.SD/MDW/CompleteConsumerRegistration")
    @WebResult(name = "String")
    public String CompleteConsumerRegistration(@WebParam(name =
                                                         "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "consumerIdentifier")
        String consumerIdentifier, @WebParam(name = "managerMSISDN")
        String managerMSISDN, @WebParam(name = "pin")
        String pin, @WebParam(name = "serviceProviderId")
        String serviceProviderId, @WebParam(name = "tan")
        String tan, @WebParam(name = "kycType")
        String kycType, @WebParam(name = "kycValue")
        String kycValue, @WebParam(name = "flowId")
        String flowId) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.CompleteConsumerRegistration(requestheader,
                                                consumerIdentifier,
                                                managerMSISDN, pin,
                                                serviceProviderId, tan,
                                                kycType, kycValue, flowId);
    }

    @WebMethod(operationName = "SelfTopUp",
               action = "http://MTN.SD/MDW/SelfTopUp")
    @WebResult(name = "String")
    public String SelfTopUp(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "payeeId")
        String payeeId, @WebParam(name = "amount")
        String amount, @WebParam(name = "consumerIdentifier")
        String consumerIdentifier, @WebParam(name = "pin")
        String pin, @WebParam(name = "transactionName")
        String transactionName) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.SelfTopUp(requestheader, payeeId, amount,
                             consumerIdentifier, pin, transactionName);
    }

    @WebMethod(operationName = "PayBill", action = "http://MTN.SD/MDW/PayBill")
    @WebResult(name = "String")
    public String PayBill(@WebParam(name = "RequestHeaderRequest")
        RequestHDR resultHeader, @WebParam(name = "sourceIdentifier")
        String sourceIdentifier, @WebParam(name = "amount")
        String amount, @WebParam(name = "payeeId")
        String payeeId, @WebParam(name = "pin")
        String pin, @WebParam(name = "customerPayeeId")
        String customerPayeeId, @WebParam(name = "transactionName")
        String transactionName) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.PayBill(resultHeader, sourceIdentifier, amount, payeeId,
                           pin, customerPayeeId, transactionName);
    }

    @WebMethod(operationName = "transferMoneyP2P",
               action = "http://MTN.SD/MDW/transferMoneyP2P")
    @WebResult(name = "String")
    public String transferMoneyP2P(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "consumerIdentifier")
        String consumerIdentifier, @WebParam(name = "amount")
        String amount, @WebParam(name = "pin")
        String pin, @WebParam(name = "destinationIdentifier")
        String destinationIdentifier) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.transferMoneyP2P(requestheader, consumerIdentifier, amount,
                                    pin, destinationIdentifier);
    }

    @WebMethod(operationName = "CashIn", action = "http://MTN.SD/MDW/CashIn")
    @WebResult(name = "String")
    public String CashIn(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "managerMSISDN")
        String managerMSISDN, @WebParam(name = "amount")
        String amount, @WebParam(name = "pin")
        String pin, @WebParam(name = "destinationConsumerIdentifier")
        String destinationConsumerIdentifier) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.CashIn(requestheader, managerMSISDN, amount, pin,
                          destinationConsumerIdentifier);
    }


    @WebMethod(operationName = "StartCashOut",
               action = "http://MTN.SD/MDW/StartCashOut")
    @WebResult(name = "String")
    public String StartCashOut(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "sourceIdetifier")
        String sourceIdetifier, @WebParam(name = "amount")
        String amount, @WebParam(name = "pin")
        String pin, @WebParam(name = "cashOutAt")
        String cashOutAt, @WebParam(name = "cashOutAll")
        Boolean cashOutAll) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.StartCashOut(requestheader, sourceIdetifier, amount, pin,
                                cashOutAt, cashOutAll);
    }

    @WebMethod(operationName = "CompleteCashOutAtMerchant",
               action = "http://MTN.SD/MDW/CompleteCashOutAtMerchant")
    @WebResult(name = "String")
    public String CompleteCashOutAtMerchant(@WebParam(name =
                                                      "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "managerMSISDN")
        String managerMSISDN, @WebParam(name = "pin")
        String pin, @WebParam(name = "transactionId")
        String transactionId, @WebParam(name = "tan")
        String tan) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.CompleteCashOutAtMerchant(requestheader, managerMSISDN, pin,
                                             transactionId, tan);
    }

    @WebMethod(operationName = "P2SBuy", action = "http://MTN.SD/MDW/P2SBuy")
    @WebResult(name = "String")
    public String P2SBuy(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "sourceIdentifier")
        String sourceIdentifier, @WebParam(name = "amount")
        String amount, @WebParam(name = "pin")
        String pin, @WebParam(name = "destinationIdentifier")
        String destinationIdentifier, @WebParam(name = "transactionName")
        String transactionName) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.P2SBuy(requestheader, sourceIdentifier, amount, pin,
                          destinationIdentifier, transactionName);
    }

    @WebMethod(operationName = "getSVABalance",
               action = "http://MTN.SD/MDW/getSVABalance")
    @WebResult(name = "String")
    public String getSVABalance(@WebParam(name = "RequestHeaderRequest")
        RequestHDR resultHeader, @WebParam(name = "sourceIdentifier")
        String sourceIdentifier, @WebParam(name = "pin")
        String pin, @WebParam(name = "isConsumer")
        Boolean isConsumer) {

        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.GetSvaBalance(resultHeader, sourceIdentifier, pin,
                                 isConsumer);
        //Resp = obj.getBalance(sourceIdentifier, pin, isConsumer);
        //return Resp;

    }


    @WebMethod(operationName = "GetLastTransactions",
               action = "http://MTN.SD/MDW/GetLastTransactions")
    @WebResult(name = "String")
    public String GetLastTransactions(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "sourceIdentifier")
        String sourceIdentifier, @WebParam(name = "pin")
        String pin, @WebParam(name = "isConsumer")
        Boolean isConsumer) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.GetLastTransactions(requestheader, sourceIdentifier, pin,
                                       isConsumer);
    }

    @WebMethod(operationName = "SvaToCard",
               action = "http://MTN.SD/MDW/SvaToCard")
    @WebResult(name = "String")
    public String SvaToCard(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "sourceIdentifier")
        String sourceIdentifier, @WebParam(name = "amount")
        String amount, @WebParam(name = "pin")
        String pin) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.SvaToCard(requestheader, sourceIdentifier, amount, pin);
    }

    @WebMethod(operationName = "CardToSVA",
               action = "http://MTN.SD/MDW/CardToSVA")
    @WebResult(name = "String")
    public String CardToSVA(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "sourceIdentifier")
        String sourceIdentifier, @WebParam(name = "amount")
        String amount, @WebParam(name = "pin")
        String pin, @WebParam(name = "ipin")
        String ipin, @WebParam(name = "expDate")
        String expDate) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.CardToSVA(requestheader, sourceIdentifier, amount, pin,
                             ipin, expDate);
    }

    @WebMethod(operationName = "ChangePin",
               action = "http://MTN.SD/MDW/ChangePin")
    @WebResult(name = "String")
    public String ChangePin(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "sourceIdentifier")
        String sourceIdentifier, @WebParam(name = "newPin")
        String newPin, @WebParam(name = "oldPIN")
        String oldPIN, @WebParam(name = "isConsumer")
        Boolean isConsumer) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.ChangePin(requestheader, sourceIdentifier, newPin, oldPIN,
                             isConsumer);
    }

    @WebMethod(operationName = "SelfLock",
               action = "http://MTN.SD/MDW/SelfLock")
    @WebResult(name = "String")
    public String SelfLock(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "consumerIdentifier")
        String consumerIdentifier, @WebParam(name = "pin")
        String pin) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.SelfLock(requestheader, consumerIdentifier, pin);
    }

    @WebMethod(operationName = "selfUnlock",
               action = "http://MTN.SD/MDW/selfUnlock")
    @WebResult(name = "String")
    public String selfUnlock(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "sourceIdentifier")
        String sourceIdentifier, @WebParam(name = "pin")
        String pin) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.selfUnlock(requestheader, sourceIdentifier, pin);
    }

    @WebMethod(operationName = "UpdateConsumerInfo",
               action = "http://MTN.SD/MDW/UpdateConsumerInfo")
    @WebResult(name = "String")
    public String UpdateConsumerInfo(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "bankAccountNumber")
        String bankAccountNumber, @WebParam(name = "bankAccountType")
        String bankAccountType, @WebParam(name = "bankBranchId")
        String bankBranchId, @WebParam(name = "bankId")
        String bankId, @WebParam(name = "city")
        String city, @WebParam(name = "consumerIdentifier")
        String consumerIdentifier, @WebParam(name = "dateOfBirth")
        String dateOfBirth, @WebParam(name = "fullName")
        String fullName, @WebParam(name = "managerMSISDN")
        String managerMSISDN, @WebParam(name = "nationality")
        String nationality, @WebParam(name = "pin")
        String pin, @WebParam(name = "primaryAccountNumber")
        String primaryAccountNumber, @WebParam(name = "state")
        String state, @WebParam(name = "street")
        String street) {
        GmppResponse Resp = null;
        CBOS_APIs obj = new CBOS_APIs();
        return obj.UpdateConsumerInfo(requestheader, bankAccountNumber,
                                      bankAccountType, bankBranchId, bankId,
                                      city, consumerIdentifier, dateOfBirth,
                                      fullName, managerMSISDN, nationality,
                                      pin, primaryAccountNumber, state,
                                      street);
    }


    @WebMethod(operationName = "NorCreateCampaign",
               action = "http://MTN.SD/MDW/NorCreateCampaign")
    @WebResult(name = "String")
    public String NorCreateCampaign(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "CampaignId")
        String CampaignId, @WebParam(name = "CampaignName")
        String CampaignName, @WebParam(name = "StartDate")
        String StartDate, @WebParam(name = "EndDate")
        String EndDate) {
        GmppResponse Resp = null;
        NOR_APIs obj = new NOR_APIs();
        return obj.NorCreateCampaign(requestheader, CampaignId, CampaignName,
                                     StartDate, EndDate);
    }

    @WebMethod(operationName = "NorAddMsisdn",
               action = "http://MTN.SD/MDW/NorAddMsisdn")
    @WebResult(name = "String")
    public Integer NorAddMsisdn(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "MSISDN")
        Integer MSISDN, @WebParam(name = "CampaignName")
        String CampaignName) {
        GmppResponse Resp = null;
        NOR_APIs obj = new NOR_APIs();
        return obj.AddMsisdn(requestheader, MSISDN, CampaignName);
    }

    public String GetSvaBalance(RequestHDR requestheader,
                                String sourceIdentifier, String pin,
                                Boolean isConsumer) {
        return null;
    }

    //////////////////////////////////////////////////////////////////
    //////////////////   ICASH   //////////////
    //////////////////////////////////////////////////////


    @WebMethod(operationName = "ICash_IsAlive",
               action = "http://MTN.SD/MDW/ICash_IsAlive")
    @WebResult(name = "ICash_IsAlive_Response")
    public ICash_IsAlive_Response ICash_IsAlive(@WebParam(name =
                                                          "RequestHeaderRequest")
        RequestHDR resultHeader, @WebParam(name = "applicationid")
        String applicationid, @WebParam(name = "tranDateTime")
        String tranDateTime, @WebParam(name = "UUID")
        String UUID) {
        ICash_IsAlive_Request IsAlv = new ICash_IsAlive_Request();

        IsAlv.setapplicationid(applicationid);
        IsAlv.settranDateTime(tranDateTime);
        IsAlv.setUUID(UUID);

        ICash_APIs ICash = new ICash_APIs();


        ICash_IsAlive_Response resp = ICash.ICash_IsAlive(resultHeader, IsAlv);
        return resp;
    }


    @WebMethod(operationName = "ICash_getBill",
               action = "http://MTN.SD/MDW/ICash_getBill")
    @WebResult(name = "ICash_getBill_Response")
    public ICash_getBill_Response ICash_getBill(@WebParam(name =
                                                          "RequestHeaderRequest")
        RequestHDR resultHeader, @WebParam(name = "applicationid")
        String applicationid, @WebParam(name = "tranDateTime")
        String tranDateTime, @WebParam(name = "UUID")
        String UUID, @WebParam(name = "userName")
        String userName, @WebParam(name = "userPassword")
        String userPassword, @WebParam(name = "entityId")
        String entityId, @WebParam(name = "entityType")
        String entityType, @WebParam(name = "PAN")
        String PAN, @WebParam(name = "mbr")
        String mbr, @WebParam(name = "expDate")
        String expDate, @WebParam(name = "IPIN")
        String IPIN, @WebParam(name = "payeeId")
        String payeeId, @WebParam(name = "paymentInfo")
        String paymentInfo, @WebParam(name = "authenticationType")
        String authenticationType) {
        ICash_getBill_Request B_Iuq = new ICash_getBill_Request();

        B_Iuq.setapplicationid(applicationid);
        B_Iuq.settranDateTime(tranDateTime);
        B_Iuq.setUUID(UUID);
        B_Iuq.setuserName(userName);
        B_Iuq.setuserPassword(userPassword);
        B_Iuq.setentityId(entityId);
        B_Iuq.setentityType(entityType);
        B_Iuq.setPAN(PAN);
        B_Iuq.setmbr(mbr);
        B_Iuq.setexpDate(expDate);
        B_Iuq.setIPIN(IPIN);
        B_Iuq.setpayeeId(payeeId);
        B_Iuq.setpaymentInfo(paymentInfo);
        B_Iuq.setauthenticationType(authenticationType);


        ICash_APIs ICash = new ICash_APIs();

        ICash_getBill_Response RESP = ICash.ICash_getBill(resultHeader, B_Iuq);
        return RESP;
    }


    @WebMethod(operationName = "ICash_register",
               action = "http://MTN.SD/MDW/ICash_register")
    @WebResult(name = "ICash_register_Response")
    public ICash_register_Response ICash_register(@WebParam(name =
                                                            "RequestHeaderRequest")
        RequestHDR resultHeader, @WebParam(name = "applicationid")
        String applicationid, @WebParam(name = "tranDateTime")
        String tranDateTime, @WebParam(name = "UUID")
        String UUID, @WebParam(name = "userName")
        String userName, @WebParam(name = "userPassword")
        String userPassword, @WebParam(name = "entityId")
        String entityId, @WebParam(name = "entityType")
        String entityType, @WebParam(name = "entityGroup")
        String entityGroup, @WebParam(name = "phoneNo")
        String phoneNo, @WebParam(name = "email")
        String email, @WebParam(name = "financialInstitutionId")
        String financialInstitutionId, @WebParam(name = "PAN")
        String PAN, @WebParam(name = "IPIN")
        String IPIN, @WebParam(name = "mbr")
        String mbr, @WebParam(name = "expDate")
        String expDate, @WebParam(name = "panCategory")
        String panCategory, @WebParam(name = "registrationType")
        String registrationType, @WebParam(name = "fullName")
        String fullName, @WebParam(name = "customerIdNumber")
        String customerIdNumber, @WebParam(name = "customerIdType")
        String customerIdType, @WebParam(name = "bankAccountNumber")
        String bankAccountNumber, @WebParam(name = "bankAccountType")
        String bankAccountType, @WebParam(name = "bankBranchId")
        String bankBranchId, @WebParam(name = "bankId")
        String bankId, @WebParam(name = "dateOfBirth")
        String dateOfBirth, @WebParam(name = "job")
        String job)

    {
        ICash_register_Request Reg_rqst = new ICash_register_Request();

        Reg_rqst.setapplicationid(applicationid);
        Reg_rqst.settranDateTime(tranDateTime);
        Reg_rqst.setUUID(UUID);
        Reg_rqst.setuserName(userName);
        Reg_rqst.setfinancialInstitutionId(financialInstitutionId);
        Reg_rqst.setuserPassword(userPassword);
        Reg_rqst.setentityId(entityId);
        Reg_rqst.setentityType(entityType);
        Reg_rqst.setentityGroup(entityGroup);
        Reg_rqst.setmbr(mbr);
        Reg_rqst.setexpDate(expDate);
        Reg_rqst.setphoneNo(phoneNo);
        Reg_rqst.setemail(email);
        Reg_rqst.setPAN(PAN);
        Reg_rqst.setIPIN(IPIN);
        Reg_rqst.setpanCategory(panCategory);
      Reg_rqst.setregistrationType(registrationType);
        Reg_rqst.setfullName(fullName);
      Reg_rqst.setcustomerIdType(customerIdType);
      Reg_rqst.setbankAccountNumber(bankAccountNumber);
      Reg_rqst.setcustomerIdNumber(customerIdNumber);
      Reg_rqst.setbankAccountType(bankAccountType);
      Reg_rqst.setbankBranchId(bankBranchId);
      Reg_rqst.setbankId(bankId);
      Reg_rqst.setdateOfBirth(dateOfBirth);
      Reg_rqst.setjob(job);
     

        ICash_APIs ICash = new ICash_APIs();


        ICash_register_Response RESP =
            ICash.ICash_register(resultHeader, Reg_rqst);
        return RESP;
    }

    /* @WebMethod(operationName = "reverse",
             action = "http://MTN.SD/MDW/reverse")
  @WebResult(name = "ICash_IsAlive_RESP")
  public  String reverse (
                          @WebParam(name = "applicationid") String  applicationid,
                          @WebParam(name = "tranDateTime") String tranDateTime,
                          @WebParam(name = "UUID") String UUID){
  ICash_reverse_Request Rvl_rqst = new   ICash_reverse_Request ();
  Rvl_rqst.setapplicationid(applicationid);
  Rvl_rqst.settranDateTime(tranDateTime);
  Rvl_rqst.setUUID(UUID);

  ICash_APIs ICash = new ICash_APIs();

       ICash.Reverse(Rvl_rqst);

      return  ICash.Reverse(Rvl_rqst).toString();
    }
  */


    @WebMethod(operationName = "ICash_getPublicKey",
               action = "http://MTN.SD/MDW/ICash_getPublicKey")
    @WebResult(name = "ICash_getPublicKey_Response")
    public ICash_getPublicKey_Response ICash_getPublicKey(@WebParam(name =
                                                                    "RequestHeaderRequest")
        RequestHDR resultHeader, @WebParam(name = "applicationid")
        String applicationid, @WebParam(name = "tranDateTime")
        String tranDateTime, @WebParam(name = "UUID")
        String UUID) {
        ICash_getPublicKey_Request getPublicKey_Request =
            new ICash_getPublicKey_Request();
        getPublicKey_Request.setapplicationid(applicationid);
        getPublicKey_Request.settranDateTime(tranDateTime);
        getPublicKey_Request.setUUID(UUID);

        ICash_APIs ICash = new ICash_APIs();


        ICash_getPublicKey_Response RESP =
            ICash.ICash_getPublicKey(resultHeader, getPublicKey_Request);
        return RESP;
    }


    @WebMethod(operationName = "ICash_reverse",
               action = "http://MTN.SD/MDW/ICash_reverse")
    @WebResult(name = "ICash_reverse_Response")
    public ICash_reverse_Response ICash_reverse(@WebParam(name =
                                                          "RequestHeaderRequest")
        RequestHDR resultHeader, @WebParam(name = "applicationid")
        String applicationid, @WebParam(name = "tranDateTime")
        String tranDateTime, @WebParam(name = "UUID")
        String UUID, @WebParam(name = "originalTranUUID")
        String originalTranUUID, @WebParam(name = "originalTranDateTime")
        String originalTranDateTime) {
        ICash_reverse_Request reverse_Request = new ICash_reverse_Request();
        reverse_Request.setapplicationid(applicationid);
        reverse_Request.settranDateTime(tranDateTime);
        reverse_Request.setUUID(UUID);
        reverse_Request.setoriginalTranDateTime(originalTranDateTime);
        reverse_Request.setoriginalTranUUID(originalTranUUID);
        ICash_APIs ICash = new ICash_APIs();


        ICash_reverse_Response RESP =
            ICash.ICash_Reverse(resultHeader, reverse_Request);
        return RESP;
    }


    @WebMethod(operationName = "ICash_getBalance",
               action = "http://MTN.SD/MDW/ICash_getBalance")
    @WebResult(name = "ICash_getBalance_Response")
    public ICash_getBalance_Response ICash_getBalance(@WebParam(name =
                                                                "RequestHeaderRequest")
        RequestHDR resultHeader, @WebParam(name = "applicationid")
        String applicationid, @WebParam(name = "tranDateTime")
        String tranDateTime, @WebParam(name = "UUID")
        String UUID, @WebParam(name = "userName")
        String userName, @WebParam(name = "userPassword")
        String userPassword, @WebParam(name = "entityId")
        String entityId, @WebParam(name = "entityType")
        String entityType, @WebParam(name = "tranCurrency")
        String tranCurrency, @WebParam(name = "PAN")
        String PAN, @WebParam(name = "mbr")
        String mbr, @WebParam(name = "expDate")
        String expDate, @WebParam(name = "IPIN")
        String IPIN, @WebParam(name = "authenticationType")
        String authenticationType) {
        ICash_getBalance_Request Bal_Iuq = new ICash_getBalance_Request();

        Bal_Iuq.setapplicationid(applicationid);
        Bal_Iuq.settranDateTime(tranDateTime);
        Bal_Iuq.setUUID(UUID);
        Bal_Iuq.setuserName(userName);
        Bal_Iuq.setuserPassword(userPassword);
        Bal_Iuq.setentityId(entityId);
        Bal_Iuq.setentityType(entityType);
        Bal_Iuq.setPAN(PAN);
        Bal_Iuq.setmbr(mbr);
        Bal_Iuq.setexpDate(expDate);
        Bal_Iuq.setIPIN(IPIN);
        Bal_Iuq.settranCurrency(tranCurrency);
        Bal_Iuq.setauthenticationType(authenticationType);


        ICash_APIs ICash = new ICash_APIs();

        ICash_getBalance_Response RESP =
            ICash.ICash_getBalance(resultHeader, Bal_Iuq);

        return RESP;
    }


    @WebMethod(operationName = "ICash_payment",
               action = "http://MTN.SD/MDW/ICash_payment")
    @WebResult(name = "ICash_payment_Response")
    public ICash_payment_Response ICash_payment(@WebParam(name =
                                                          "RequestHeaderRequest")
        RequestHDR resultHeader, @WebParam(name = "applicationid")
        String applicationid, @WebParam(name = "tranDateTime")
        String tranDateTime, @WebParam(name = "UUID")
        String UUID, @WebParam(name = "userName")
        String userName, @WebParam(name = "userPassword")
        String userPassword, @WebParam(name = "entityId")
        String entityId, @WebParam(name = "entityType")
        String entityType, @WebParam(name = "tranCurrency")
        String tranCurrency, @WebParam(name = "tranAmount")
        int tranAmount, @WebParam(name = "paymentInfo")
        String paymentInfo, @WebParam(name = "payeeId")
        String payeeId, @WebParam(name = "PAN")
        String PAN, @WebParam(name = "mbr")
        String mbr, @WebParam(name = "expDate")
        String expDate, @WebParam(name = "IPIN")
        String IPIN, @WebParam(name = "fromAccountType")
        String fromAccountType, @WebParam(name = "authenticationType")
        String authenticationType) {
        ICash_payment_Request payment_Request = new ICash_payment_Request();

        payment_Request.setapplicationid(applicationid);
        payment_Request.settranDateTime(tranDateTime);
        payment_Request.setUUID(UUID);
        payment_Request.setuserName(userName);
        payment_Request.setuserPassword(userPassword);
        payment_Request.setentityId(entityId);
        payment_Request.setentityType(entityType);
        payment_Request.setPAN(PAN);
        payment_Request.setmbr(mbr);
        payment_Request.setexpDate(expDate);
        payment_Request.setIPIN(IPIN);
        payment_Request.settranCurrency(tranCurrency);
        payment_Request.setauthenticationType(authenticationType);
        payment_Request.setfromAccountType(fromAccountType);
        payment_Request.setpayeeId(payeeId);
        payment_Request.setpaymentInfo(paymentInfo);
        payment_Request.settranAmount(tranAmount);


        ICash_APIs ICash = new ICash_APIs();

        ICash_payment_Response RESP =
            ICash.ICash_payment(resultHeader, payment_Request);

        return RESP;
    }


    @WebMethod(operationName = "ICash_doCardTransfer",
               action = "http://MTN.SD/MDW/ICash_doCardTransfer")
    @WebResult(name = "ICash_doCardTransfer_Response")
    public ICash_doCardTransfer_Response ICash_doCardTransfer(@WebParam(name =
                                                                        "RequestHeaderRequest")
        RequestHDR resultHeader, @WebParam(name = "applicationid")
        String applicationid, @WebParam(name = "tranDateTime")
        String tranDateTime, @WebParam(name = "UUID")
        String UUID, @WebParam(name = "userName")
        String userName, @WebParam(name = "userPassword")
        String userPassword, @WebParam(name = "entityId")
        String entityId, @WebParam(name = "entityType")
        String entityType, @WebParam(name = "tranCurrency")
        String tranCurrency, @WebParam(name = "tranAmount")
        int tranAmount, @WebParam(name = "toCard")
        String toCard, @WebParam(name = "PAN")
        String PAN, @WebParam(name = "mbr")
        String mbr, @WebParam(name = "expDate")
        String expDate, @WebParam(name = "IPIN")
        String IPIN, @WebParam(name = "fromAccountType")
        String fromAccountType, @WebParam(name = "authenticationType")
        String authenticationType) {
        ICash_doCardTransfer_Request doCardTransfer_Request =
            new ICash_doCardTransfer_Request();

        doCardTransfer_Request.setapplicationid(applicationid);
        doCardTransfer_Request.settranDateTime(tranDateTime);
        doCardTransfer_Request.setUUID(UUID);
        doCardTransfer_Request.setuserName(userName);
        doCardTransfer_Request.setuserPassword(userPassword);
        doCardTransfer_Request.setentityId(entityId);
        doCardTransfer_Request.setentityType(entityType);
        doCardTransfer_Request.setPAN(PAN);
        doCardTransfer_Request.setmbr(mbr);
        doCardTransfer_Request.setexpDate(expDate);
        doCardTransfer_Request.setIPIN(IPIN);
        doCardTransfer_Request.settranCurrency(tranCurrency);
        doCardTransfer_Request.setauthenticationType(authenticationType);
        doCardTransfer_Request.setfromAccountType(fromAccountType);
        doCardTransfer_Request.settoCard(toCard);
        doCardTransfer_Request.settranAmount(tranAmount);


        ICash_APIs ICash = new ICash_APIs();

        ICash_doCardTransfer_Response RESP =
            ICash.ICash_doCardTransfer(resultHeader, doCardTransfer_Request);

        return RESP;
    }

    @WebMethod(operationName = "ICash_getPayeesList",
               action = "http://MTN.SD/MDW/ICash_getPayeesList")
    @WebResult(name = "ICash_getPayeesList_Response")
    public ICash_getPayeesList_Response ICash_getPayeesList(@WebParam(name =
                                                                      "RequestHeaderRequest")
        RequestHDR resultHeader, @WebParam(name = "applicationid")
        String applicationid, @WebParam(name = "tranDateTime")
        String tranDateTime, @WebParam(name = "UUID")
        String UUID) {
        ICash_getPayeesList_Request getPayeesList_Request =
            new ICash_getPayeesList_Request();
        getPayeesList_Request.setapplicationid(applicationid);
        getPayeesList_Request.settranDateTime(tranDateTime);
        getPayeesList_Request.setUUID(UUID);

        ICash_APIs ICash = new ICash_APIs();

        ICash_getPayeesList_Response RESP =
            ICash.ICash_getPayeesList(resultHeader, getPayeesList_Request);

        return RESP;
    }

    @WebMethod(operationName = "PaymentRequest",
               action = "http://MTN.SD/MDW/PaymentRequest")
    @WebResult(name = "PaymentRequest")
    public Customer_Resp PaymentRequest(@WebParam(name =
                                                  "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "Customer")
        Customer_Reqest Customer) {
        Customer_Resp Resp;
        TABS_APIs payment = new TABS_APIs();
        Resp = payment.PaymentRequest(requestheader, Customer);

        return Resp;

    }

    @WebMethod(operationName = "QueryGSM",
               action = "http://MTN.SD/MDW/QueryGSM")
    @WebResult(name = "QueryGSM")
    public String QueryGSM(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "QueryGSM")
        QueryGSM QueryReq) {
        String Resp;
        TABS_APIs QueryGSM = new TABS_APIs();
        Resp = QueryGSM.QueryGSM(requestheader, QueryReq);

        return Resp;

    }

    @WebMethod(operationName = "BillInquery",
               action = "http://MTN.SD/MDW/BillInquery")
    @WebResult(name = "BillInquery")
    public Customer_Resp BillInquery(@WebParam(name = "RequestHeaderRequest")
        RequestHDR requestheader, @WebParam(name = "Customer")
        Customer_Reqest Customer) {
        Customer_Resp Resp;
        TABS_APIs payment = new TABS_APIs();
        Resp = payment.PaymentRequest(requestheader, Customer);

        return Resp;
    }
}
