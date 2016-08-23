
package com.huawei.bme.cbsinterface.subscribe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.OneTimeCharge;


/**
 * <p>Java class for ChangeOptionalOfferRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeOptionalOfferRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *         &lt;element name="OptionalOffer" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}OptionalOfferOrder">
 *                 &lt;sequence>
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
 *         &lt;element name="PrimaryOfferOrderKey" type="{http://www.huawei.com/bme/cbsinterface/common}OfferOrderKey" minOccurs="0"/>
 *         &lt;element name="OneTimeCharge" type="{http://www.huawei.com/bme/cbsinterface/common}OneTimeCharge" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeOptionalOfferRequest", propOrder = {
    "subscriberNo",
    "optionalOffer",
    "handleChargeFlag",
    "primaryOfferOrderKey",
    "oneTimeCharge"
})
public class ChangeOptionalOfferRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "OptionalOffer", required = true)
    protected List<ChangeOptionalOfferRequest.OptionalOffer> optionalOffer;
    @XmlElement(name = "HandleChargeFlag")
    protected Integer handleChargeFlag;
    @XmlElement(name = "PrimaryOfferOrderKey")
    protected Long primaryOfferOrderKey;
    @XmlElement(name = "OneTimeCharge")
    protected OneTimeCharge oneTimeCharge;

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
     * {@link ChangeOptionalOfferRequest.OptionalOffer }
     * 
     * 
     */
    public List<ChangeOptionalOfferRequest.OptionalOffer> getOptionalOffer() {
        if (optionalOffer == null) {
            optionalOffer = new ArrayList<ChangeOptionalOfferRequest.OptionalOffer>();
        }
        return this.optionalOffer;
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
     * Gets the value of the primaryOfferOrderKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrimaryOfferOrderKey() {
        return primaryOfferOrderKey;
    }

    /**
     * Sets the value of the primaryOfferOrderKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrimaryOfferOrderKey(Long value) {
        this.primaryOfferOrderKey = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}OptionalOfferOrder">
     *       &lt;sequence>
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
        "operationType",
        "offerOrderKey",
        "validMode",
        "status"
    })
    public static class OptionalOffer
        extends OptionalOfferOrder
    {

        @XmlElement(name = "OperationType")
        protected int operationType;
        @XmlElement(name = "OfferOrderKey")
        protected Long offerOrderKey;
        @XmlElement(name = "ValidMode")
        protected EffectMode validMode;
        @XmlElement(name = "Status")
        protected String status;

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

    }

}
