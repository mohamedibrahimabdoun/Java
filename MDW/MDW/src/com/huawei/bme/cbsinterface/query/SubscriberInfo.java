
package com.huawei.bme.cbsinterface.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.SimpleProperty;


/**
 * <p>Java class for SubscriberInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryOfferId" type="{http://www.huawei.com/bme/cbsinterface/common}OfferId"/>
 *         &lt;element name="PrimaryOfferOrderKey" type="{http://www.huawei.com/bme/cbsinterface/common}OfferOrderKey"/>
 *         &lt;element name="MainProductId" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId"/>
 *         &lt;element name="NetworkType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BrandID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaidMode" type="{http://www.huawei.com/bme/cbsinterface/common}PaidMode"/>
 *         &lt;element name="IMSI" type="{http://www.huawei.com/bme/cbsinterface/common}IMSI" minOccurs="0"/>
 *         &lt;element name="ComponentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SubscriberCode" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
 *         &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode"/>
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
@XmlType(name = "SubscriberInfo", propOrder = {
    "primaryOfferId",
    "primaryOfferOrderKey",
    "mainProductId",
    "networkType",
    "brandID",
    "paidMode",
    "imsi",
    "componentId",
    "subscriberCode",
    "accountCode",
    "simpleProperty"
})
public class SubscriberInfo {

    @XmlElement(name = "PrimaryOfferId")
    protected int primaryOfferId;
    @XmlElement(name = "PrimaryOfferOrderKey")
    protected long primaryOfferOrderKey;
    @XmlElement(name = "MainProductId")
    protected int mainProductId;
    @XmlElement(name = "NetworkType")
    protected int networkType;
    @XmlElement(name = "BrandID")
    protected int brandID;
    @XmlElement(name = "PaidMode")
    protected int paidMode;
    @XmlElement(name = "IMSI")
    protected String imsi;
    @XmlElementRef(name = "ComponentId", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class)
    protected JAXBElement<Integer> componentId;
    @XmlElement(name = "SubscriberCode")
    protected String subscriberCode;
    @XmlElement(name = "AccountCode", required = true)
    protected String accountCode;
    @XmlElement(name = "SimpleProperty")
    protected List<SimpleProperty> simpleProperty;

    /**
     * Gets the value of the primaryOfferId property.
     * 
     */
    public int getPrimaryOfferId() {
        return primaryOfferId;
    }

    /**
     * Sets the value of the primaryOfferId property.
     * 
     */
    public void setPrimaryOfferId(int value) {
        this.primaryOfferId = value;
    }

    /**
     * Gets the value of the primaryOfferOrderKey property.
     * 
     */
    public long getPrimaryOfferOrderKey() {
        return primaryOfferOrderKey;
    }

    /**
     * Sets the value of the primaryOfferOrderKey property.
     * 
     */
    public void setPrimaryOfferOrderKey(long value) {
        this.primaryOfferOrderKey = value;
    }

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
     * Gets the value of the networkType property.
     * 
     */
    public int getNetworkType() {
        return networkType;
    }

    /**
     * Sets the value of the networkType property.
     * 
     */
    public void setNetworkType(int value) {
        this.networkType = value;
    }

    /**
     * Gets the value of the brandID property.
     * 
     */
    public int getBrandID() {
        return brandID;
    }

    /**
     * Sets the value of the brandID property.
     * 
     */
    public void setBrandID(int value) {
        this.brandID = value;
    }

    /**
     * Gets the value of the paidMode property.
     * 
     */
    public int getPaidMode() {
        return paidMode;
    }

    /**
     * Sets the value of the paidMode property.
     * 
     */
    public void setPaidMode(int value) {
        this.paidMode = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMSI() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMSI(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the componentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getComponentId() {
        return componentId;
    }

    /**
     * Sets the value of the componentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setComponentId(JAXBElement<Integer> value) {
        this.componentId = ((JAXBElement<Integer> ) value);
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

}
