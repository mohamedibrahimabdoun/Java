
package com.huawei.bme.cbsinterface.submgrt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagePaymentRelationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagePaymentRelationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaymentRelation" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
 *                   &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="Quota" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                   &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="TimeSchema" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="PaymentRelKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ManagePaymentRelationRequest", propOrder = {
    "subscriberNo",
    "operationType",
    "paymentRelation"
})
public class ManagePaymentRelationRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "OperationType")
    protected int operationType;
    @XmlElement(name = "PaymentRelation", required = true)
    protected List<ManagePaymentRelationRequest.PaymentRelation> paymentRelation;

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
     * Gets the value of the paymentRelation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentRelation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagePaymentRelationRequest.PaymentRelation }
     * 
     * 
     */
    public List<ManagePaymentRelationRequest.PaymentRelation> getPaymentRelation() {
        if (paymentRelation == null) {
            paymentRelation = new ArrayList<ManagePaymentRelationRequest.PaymentRelation>();
        }
        return this.paymentRelation;
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
     *         &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
     *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="Quota" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="TimeSchema" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="PaymentRelKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "priority",
        "quota",
        "serviceType",
        "timeSchema",
        "paymentRelKey",
        "shareSourceType",
        "quotaNotifyID"
    })
    public static class PaymentRelation {

        @XmlElement(name = "AccountCode")
        protected String accountCode;
        @XmlElement(name = "Priority")
        protected Integer priority;
        @XmlElement(name = "Quota")
        protected Long quota;
        @XmlElement(name = "ServiceType")
        protected Integer serviceType;
        @XmlElement(name = "TimeSchema")
        protected Integer timeSchema;
        @XmlElement(name = "PaymentRelKey")
        protected String paymentRelKey;
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
         * Gets the value of the priority property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPriority() {
            return priority;
        }

        /**
         * Sets the value of the priority property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPriority(Integer value) {
            this.priority = value;
        }

        /**
         * Gets the value of the quota property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getQuota() {
            return quota;
        }

        /**
         * Sets the value of the quota property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setQuota(Long value) {
            this.quota = value;
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
