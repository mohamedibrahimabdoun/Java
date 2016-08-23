package sd.mtn.ocs;

import com.huawei.bme.cbsinterface.common.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 101221.1153.15811)

@WebService(wsdlLocation="http://172.21.24.100:8680/services/SubmgrtMgrService/#%7Bhttp%3A%2F%2Fwww.huawei.com%2Fbme%2Fcbsinterface%2Fsubmgrtmgr%7DSubmgrtMgrService?wsdl",
  targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
  name="Submgrt")
@XmlSeeAlso(
  { com.huawei.bme.cbsinterface.submgrtmgr.ObjectFactory.class, com.huawei.bme.cbsinterface.submgrt.ObjectFactory.class,
    ObjectFactory.class })
public interface Submgrt
{
  @WebMethod(operationName="ChangeCustBasicInfor", action="ChangeCustBasicInfor")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="ChangeCustBasicInfor", output="http://www.huawei.com/bme/cbsinterface/submgrtmgr/Submgrt/ChangeCustBasicInforResponse")
  @WebResult(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
    partName="ChangeCustBasicInforResultMsg", name="ChangeCustBasicInforResultMsg")
  public com.huawei.bme.cbsinterface.submgrtmgr.ChangeCustBasicInforResultMsg changeCustBasicInfor(@WebParam(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
      partName="ChangeCustBasicInforRequestMsg", name="ChangeCustBasicInforRequestMsg")
    com.huawei.bme.cbsinterface.submgrtmgr.ChangeCustBasicInforRequestMsg ChangeCustBasicInforRequestMsg);

  @WebMethod(operationName="ChangeAccountBasicInfor", action="ChangeAccountBasicInfor")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="ChangeAccountBasicInfor", output="http://www.huawei.com/bme/cbsinterface/submgrtmgr/Submgrt/ChangeAccountBasicInforResponse")
  @WebResult(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
    partName="ChangeAccountBasicInforResultMsg", name="ChangeAccountBasicInforResultMsg")
  public com.huawei.bme.cbsinterface.submgrtmgr.ChangeAccountBasicInforResultMsg changeAccountBasicInfor(@WebParam(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
      partName="ChangeAccountBasicInforRequestMsg", name="ChangeAccountBasicInforRequestMsg")
    com.huawei.bme.cbsinterface.submgrtmgr.ChangeAccountBasicInforRequestMsg ChangeAccountBasicInforRequestMsg);

  @WebMethod(operationName="ChangeSubscriberBasicInfor", action="ChangeSubscriberBasicInfor")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="ChangeSubscriberBasicInfor", output="http://www.huawei.com/bme/cbsinterface/submgrtmgr/Submgrt/ChangeSubscriberBasicInforResponse")
  @WebResult(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
    partName="ChangeSubscriberBasicInforResultMsg", name="ChangeSubscriberBasicInforResultMsg")
  public com.huawei.bme.cbsinterface.submgrtmgr.ChangeSubscriberBasicInforResultMsg changeSubscriberBasicInfor(@WebParam(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
      partName="ChangeSubscriberBasicInforRequestMsg", name="ChangeSubscriberBasicInforRequestMsg")
    com.huawei.bme.cbsinterface.submgrtmgr.ChangeSubscriberBasicInforRequestMsg ChangeSubscriberBasicInforRequestMsg);

  @WebMethod(operationName="ChangeMSISDN", action="ChangeMSISDN")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="ChangeMSISDN", output="http://www.huawei.com/bme/cbsinterface/submgrtmgr/Submgrt/ChangeMSISDNResponse")
  @WebResult(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
    partName="ChangeMSISDNResultMsg", name="ChangeMSISDNResultMsg")
  public com.huawei.bme.cbsinterface.submgrtmgr.ChangeMSISDNResultMsg changeMSISDN(@WebParam(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
      partName="ChangeMSISDNRequestMsg", name="ChangeMSISDNRequestMsg")
    com.huawei.bme.cbsinterface.submgrtmgr.ChangeMSISDNRequestMsg ChangeMSISDNRequestMsg);

  @WebMethod(operationName="ChangeSIM", action="ChangeSIM")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="ChangeSIM", output="http://www.huawei.com/bme/cbsinterface/submgrtmgr/Submgrt/ChangeSIMResponse")
  @WebResult(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
    partName="ChangeSIMResultMsg", name="ChangeSIMResultMsg")
  public com.huawei.bme.cbsinterface.submgrtmgr.ChangeSIMResultMsg changeSIM(@WebParam(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
      partName="ChangeSIMRequestMsg", name="ChangeSIMRequestMsg")
    com.huawei.bme.cbsinterface.submgrtmgr.ChangeSIMRequestMsg ChangeSIMRequestMsg);

  @WebMethod(operationName="ChangeCreditLevel", action="ChangeCreditLevel")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="ChangeCreditLevel", output="http://www.huawei.com/bme/cbsinterface/submgrtmgr/Submgrt/ChangeCreditLevelResponse")
  @WebResult(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
    partName="ChangeCreditLevelResultMsg", name="ChangeCreditLevelResultMsg")
  public com.huawei.bme.cbsinterface.submgrtmgr.ChangeCreditLevelResultMsg changeCreditLevel(@WebParam(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
      partName="ChangeCreditLevelRequestMsg", name="ChangeCreditLevelRequestMsg")
    com.huawei.bme.cbsinterface.submgrtmgr.ChangeCreditLevelRequestMsg ChangeCreditLevelRequestMsg);

  @WebMethod(operationName="ChangeAcctBillCycle", action="ChangeAcctBillCycle")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="ChangeAcctBillCycle", output="http://www.huawei.com/bme/cbsinterface/submgrtmgr/Submgrt/ChangeAcctBillCycleResponse")
  @WebResult(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
    partName="ChangeAcctBillCycleResultMsg", name="ChangeAcctBillCycleResultMsg")
  public com.huawei.bme.cbsinterface.submgrtmgr.ChangeAcctBillCycleResultMsg changeAcctBillCycle(@WebParam(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
      partName="ChangeAcctBillCycleRequestMsg", name="ChangeAcctBillCycleRequestMsg")
    com.huawei.bme.cbsinterface.submgrtmgr.ChangeAcctBillCycleRequestMsg ChangeAcctBillCycleRequestMsg);

  @WebMethod(operationName="ManagePaymentRelation", action="ManagePaymentRelation")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="ManagePaymentRelation", output="http://www.huawei.com/bme/cbsinterface/submgrtmgr/Submgrt/ManagePaymentRelationResponse")
  @WebResult(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
    partName="ManagePaymentRelationResultMsg", name="ManagePaymentRelationResultMsg")
  public com.huawei.bme.cbsinterface.submgrtmgr.ManagePaymentRelationResultMsg managePaymentRelation(@WebParam(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
      partName="ManagePaymentRelationRequestMsg", name="ManagePaymentRelationRequestMsg")
    com.huawei.bme.cbsinterface.submgrtmgr.ManagePaymentRelationRequestMsg ManagePaymentRelationRequestMsg);

  @WebMethod(operationName="BatchModifyInitBalance", action="BatchModifyInitBalance")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="BatchModifyInitBalance", output="http://www.huawei.com/bme/cbsinterface/submgrtmgr/Submgrt/BatchModifyInitBalanceResponse")
  @WebResult(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
    partName="BatchModifyInitBalanceResultMsg", name="BatchModifyInitBalanceResultMsg")
  public com.huawei.bme.cbsinterface.submgrtmgr.BatchModifyInitBalanceResultMsg batchModifyInitBalance(@WebParam(targetNamespace="http://www.huawei.com/bme/cbsinterface/submgrtmgr",
      partName="BatchModifyInitBalanceRequest", name="BatchModifyInitBalanceRequestMsg")
    com.huawei.bme.cbsinterface.submgrtmgr.BatchModifyInitBalanceRequestMsg BatchModifyInitBalanceRequest);
}
