
package com.huawei.bme.cbsinterface.submgrtmgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.RequestHeader;
import com.huawei.bme.cbsinterface.submgrt.ChangeSIMRequest;


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
 *         &lt;element name="ChangeSIMRequest" type="{http://www.huawei.com/bme/cbsinterface/submgrt}ChangeSIMRequest"/>
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
    "changeSIMRequest"
})
@XmlRootElement(name = "ChangeSIMRequestMsg")
public class ChangeSIMRequestMsg {

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "ChangeSIMRequest", required = true)
    protected ChangeSIMRequest changeSIMRequest;

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
     * Gets the value of the changeSIMRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSIMRequest }
     *     
     */
    public ChangeSIMRequest getChangeSIMRequest() {
        return changeSIMRequest;
    }

    /**
     * Sets the value of the changeSIMRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSIMRequest }
     *     
     */
    public void setChangeSIMRequest(ChangeSIMRequest value) {
        this.changeSIMRequest = value;
    }

}
