
package com.huawei.bme.cbsinterface.subscribe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HomeZoneInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HomeZoneInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HomeZoneID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="effectiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="expireDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HomeZoneInfo", propOrder = {
    "homeZoneID",
    "effectiveDate",
    "expireDate"
})
public class HomeZoneInfo {

    @XmlElement(name = "HomeZoneID")
    protected int homeZoneID;
    protected String effectiveDate;
    protected String expireDate;

    /**
     * Gets the value of the homeZoneID property.
     * 
     */
    public int getHomeZoneID() {
        return homeZoneID;
    }

    /**
     * Sets the value of the homeZoneID property.
     * 
     */
    public void setHomeZoneID(int value) {
        this.homeZoneID = value;
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

}
