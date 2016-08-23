package sd.mtn.BusinessLogic;


import com.gemalto.ggs.cbos.wswrapper.ws.CardToSVA;
import com.gemalto.ggs.cbos.wswrapper.ws.CardToSVAResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.CashIn;
import com.gemalto.ggs.cbos.wswrapper.ws.CashInResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.ChangePin;
import com.gemalto.ggs.cbos.wswrapper.ws.ChangePinResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.CompleteCashOutAtMerchant;
import com.gemalto.ggs.cbos.wswrapper.ws.CompleteCashOutAtMerchantResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.CompleteConsumerRegistration;
import com.gemalto.ggs.cbos.wswrapper.ws.CompleteConsumerRegistrationResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.ConsumerInfoResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.ConsumerInformation;
import com.gemalto.ggs.cbos.wswrapper.ws.ConsumerRegistration;
import com.gemalto.ggs.cbos.wswrapper.ws.ConsumerRegistrationResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.Distribute;
import com.gemalto.ggs.cbos.wswrapper.ws.DistributeResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.GetLastTransactions;
import com.gemalto.ggs.cbos.wswrapper.ws.GetLastTransactionsResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.GetSVABalance;
import com.gemalto.ggs.cbos.wswrapper.ws.GetSVABalanceResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.GmppResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.P2SBuy;
import com.gemalto.ggs.cbos.wswrapper.ws.P2SBuyResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.PayBill;
import com.gemalto.ggs.cbos.wswrapper.ws.PayBillResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.Recharge;
import com.gemalto.ggs.cbos.wswrapper.ws.RechargeResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.RegisterConsumerAtMerchant;
import com.gemalto.ggs.cbos.wswrapper.ws.RegisterConsumerAtMerchantResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.SelfLock;
import com.gemalto.ggs.cbos.wswrapper.ws.SelfLockResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.SelfTopUp;
import com.gemalto.ggs.cbos.wswrapper.ws.SelfTopUpResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.SelfUnlock;
import com.gemalto.ggs.cbos.wswrapper.ws.SelfUnlockResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.StartCashOut;
import com.gemalto.ggs.cbos.wswrapper.ws.StartCashOutResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.SvaToCard;
import com.gemalto.ggs.cbos.wswrapper.ws.SvaToCardResponse;
import com.gemalto.ggs.cbos.wswrapper.ws.TransferMoneyP2P;
import com.gemalto.ggs.cbos.wswrapper.ws.TransferMoneyP2PResponse;

import javax.xml.ws.WebServiceRef;

import sd.mtn.Data.RequestHDR;
import sd.mtn.Data.ResultHDR;
import sd.mtn.cbos.GMPPUSSDService;
import sd.mtn.cbos.GMPPUSSDService_Service;


//Error(82,8):  duplicate class: sd.mtn.Nor.BusinessLogic.CBOS_APIs


public class CBOS_APIs {
  
  @WebServiceRef
  private static GMPPUSSDService_Service gMPPUSSDService; 
  TABS_APIs TabObj = new TABS_APIs();
  
  @WebServiceRef
  
  public  String Distribute (RequestHDR requestheader,String sourceIdentifier,String amount,String pin,String destinationIdentifier){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
        if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();
          

      DistributeResponse DisResp = new DistributeResponse();
      Distribute Dis = new Distribute();

      Dis.setSourceIdentifier(sourceIdentifier);
      Dis.setAmount(amount);
      Dis.setPin(pin);
      Dis.setDestinationIdentifier(destinationIdentifier);
      
      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.distribute(sourceIdentifier, amount,pin,destinationIdentifier);

      DisResp.setReturn(GmppResp);
      
      ErrCode = DisResp.getReturn().getErrorCode();
      ErrDesc = DisResp.getReturn().getErrorDescription();
      ReturnCode = DisResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();
      
      /* if (ErrDesc.equals("null") && ReturnCode.equals("Completed")){
        ErrDesc = "Operation Successfully.";
      }
      System.out.print("ErrDesc: " + ErrDesc); */
      
      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  } 
  
  public  String Recharge (RequestHDR requestheader,String sourceIdentifier,String amount,String pin,String payeeId,String customerPayeeId,String transactionName){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
            if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      RechargeResponse RechResp = new RechargeResponse();
      Recharge Rech = new Recharge();

      Rech.setSourceIdentifier(sourceIdentifier);
      Rech.setAmount(amount);
      Rech.setPin(pin);
      Rech.setPayeeId(payeeId);
      Rech.setCustomerPayeeId(customerPayeeId);
      Rech.setTransactionName(transactionName);

      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.recharge(sourceIdentifier, amount,pin,payeeId,customerPayeeId,transactionName);

      RechResp.setReturn(GmppResp);
      
      ErrCode = RechResp.getReturn().getErrorCode();
      ErrDesc = RechResp.getReturn().getErrorDescription();
      ReturnCode = RechResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  } 
  
