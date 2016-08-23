
package com.gemalto.ggs.cbos.wswrapper.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for startCashOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="startCashOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceIdetifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cashOutAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cashoutAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "startCashOut", propOrder = {
    "sourceIdetifier",
    "amount",
    "pin",
    "cashOutAt",
    "cashoutAll"
})
public class StartCashOut {

    protected String sourceIdetifier;
    protected String amount;
    protected String pin;
    protected String cashOutAt;
    protected Boolean cashoutAll;

    /**
     * Gets the value of the sourceIdetifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIdetifier() {
        return sourceIdetifier;
    }

    /**
     * Sets the value of the sourceIdetifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIdetifier(String value) {
        this.sourceIdetifier = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the cashOutAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashOutAt() {
        return cashOutAt;
    }

    /**
     * Sets the value of the cashOutAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashOutAt(String value) {
        this.cashOutAt = value;
    }

    /**
     * Gets the value of the cashoutAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCashoutAll() {
        return cashoutAll;
    }

    /**
     * Sets the value of the cashoutAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCashoutAll(Boolean value) {
        this.cashoutAll = value;
    }

}
