
package com.huawei.bme.cbsinterface.subscribe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.SimpleProperty;


/**
 * <p>Java class for OfferOrderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferOrderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferId" type="{http://www.huawei.com/bme/cbsinterface/common}OfferId"/>
 *         &lt;element name="OfferOrderKey" type="{http://www.huawei.com/bme/cbsinterface/common}OfferOrderKey"/>
 *         &lt;element name="EffectiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *         &lt;element name="ExpireDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *         &lt;element name="AutoType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OfferCode" type="{http://www.huawei.com/bme/cbsinterface/common}OfferCode" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "OfferOrderInfo", propOrder = {
    "offerId",
    "offerOrderKey",
    "effectiveDate",
    "expireDate",
    "autoType",
    "offerCode",
    "status",
    "simpleProperty"
})
@XmlSeeAlso({
    com.huawei.bme.cbsinterface.query.QueryCustomerResult.Customer.Offer.class
})
public class OfferOrderInfo {

    @XmlElement(name = "OfferId")
    protected int offerId;
    @XmlElement(name = "OfferOrderKey")
    protected long offerOrderKey;
    @XmlElement(name = "EffectiveDate", required = true)
    protected String effectiveDate;
    @XmlElement(name = "ExpireDate", required = true)
    protected String expireDate;
    @XmlElement(name = "AutoType")
    protected int autoType;
    @XmlElement(name = "OfferCode")
    protected String offerCode;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "SimpleProperty")
    protected List<SimpleProperty> simpleProperty;

    /**
     * Gets the value of the offerId property.
     * 
     */
    public int getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     */
    public void setOfferId(int value) {
        this.offerId = value;
    }

    /**
     * Gets the value of the offerOrderKey property.
     * 
     */
    public long getOfferOrderKey() {
        return offerOrderKey;
    }

    /**
     * Sets the value of the offerOrderKey property.
     * 
     */
    public void setOfferOrderKey(long value) {
        this.offerOrderKey = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the autoType property.
     * 
     */
    public int getAutoType() {
        return autoType;
    }

    /**
     * Sets the value of the autoType property.
     * 
     */
    public void setAutoType(int value) {
        this.autoType = value;
    }

    /**
     * Gets the value of the offerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCode() {
        return offerCode;
    }

    /**
     * Sets the value of the offerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCode(String value) {
        this.offerCode = value;
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
