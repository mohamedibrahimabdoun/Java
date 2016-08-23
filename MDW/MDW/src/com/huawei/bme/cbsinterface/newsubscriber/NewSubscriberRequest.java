
package com.huawei.bme.cbsinterface.newsubscriber;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.BAAddrInfo;
import com.huawei.bme.cbsinterface.common.BADelivery;
import com.huawei.bme.cbsinterface.common.BAScenario;
import com.huawei.bme.cbsinterface.common.OneTimeCharge;
import com.huawei.bme.cbsinterface.subscribe.OfferOrder;
import com.huawei.bme.cbsinterface.subscribe.OptionalOfferOrder;
import com.huawei.bme.cbsinterface.subscribe.Product;


/**
 * <p>Java class for NewSubscriberRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewSubscriberRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/common}Customer">
 *                 &lt;sequence>
 *                   &lt;element name="OperType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Account" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/common}Account">
 *                 &lt;sequence>
 *                   &lt;element name="BillCycleType" type="{http://www.huawei.com/bme/cbsinterface/common}BillCycleType"/>
 *                   &lt;element name="IsCustShareAcct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="OperType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrimaryOffer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrder">
 *                 &lt;sequence>
 *                   &lt;element name="Subscriber" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/common}Subscriber">
 *                           &lt;sequence>
 *                             &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/subscribe}Product" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ComponentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OptionalOffer" type="{http://www.huawei.com/bme/cbsinterface/subscribe}OptionalOfferOrder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OneTimeCharge" type="{http://www.huawei.com/bme/cbsinterface/common}OneTimeCharge" minOccurs="0"/>
 *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
 *         &lt;element name="BA" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
 *                   &lt;element name="BACode" type="{http://www.huawei.com/bme/cbsinterface/common}BACode"/>
 *                   &lt;element name="BillAddr" type="{http://www.huawei.com/bme/cbsinterface/common}BAAddrInfo" minOccurs="0"/>
 *                   &lt;element name="ApplyTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *                   &lt;element name="ExpireTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *                   &lt;element name="BAScenario" type="{http://www.huawei.com/bme/cbsinterface/common}BAScenario" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="BillDelivery" type="{http://www.huawei.com/bme/cbsinterface/common}BADelivery" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="DefaultFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Sponsor" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewSubscriberRequest", propOrder = {
    "customer",
    "account",
    "primaryOffer",
    "optionalOffer",
    "oneTimeCharge",
    "subscriberNo",
    "ba",
    "sponsor"
})
public class NewSubscriberRequest {

    @XmlElement(name = "Customer")
    protected NewSubscriberRequest.Customer customer;
    @XmlElement(name = "Account")
    protected List<NewSubscriberRequest.Account> account;
    @XmlElement(name = "PrimaryOffer")
    protected NewSubscriberRequest.PrimaryOffer primaryOffer;
    @XmlElement(name = "OptionalOffer")
    protected List<OptionalOfferOrder> optionalOffer;
    @XmlElement(name = "OneTimeCharge")
    protected OneTimeCharge oneTimeCharge;
    @XmlElement(name = "SubscriberNo")
    protected String subscriberNo;
    @XmlElement(name = "BA")
    protected List<NewSubscriberRequest.BA> ba;
    @XmlElement(name = "Sponsor")
    protected String sponsor;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link NewSubscriberRequest.Customer }
     *     
     */
    public NewSubscriberRequest.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewSubscriberRequest.Customer }
     *     
     */
    public void setCustomer(NewSubscriberRequest.Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewSubscriberRequest.Account }
     * 
     * 
     */
    public List<NewSubscriberRequest.Account> getAccount() {
        if (account == null) {
            account = new ArrayList<NewSubscriberRequest.Account>();
        }
        return this.account;
    }

    /**
     * Gets the value of the primaryOffer property.
     * 
     * @return
     *     possible object is
     *     {@link NewSubscriberRequest.PrimaryOffer }
     *     
     */
    public NewSubscriberRequest.PrimaryOffer getPrimaryOffer() {
        return primaryOffer;
    }

    /**
     * Sets the value of the primaryOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewSubscriberRequest.PrimaryOffer }
     *     
     */
    public void setPrimaryOffer(NewSubscriberRequest.PrimaryOffer value) {
        this.primaryOffer = value;
    }

    /**
     * Gets the value of the optionalOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionalOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionalOfferOrder }
     * 
     * 
     */
    public List<OptionalOfferOrder> getOptionalOffer() {
        if (optionalOffer == null) {
            optionalOffer = new ArrayList<OptionalOfferOrder>();
        }
        return this.optionalOffer;
    }

    /**
     * Gets the value of the oneTimeCharge property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeCharge }
     *     
     */
    public OneTimeCharge getOneTimeCharge() {
        return oneTimeCharge;
    }

    /**
     * Sets the value of the oneTimeCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeCharge }
     *     
     */
    public void setOneTimeCharge(OneTimeCharge value) {
        this.oneTimeCharge = value;
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
     * Gets the value of the ba property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ba property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewSubscriberRequest.BA }
     * 
     * 
     */
    public List<NewSubscriberRequest.BA> getBA() {
        if (ba == null) {
            ba = new ArrayList<NewSubscriberRequest.BA>();
        }
        return this.ba;
    }

    /**
     * Gets the value of the sponsor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsor() {
        return sponsor;
    }

    /**
     * Sets the value of the sponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsor(String value) {
        this.sponsor = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/common}Account">
     *       &lt;sequence>
     *         &lt;element name="BillCycleType" type="{http://www.huawei.com/bme/cbsinterface/common}BillCycleType"/>
     *         &lt;element name="IsCustShareAcct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="OperType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "billCycleType",
        "isCustShareAcct",
        "operType"
    })
    public static class Account
        extends com.huawei.bme.cbsinterface.common.Account
    {

        @XmlElement(name = "BillCycleType")
        protected int billCycleType;
        @XmlElement(name = "IsCustShareAcct")
        protected Boolean isCustShareAcct;
        @XmlElement(name = "OperType")
        protected Integer operType;

        /**
         * Gets the value of the billCycleType property.
         * 
         */
        public int getBillCycleType() {
            return billCycleType;
        }

        /**
         * Sets the value of the billCycleType property.
         * 
         */
        public void setBillCycleType(int value) {
            this.billCycleType = value;
        }

        /**
         * Gets the value of the isCustShareAcct property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsCustShareAcct() {
            return isCustShareAcct;
        }

        /**
         * Sets the value of the isCustShareAcct property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsCustShareAcct(Boolean value) {
            this.isCustShareAcct = value;
        }

        /**
         * Gets the value of the operType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOperType() {
            return operType;
        }

        /**
         * Sets the value of the operType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOperType(Integer value) {
            this.operType = value;
        }

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
     *         &lt;element name="BACode" type="{http://www.huawei.com/bme/cbsinterface/common}BACode"/>
     *         &lt;element name="BillAddr" type="{http://www.huawei.com/bme/cbsinterface/common}BAAddrInfo" minOccurs="0"/>
     *         &lt;element name="ApplyTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
     *         &lt;element name="ExpireTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
     *         &lt;element name="BAScenario" type="{http://www.huawei.com/bme/cbsinterface/common}BAScenario" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="BillDelivery" type="{http://www.huawei.com/bme/cbsinterface/common}BADelivery" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="DefaultFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "baCode",
        "billAddr",
        "applyTime",
        "expireTime",
        "baScenario",
        "billDelivery",
        "defaultFlag"
    })
    public static class BA {

        @XmlElement(name = "AccountCode")
        protected String accountCode;
        @XmlElement(name = "BACode", required = true)
        protected String baCode;
        @XmlElement(name = "BillAddr")
        protected BAAddrInfo billAddr;
        @XmlElement(name = "ApplyTime")
        protected String applyTime;
        @XmlElement(name = "ExpireTime")
        protected String expireTime;
        @XmlElement(name = "BAScenario")
        protected List<BAScenario> baScenario;
        @XmlElement(name = "BillDelivery")
        protected List<BADelivery> billDelivery;
        @XmlElement(name = "DefaultFlag")
        protected Integer defaultFlag;

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
         * Gets the value of the baCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBACode() {
            return baCode;
        }

        /**
         * Sets the value of the baCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBACode(String value) {
            this.baCode = value;
        }

        /**
         * Gets the value of the billAddr property.
         * 
         * @return
         *     possible object is
         *     {@link BAAddrInfo }
         *     
         */
        public BAAddrInfo getBillAddr() {
            return billAddr;
        }

        /**
         * Sets the value of the billAddr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BAAddrInfo }
         *     
         */
        public void setBillAddr(BAAddrInfo value) {
            this.billAddr = value;
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
         * Gets the value of the baScenario property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baScenario property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBAScenario().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BAScenario }
         * 
         * 
         */
        public List<BAScenario> getBAScenario() {
            if (baScenario == null) {
                baScenario = new ArrayList<BAScenario>();
            }
            return this.baScenario;
        }

        /**
         * Gets the value of the billDelivery property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the billDelivery property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBillDelivery().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BADelivery }
         * 
         * 
         */
        public List<BADelivery> getBillDelivery() {
            if (billDelivery == null) {
                billDelivery = new ArrayList<BADelivery>();
            }
            return this.billDelivery;
        }

        /**
         * Gets the value of the defaultFlag property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDefaultFlag() {
            return defaultFlag;
        }

        /**
         * Sets the value of the defaultFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDefaultFlag(Integer value) {
            this.defaultFlag = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/common}Customer">
     *       &lt;sequence>
     *         &lt;element name="OperType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "operType"
    })
    public static class Customer
        extends com.huawei.bme.cbsinterface.common.Customer
    {

        @XmlElement(name = "OperType")
        protected Integer operType;

        /**
         * Gets the value of the operType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOperType() {
            return operType;
        }

        /**
         * Sets the value of the operType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOperType(Integer value) {
            this.operType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrder">
     *       &lt;sequence>
     *         &lt;element name="Subscriber" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/common}Subscriber">
     *                 &lt;sequence>
     *                   &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/subscribe}Product" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ComponentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subscriber",
        "accountCode"
    })
    public static class PrimaryOffer
        extends OfferOrder
    {

        @XmlElement(name = "Subscriber", required = true)
        protected List<NewSubscriberRequest.PrimaryOffer.Subscriber> subscriber;
        @XmlElement(name = "AccountCode")
        protected String accountCode;

        /**
         * Gets the value of the subscriber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subscriber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubscriber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NewSubscriberRequest.PrimaryOffer.Subscriber }
         * 
         * 
         */
        public List<NewSubscriberRequest.PrimaryOffer.Subscriber> getSubscriber() {
            if (subscriber == null) {
                subscriber = new ArrayList<NewSubscriberRequest.PrimaryOffer.Subscriber>();
            }
            return this.subscriber;
        }

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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/common}Subscriber">
         *       &lt;sequence>
         *         &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/subscribe}Product" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ComponentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "product",
            "componentID",
            "accountCode"
        })
        public static class Subscriber
            extends com.huawei.bme.cbsinterface.common.Subscriber
        {

            @XmlElement(name = "Product")
            protected List<Product> product;
            @XmlElementRef(name = "ComponentID", namespace = "http://www.huawei.com/bme/cbsinterface/newsubscriber", type = JAXBElement.class)
            protected JAXBElement<Integer> componentID;
            @XmlElement(name = "AccountCode")
            protected String accountCode;

            /**
             * Gets the value of the product property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the product property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProduct().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Product }
             * 
             * 
             */
            public List<Product> getProduct() {
                if (product == null) {
                    product = new ArrayList<Product>();
                }
                return this.product;
            }

            /**
             * Gets the value of the componentID property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getComponentID() {
                return componentID;
            }

            /**
             * Sets the value of the componentID property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setComponentID(JAXBElement<Integer> value) {
                this.componentID = ((JAXBElement<Integer> ) value);
            }

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

        }

    }

}