  public  String ConsumerRegistration (RequestHDR requestheader,String serviceProviderId,String consumerIdentifier,String kycType,String kycValue){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      ConsumerRegistrationResponse ConsRegResp = new ConsumerRegistrationResponse();
      ConsumerRegistration ConsReg = new ConsumerRegistration();

      ConsReg.setServiceProviderId(serviceProviderId);
      ConsReg.setConsumerIdentifier(consumerIdentifier);
      ConsReg.setKycType(kycType);
      ConsReg.setKycValue(kycValue);


      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.consumerRegistration(serviceProviderId, consumerIdentifier, kycType, kycValue);

      ConsRegResp.setReturn(GmppResp);
      
      ErrCode = ConsRegResp.getReturn().getErrorCode();
      ErrDesc = ConsRegResp.getReturn().getErrorDescription();
      ReturnCode = ConsRegResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  }
  
  public  String RegisterConsumerAtMerchant (RequestHDR requestheader,String consumerIdentifier,String managerMSISDN,String pin){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      RegisterConsumerAtMerchantResponse RegMerchanRegResp = new RegisterConsumerAtMerchantResponse();
      RegisterConsumerAtMerchant RegMerchanReg = new RegisterConsumerAtMerchant();

      RegMerchanReg.setConsumerIdentifier(consumerIdentifier);
      RegMerchanReg.setManagerMSISDN(managerMSISDN);
      RegMerchanReg.setPin(pin);


      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.registerConsumerAtMerchant(consumerIdentifier, managerMSISDN, pin);

      RegMerchanRegResp.setReturn(GmppResp);
      
      ErrCode = RegMerchanRegResp.getReturn().getErrorCode();
      ErrDesc = RegMerchanRegResp.getReturn().getErrorDescription();
      ReturnCode = RegMerchanRegResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  } 
  
  public  String CompleteConsumerRegistration (RequestHDR requestheader,String consumerIdentifier,String managerMSISDN,String pin,String serviceProviderId,String tan,String kycType,String kycValue,String flowId){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      CompleteConsumerRegistrationResponse CompRegResp = new CompleteConsumerRegistrationResponse();
      CompleteConsumerRegistration CompReg = new CompleteConsumerRegistration();

      CompReg.setConsumerIdentifier(consumerIdentifier);
      CompReg.setManagerMSISDN(managerMSISDN);
      CompReg.setPin(pin);
      CompReg.setServiceProviderId(serviceProviderId);
      CompReg.setTan(tan);
      CompReg.setKycType(kycType);
      CompReg.setKycValue(kycValue);
      CompReg.setFlowId(flowId);


      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.completeConsumerRegistration(consumerIdentifier, managerMSISDN, pin, serviceProviderId, tan, kycType, kycValue, flowId);

      CompRegResp.setReturn(GmppResp);
      
      ErrCode = CompRegResp.getReturn().getErrorCode();
      ErrDesc = CompRegResp.getReturn().getErrorDescription();
      ReturnCode = CompRegResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  } 
   
  public  String SelfTopUp (RequestHDR requestheader,String payeeId,String amount,String consumerIdentifier,String pin,String transactionName){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      SelfTopUpResponse SeToUpResp = new SelfTopUpResponse();
      SelfTopUp SeToUp = new SelfTopUp();

      SeToUp.setAmount(amount);
      SeToUp.setConsumerIdentifier(consumerIdentifier);
      SeToUp.setPin(pin);
      SeToUp.setTransactionName(transactionName);


      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.selfTopUp(payeeId,amount, consumerIdentifier, pin, transactionName);

      SeToUpResp.setReturn(GmppResp);
      
      ErrCode = SeToUpResp.getReturn().getErrorCode();
      ErrDesc = SeToUpResp.getReturn().getErrorDescription();
      ReturnCode = SeToUpResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  } 
   
