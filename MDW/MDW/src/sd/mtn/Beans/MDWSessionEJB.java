package sd.mtn.Beans;

import com.gemalto.ggs.cbos.wswrapper.ws.GetSVABalanceResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.GmppResponse;

import com.huawei.bme.cbsinterface.common.RequestHeader;

import java.util.List;

import javax.ejb.Remote;

import javax.jws.WebParam;

import javax.xml.datatype.XMLGregorianCalendar;

import sd.mtn.Data.CustomerResponseMsg;
import sd.mtn.Data.DestinationResultMSG;
import sd.mtn.Data.ExternalNodeReplayRequest;
import sd.mtn.Data.ExternalNodeReplayResultMsg;
import sd.mtn.Data.ICash_IsAlive_Request;
import sd.mtn.Data.ICash_IsAlive_Response;
import sd.mtn.Data.ICash_IsAlive_ResponseMsg;
import sd.mtn.Data.ICash_doCardTransfer_Response;
import sd.mtn.Data.ICash_getBalance_Response;
import sd.mtn.Data.ICash_getBill_Response;
import sd.mtn.Data.ICash_getPayeesList_Response;
import sd.mtn.Data.ICash_getPublicKey_Response;
import sd.mtn.Data.ICash_payment_Response;
import sd.mtn.Data.ICash_register_Response;
import sd.mtn.Data.ICash_reverse_Response;
import sd.mtn.Data.LanguageRequest;
import sd.mtn.Data.LanguageResposeMessage;
import sd.mtn.Data.QueryInfoRequest;
import sd.mtn.Data.QueryInfoResponse;
import sd.mtn.Data.RequestHDR;
import sd.mtn.Data.ResultHDR;
import sd.mtn.Data.Customer_Reqest;
import sd.mtn.Data.Customer_Resp;
import sd.mtn.Data.QueryGSM;

@Remote
public interface MDWSessionEJB {

    public LanguageResposeMessage ChangeSubscriberInfo(RequestHDR requestheader,
                                                       LanguageRequest languagerequest);

    public LanguageResposeMessage QuerySubscriberInfor(RequestHDR requestheader,
                                                       String msisdn);

    public DestinationResultMSG getRequestInfo(RequestHDR rHeader,
                                               QueryInfoRequest qryinfoReqst);

    public ExternalNodeReplayResultMsg SubmitResponse(RequestHDR rHeader,
                                                      List<ExternalNodeReplayRequest> externalnodereplayRequest);

    public CustomerResponseMsg CustInfoQryReq(RequestHDR resultHeader,
                                              String pMSISDN);

    public CustomerResponseMsg GetConsumerInfo(RequestHDR resultHeader,
                                               String pMSISDN);
    
    
  //////////////////////////////////////////////////////////
  //////////TABS/////////////
  //////////////////////////////////////////////////////////
  public Customer_Resp PaymentRequest(RequestHDR requestheader,Customer_Reqest Customer);
  
  public Customer_Resp BillInquery(RequestHDR requestheader,Customer_Reqest Customer);

  public String QueryGSM(RequestHDR requestheader,QueryGSM QueryReq);    

    //////////////////////////////////////////////////////////
    //////////CBOS/////////////
    //////////////////////////////////////////////////////////

    public String Distribute(RequestHDR requestheader, String sourceIdentifier,
                             String amount, String pin,
                             String destinationIdentifier);

    public String Recharge(RequestHDR requestheader, String sourceIdentifier,
                           String amount, String pin, String payeeId,
                           String customerPayeeId, String transactionName);

    public String ConsumerRegistration(RequestHDR requestheader,
                                       String serviceProviderId,
                                       String consumerIdentifier,
                                       String kycType, String kycValue);

    public String RegisterConsumerAtMerchant(RequestHDR requestheader,
                                             String consumerIdentifier,
                                             String managerMSISDN, String pin);

    public String CompleteConsumerRegistration(RequestHDR requestheader,
                                               String consumerIdentifier,
                                               String managerMSISDN,
                                               String pin,
                                               String serviceProviderId,
                                               String tan, String kycType,
                                               String kycValue, String flowId);

    public String SelfTopUp(RequestHDR requestheader, String payeeId,
                            String amount, String consumerIdentifier,
                            String pin, String transactionName);

    public String PayBill(RequestHDR requestheader, String sourceIdentifier,
                          String amount, String payeeId, String pin,
                          String customerPayeeId, String transactionName);

    public String transferMoneyP2P(RequestHDR requestheader,
                                   String consumerIdentifier, String amount,
                                   String pin, String destinationIdentifier);

    public String CashIn(RequestHDR requestheader, String managerMSISDN,
                         String amount, String pin,
                         String destinationConsumerIdentifier);

