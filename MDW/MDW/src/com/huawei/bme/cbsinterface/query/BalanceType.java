
package com.huawei.bme.cbsinterface.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BalanceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AccountType" type="{http://www.huawei.com/bme/cbsinterface/common}AccountType"/>
 *         &lt;element name="Amount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *         &lt;element name="AccountCredit" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *         &lt;element name="ApplyTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="ExpireTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="RelatedType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RelatedObjectID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceType", propOrder = {
    "balanceId",
    "accountType",
    "amount",
    "accountCredit",
    "applyTime",
    "expireTime",
    "relatedType",
    "relatedObjectID"
})
public class BalanceType {

    @XmlElement(name = "BalanceId")
    protected long balanceId;
    @XmlElement(name = "AccountType", required = true)
    protected String accountType;
    @XmlElement(name = "Amount")
    protected long amount;
    @XmlElement(name = "AccountCredit")
    protected long accountCredit;
    @XmlElement(name = "ApplyTime")
    protected String applyTime;
    @XmlElement(name = "ExpireTime")
    protected String expireTime;
    @XmlElement(name = "RelatedType")
    protected Integer relatedType;
    @XmlElement(name = "RelatedObjectID")
    protected Long relatedObjectID;

    /**
     * Gets the value of the balanceId property.
     * 
     */
    public long getBalanceId() {
        return balanceId;
    }

    /**
     * Sets the value of the balanceId property.
     * 
     */
    public void setBalanceId(long value) {
        this.balanceId = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the accountCredit property.
     * 
     */
    public long getAccountCredit() {
        return accountCredit;
    }

    /**
     * Sets the value of the accountCredit property.
     * 
     */
    public void setAccountCredit(long value) {
        this.accountCredit = value;
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

    /**
     * Gets the value of the relatedType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelatedType() {
        return relatedType;
    }

    /**
     * Sets the value of the relatedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelatedType(Integer value) {
        this.relatedType = value;
    }

    /**
     * Gets the value of the relatedObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRelatedObjectID() {
        return relatedObjectID;
    }

    /**
     * Sets the value of the relatedObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRelatedObjectID(Long value) {
        this.relatedObjectID = value;
    }

}
