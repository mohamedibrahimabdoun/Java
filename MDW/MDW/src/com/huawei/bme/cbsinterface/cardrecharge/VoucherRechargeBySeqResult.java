
package com.huawei.bme.cbsinterface.cardrecharge;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoucherRechargeBySeqResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoucherRechargeBySeqResult">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoucherRechargeBySeqResult", propOrder = {
    "faceValue",
    "newBalance",
    "newActiveStop",
    "validityPeriod",
    "rechargeBonus"
})
public class VoucherRechargeBySeqResult {

    @XmlElement(name = "FaceValue", required = true, type = Long.class, nillable = true)
    protected Long faceValue;
    @XmlElement(name = "NewBalance", required = true, type = Long.class, nillable = true)
    protected Long newBalance;
    @XmlElement(name = "NewActiveStop", required = true)
    protected String newActiveStop;
    @XmlElement(name = "ValidityPeriod", required = true, type = Integer.class, nillable = true)
    protected Integer validityPeriod;
    @XmlElement(name = "RechargeBonus")
    protected List<VoucherRechargeBySeqResult.RechargeBonus> rechargeBonus;

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
     * {@link VoucherRechargeBySeqResult.RechargeBonus }
     * 
     * 
     */
    public List<VoucherRechargeBySeqResult.RechargeBonus> getRechargeBonus() {
        if (rechargeBonus == null) {
            rechargeBonus = new ArrayList<VoucherRechargeBySeqResult.RechargeBonus>();
        }
        return this.rechargeBonus;
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
