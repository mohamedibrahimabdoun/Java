
package com.gemalto.ggs.cbos.wswrapper.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for completeCashOutAtMerchant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="completeCashOutAtMerchant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="managerMSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "completeCashOutAtMerchant", propOrder = {
    "managerMSISDN",
    "pin",
    "transactionId",
    "tan"
})
public class CompleteCashOutAtMerchant {

    protected String managerMSISDN;
    protected String pin;
    protected String transactionId;
    protected String tan;

    /**
     * Gets the value of the managerMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerMSISDN() {
        return managerMSISDN;
    }

    /**
     * Sets the value of the managerMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerMSISDN(String value) {
        this.managerMSISDN = value;
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
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the tan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTan() {
        return tan;
    }

    /**
     * Sets the value of the tan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTan(String value) {
        this.tan = value;
    }

}
