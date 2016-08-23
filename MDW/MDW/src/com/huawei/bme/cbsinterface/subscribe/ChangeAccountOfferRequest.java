
package com.huawei.bme.cbsinterface.subscribe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.SimpleProperty;


/**
 * <p>Java class for ChangeAccountOfferRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeAccountOfferRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *         &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
 *         &lt;element name="Offering" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrder">
 *                 &lt;sequence>
 *                   &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId"/>
 *                             &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="FeeAmount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="OfferOrderKey" type="{http://www.huawei.com/bme/cbsinterface/common}OfferOrderKey" minOccurs="0"/>
 *                   &lt;element name="ValidMode" type="{http://www.huawei.com/bme/cbsinterface/subscribe}EffectMode" minOccurs="0"/>
 *                   &lt;element name="Status" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="7"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HandleChargeFlag" type="{http://www.huawei.com/bme/cbsinterface/common}HandleChargeFlag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeAccountOfferRequest", propOrder = {
    "subscriberNo",
    "accountCode",
    "offering",
    "handleChargeFlag"
})
public class ChangeAccountOfferRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "AccountCode")
    protected String accountCode;
    @XmlElement(name = "Offering", required = true)
    protected List<ChangeAccountOfferRequest.Offering> offering;
    @XmlElement(name = "HandleChargeFlag")
    protected Integer handleChargeFlag;

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
     * Gets the value of the offering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeAccountOfferRequest.Offering }
     * 
     * 
     */
    public List<ChangeAccountOfferRequest.Offering> getOffering() {
        if (offering == null) {
            offering = new ArrayList<ChangeAccountOfferRequest.Offering>();
        }
        return this.offering;
    }

    /**
     * Gets the value of the handleChargeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandleChargeFlag() {
        return handleChargeFlag;
    }

    /**
     * Sets the value of the handleChargeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandleChargeFlag(Integer value) {
        this.handleChargeFlag = value;
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
     *         &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId"/>
     *                   &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="FeeAmount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="OfferOrderKey" type="{http://www.huawei.com/bme/cbsinterface/common}OfferOrderKey" minOccurs="0"/>
     *         &lt;element name="ValidMode" type="{http://www.huawei.com/bme/cbsinterface/subscribe}EffectMode" minOccurs="0"/>
     *         &lt;element name="Status" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="7"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "product",
        "operationType",
        "offerOrderKey",
        "validMode",
        "status"
    })
    public static class Offering
        extends OfferOrder
    {

        @XmlElement(name = "Product")
        protected List<ChangeAccountOfferRequest.Offering.Product> product;
        @XmlElement(name = "OperationType")
        protected int operationType;
        @XmlElement(name = "OfferOrderKey")
        protected Long offerOrderKey;
        @XmlElement(name = "ValidMode")
        protected EffectMode validMode;
        @XmlElement(name = "Status")
        protected String status;

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
         * {@link ChangeAccountOfferRequest.Offering.Product }
         * 
         * 
         */
        public List<ChangeAccountOfferRequest.Offering.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<ChangeAccountOfferRequest.Offering.Product>();
            }
            return this.product;
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
         * Gets the value of the offerOrderKey property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOfferOrderKey() {
            return offerOrderKey;
        }

        /**
         * Sets the value of the offerOrderKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOfferOrderKey(Long value) {
            this.offerOrderKey = value;
        }

        /**
         * Gets the value of the validMode property.
         * 
         * @return
         *     possible object is
         *     {@link EffectMode }
         *     
         */
        public EffectMode getValidMode() {
            return validMode;
        }

        /**
         * Sets the value of the validMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link EffectMode }
         *     
         */
        public void setValidMode(EffectMode value) {
            this.validMode = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
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
         *         &lt;element name="Id" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId"/>
         *         &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="FeeAmount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
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
            "id",
            "simpleProperty",
            "feeAmount"
        })
        public static class Product {

            @XmlElement(name = "Id")
            protected int id;
            @XmlElement(name = "SimpleProperty")
            protected List<SimpleProperty> simpleProperty;
            @XmlElement(name = "FeeAmount")
            protected Long feeAmount;

            /**
             * Gets the value of the id property.
             * 
             */
            public int getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             */
            public void setId(int value) {
                this.id = value;
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
             * Gets the value of the feeAmount property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getFeeAmount() {
                return feeAmount;
            }

            /**
             * Sets the value of the feeAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setFeeAmount(Long value) {
                this.feeAmount = value;
            }

        }

    }

}
