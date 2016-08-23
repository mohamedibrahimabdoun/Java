
package com.huawei.bme.cbsinterface.acctcredit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManAcctCreditRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManAcctCreditRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID" minOccurs="0"/>
 *         &lt;element name="AcctCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
 *         &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
 *         &lt;element name="Msisdn" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
 *         &lt;element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OperType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Amount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="ApplyTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="ExpireTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManAcctCreditRequest", propOrder = {
    "acctId",
    "acctCode",
    "subId",
    "msisdn",
    "objectType",
    "operType",
    "amount",
    "applyTime",
    "expireTime"
})
public class ManAcctCreditRequest {

    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctCode")
    protected String acctCode;
    @XmlElement(name = "SubId")
    protected String subId;
    @XmlElement(name = "Msisdn")
    protected String msisdn;
    @XmlElement(name = "ObjectType")
    protected int objectType;
    @XmlElement(name = "OperType")
    protected int operType;
    @XmlElement(name = "Amount")
    protected Long amount;
    @XmlElement(name = "ApplyTime")
    protected String applyTime;
    @XmlElement(name = "ExpireTime")
    protected String expireTime;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Sets the value of the acctCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCode(String value) {
        this.acctCode = value;
    }

    /**
     * Gets the value of the subId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubId() {
        return subId;
    }

    /**
     * Sets the value of the subId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubId(String value) {
        this.subId = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     */
    public int getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     */
    public void setObjectType(int value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the operType property.
     * 
     */
    public int getOperType() {
        return operType;
    }

    /**
     * Sets the value of the operType property.
     * 
     */
    public void setOperType(int value) {
        this.operType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the applyTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyTime() {
        return applyTime;
    }

    /**
     * Sets the value of the applyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyTime(String value) {
        this.applyTime = value;
    }

    /**
     * Gets the value of the expireTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * Sets the value of the expireTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireTime(String value) {
        this.expireTime = value;
    }

}
