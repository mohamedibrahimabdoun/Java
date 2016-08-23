
package com.huawei.bme.cbsinterface.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryBalanceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryBalanceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *         &lt;element name="HandleChargeFlag" type="{http://www.huawei.com/bme/cbsinterface/common}HandleChargeFlag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryBalanceRequest", propOrder = {
    "subscriberNo",
    "handleChargeFlag"
})
public class QueryBalanceRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "HandleChargeFlag")
    protected Integer handleChargeFlag;

    /**
     * Gets the value of the subscriberNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNo() {
        return subscriberNo;
    }

    /**
     * Sets the value of the subscriberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNo(String value) {
        this.subscriberNo = value;
    }

    /**
     * Gets the value of the handleChargeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandleChargeFlag() {
        return handleChargeFlag;
    }

    /**
     * Sets the value of the handleChargeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandleChargeFlag(Integer value) {
        this.handleChargeFlag = value;
    }

}
