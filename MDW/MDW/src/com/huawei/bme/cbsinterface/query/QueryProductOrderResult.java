
package com.huawei.bme.cbsinterface.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.SimpleProperty;


/**
 * <p>Java class for QueryProductOrderResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryProductOrderResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceTariff" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="FavoriteCountry">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CountryRate" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CountryCode" type="{http://www.huawei.com/bme/cbsinterface/common}Country"/>
 *                                       &lt;element name="VoiceRate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LoyaltyNumber">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DiscountRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FreeResource" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BalanceRecord" type="{http://www.huawei.com/bme/cbsinterface/query}BalanceType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RecurringCharge" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryProductOrderResult", propOrder = {
    "serviceTariff",
    "freeResource",
    "recurringCharge",
    "simpleProperty"
})
public class QueryProductOrderResult {

    @XmlElement(name = "ServiceTariff")
    protected QueryProductOrderResult.ServiceTariff serviceTariff;
    @XmlElement(name = "FreeResource")
    protected QueryProductOrderResult.FreeResource freeResource;
    @XmlElement(name = "RecurringCharge")
    protected Long recurringCharge;
    @XmlElement(name = "SimpleProperty")
    protected List<SimpleProperty> simpleProperty;

    /**
     * Gets the value of the serviceTariff property.
     * 
     * @return
     *     possible object is
     *     {@link QueryProductOrderResult.ServiceTariff }
     *     
     */
    public QueryProductOrderResult.ServiceTariff getServiceTariff() {
        return serviceTariff;
    }

    /**
     * Sets the value of the serviceTariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryProductOrderResult.ServiceTariff }
     *     
     */
    public void setServiceTariff(QueryProductOrderResult.ServiceTariff value) {
        this.serviceTariff = value;
    }

    /**
     * Gets the value of the freeResource property.
     * 
     * @return
     *     possible object is
     *     {@link QueryProductOrderResult.FreeResource }
     *     
     */
    public QueryProductOrderResult.FreeResource getFreeResource() {
        return freeResource;
    }

    /**
     * Sets the value of the freeResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryProductOrderResult.FreeResource }
     *     
     */
    public void setFreeResource(QueryProductOrderResult.FreeResource value) {
        this.freeResource = value;
    }

    /**
     * Gets the value of the recurringCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecurringCharge() {
        return recurringCharge;
    }

    /**
     * Sets the value of the recurringCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecurringCharge(Long value) {
        this.recurringCharge = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="BalanceRecord" type="{http://www.huawei.com/bme/cbsinterface/query}BalanceType" maxOccurs="unbounded" minOccurs="0"/>
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
        "balanceRecord"
    })
    public static class FreeResource {

        @XmlElement(name = "BalanceRecord")
        protected List<BalanceType> balanceRecord;

        /**
         * Gets the value of the balanceRecord property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the balanceRecord property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBalanceRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BalanceType }
         * 
         * 
         */
        public List<BalanceType> getBalanceRecord() {
            if (balanceRecord == null) {
                balanceRecord = new ArrayList<BalanceType>();
            }
            return this.balanceRecord;
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
     *       &lt;choice>
     *         &lt;element name="FavoriteCountry">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CountryRate" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CountryCode" type="{http://www.huawei.com/bme/cbsinterface/common}Country"/>
     *                             &lt;element name="VoiceRate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LoyaltyNumber">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DiscountRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "favoriteCountry",
        "loyaltyNumber"
    })
    public static class ServiceTariff {

        @XmlElement(name = "FavoriteCountry")
        protected QueryProductOrderResult.ServiceTariff.FavoriteCountry favoriteCountry;
        @XmlElement(name = "LoyaltyNumber")
        protected QueryProductOrderResult.ServiceTariff.LoyaltyNumber loyaltyNumber;

        /**
         * Gets the value of the favoriteCountry property.
         * 
         * @return
         *     possible object is
         *     {@link QueryProductOrderResult.ServiceTariff.FavoriteCountry }
         *     
         */
        public QueryProductOrderResult.ServiceTariff.FavoriteCountry getFavoriteCountry() {
            return favoriteCountry;
        }

        /**
         * Sets the value of the favoriteCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryProductOrderResult.ServiceTariff.FavoriteCountry }
         *     
         */
        public void setFavoriteCountry(QueryProductOrderResult.ServiceTariff.FavoriteCountry value) {
            this.favoriteCountry = value;
        }

        /**
         * Gets the value of the loyaltyNumber property.
         * 
         * @return
         *     possible object is
         *     {@link QueryProductOrderResult.ServiceTariff.LoyaltyNumber }
         *     
         */
        public QueryProductOrderResult.ServiceTariff.LoyaltyNumber getLoyaltyNumber() {
            return loyaltyNumber;
        }

        /**
         * Sets the value of the loyaltyNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryProductOrderResult.ServiceTariff.LoyaltyNumber }
         *     
         */
        public void setLoyaltyNumber(QueryProductOrderResult.ServiceTariff.LoyaltyNumber value) {
            this.loyaltyNumber = value;
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
         *         &lt;element name="CountryRate" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CountryCode" type="{http://www.huawei.com/bme/cbsinterface/common}Country"/>
         *                   &lt;element name="VoiceRate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        @XmlType(name = "", propOrder = {
            "countryRate"
        })
        public static class FavoriteCountry {

            @XmlElement(name = "CountryRate")
            protected List<QueryProductOrderResult.ServiceTariff.FavoriteCountry.CountryRate> countryRate;

            /**
             * Gets the value of the countryRate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the countryRate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCountryRate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link QueryProductOrderResult.ServiceTariff.FavoriteCountry.CountryRate }
             * 
             * 
             */
            public List<QueryProductOrderResult.ServiceTariff.FavoriteCountry.CountryRate> getCountryRate() {
                if (countryRate == null) {
                    countryRate = new ArrayList<QueryProductOrderResult.ServiceTariff.FavoriteCountry.CountryRate>();
                }
                return this.countryRate;
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
             *         &lt;element name="CountryCode" type="{http://www.huawei.com/bme/cbsinterface/common}Country"/>
             *         &lt;element name="VoiceRate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "countryCode",
                "voiceRate"
            })
            public static class CountryRate {

                @XmlElement(name = "CountryCode")
                protected int countryCode;
                @XmlElement(name = "VoiceRate", required = true)
                protected String voiceRate;

                /**
                 * Gets the value of the countryCode property.
                 * 
                 */
                public int getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 */
                public void setCountryCode(int value) {
                    this.countryCode = value;
                }

                /**
                 * Gets the value of the voiceRate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVoiceRate() {
                    return voiceRate;
                }

                /**
                 * Sets the value of the voiceRate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVoiceRate(String value) {
                    this.voiceRate = value;
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DiscountRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "discountRate"
        })
        public static class LoyaltyNumber {

            @XmlElement(name = "DiscountRate")
            protected String discountRate;

            /**
             * Gets the value of the discountRate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDiscountRate() {
                return discountRate;
            }

            /**
             * Sets the value of the discountRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDiscountRate(String value) {
                this.discountRate = value;
            }

        }

    }

}
