
package com.huawei.bme.cbsinterface.submgrt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeCreditLevelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeCreditLevelRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriberID" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
 *         &lt;element name="subscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *         &lt;element name="PayModeType" type="{http://www.huawei.com/bme/cbsinterface/common}PaidMode"/>
 *         &lt;element name="CreditLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Credit" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeCreditLevelRequest", propOrder = {
    "subscriberID",
    "subscriberNo",
    "payModeType",
    "creditLevel",
    "operationType",
    "credit"
})
public class ChangeCreditLevelRequest {

    protected String subscriberID;
    @XmlElement(required = true)
    protected String subscriberNo;
    @XmlElement(name = "PayModeType")
    protected int payModeType;
    @XmlElement(name = "CreditLevel")
    protected Integer creditLevel;
    @XmlElement(name = "OperationType")
    protected int operationType;
    @XmlElement(name = "Credit")
    protected Long credit;

    /**
     * Gets the value of the subscriberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberID() {
        return subscriberID;
    }

    /**
     * Sets the value of the subscriberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberID(String value) {
        this.subscriberID = value;
    }

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
     * Gets the value of the payModeType property.
     * 
     */
    public int getPayModeType() {
        return payModeType;
    }

    /**
     * Sets the value of the payModeType property.
     * 
     */
    public void setPayModeType(int value) {
        this.payModeType = value;
    }

    /**
     * Gets the value of the creditLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditLevel() {
        return creditLevel;
    }

    /**
     * Sets the value of the creditLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditLevel(Integer value) {
        this.creditLevel = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     */
    public int getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     */
    public void setOperationType(int value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCredit(Long value) {
        this.credit = value;
    }

}
