
package com.huawei.bme.cbsinterface.cardrecharge;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoucherRechargeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoucherRechargeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FaceValue" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *         &lt;element name="NewBalance" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *         &lt;element name="NewActiveStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date"/>
 *         &lt;element name="ValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RechargeBonus" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="PrmAcctType" type="{http://www.huawei.com/bme/cbsinterface/common}AccountType"/>
 *                   &lt;element name="PrmAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LoanAmount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="LoanPoundage" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="BalanceValidity" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *         &lt;element name="BalanceValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BalanceActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *         &lt;element name="UserDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoucherRechargeResult", propOrder = {
    "faceValue",
    "newBalance",
    "newActiveStop",
    "validityPeriod",
    "rechargeBonus",
    "loanAmount",
    "loanPoundage",
    "balanceValidity",
    "balanceValidityPeriod",
    "balanceActiveDate",
    "userDays"
})
public class VoucherRechargeResult {

    @XmlElement(name = "FaceValue", required = true, type = Long.class, nillable = true)
    protected Long faceValue;
    @XmlElement(name = "NewBalance", required = true, type = Long.class, nillable = true)
    protected Long newBalance;
    @XmlElement(name = "NewActiveStop", required = true)
    protected String newActiveStop;
    @XmlElement(name = "ValidityPeriod", required = true, type = Integer.class, nillable = true)
    protected Integer validityPeriod;
    @XmlElement(name = "RechargeBonus")
    protected List<VoucherRechargeResult.RechargeBonus> rechargeBonus;
    @XmlElementRef(name = "LoanAmount", namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", type = JAXBElement.class)
    protected JAXBElement<Long> loanAmount;
    @XmlElementRef(name = "LoanPoundage", namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", type = JAXBElement.class)
    protected JAXBElement<Long> loanPoundage;
    @XmlElement(name = "BalanceValidity")
    protected String balanceValidity;
    @XmlElementRef(name = "BalanceValidityPeriod", namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", type = JAXBElement.class)
    protected JAXBElement<Integer> balanceValidityPeriod;
    @XmlElement(name = "BalanceActiveDate")
    protected String balanceActiveDate;
    @XmlElementRef(name = "UserDays", namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", type = JAXBElement.class)
    protected JAXBElement<Integer> userDays;

    /**
     * Gets the value of the faceValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFaceValue() {
        return faceValue;
    }

    /**
     * Sets the value of the faceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFaceValue(Long value) {
        this.faceValue = value;
    }

    /**
     * Gets the value of the newBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNewBalance() {
        return newBalance;
    }

    /**
     * Sets the value of the newBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNewBalance(Long value) {
        this.newBalance = value;
    }

    /**
     * Gets the value of the newActiveStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewActiveStop() {
        return newActiveStop;
    }

    /**
     * Sets the value of the newActiveStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewActiveStop(String value) {
        this.newActiveStop = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValidityPeriod(Integer value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the rechargeBonus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rechargeBonus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRechargeBonus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoucherRechargeResult.RechargeBonus }
     * 
     * 
     */
    public List<VoucherRechargeResult.RechargeBonus> getRechargeBonus() {
        if (rechargeBonus == null) {
            rechargeBonus = new ArrayList<VoucherRechargeResult.RechargeBonus>();
        }
        return this.rechargeBonus;
    }

    /**
     * Gets the value of the loanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLoanAmount(JAXBElement<Long> value) {
        this.loanAmount = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the loanPoundage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLoanPoundage() {
        return loanPoundage;
    }

    /**
     * Sets the value of the loanPoundage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLoanPoundage(JAXBElement<Long> value) {
        this.loanPoundage = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the balanceValidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceValidity() {
        return balanceValidity;
    }

    /**
     * Sets the value of the balanceValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceValidity(String value) {
        this.balanceValidity = value;
    }

    /**
     * Gets the value of the balanceValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBalanceValidityPeriod() {
        return balanceValidityPeriod;
    }

    /**
     * Sets the value of the balanceValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBalanceValidityPeriod(JAXBElement<Integer> value) {
        this.balanceValidityPeriod = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the balanceActiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceActiveDate() {
        return balanceActiveDate;
    }

    /**
     * Sets the value of the balanceActiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceActiveDate(String value) {
        this.balanceActiveDate = value;
    }

    /**
     * Gets the value of the userDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUserDays() {
        return userDays;
    }

    /**
     * Sets the value of the userDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUserDays(JAXBElement<Integer> value) {
        this.userDays = ((JAXBElement<Integer> ) value);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="PrmAcctType" type="{http://www.huawei.com/bme/cbsinterface/common}AccountType"/>
     *         &lt;element name="PrmAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class RechargeBonus {

        @XmlElement(name = "PrmAcctType", required = true, nillable = true)
        protected String prmAcctType;
        @XmlElement(name = "PrmAmt", required = true, type = Long.class, nillable = true)
        protected Long prmAmt;

        /**
         * Gets the value of the prmAcctType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrmAcctType() {
            return prmAcctType;
        }

        /**
         * Sets the value of the prmAcctType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrmAcctType(String value) {
            this.prmAcctType = value;
        }

        /**
         * Gets the value of the prmAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPrmAmt() {
            return prmAmt;
        }

        /**
         * Sets the value of the prmAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPrmAmt(Long value) {
            this.prmAmt = value;
        }

    }

}
