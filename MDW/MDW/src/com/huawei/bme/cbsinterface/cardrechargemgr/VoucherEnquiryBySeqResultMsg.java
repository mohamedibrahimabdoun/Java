
package com.huawei.bme.cbsinterface.cardrechargemgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.cardrecharge.VoucherEnquiryBySeqResult;
import com.huawei.bme.cbsinterface.common.ResultHeader;


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
 *         &lt;element name="ResultHeader" type="{http://www.huawei.com/bme/cbsinterface/common}ResultHeader"/>
 *         &lt;element name="VoucherEnquiryBySeqResult" type="{http://www.huawei.com/bme/cbsinterface/cardrecharge}VoucherEnquiryBySeqResult"/>
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
    "resultHeader",
    "voucherEnquiryBySeqResult"
})
@XmlRootElement(name = "VoucherEnquiryBySeqResultMsg")
public class VoucherEnquiryBySeqResultMsg {

    @XmlElement(name = "ResultHeader", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "VoucherEnquiryBySeqResult", required = true)
    protected VoucherEnquiryBySeqResult voucherEnquiryBySeqResult;

    /**
     * Gets the value of the resultHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResultHeader }
     *     
     */
    public ResultHeader getResultHeader() {
        return resultHeader;
    }

    /**
     * Sets the value of the resultHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultHeader }
     *     
     */
    public void setResultHeader(ResultHeader value) {
        this.resultHeader = value;
    }

    /**
     * Gets the value of the voucherEnquiryBySeqResult property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherEnquiryBySeqResult }
     *     
     */
    public VoucherEnquiryBySeqResult getVoucherEnquiryBySeqResult() {
        return voucherEnquiryBySeqResult;
    }

    /**
     * Sets the value of the voucherEnquiryBySeqResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherEnquiryBySeqResult }
     *     
     */
    public void setVoucherEnquiryBySeqResult(VoucherEnquiryBySeqResult value) {
        this.voucherEnquiryBySeqResult = value;
    }

}
