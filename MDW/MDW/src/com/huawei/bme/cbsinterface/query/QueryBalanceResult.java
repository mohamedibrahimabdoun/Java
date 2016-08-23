
package com.huawei.bme.cbsinterface.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryBalanceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryBalanceResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BalanceRecord" type="{http://www.huawei.com/bme/cbsinterface/query}BalanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BalanceValidity" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *         &lt;element name="AvailableCredit" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="BalanceActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *         &lt;element name="UnpaidFee" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="AvailableQuota" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryBalanceResult", propOrder = {
    "balanceRecord",
    "balanceValidity",
    "availableCredit",
    "balanceActiveDate",
    "unpaidFee",
    "availableQuota"
})
public class QueryBalanceResult {

    @XmlElement(name = "BalanceRecord")
    protected List<BalanceType> balanceRecord;
    @XmlElement(name = "BalanceValidity")
    protected String balanceValidity;
    @XmlElement(name = "AvailableCredit")
    protected Long availableCredit;
    @XmlElement(name = "BalanceActiveDate")
    protected String balanceActiveDate;
    @XmlElementRef(name = "UnpaidFee", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class)
    protected JAXBElement<Long> unpaidFee;
    @XmlElement(name = "AvailableQuota")
    protected Long availableQuota;

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

    /**
     * Gets the value of the balanceValidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceValidity() {
        return balanceValidity;
    }

    /**
     * Sets the value of the balanceValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceValidity(String value) {
        this.balanceValidity = value;
    }

    /**
     * Gets the value of the availableCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailableCredit() {
        return availableCredit;
    }

    /**
     * Sets the value of the availableCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailableCredit(Long value) {
        this.availableCredit = value;
    }

    /**
     * Gets the value of the balanceActiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceActiveDate() {
        return balanceActiveDate;
    }

    /**
     * Sets the value of the balanceActiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceActiveDate(String value) {
        this.balanceActiveDate = value;
    }

    /**
     * Gets the value of the unpaidFee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUnpaidFee() {
        return unpaidFee;
    }

    /**
     * Sets the value of the unpaidFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUnpaidFee(JAXBElement<Long> value) {
        this.unpaidFee = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the availableQuota property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailableQuota() {
        return availableQuota;
    }

    /**
     * Sets the value of the availableQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailableQuota(Long value) {
        this.availableQuota = value;
    }

}