    public String StartCashOut(RequestHDR requestheader,
                               String sourceIdetifier, String amount,
                               String pin, String cashOutAt,Boolean cashOutAll);

    public String CompleteCashOutAtMerchant(RequestHDR requestheader,
                                            String managerMSISDN, String pin,
                                            String transactionId, String tan);

    public String P2SBuy(RequestHDR requestheader, String sourceIdentifier,
                         String amount, String pin,
                         String destinationIdentifier, String transactionName);

    public String GetSvaBalance(RequestHDR requestheader,
                                String sourceIdentifier, String pin,
                                Boolean isConsumer);

    public String GetLastTransactions(RequestHDR requestheader,
                                      String sourceIdentifier, String pin,
                                      Boolean isConsumer);

    public String SvaToCard(RequestHDR requestheader, String sourceIdentifier,
                            String amount, String pin);

    public String CardToSVA(RequestHDR requestheader, String sourceIdentifier,
                            String amount, String pin, String ipin,
                            String expDate);

    public String ChangePin(RequestHDR requestheader, String sourceIdentifier,
                            String newPin, String oldPIN, Boolean isConsumer);

    public String SelfLock(RequestHDR requestheader, String consumerIdentifier,
                           String pin);

    public String selfUnlock(RequestHDR requestheader, String sourceIdentifier,
                             String pin);

    public String UpdateConsumerInfo(RequestHDR requestheader,
                                     String bankAccountNumber,
                                     String bankAccountType,
                                     String bankBranchId, String bankId,
                                     String city, String consumerIdentifier,
                                     String dateOfBirth, String fullName,
                                     String managerMSISDN, String nationality,
                                     String pin, String primaryAccountNumber,
                                     String state, String street);


    //////////////////////////////////////////////////////////
    //////////NOR/////////////
    //////////////////////////////////////////////////////////

    public String NorCreateCampaign(RequestHDR requestheader,
                                    String CampaignId, String CampaignName,
                                    String StartDate, String EndDate);

    public Integer NorAddMsisdn(RequestHDR requestheader, Integer MSISDN,
                                String CampaignName);

    /////////////////////////////////////////////////////////////
    //////////////////// ICASH ///////////////////////////////////
    /////////////////////////////////////////////////////
    public ICash_IsAlive_Response ICash_IsAlive(RequestHDR requestheader,String applicationid, String tranDateTime,
                          String UUID);
 
    public ICash_getBill_Response ICash_getBill(RequestHDR requestheader,String applicationid, String tranDateTime,
                          String UUID, String userName, String userPassword,
                          String entityId, String entityType, String PAN,
                          String mbr, String expDate, String IPIN,
                          String payeeId, String paymentInfo,
                          String authenticationType);

    public ICash_register_Response ICash_register(RequestHDR requestheader,String applicationid, String tranDateTime,
                           String UUID, String userName, String userPassword,
                           String entityId, String entityType,
                           String entityGroup, String phoneNo, String email,
                           String financialInstitutionId, String PAN,
                           String IPIN, String mbr, String expDate,
                           String panCategory, String registrationType , String fullName , String customerIdNumber , String customerIdType, String bankAccountNumber, String bankAccountType, String bankBranchId, String bankId, String dateOfBirth, String job
                      );


    public ICash_getPublicKey_Response ICash_getPublicKey(RequestHDR requestheader,String applicationid, String tranDateTime,
                               String UUID);

    public ICash_reverse_Response ICash_reverse(RequestHDR requestheader,String applicationid, String tranDateTime,
                          String UUID, String originalTranUUID,
                          String originalTranDateTime);

    public ICash_getBalance_Response ICash_getBalance(RequestHDR requestheader,String applicationid, String tranDateTime,
                             String UUID, String userName, String userPassword,
                             String entityId, String entityType,
                             String tranCurrency, String PAN, String mbr,
                             String expDate, String IPIN,
                             String authenticationType);

    public ICash_payment_Response ICash_payment(RequestHDR requestheader,String applicationid, String tranDateTime,
                          String UUID, String userName, String userPassword,
                          String entityId, String entityType,
                          String tranCurrency, int tranAmount,
                          String paymentInfo, String PAN, String mbr,
                          String expDate, String IPIN, String fromAccountType,String  payeeId,
                          String authenticationType);

    public ICash_doCardTransfer_Response ICash_doCardTransfer(RequestHDR requestheader,String applicationid, String tranDateTime,
                                 String UUID, String userName,
                                 String userPassword, String entityId,
                                 String entityType, String tranCurrency,
                                 int tranAmount, String toCard, String PAN,
                                 String mbr, String expDate, String IPIN,
                                 String fromAccountType,
                                 String authenticationType);

    public ICash_getPayeesList_Response ICash_getPayeesList(RequestHDR requestheader,String applicationid, String tranDateTime,
                                String UUID);


}


