package sd.mtn.Vas;

import com.globitel.web.ObjectFactory;
import com.globitel.web.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 101221.1153.15811)

@WebService(wsdlLocation="http://172.20.9.22:8080/MissedCallNotification_WS_1.0/services/MCNPort?wsdl",
  targetNamespace="http://web.globitel.com/", name="MCN")
@XmlSeeAlso(
  { ObjectFactory.class })
public interface MCN
{
  @WebMethod(action="urn:DeleteCampaign")
  @Action(input="urn:DeleteCampaign", output="http://web.globitel.com/MCN/deleteCampaignResponse")
  @ResponseWrapper(localName="deleteCampaignResponse", targetNamespace="http://web.globitel.com/",
    className="com.globitel.web.DeleteCampaignResponse")
  @RequestWrapper(localName="deleteCampaign", targetNamespace="http://web.globitel.com/",
    className="com.globitel.web.DeleteCampaign")
  @WebResult(targetNamespace="")
  public int deleteCampaign(@WebParam(targetNamespace="", name="arg0")
    int arg0);

  @WebMethod(action="urn:AddMSISDN")
  @Action(input="urn:AddMSISDN", output="http://web.globitel.com/MCN/addMSISDNResponse")
  @ResponseWrapper(localName="addMSISDNResponse", targetNamespace="http://web.globitel.com/",
    className="com.globitel.web.AddMSISDNResponse")
  @RequestWrapper(localName="addMSISDN", targetNamespace="http://web.globitel.com/",
    className="com.globitel.web.AddMSISDN")
  @WebResult(targetNamespace="")
  public int addMSISDN(@WebParam(targetNamespace="", name="arg0")
    int arg0, @WebParam(targetNamespace="", name="arg1")
    String arg1);

  @WebMethod(action="urn:CreateCampaign")
  @Action(input="urn:CreateCampaign", output="http://web.globitel.com/MCN/createCampaignResponse")
  @ResponseWrapper(localName="createCampaignResponse", targetNamespace="http://web.globitel.com/",
    className="com.globitel.web.CreateCampaignResponse")
  @RequestWrapper(localName="createCampaign", targetNamespace="http://web.globitel.com/",
    className="com.globitel.web.CreateCampaign")
  @WebResult(targetNamespace="")
  public int createCampaign(@WebParam(targetNamespace="", name="arg0")
    String arg0, @WebParam(targetNamespace="", name="arg1")
    String arg1, @WebParam(targetNamespace="", name="arg2")
    XMLGregorianCalendar arg2, @WebParam(targetNamespace="", name="arg3")
    XMLGregorianCalendar arg3);

  @WebMethod(action="urn:DisableCampaign")
  @Action(input="urn:DisableCampaign", output="http://web.globitel.com/MCN/disableCampaignResponse")
  @ResponseWrapper(localName="disableCampaignResponse", targetNamespace="http://web.globitel.com/",
    className="com.globitel.web.DisableCampaignResponse")
  @RequestWrapper(localName="disableCampaign", targetNamespace="http://web.globitel.com/",
    className="com.globitel.web.DisableCampaign")
  @WebResult(targetNamespace="")
  public int disableCampaign(@WebParam(targetNamespace="", name="arg0")
    int arg0);

  @WebMethod(action="urn:EnableCampaign")
  @Action(input="urn:EnableCampaign", output="http://web.globitel.com/MCN/enableCampaignResponse")
  @ResponseWrapper(localName="enableCampaignResponse", targetNamespace="http://web.globitel.com/",
    className="com.globitel.web.EnableCampaignResponse")
  @RequestWrapper(localName="enableCampaign", targetNamespace="http://web.globitel.com/",
    className="com.globitel.web.EnableCampaign")
  @WebResult(targetNamespace="")
  public int enableCampaign(@WebParam(targetNamespace="", name="arg0")
    int arg0);
}
