
package com.huawei.bme.cbsinterface.cardrechargemgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.cardrecharge.VoucherRechargeRequest;
import com.huawei.bme.cbsinterface.common.RequestHeader;


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
 *         &lt;element name="VoucherRechargeRequest" type="{http://www.huawei.com/bme/cbsinterface/cardrecharge}VoucherRechargeRequest"/>
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
    "voucherRechargeRequest"
})
@XmlRootElement(name = "VoucherRechargeRequestMsg")
public class VoucherRechargeRequestMsg {

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "VoucherRechargeRequest", required = true)
    protected VoucherRechargeRequest voucherRechargeRequest;

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
     * Gets the value of the voucherRechargeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherRechargeRequest }
     *     
     */
    public VoucherRechargeRequest getVoucherRechargeRequest() {
        return voucherRechargeRequest;
    }

    /**
     * Sets the value of the voucherRechargeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherRechargeRequest }
     *     
     */
    public void setVoucherRechargeRequest(VoucherRechargeRequest value) {
        this.voucherRechargeRequest = value;
    }

}