  public  String PayBill (RequestHDR requestheader,String sourceIdentifier,String amount,String payeeId,String pin,String customerPayeeId,String transactionName){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      PayBillResponse PayResp = new PayBillResponse();
      PayBill Pay = new PayBill();

      Pay.setSourceIdentifier(sourceIdentifier);
      Pay.setAmount(amount);
      Pay.setPayeeId(payeeId);
      Pay.setPin(pin);
      Pay.setCustomerPayeeId(customerPayeeId);
      Pay.setTransactionName(transactionName);

      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.payBill(sourceIdentifier, amount, payeeId,pin,customerPayeeId,transactionName);

      PayResp.setReturn(GmppResp);
      
      ErrCode = PayResp.getReturn().getErrorCode();
      ErrDesc = PayResp.getReturn().getErrorDescription();
      ReturnCode = PayResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  } 
  
  public  String transferMoneyP2P (RequestHDR requestheader,String consumerIdentifier,String amount,String pin,String destinationIdentifier){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
            if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      TransferMoneyP2PResponse TransMoneyP2pResp = new TransferMoneyP2PResponse();
      TransferMoneyP2P TransMoneyP2p = new TransferMoneyP2P();

      TransMoneyP2p.setConsumerIdentifier(consumerIdentifier);
      TransMoneyP2p.setAmount(amount);
      TransMoneyP2p.setPin(pin);
      TransMoneyP2p.setDestinationIdentifier(destinationIdentifier);


      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.transferMoneyP2P(consumerIdentifier, amount, pin, destinationIdentifier);

      TransMoneyP2pResp.setReturn(GmppResp);
      
      ErrCode = TransMoneyP2pResp.getReturn().getErrorCode();
      ErrDesc = TransMoneyP2pResp.getReturn().getErrorDescription();
      ReturnCode = TransMoneyP2pResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  } 
  
  public  String CashIn (RequestHDR requestheader,String managerMSISDN,String amount,String pin,String destinationConsumerIdentifier){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      CashInResponse CashInResp = new CashInResponse();
      CashIn CashIn = new CashIn();

      CashIn.setManagerMSISDN(managerMSISDN);
      CashIn.setAmount(amount);
      CashIn.setPin(pin);
      CashIn.setDestinationConsumerIdentifier(destinationConsumerIdentifier);


      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.cashIn(managerMSISDN, amount, pin, destinationConsumerIdentifier);

      CashInResp.setReturn(GmppResp);
      
      ErrCode = CashInResp.getReturn().getErrorCode();
      ErrDesc = CashInResp.getReturn().getErrorDescription();
      ReturnCode = CashInResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  } 
  
  public  String StartCashOut (RequestHDR requestheader,String sourceIdetifier,String amount,String pin,String cashOutAt,Boolean CashOutAll){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      StartCashOutResponse CashOutResp = new StartCashOutResponse();
      StartCashOut CashOut = new StartCashOut();

      CashOut.setSourceIdetifier(sourceIdetifier);
      CashOut.setAmount(amount);
      CashOut.setPin(pin);
      CashOut.setCashOutAt(cashOutAt);
      CashOut.setCashoutAll(CashOutAll);

      


      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.startCashOut(sourceIdetifier, amount, pin, cashOutAt,CashOutAll);

      CashOutResp.setReturn(GmppResp);
      
      ErrCode = CashOutResp.getReturn().getErrorCode();
      ErrDesc = CashOutResp.getReturn().getErrorDescription();
      ReturnCode = CashOutResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  } 
  
  public  String CompleteCashOutAtMerchant (RequestHDR requestheader,String managerMSISDN,String pin,String transactionId,String tan){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      CompleteCashOutAtMerchantResponse CashOutMerResp = new CompleteCashOutAtMerchantResponse();
      CompleteCashOutAtMerchant CashOutMer = new CompleteCashOutAtMerchant();

      CashOutMer.setManagerMSISDN(managerMSISDN);
      CashOutMer.setPin(pin);
      CashOutMer.setTransactionId(transactionId);
      CashOutMer.setTan(tan);


      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.completeCashOutAtMerchant(managerMSISDN, pin, transactionId, tan);

      CashOutMerResp.setReturn(GmppResp);
      
      ErrCode = CashOutMerResp.getReturn().getErrorCode();
      ErrDesc = CashOutMerResp.getReturn().getErrorDescription();
      ReturnCode = CashOutMerResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  } 
  
