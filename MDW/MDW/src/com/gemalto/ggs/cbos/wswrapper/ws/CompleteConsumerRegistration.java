
package com.gemalto.ggs.cbos.wswrapper.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for completeConsumerRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="completeConsumerRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consumerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="managerMSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceProviderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kycType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kycValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "completeConsumerRegistration", propOrder = {
    "consumerIdentifier",
    "managerMSISDN",
    "pin",
    "serviceProviderId",
    "tan",
    "kycType",
    "kycValue",
    "flowId"
})
public class CompleteConsumerRegistration {

    protected String consumerIdentifier;
    protected String managerMSISDN;
    protected String pin;
    protected String serviceProviderId;
    protected String tan;
    protected String kycType;
    protected String kycValue;
    protected String flowId;

    /**
     * Gets the value of the consumerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerIdentifier() {
        return consumerIdentifier;
    }

    /**
     * Sets the value of the consumerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerIdentifier(String value) {
        this.consumerIdentifier = value;
    }

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
     * Gets the value of the serviceProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderId() {
        return serviceProviderId;
    }

    /**
     * Sets the value of the serviceProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderId(String value) {
        this.serviceProviderId = value;
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

    /**
     * Gets the value of the kycType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKycType() {
        return kycType;
    }

    /**
     * Sets the value of the kycType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKycType(String value) {
        this.kycType = value;
    }

    /**
     * Gets the value of the kycValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKycValue() {
        return kycValue;
    }

    /**
     * Sets the value of the kycValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKycValue(String value) {
        this.kycValue = value;
    }

    /**
     * Gets the value of the flowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * Sets the value of the flowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowId(String value) {
        this.flowId = value;
    }

}
