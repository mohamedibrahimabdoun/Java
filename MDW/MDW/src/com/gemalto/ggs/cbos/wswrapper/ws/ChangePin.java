
package com.gemalto.ggs.cbos.wswrapper.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changePin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changePin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isConsumer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changePin", propOrder = {
    "sourceIdentifier",
    "newPin",
    "oldPIN",
    "isConsumer"
})
public class ChangePin {

    protected String sourceIdentifier;
    protected String newPin;
    protected String oldPIN;
    protected Boolean isConsumer;

    /**
     * Gets the value of the sourceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * Sets the value of the sourceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIdentifier(String value) {
        this.sourceIdentifier = value;
    }

    /**
     * Gets the value of the newPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPin() {
        return newPin;
    }

    /**
     * Sets the value of the newPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPin(String value) {
        this.newPin = value;
    }

    /**
     * Gets the value of the oldPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPIN() {
        return oldPIN;
    }

    /**
     * Sets the value of the oldPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPIN(String value) {
        this.oldPIN = value;
    }

    /**
     * Gets the value of the isConsumer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConsumer() {
        return isConsumer;
    }

    /**
     * Sets the value of the isConsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConsumer(Boolean value) {
        this.isConsumer = value;
    }

}
