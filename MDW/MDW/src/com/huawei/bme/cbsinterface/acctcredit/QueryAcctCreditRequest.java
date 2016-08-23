
package com.huawei.bme.cbsinterface.acctcredit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAcctCreditRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAcctCreditRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID" minOccurs="0"/>
 *         &lt;element name="AcctCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
 *         &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
 *         &lt;element name="Msisdn" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAcctCreditRequest", propOrder = {
    "acctId",
    "acctCode",
    "subId",
    "msisdn"
})
public class QueryAcctCreditRequest {

    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctCode")
    protected String acctCode;
    @XmlElement(name = "SubId")
    protected String subId;
    @XmlElement(name = "Msisdn")
    protected String msisdn;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Sets the value of the acctCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCode(String value) {
        this.acctCode = value;
    }

    /**
     * Gets the value of the subId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubId() {
        return subId;
    }

    /**
     * Sets the value of the subId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubId(String value) {
        this.subId = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

}
