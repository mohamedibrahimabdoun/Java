package sd.mtn.BusinessLogic;

import com.huawei.bme.cbsinterface.common.RequestHeader;
import com.huawei.bme.cbsinterface.common.SimpleProperty;
import com.huawei.bme.cbsinterface.query.QueryCustomerRequest;
import com.huawei.bme.cbsinterface.querymgr.QueryCustomerRequestMsg;
import com.huawei.bme.cbsinterface.querymgr.QueryCustomerResultMsg;
import com.huawei.bme.cbsinterface.submgrt.ChangeSubscriberBasicInforRequest;
import com.huawei.bme.cbsinterface.submgrtmgr.ChangeSubscriberBasicInforRequestMsg;

import com.huawei.bme.cbsinterface.submgrtmgr.ChangeSubscriberBasicInforResultMsg;



import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.WebServiceRef;

import sd.mtn.Data.LanguageRequest;
import sd.mtn.Data.RequestHDR;
import sd.mtn.ocs.QueryMgr;
import sd.mtn.ocs.QueryMgrService;
import sd.mtn.ocs.Submgrt;
import sd.mtn.ocs.SubmgrtMgrService;

public class OCS_APIs {
  @WebServiceRef
  private static SubmgrtMgrService submgrtMgrService;
  
  @WebServiceRef
  private static QueryMgrService queryMgrService;
    
  public static ChangeSubscriberBasicInforResultMsg ChangeSubscriberInfo(RequestHDR requestheader,LanguageRequest languagerequest){
          submgrtMgrService = new SubmgrtMgrService();
          Submgrt submgrt = submgrtMgrService.getSubmgrtServicePort();
          // Add your code to call the desired methods.      

          ChangeSubscriberBasicInforRequestMsg ChangeSubscBasicingoRQSTMSG=new ChangeSubscriberBasicInforRequestMsg();
          ChangeSubscriberBasicInforRequest  ChangeSubscBasicingoRQST= new ChangeSubscriberBasicInforRequest();
          RequestHeader rqsthdr=new RequestHeader();
          rqsthdr.setCommandId("QueryCustomer");
          rqsthdr.setTransactionId(requestheader.getSerial());
          rqsthdr.setVersion("3.3");
          rqsthdr.setSequenceId(requestheader.getSerial());
          rqsthdr.setRequestType("Event");
          rqsthdr.setSerialNo(requestheader.getSerial());
   
          
          List<SimpleProperty> smplprop=new ArrayList<SimpleProperty>();
         SimpleProperty obj_SimpleProperty=new SimpleProperty();
        
        //-----------------  Ethipoia Lang
         if ( languagerequest.getLang().equals("4")) 
          { 
          
           obj_SimpleProperty.setId("LangType");
           obj_SimpleProperty.setValue(languagerequest.getLang());   
           /*obj_SimpleProperty.setId("SMSLangType");
           obj_SimpleProperty.setValue(languagerequest.getLang());
           */             
         } else {
          obj_SimpleProperty.setId("SMSLangType");
          obj_SimpleProperty.setValue(languagerequest.getLang());
            //------ add sa
            obj_SimpleProperty.setId("LangType");
                        obj_SimpleProperty.setValue(languagerequest.getLang());
          }
        //-----------------  Arabic/ English Lang            
    /* obj_SimpleProperty.setId("LangType");
            obj_SimpleProperty.setValue(languagerequest.getLang());
              
          obj_SimpleProperty.setId("SMSLangType");
          obj_SimpleProperty.setValue(languagerequest.getLang());*/
       
          
        ChangeSubscBasicingoRQST.setSubscriberNo(languagerequest.getMSISDN());
         smplprop= ChangeSubscBasicingoRQST.getSimpleProperty();
          smplprop.add(obj_SimpleProperty);
          //ChangeSubscBasicingoRQST.clone()
              ChangeSubscBasicingoRQSTMSG.setRequestHeader(rqsthdr);
          ChangeSubscBasicingoRQSTMSG.setChangeSubscriberBasicInforRequest(ChangeSubscBasicingoRQST);
          ChangeSubscriberBasicInforResultMsg resltmsg=  submgrt.changeSubscriberBasicInfor(ChangeSubscBasicingoRQSTMSG);
          
        
        return resltmsg;
        
        }
 
  public static QueryCustomerResultMsg QueryCustomer( RequestHDR requestheader,String msisdn ){
      
        QueryCustomerRequestMsg rqst_msg =new QueryCustomerRequestMsg();
        
        RequestHeader rqsthdr=new RequestHeader();
        rqsthdr.setCommandId("QueryCustomer");
        rqsthdr.setTransactionId(requestheader.getSerial());
        rqsthdr.setVersion("3.3");
        rqsthdr.setSequenceId(requestheader.getSerial());
        rqsthdr.setRequestType("Event");
        rqsthdr.setSerialNo(requestheader.getSerial());
                    
                    QueryCustomerRequest Qc_rqst =new QueryCustomerRequest();
                    Qc_rqst.setSubscriberNo(msisdn);
                    Qc_rqst.setQueryType(0);
                  
                   // Qc_rqst.setCustomerMask("00");
                 //  Qc_rqst.setSubscriberMask ("111111");
                 //  Qc_rqst.setAccountMask ("001011");
                  
                    rqst_msg.setQueryCustomerRequest(Qc_rqst);
                    rqst_msg.setRequestHeader(rqsthdr);
                    
                    ////////////////////////////////////////
                 queryMgrService = new QueryMgrService();
                 QueryMgr queryMgr = queryMgrService.getQueryMgrServicePort();
                 // Add your code to call the desired methods.
               QueryCustomerResultMsg resltmsg=  queryMgr.queryCustomer(rqst_msg);
               
               
       
        
        return resltmsg;
      
      }
}
