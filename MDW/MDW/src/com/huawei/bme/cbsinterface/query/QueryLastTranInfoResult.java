
package com.huawei.bme.cbsinterface.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * only for NTS
 * 
 * <p>Java class for QueryLastTranInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryLastTranInfoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChargeEvent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubChargeEvent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsVideoCall" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ChargeBeginTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrigPartyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DestPartyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChargeInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="UsedDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="UsedVolume" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="ChgOfItemsAcc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="ChgOfDurationAcc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="ChgOfMFundAcc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="ChgOfPFundAcc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="TotalChargeFlux" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "QueryLastTranInfoResult", propOrder = {
    "chargeEvent",
    "subChargeEvent",
    "serviceType",
    "isVideoCall",
    "chargeBeginTime",
    "origPartyNumber",
    "destPartyNumber",
    "chargeInfo"
})
public class QueryLastTranInfoResult {

    @XmlElement(name = "ChargeEvent")
    protected int chargeEvent;
    @XmlElement(name = "SubChargeEvent")
    protected int subChargeEvent;
    @XmlElement(name = "ServiceType", required = true)
    protected String serviceType;
    @XmlElement(name = "IsVideoCall")
    protected int isVideoCall;
    @XmlElement(name = "ChargeBeginTime", required = true)
    protected String chargeBeginTime;
    @XmlElement(name = "OrigPartyNumber", required = true)
    protected String origPartyNumber;
    @XmlElement(name = "DestPartyNumber", required = true)
    protected String destPartyNumber;
    @XmlElement(name = "ChargeInfo", required = true)
    protected QueryLastTranInfoResult.ChargeInfo chargeInfo;

    /**
     * Gets the value of the chargeEvent property.
     * 
     */
    public int getChargeEvent() {
        return chargeEvent;
    }

    /**
     * Sets the value of the chargeEvent property.
     * 
     */
    public void setChargeEvent(int value) {
        this.chargeEvent = value;
    }

    /**
     * Gets the value of the subChargeEvent property.
     * 
     */
    public int getSubChargeEvent() {
        return subChargeEvent;
    }

    /**
     * Sets the value of the subChargeEvent property.
     * 
     */
    public void setSubChargeEvent(int value) {
        this.subChargeEvent = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the isVideoCall property.
     * 
     */
    public int getIsVideoCall() {
        return isVideoCall;
    }

    /**
     * Sets the value of the isVideoCall property.
     * 
     */
    public void setIsVideoCall(int value) {
        this.isVideoCall = value;
    }

    /**
     * Gets the value of the chargeBeginTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeBeginTime() {
        return chargeBeginTime;
    }

    /**
     * Sets the value of the chargeBeginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeBeginTime(String value) {
        this.chargeBeginTime = value;
    }

    /**
     * Gets the value of the origPartyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigPartyNumber() {
        return origPartyNumber;
    }

    /**
     * Sets the value of the origPartyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigPartyNumber(String value) {
        this.origPartyNumber = value;
    }

    /**
     * Gets the value of the destPartyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestPartyNumber() {
        return destPartyNumber;
    }

    /**
     * Sets the value of the destPartyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestPartyNumber(String value) {
        this.destPartyNumber = value;
    }

    /**
     * Gets the value of the chargeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryLastTranInfoResult.ChargeInfo }
     *     
     */
    public QueryLastTranInfoResult.ChargeInfo getChargeInfo() {
        return chargeInfo;
    }

    /**
     * Sets the value of the chargeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryLastTranInfoResult.ChargeInfo }
     *     
     */
    public void setChargeInfo(QueryLastTranInfoResult.ChargeInfo value) {
        this.chargeInfo = value;
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
     *         &lt;element name="UsedDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="UsedVolume" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="ChgOfItemsAcc" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="ChgOfDurationAcc" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="ChgOfMFundAcc" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="ChgOfPFundAcc" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="TotalChargeFlux" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    public static class ChargeInfo {

        @XmlElement(name = "UsedDuration")
        protected int usedDuration;
        @XmlElement(name = "UsedVolume")
        protected int usedVolume;
        @XmlElement(name = "ChgOfItemsAcc")
        protected int chgOfItemsAcc;
        @XmlElement(name = "ChgOfDurationAcc")
        protected int chgOfDurationAcc;
        @XmlElement(name = "ChgOfMFundAcc")
        protected int chgOfMFundAcc;
        @XmlElement(name = "ChgOfPFundAcc")
        protected int chgOfPFundAcc;
        @XmlElement(name = "TotalChargeFlux")
        protected int totalChargeFlux;

        /**
         * Gets the value of the usedDuration property.
         * 
         */
        public int getUsedDuration() {
            return usedDuration;
        }

        /**
         * Sets the value of the usedDuration property.
         * 
         */
        public void setUsedDuration(int value) {
            this.usedDuration = value;
        }

        /**
         * Gets the value of the usedVolume property.
         * 
         */
        public int getUsedVolume() {
            return usedVolume;
        }

        /**
         * Sets the value of the usedVolume property.
         * 
         */
        public void setUsedVolume(int value) {
            this.usedVolume = value;
        }

        /**
         * Gets the value of the chgOfItemsAcc property.
         * 
         */
        public int getChgOfItemsAcc() {
            return chgOfItemsAcc;
        }

        /**
         * Sets the value of the chgOfItemsAcc property.
         * 
         */
        public void setChgOfItemsAcc(int value) {
            this.chgOfItemsAcc = value;
        }

        /**
         * Gets the value of the chgOfDurationAcc property.
         * 
         */
        public int getChgOfDurationAcc() {
            return chgOfDurationAcc;
        }

        /**
         * Sets the value of the chgOfDurationAcc property.
         * 
         */
        public void setChgOfDurationAcc(int value) {
            this.chgOfDurationAcc = value;
        }

        /**
         * Gets the value of the chgOfMFundAcc property.
         * 
         */
        public int getChgOfMFundAcc() {
            return chgOfMFundAcc;
        }

        /**
         * Sets the value of the chgOfMFundAcc property.
         * 
         */
        public void setChgOfMFundAcc(int value) {
            this.chgOfMFundAcc = value;
        }

        /**
         * Gets the value of the chgOfPFundAcc property.
         * 
         */
        public int getChgOfPFundAcc() {
            return chgOfPFundAcc;
        }

        /**
         * Sets the value of the chgOfPFundAcc property.
         * 
         */
        public void setChgOfPFundAcc(int value) {
            this.chgOfPFundAcc = value;
        }

        /**
         * Gets the value of the totalChargeFlux property.
         * 
         */
        public int getTotalChargeFlux() {
            return totalChargeFlux;
        }

        /**
         * Sets the value of the totalChargeFlux property.
         * 
         */
        public void setTotalChargeFlux(int value) {
            this.totalChargeFlux = value;
        }

    }

}
