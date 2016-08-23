
package com.huawei.bme.cbsinterface.subscribe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FamilyNoInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyNoInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FamilyNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *         &lt;element name="phoneNoOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="subGroupType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "FamilyNoInfo", propOrder = {
    "familyNo",
    "phoneNoOrder",
    "subGroupType",
    "effectiveDate",
    "expireDate"
})
public class FamilyNoInfo {

    @XmlElement(name = "FamilyNo", required = true)
    protected String familyNo;
    @XmlElementRef(name = "phoneNoOrder", namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", type = JAXBElement.class)
    protected JAXBElement<Integer> phoneNoOrder;
    @XmlElementRef(name = "subGroupType", namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", type = JAXBElement.class)
    protected JAXBElement<Integer> subGroupType;
    protected String effectiveDate;
    protected String expireDate;

    /**
     * Gets the value of the familyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyNo() {
        return familyNo;
    }

    /**
     * Sets the value of the familyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyNo(String value) {
        this.familyNo = value;
    }

    /**
     * Gets the value of the phoneNoOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhoneNoOrder() {
        return phoneNoOrder;
    }

    /**
     * Sets the value of the phoneNoOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhoneNoOrder(JAXBElement<Integer> value) {
        this.phoneNoOrder = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the subGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSubGroupType() {
        return subGroupType;
    }

    /**
     * Sets the value of the subGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSubGroupType(JAXBElement<Integer> value) {
        this.subGroupType = ((JAXBElement<Integer> ) value);
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