  public  String P2SBuy (RequestHDR requestheader,String sourceIdentifier,String amount,String pin,String destinationIdentifier,String transactionName){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      P2SBuyResponse p2SBuyResp = new P2SBuyResponse();
      P2SBuy p2SBuy = new P2SBuy();

      p2SBuy.setSourceIdentifier(sourceIdentifier);
      p2SBuy.setAmount(amount);
      p2SBuy.setPin(pin);
      p2SBuy.setTransactionName(transactionName);

      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.p2SBuy(sourceIdentifier, amount, pin, destinationIdentifier, transactionName);

      p2SBuyResp.setReturn(GmppResp);
      
      ErrCode = p2SBuyResp.getReturn().getErrorCode();
      ErrDesc = p2SBuyResp.getReturn().getErrorDescription();
      ReturnCode = p2SBuyResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  } 
  
  public  String GetSvaBalance (RequestHDR requestheader,String sourceIdentifier,String pin,Boolean isConsumer){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      GetSVABalanceResponse getBalanceResp = new GetSVABalanceResponse();
      GetSVABalance getBalance = new GetSVABalance();

      getBalance.setSourceIdentifier(sourceIdentifier);
      getBalance.setPin(pin);
      getBalance.setIsConsumer(isConsumer);

      GmppResponse GmppResp = new GmppResponse();
      GmppResp = GMPPUSSDSer.getSVABalance(sourceIdentifier, pin, isConsumer);

      getBalanceResp.setReturn(GmppResp);
      ErrCode = getBalanceResp.getReturn().getErrorCode();
      ErrDesc = getBalanceResp.getReturn().getErrorDescription();
      ReturnCode = getBalanceResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  } 
  
  public  String GetLastTransactions (RequestHDR requestheader,String sourceIdentifier,String pin,Boolean isConsumer){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      GetLastTransactionsResponse getLastBalanceResp = new GetLastTransactionsResponse();
      GetLastTransactions getLastBalance = new GetLastTransactions();

      getLastBalance.setSourceIdentifier(sourceIdentifier);
      getLastBalance.setPin(pin);
      getLastBalance.setIsConsumer(isConsumer);

      GmppResponse GmppResp = new GmppResponse();
      GmppResp = GMPPUSSDSer.getLastTransactions(sourceIdentifier, pin, isConsumer);
      
      getLastBalanceResp.setReturn(GmppResp);
      ErrCode = getLastBalanceResp.getReturn().getErrorCode();
      ErrDesc = getLastBalanceResp.getReturn().getErrorDescription();
      ReturnCode = getLastBalanceResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  } 
  
  public  String SvaToCard (RequestHDR requestheader,String sourceIdentifier,String amount,String pin){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      SvaToCardResponse svaToCardResp = new SvaToCardResponse();
      SvaToCard svaToCard = new SvaToCard();

      svaToCard.setSourceIdentifier(sourceIdentifier);
      svaToCard.setAmount(amount);
      svaToCard.setPin(pin);

      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.svaToCard(sourceIdentifier, amount, pin);

      svaToCardResp.setReturn(GmppResp);
      
      ErrCode = svaToCardResp.getReturn().getErrorCode();
      ErrDesc = svaToCardResp.getReturn().getErrorDescription();
      ReturnCode = svaToCardResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  }
  
  public  String CardToSVA (RequestHDR requestheader,String sourceIdentifier,String amount,String pin,String ipin,String expDate){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      CardToSVAResponse cardToSvaResp = new CardToSVAResponse();
      CardToSVA cardToSva = new CardToSVA();

      cardToSva.setSourceIdentifier(sourceIdentifier);
      cardToSva.setAmount(amount);
      cardToSva.setPin(pin);
      cardToSva.setPin(ipin);
      cardToSva.setPin(expDate);

      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.cardToSVA(sourceIdentifier, amount, pin, ipin, expDate);

      cardToSvaResp.setReturn(GmppResp);
      
      ErrCode = cardToSvaResp.getReturn().getErrorCode();
      ErrDesc = cardToSvaResp.getReturn().getErrorDescription();
      ReturnCode = cardToSvaResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  }
  
  public  String ChangePin (RequestHDR requestheader,String sourceIdentifier,String newPin,String oldPIN,Boolean isConsumer){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      ChangePinResponse ChanpinResp = new ChangePinResponse();
      ChangePin Chanpin = new ChangePin();

      Chanpin.setSourceIdentifier(sourceIdentifier);
      Chanpin.setNewPin(newPin);
      Chanpin.setOldPIN(oldPIN);
      Chanpin.setIsConsumer(isConsumer);

      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.changePin(sourceIdentifier, newPin, oldPIN, isConsumer);

      ChanpinResp.setReturn(GmppResp);
      
      ErrCode = ChanpinResp.getReturn().getErrorCode();
      ErrDesc = ChanpinResp.getReturn().getErrorDescription();
      ReturnCode = ChanpinResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  }
   
