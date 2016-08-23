
package com.huawei.bme.cbsinterface.submgrt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeSIMRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeSIMRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *         &lt;element name="OldIMSI" type="{http://www.huawei.com/bme/cbsinterface/common}IMSI" minOccurs="0"/>
 *         &lt;element name="NewIMSI" type="{http://www.huawei.com/bme/cbsinterface/common}IMSI"/>
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
@XmlType(name = "ChangeSIMRequest", propOrder = {
    "subscriberNo",
    "oldIMSI",
    "newIMSI",
    "handleChargeFlag"
})
public class ChangeSIMRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "OldIMSI")
    protected String oldIMSI;
    @XmlElement(name = "NewIMSI", required = true)
    protected String newIMSI;
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
     * Gets the value of the oldIMSI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldIMSI() {
        return oldIMSI;
    }

    /**
     * Sets the value of the oldIMSI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldIMSI(String value) {
        this.oldIMSI = value;
    }

    /**
     * Gets the value of the newIMSI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewIMSI() {
        return newIMSI;
    }

    /**
     * Sets the value of the newIMSI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewIMSI(String value) {
        this.newIMSI = value;
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
