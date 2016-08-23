
package com.huawei.bme.cbsinterface.cardrechargemgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.cardrecharge.VoucherRechargeBySeqRequest;
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
 *         &lt;element name="VoucherRechargeBySeqRequest" type="{http://www.huawei.com/bme/cbsinterface/cardrecharge}VoucherRechargeBySeqRequest"/>
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
    "voucherRechargeBySeqRequest"
})
@XmlRootElement(name = "VoucherRechargeBySeqRequestMsg")
public class VoucherRechargeBySeqRequestMsg {

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "VoucherRechargeBySeqRequest", required = true)
    protected VoucherRechargeBySeqRequest voucherRechargeBySeqRequest;

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
     * Gets the value of the voucherRechargeBySeqRequest property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherRechargeBySeqRequest }
     *     
     */
    public VoucherRechargeBySeqRequest getVoucherRechargeBySeqRequest() {
        return voucherRechargeBySeqRequest;
    }

    /**
     * Sets the value of the voucherRechargeBySeqRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherRechargeBySeqRequest }
     *     
     */
    public void setVoucherRechargeBySeqRequest(VoucherRechargeBySeqRequest value) {
        this.voucherRechargeBySeqRequest = value;
    }

}
