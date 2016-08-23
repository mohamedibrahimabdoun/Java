
package com.huawei.bme.cbsinterface.subscribe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.SimpleProperty;


/**
 * <p>Java class for Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.huawei.com/bme/cbsinterface/common}ServiceId"/>
 *         &lt;element name="Property">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="FamilyNo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FamilyNoList" type="{http://www.huawei.com/bme/cbsinterface/subscribe}FamilyNoInfo" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CallScreen" type="{http://www.huawei.com/bme/cbsinterface/subscribe}CallScreen" minOccurs="0"/>
 *                   &lt;element name="HomeZone" type="{http://www.huawei.com/bme/cbsinterface/subscribe}HomeZone" minOccurs="0"/>
 *                   &lt;element name="SimploProperties" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SimploProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {
    "id",
    "property"
})
public class Service {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Property", required = true)
    protected Service.Property property;

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
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link Service.Property }
     *     
     */
    public Service.Property getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link Service.Property }
     *     
     */
    public void setProperty(Service.Property value) {
        this.property = value;
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
     *         &lt;element name="FamilyNo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FamilyNoList" type="{http://www.huawei.com/bme/cbsinterface/subscribe}FamilyNoInfo" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CallScreen" type="{http://www.huawei.com/bme/cbsinterface/subscribe}CallScreen" minOccurs="0"/>
     *         &lt;element name="HomeZone" type="{http://www.huawei.com/bme/cbsinterface/subscribe}HomeZone" minOccurs="0"/>
     *         &lt;element name="SimploProperties" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SimploProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
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
        "familyNo",
        "callScreen",
        "homeZone",
        "simploProperties"
    })
    public static class Property {

        @XmlElement(name = "FamilyNo")
        protected Service.Property.FamilyNo familyNo;
        @XmlElement(name = "CallScreen")
        protected CallScreen callScreen;
        @XmlElement(name = "HomeZone")
        protected HomeZone homeZone;
        @XmlElement(name = "SimploProperties")
        protected Service.Property.SimploProperties simploProperties;

        /**
         * Gets the value of the familyNo property.
         * 
         * @return
         *     possible object is
         *     {@link Service.Property.FamilyNo }
         *     
         */
        public Service.Property.FamilyNo getFamilyNo() {
            return familyNo;
        }

        /**
         * Sets the value of the familyNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Service.Property.FamilyNo }
         *     
         */
        public void setFamilyNo(Service.Property.FamilyNo value) {
            this.familyNo = value;
        }

        /**
         * Gets the value of the callScreen property.
         * 
         * @return
         *     possible object is
         *     {@link CallScreen }
         *     
         */
        public CallScreen getCallScreen() {
            return callScreen;
        }

        /**
         * Sets the value of the callScreen property.
         * 
         * @param value
         *     allowed object is
         *     {@link CallScreen }
         *     
         */
        public void setCallScreen(CallScreen value) {
            this.callScreen = value;
        }

        /**
         * Gets the value of the homeZone property.
         * 
         * @return
         *     possible object is
         *     {@link HomeZone }
         *     
         */
        public HomeZone getHomeZone() {
            return homeZone;
        }

        /**
         * Sets the value of the homeZone property.
         * 
         * @param value
         *     allowed object is
         *     {@link HomeZone }
         *     
         */
        public void setHomeZone(HomeZone value) {
            this.homeZone = value;
        }

        /**
         * Gets the value of the simploProperties property.
         * 
         * @return
         *     possible object is
         *     {@link Service.Property.SimploProperties }
         *     
         */
        public Service.Property.SimploProperties getSimploProperties() {
            return simploProperties;
        }

        /**
         * Sets the value of the simploProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link Service.Property.SimploProperties }
         *     
         */
        public void setSimploProperties(Service.Property.SimploProperties value) {
            this.simploProperties = value;
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
         *         &lt;element name="FamilyNoList" type="{http://www.huawei.com/bme/cbsinterface/subscribe}FamilyNoInfo" maxOccurs="unbounded"/>
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
            "familyNoList"
        })
        public static class FamilyNo {

            @XmlElement(name = "FamilyNoList", required = true)
            protected List<FamilyNoInfo> familyNoList;

            /**
             * Gets the value of the familyNoList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the familyNoList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFamilyNoList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FamilyNoInfo }
             * 
             * 
             */
            public List<FamilyNoInfo> getFamilyNoList() {
                if (familyNoList == null) {
                    familyNoList = new ArrayList<FamilyNoInfo>();
                }
                return this.familyNoList;
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
         *         &lt;element name="SimploProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
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
            "simploProperty"
        })
        public static class SimploProperties {

            @XmlElement(name = "SimploProperty")
            protected List<SimpleProperty> simploProperty;

            /**
             * Gets the value of the simploProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the simploProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSimploProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SimpleProperty }
             * 
             * 
             */
            public List<SimpleProperty> getSimploProperty() {
                if (simploProperty == null) {
                    simploProperty = new ArrayList<SimpleProperty>();
                }
                return this.simploProperty;
            }

        }

    }

}
