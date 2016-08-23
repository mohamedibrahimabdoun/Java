
package com.huawei.bme.cbsinterface.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingCycleDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingCycleDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillCycleOpenDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="BillCycleEndDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="BillCycleType" type="{http://www.huawei.com/bme/cbsinterface/common}BillCycleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingCycleDate", propOrder = {
    "billCycleOpenDate",
    "billCycleEndDate",
    "billCycleType"
})
public class BillingCycleDate {

    @XmlElement(name = "BillCycleOpenDate")
    protected String billCycleOpenDate;
    @XmlElement(name = "BillCycleEndDate")
    protected String billCycleEndDate;
    @XmlElement(name = "BillCycleType")
    protected Integer billCycleType;

    /**
     * Gets the value of the billCycleOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleOpenDate() {
        return billCycleOpenDate;
    }

    /**
     * Sets the value of the billCycleOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleOpenDate(String value) {
        this.billCycleOpenDate = value;
    }

    /**
     * Gets the value of the billCycleEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleEndDate() {
        return billCycleEndDate;
    }

    /**
     * Sets the value of the billCycleEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleEndDate(String value) {
        this.billCycleEndDate = value;
    }

    /**
     * Gets the value of the billCycleType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillCycleType() {
        return billCycleType;
    }

    /**
     * Sets the value of the billCycleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillCycleType(Integer value) {
        this.billCycleType = value;
    }

}