  public  String SelfLock (RequestHDR requestheader,String consumerIdentifier,String pin){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      SelfLockResponse selfResp = new SelfLockResponse();
      SelfLock self = new SelfLock();

      self.setConsumerIdentifier(consumerIdentifier);
      self.setPin(pin);

      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.selfLock(consumerIdentifier, pin);

      selfResp.setReturn(GmppResp);
      
      ErrCode = selfResp.getReturn().getErrorCode();
      ErrDesc = selfResp.getReturn().getErrorDescription();
      ReturnCode = selfResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  }
  
  public  String selfUnlock (RequestHDR requestheader,String sourceIdentifier,String pin){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
            if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());


      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      SelfUnlockResponse selfUnlockResp = new SelfUnlockResponse();
      SelfUnlock selfUnlock = new SelfUnlock();

      selfUnlock.setSourceIdentifier(sourceIdentifier);
      selfUnlock.setPin(pin);

      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.selfUnlock(sourceIdentifier, pin);

      selfUnlockResp.setReturn(GmppResp);
      
      ErrCode = selfUnlockResp.getReturn().getErrorCode();
      ErrDesc = selfUnlockResp.getReturn().getErrorDescription();
      ReturnCode = selfUnlockResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  }
  
  public  String UpdateConsumerInfo (RequestHDR requestheader,String bankAccountNumber,String bankAccountType,String bankBranchId,String bankId,String city,String consumerIdentifier,String dateOfBirth,String fullName,String managerMSISDN,String nationality,String pin,String primaryAccountNumber,String state,String street){
      String ErrCode;
      String ErrDesc;
      String ReturnCode;
      String Result = null;
        
        ResultHDR rslthdr = new ResultHDR();
        
            /* Get  Permission */
          if (TabObj.Check_Permission(requestheader.getUserName(), requestheader.getPassword(), requestheader.getCommandId() ) == 1) {
               rslthdr.setCommandId(requestheader.getCommandId());
          rslthdr.setFinalResult(true);
          rslthdr.setResultCode("405000000");
          rslthdr.setResultDesc("Operation successfully.");
          rslthdr.setTransserial(requestheader.getSerial());

      ConsumerInformation consumerInformation = new ConsumerInformation();
      gMPPUSSDService = new GMPPUSSDService_Service();
      GMPPUSSDService GMPPUSSDSer = gMPPUSSDService.getGMPPUSSDServicePort();

      ConsumerInfoResponse updateCusInfoResp = new ConsumerInfoResponse();
      ConsumerInformation updateCusInfo = new ConsumerInformation();
      
            updateCusInfo.setBankAccountNumber(bankAccountNumber);
            updateCusInfo.setBankAccountType(bankAccountType);
            updateCusInfo.setBankBranchId(bankBranchId);
            updateCusInfo.setBankId(bankId);
            updateCusInfo.setCity(city);
            updateCusInfo.setConsumerIdentifier(consumerIdentifier);
            updateCusInfo.setDateOfBirth(dateOfBirth);
            updateCusInfo.setFullName(fullName);
            updateCusInfo.setManagerMSISDN(managerMSISDN);
            updateCusInfo.setNationality(nationality);
            updateCusInfo.setPin(pin);
            updateCusInfo.setPrimaryAccountNumber(primaryAccountNumber);
            updateCusInfo.setState(state);
            updateCusInfo.setStreet(street);


      GmppResponse GmppResp = new GmppResponse();

      GmppResp = GMPPUSSDSer.updateConsumerInfo(consumerInformation);

      updateCusInfoResp.setCity(updateCusInfo.getCity());
      
      /*ErrCode = GmppResp.getReturn().getErrorCode();
      ErrDesc = GmppResp.getReturn().getErrorDescription();
      ReturnCode = GmppResp.getReturn().getReturnCode();

      //ErrCode = GmppResp.getErrorCode();
      //ErrDesc = GmppResp.getErrorDescription();
      //ReturnCode = GmppResp.getReturnCode();

      Result = ErrCode + '|' + ReturnCode + '|' + ErrDesc + '|';*/

        //cashResp.setReturn(cashReq);
        //Resp.setReturn(cashResp);
          } else {
      System.out.print("Sorry Permission Deined ");
      rslthdr.setResultCode("505000000");
      rslthdr.setResultDesc("Error: Permission Deined.");
    String msg= "Sorry Permission Deined";
        Result = msg;
    }
        return Result;
      
  }
  
  
}
