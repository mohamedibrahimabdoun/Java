package sd.mtn.Data;



import com.huawei.bme.cbsinterface.query.BalanceType;
import com.huawei.bme.cbsinterface.query.ProductOrderInfo;
import com.huawei.bme.cbsinterface.query.QueryCustomerResult;
import  com.huawei.bme.cbsinterface.query.SubscriberInfo;

//SubscriberState
//import  com.huawei.bme.cbsinterface.query.*;

import com.huawei.bme.cbsinterface.querymgr.QueryCustomerResultMsg;

import java.util.ArrayList;

import java.util.List;

import javax.xml.bind.annotation.XmlType;



@XmlType(name = "SubscriberInforReponseMsg", propOrder = {
    "resultHeader",
    "languageReponse",
    "subscriberInfo",
    "productOrderInfo",
    "balanceType",
    "subscrState",
    "postpaid_Profile",
    "postpaid_BillInfo",
    "postpaid_Equipment"
    
})
public class LanguageResposeMessage {
  ResultHDR resultHeader;
  LanguageRespose languageReponse;
  SubscriberInfo subscriberInfo;
  ArrayList<ProductOrderInfo> productOrderInfo;
  ArrayList<BalanceType> balanceType;
  SubscrState subscrState;
  Postpaid_Profile postpaid_Profile;
  List<Postpaid_BillInfo> postpaid_BillInfo;
  List<Postpaid_Equipment> postpaid_Equipment;
  
 

    public void setResultHeader(ResultHDR resultHeader) {
        this.resultHeader = resultHeader;
    }

    public ResultHDR getResultHeader() {
        return resultHeader;
    }

    public void setLanguageReponse(LanguageRespose languageReponse) {
        this.languageReponse = languageReponse;
    }

    public LanguageRespose getLanguageReponse() {
        return languageReponse;
    }

    public void setSubscriberInfo(SubscriberInfo subscriberInfo) {
        this.subscriberInfo = subscriberInfo;
    }

    public SubscriberInfo getSubscriberInfo() {
        return subscriberInfo;
    }



    public void setProductOrderInfo(ArrayList<ProductOrderInfo> productOrderInfo) {
        this.productOrderInfo = productOrderInfo;
    }

    public ArrayList<ProductOrderInfo> getProductOrderInfo() {
        return productOrderInfo;
    }

    public void setBalanceType(ArrayList<BalanceType> balanceType) {
        this.balanceType = balanceType;
    }

    public ArrayList<BalanceType> getBalanceType() {
        return balanceType;
    }


    public void setSubscrState(SubscrState subscriberState) {
        this.subscrState = subscriberState;
    }

    public SubscrState getSubscrState() {
        return subscrState;
    }

    public void setPostpaid_Profile(Postpaid_Profile postpaid_Profile) {
        this.postpaid_Profile = postpaid_Profile;
    }

    public Postpaid_Profile getPostpaid_Profile() {
        return postpaid_Profile;
    }


    public void setPostpaid_BillInfo(List<Postpaid_BillInfo> postpaid_BillInfo) {
        this.postpaid_BillInfo = postpaid_BillInfo;
    }

    public List<Postpaid_BillInfo> getPostpaid_BillInfo() {
        return postpaid_BillInfo;
    }

    public void setPostpaid_Equipment(List<Postpaid_Equipment> postpaid_Equipment) {
        this.postpaid_Equipment = postpaid_Equipment;
    }

    public List<Postpaid_Equipment> getPostpaid_Equipment() {
        return postpaid_Equipment;
    }
}
