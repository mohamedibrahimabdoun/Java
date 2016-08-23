
package com.huawei.bme.cbsinterface.submgrt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagePaymentRelationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagePaymentRelationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentRule" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode"/>
 *                   &lt;element name="Quota" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *                   &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="TimeSchema" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="PaymentRelKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ApplyTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *                   &lt;element name="ExpireTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *                   &lt;element name="ShareSourceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="QuotaNotifyID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
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
@XmlType(name = "ManagePaymentRelationResult", propOrder = {
    "paymentRule"
})
public class ManagePaymentRelationResult {

    @XmlElement(name = "PaymentRule", required = true)
    protected List<ManagePaymentRelationResult.PaymentRule> paymentRule;

    /**
     * Gets the value of the paymentRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagePaymentRelationResult.PaymentRule }
     * 
     * 
     */
    public List<ManagePaymentRelationResult.PaymentRule> getPaymentRule() {
        if (paymentRule == null) {
            paymentRule = new ArrayList<ManagePaymentRelationResult.PaymentRule>();
        }
        return this.paymentRule;
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
     *       &lt;sequence>
     *         &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode"/>
     *         &lt;element name="Quota" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
     *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="TimeSchema" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="PaymentRelKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ApplyTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
     *         &lt;element name="ExpireTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
     *         &lt;element name="ShareSourceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="QuotaNotifyID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "accountCode",
        "quota",
        "priority",
        "serviceType",
        "timeSchema",
        "paymentRelKey",
        "applyTime",
        "expireTime",
        "shareSourceType",
        "quotaNotifyID"
    })
    public static class PaymentRule {

        @XmlElement(name = "AccountCode", required = true)
        protected String accountCode;
        @XmlElement(name = "Quota")
        protected long quota;
        @XmlElement(name = "Priority")
        protected int priority;
        @XmlElement(name = "ServiceType")
        protected Integer serviceType;
        @XmlElement(name = "TimeSchema")
        protected Integer timeSchema;
        @XmlElement(name = "PaymentRelKey")
        protected String paymentRelKey;
        @XmlElement(name = "ApplyTime", required = true)
        protected String applyTime;
        @XmlElement(name = "ExpireTime", required = true)
        protected String expireTime;
        @XmlElement(name = "ShareSourceType")
        protected Integer shareSourceType;
        @XmlElement(name = "QuotaNotifyID")
        protected Integer quotaNotifyID;

        /**
         * Gets the value of the accountCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountCode() {
            return accountCode;
        }

        /**
         * Sets the value of the accountCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountCode(String value) {
            this.accountCode = value;
        }

        /**
         * Gets the value of the quota property.
         * 
         */
        public long getQuota() {
            return quota;
        }

        /**
         * Sets the value of the quota property.
         * 
         */
        public void setQuota(long value) {
            this.quota = value;
        }

        /**
         * Gets the value of the priority property.
         * 
         */
        public int getPriority() {
            return priority;
        }

        /**
         * Sets the value of the priority property.
         * 
         */
        public void setPriority(int value) {
            this.priority = value;
        }

        /**
         * Gets the value of the serviceType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getServiceType() {
            return serviceType;
        }

        /**
         * Sets the value of the serviceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setServiceType(Integer value) {
            this.serviceType = value;
        }

        /**
         * Gets the value of the timeSchema property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTimeSchema() {
            return timeSchema;
        }

        /**
         * Sets the value of the timeSchema property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTimeSchema(Integer value) {
            this.timeSchema = value;
        }

        /**
         * Gets the value of the paymentRelKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentRelKey() {
            return paymentRelKey;
        }

        /**
         * Sets the value of the paymentRelKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentRelKey(String value) {
            this.paymentRelKey = value;
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
         * Gets the value of the shareSourceType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getShareSourceType() {
            return shareSourceType;
        }

        /**
         * Sets the value of the shareSourceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setShareSourceType(Integer value) {
            this.shareSourceType = value;
        }

        /**
         * Gets the value of the quotaNotifyID property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQuotaNotifyID() {
            return quotaNotifyID;
        }

        /**
         * Sets the value of the quotaNotifyID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQuotaNotifyID(Integer value) {
            this.quotaNotifyID = value;
        }

    }

}
