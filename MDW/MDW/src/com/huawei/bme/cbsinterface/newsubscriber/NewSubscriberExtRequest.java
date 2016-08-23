
package com.huawei.bme.cbsinterface.newsubscriber;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.BindSubscriberNo;
import com.huawei.bme.cbsinterface.common.SimpleProperty;
import com.huawei.bme.cbsinterface.subscribe.OfferOrder;


/**
 * <p>Java class for NewSubscriberExtRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewSubscriberExtRequest">
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
 *         &lt;element name="Account" minOccurs="0">
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
 *         &lt;element name="PrimaryOffer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrder">
 *                 &lt;sequence>
 *                   &lt;element name="Subscriber">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MainProductId" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId"/>
 *                             &lt;element name="SubscriberCode" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
 *                             &lt;element name="BelToAreaID" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Password" type="{http://www.huawei.com/bme/cbsinterface/common}Password" minOccurs="0"/>
 *                             &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}Product">
 *                                     &lt;sequence>
 *                                       &lt;element name="BindSubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}BindSubscriberNo" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OptionalOffer" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrder">
 *                 &lt;sequence>
 *                   &lt;element name="Product">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}Product">
 *                           &lt;sequence>
 *                             &lt;element name="BindSubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}BindSubscriberNo" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "NewSubscriberExtRequest", propOrder = {
    "customer",
    "account",
    "primaryOffer",
    "optionalOffer"
})
public class NewSubscriberExtRequest {

    @XmlElement(name = "Customer")
    protected NewSubscriberExtRequest.Customer customer;
    @XmlElement(name = "Account")
    protected NewSubscriberExtRequest.Account account;
    @XmlElement(name = "PrimaryOffer", required = true)
    protected NewSubscriberExtRequest.PrimaryOffer primaryOffer;
    @XmlElement(name = "OptionalOffer")
    protected List<NewSubscriberExtRequest.OptionalOffer> optionalOffer;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link NewSubscriberExtRequest.Customer }
     *     
     */
    public NewSubscriberExtRequest.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewSubscriberExtRequest.Customer }
     *     
     */
    public void setCustomer(NewSubscriberExtRequest.Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link NewSubscriberExtRequest.Account }
     *     
     */
    public NewSubscriberExtRequest.Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewSubscriberExtRequest.Account }
     *     
     */
    public void setAccount(NewSubscriberExtRequest.Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the primaryOffer property.
     * 
     * @return
     *     possible object is
     *     {@link NewSubscriberExtRequest.PrimaryOffer }
     *     
     */
    public NewSubscriberExtRequest.PrimaryOffer getPrimaryOffer() {
        return primaryOffer;
    }

    /**
     * Sets the value of the primaryOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewSubscriberExtRequest.PrimaryOffer }
     *     
     */
    public void setPrimaryOffer(NewSubscriberExtRequest.PrimaryOffer value) {
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
     * {@link NewSubscriberExtRequest.OptionalOffer }
     * 
     * 
     */
    public List<NewSubscriberExtRequest.OptionalOffer> getOptionalOffer() {
        if (optionalOffer == null) {
            optionalOffer = new ArrayList<NewSubscriberExtRequest.OptionalOffer>();
        }
        return this.optionalOffer;
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
     *         &lt;element name="Product">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}Product">
     *                 &lt;sequence>
     *                   &lt;element name="BindSubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}BindSubscriberNo" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "product"
    })
    public static class OptionalOffer
        extends OfferOrder
    {

        @XmlElement(name = "Product", required = true)
        protected NewSubscriberExtRequest.OptionalOffer.Product product;

        /**
         * Gets the value of the product property.
         * 
         * @return
         *     possible object is
         *     {@link NewSubscriberExtRequest.OptionalOffer.Product }
         *     
         */
        public NewSubscriberExtRequest.OptionalOffer.Product getProduct() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewSubscriberExtRequest.OptionalOffer.Product }
         *     
         */
        public void setProduct(NewSubscriberExtRequest.OptionalOffer.Product value) {
            this.product = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}Product">
         *       &lt;sequence>
         *         &lt;element name="BindSubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}BindSubscriberNo" maxOccurs="unbounded" minOccurs="0"/>
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
            "bindSubscriberNo"
        })
        public static class Product
            extends com.huawei.bme.cbsinterface.subscribe.Product
        {

            @XmlElement(name = "BindSubscriberNo")
            protected List<BindSubscriberNo> bindSubscriberNo;

            /**
             * Gets the value of the bindSubscriberNo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bindSubscriberNo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBindSubscriberNo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BindSubscriberNo }
             * 
             * 
             */
            public List<BindSubscriberNo> getBindSubscriberNo() {
                if (bindSubscriberNo == null) {
                    bindSubscriberNo = new ArrayList<BindSubscriberNo>();
                }
                return this.bindSubscriberNo;
            }

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
     *         &lt;element name="Subscriber">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MainProductId" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId"/>
     *                   &lt;element name="SubscriberCode" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
     *                   &lt;element name="BelToAreaID" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Password" type="{http://www.huawei.com/bme/cbsinterface/common}Password" minOccurs="0"/>
     *                   &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}Product">
     *                           &lt;sequence>
     *                             &lt;element name="BindSubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}BindSubscriberNo" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "subscriber"
    })
    public static class PrimaryOffer
        extends OfferOrder
    {

        @XmlElement(name = "Subscriber", required = true)
        protected NewSubscriberExtRequest.PrimaryOffer.Subscriber subscriber;

        /**
         * Gets the value of the subscriber property.
         * 
         * @return
         *     possible object is
         *     {@link NewSubscriberExtRequest.PrimaryOffer.Subscriber }
         *     
         */
        public NewSubscriberExtRequest.PrimaryOffer.Subscriber getSubscriber() {
            return subscriber;
        }

        /**
         * Sets the value of the subscriber property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewSubscriberExtRequest.PrimaryOffer.Subscriber }
         *     
         */
        public void setSubscriber(NewSubscriberExtRequest.PrimaryOffer.Subscriber value) {
            this.subscriber = value;
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
         *         &lt;element name="MainProductId" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId"/>
         *         &lt;element name="SubscriberCode" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
         *         &lt;element name="BelToAreaID" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Password" type="{http://www.huawei.com/bme/cbsinterface/common}Password" minOccurs="0"/>
         *         &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}Product">
         *                 &lt;sequence>
         *                   &lt;element name="BindSubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}BindSubscriberNo" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
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
        @XmlType(name = "", propOrder = {
            "mainProductId",
            "subscriberCode",
            "belToAreaID",
            "password",
            "simpleProperty",
            "product"
        })
        public static class Subscriber {

            @XmlElement(name = "MainProductId")
            protected int mainProductId;
            @XmlElement(name = "SubscriberCode")
            protected String subscriberCode;
            @XmlElement(name = "BelToAreaID")
            protected String belToAreaID;
            @XmlElement(name = "Password")
            protected String password;
            @XmlElement(name = "SimpleProperty")
            protected List<SimpleProperty> simpleProperty;
            @XmlElement(name = "Product")
            protected List<NewSubscriberExtRequest.PrimaryOffer.Subscriber.Product> product;

            /**
             * Gets the value of the mainProductId property.
             * 
             */
            public int getMainProductId() {
                return mainProductId;
            }

            /**
             * Sets the value of the mainProductId property.
             * 
             */
            public void setMainProductId(int value) {
                this.mainProductId = value;
            }

            /**
             * Gets the value of the subscriberCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubscriberCode() {
                return subscriberCode;
            }

            /**
             * Sets the value of the subscriberCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubscriberCode(String value) {
                this.subscriberCode = value;
            }

            /**
             * Gets the value of the belToAreaID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBelToAreaID() {
                return belToAreaID;
            }

            /**
             * Sets the value of the belToAreaID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBelToAreaID(String value) {
                this.belToAreaID = value;
            }

            /**
             * Gets the value of the password property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPassword() {
                return password;
            }

            /**
             * Sets the value of the password property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPassword(String value) {
                this.password = value;
            }

            /**
             * Gets the value of the simpleProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the simpleProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSimpleProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SimpleProperty }
             * 
             * 
             */
            public List<SimpleProperty> getSimpleProperty() {
                if (simpleProperty == null) {
                    simpleProperty = new ArrayList<SimpleProperty>();
                }
                return this.simpleProperty;
            }

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
             * {@link NewSubscriberExtRequest.PrimaryOffer.Subscriber.Product }
             * 
             * 
             */
            public List<NewSubscriberExtRequest.PrimaryOffer.Subscriber.Product> getProduct() {
                if (product == null) {
                    product = new ArrayList<NewSubscriberExtRequest.PrimaryOffer.Subscriber.Product>();
                }
                return this.product;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}Product">
             *       &lt;sequence>
             *         &lt;element name="BindSubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}BindSubscriberNo" maxOccurs="unbounded" minOccurs="0"/>
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
                "bindSubscriberNo"
            })
            public static class Product
                extends com.huawei.bme.cbsinterface.subscribe.Product
            {

                @XmlElement(name = "BindSubscriberNo")
                protected List<BindSubscriberNo> bindSubscriberNo;

                /**
                 * Gets the value of the bindSubscriberNo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the bindSubscriberNo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBindSubscriberNo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BindSubscriberNo }
                 * 
                 * 
                 */
                public List<BindSubscriberNo> getBindSubscriberNo() {
                    if (bindSubscriberNo == null) {
                        bindSubscriberNo = new ArrayList<BindSubscriberNo>();
                    }
                    return this.bindSubscriberNo;
                }

            }

        }

    }

}
