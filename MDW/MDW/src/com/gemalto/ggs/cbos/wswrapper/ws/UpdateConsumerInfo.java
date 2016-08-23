
package com.gemalto.ggs.cbos.wswrapper.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateConsumerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateConsumerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consumerInformation" type="{http://ws.wswrapper.cbos.ggs.gemalto.com/}consumerInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateConsumerInfo", propOrder = {
    "consumerInformation"
})
public class UpdateConsumerInfo {

    protected ConsumerInformation consumerInformation;

    /**
     * Gets the value of the consumerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerInformation }
     *     
     */
    public ConsumerInformation getConsumerInformation() {
        return consumerInformation;
    }

    /**
     * Sets the value of the consumerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerInformation }
     *     
     */
    public void setConsumerInformation(ConsumerInformation value) {
        this.consumerInformation = value;
    }

}
