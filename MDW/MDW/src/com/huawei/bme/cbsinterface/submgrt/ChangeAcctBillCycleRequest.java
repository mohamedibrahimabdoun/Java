
package com.huawei.bme.cbsinterface.submgrt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.SimpleProperty;


/**
 * <p>Java class for ChangeAcctBillCycleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeAcctBillCycleRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *           &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode"/>
 *         &lt;/choice>
 *         &lt;element name="NewBillCycleType" type="{http://www.huawei.com/bme/cbsinterface/common}BillCycleType"/>
 *         &lt;element name="ValidMode" type="{http://www.huawei.com/bme/cbsinterface/submgrt}ValidMode" minOccurs="0"/>
 *         &lt;element name="Parameters" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeAcctBillCycleRequest", propOrder = {
    "subscriberNo",
    "accountCode",
    "newBillCycleType",
    "validMode",
    "parameters"
})
public class ChangeAcctBillCycleRequest {

    @XmlElement(name = "SubscriberNo")
    protected String subscriberNo;
    @XmlElement(name = "AccountCode")
    protected String accountCode;
    @XmlElement(name = "NewBillCycleType")
    protected int newBillCycleType;
    @XmlElement(name = "ValidMode")
    protected String validMode;
    @XmlElement(name = "Parameters")
    protected List<SimpleProperty> parameters;

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
     * Gets the value of the newBillCycleType property.
     * 
     */
    public int getNewBillCycleType() {
        return newBillCycleType;
    }

    /**
     * Sets the value of the newBillCycleType property.
     * 
     */
    public void setNewBillCycleType(int value) {
        this.newBillCycleType = value;
    }

    /**
     * Gets the value of the validMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidMode() {
        return validMode;
    }

    /**
     * Sets the value of the validMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidMode(String value) {
        this.validMode = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleProperty }
     * 
     * 
     */
    public List<SimpleProperty> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<SimpleProperty>();
        }
        return this.parameters;
    }

}
