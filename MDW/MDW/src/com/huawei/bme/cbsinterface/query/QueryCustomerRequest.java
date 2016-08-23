
package com.huawei.bme.cbsinterface.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCustomerRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCustomerRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *           &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode"/>
 *           &lt;element name="CustomerCode" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerCode"/>
 *         &lt;/choice>
 *         &lt;element name="QueryType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerMask" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AccountMask" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubscriberMask" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "QueryCustomerRequest", propOrder = {
    "subscriberNo",
    "accountCode",
    "customerCode",
    "queryType",
    "customerMask",
    "accountMask",
    "subscriberMask"
})
public class QueryCustomerRequest {

    @XmlElement(name = "SubscriberNo")
    protected String subscriberNo;
    @XmlElement(name = "AccountCode")
    protected String accountCode;
    @XmlElement(name = "CustomerCode")
    protected String customerCode;
    @XmlElement(name = "QueryType")
    protected Integer queryType;
    @XmlElement(name = "CustomerMask")
    protected String customerMask;
    @XmlElement(name = "AccountMask")
    protected String accountMask;
    @XmlElement(name = "SubscriberMask")
    protected String subscriberMask;

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
     * Gets the value of the customerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Sets the value of the customerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    /**
     * Gets the value of the queryType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQueryType() {
        return queryType;
    }

    /**
     * Sets the value of the queryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQueryType(Integer value) {
        this.queryType = value;
    }

    /**
     * Gets the value of the customerMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerMask() {
        return customerMask;
    }

    /**
     * Sets the value of the customerMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerMask(String value) {
        this.customerMask = value;
    }

    /**
     * Gets the value of the accountMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountMask() {
        return accountMask;
    }

    /**
     * Sets the value of the accountMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountMask(String value) {
        this.accountMask = value;
    }

    /**
     * Gets the value of the subscriberMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberMask() {
        return subscriberMask;
    }

    /**
     * Sets the value of the subscriberMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberMask(String value) {
        this.subscriberMask = value;
    }

}
