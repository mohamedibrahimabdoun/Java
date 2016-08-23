
package com.huawei.bme.cbsinterface.submgrtmgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.RequestHeader;
import com.huawei.bme.cbsinterface.submgrt.ChangeMSISDNRequest;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestHeader" type="{http://www.huawei.com/bme/cbsinterface/common}RequestHeader"/>
 *         &lt;element name="ChangeMSISDNRequest" type="{http://www.huawei.com/bme/cbsinterface/submgrt}ChangeMSISDNRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestHeader",
    "changeMSISDNRequest"
})
@XmlRootElement(name = "ChangeMSISDNRequestMsg")
public class ChangeMSISDNRequestMsg {

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "ChangeMSISDNRequest", required = true)
    protected ChangeMSISDNRequest changeMSISDNRequest;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
    }

    /**
     * Gets the value of the changeMSISDNRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeMSISDNRequest }
     *     
     */
    public ChangeMSISDNRequest getChangeMSISDNRequest() {
        return changeMSISDNRequest;
    }

    /**
     * Sets the value of the changeMSISDNRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeMSISDNRequest }
     *     
     */
    public void setChangeMSISDNRequest(ChangeMSISDNRequest value) {
        this.changeMSISDNRequest = value;
    }

}
