
package com.huawei.bme.cbsinterface.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctChgRecType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctChgRecType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CurrAcctBal" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *         &lt;element name="ChgAcctBal" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *         &lt;element name="CurrExpTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *         &lt;element name="ChgExpTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccountType" type="{http://www.huawei.com/bme/cbsinterface/common}AccountType"/>
 *         &lt;element name="BalanceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MinMeasureId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctChgRecType", propOrder = {

})
public class AcctChgRecType {

    @XmlElement(name = "CurrAcctBal", required = true, type = Long.class, nillable = true)
    protected Long currAcctBal;
    @XmlElement(name = "ChgAcctBal", required = true, type = Long.class, nillable = true)
    protected Long chgAcctBal;
    @XmlElement(name = "CurrExpTime", required = true)
    protected String currExpTime;
    @XmlElement(name = "ChgExpTime")
    protected int chgExpTime;
    @XmlElement(name = "AccountType", required = true, nillable = true)
    protected String accountType;
    @XmlElement(name = "BalanceId", required = true, type = Long.class, nillable = true)
    protected Long balanceId;
    @XmlElementRef(name = "MinMeasureId", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> minMeasureId;

    /**
     * Gets the value of the currAcctBal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrAcctBal() {
        return currAcctBal;
    }

    /**
     * Sets the value of the currAcctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrAcctBal(Long value) {
        this.currAcctBal = value;
    }

    /**
     * Gets the value of the chgAcctBal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChgAcctBal() {
        return chgAcctBal;
    }

    /**
     * Sets the value of the chgAcctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChgAcctBal(Long value) {
        this.chgAcctBal = value;
    }

    /**
     * Gets the value of the currExpTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrExpTime() {
        return currExpTime;
    }

    /**
     * Sets the value of the currExpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrExpTime(String value) {
        this.currExpTime = value;
    }

    /**
     * Gets the value of the chgExpTime property.
     * 
     */
    public int getChgExpTime() {
        return chgExpTime;
    }

    /**
     * Sets the value of the chgExpTime property.
     * 
     */
    public void setChgExpTime(int value) {
        this.chgExpTime = value;
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
     * Gets the value of the balanceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBalanceId() {
        return balanceId;
    }

    /**
     * Sets the value of the balanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBalanceId(Long value) {
        this.balanceId = value;
    }

    /**
     * Gets the value of the minMeasureId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinMeasureId() {
        return minMeasureId;
    }

    /**
     * Sets the value of the minMeasureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinMeasureId(JAXBElement<Integer> value) {
        this.minMeasureId = ((JAXBElement<Integer> ) value);
    }

}
