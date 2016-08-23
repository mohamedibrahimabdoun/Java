
package com.huawei.bme.cbsinterface.subscribe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.SimpleProperty;


/**
 * <p>Java class for OfferOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.huawei.com/bme/cbsinterface/common}OfferId"/>
 *         &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferOrder", propOrder = {
    "id",
    "simpleProperty"
})
@XmlSeeAlso({
    com.huawei.bme.cbsinterface.newsubscriber.BatchNewSubscriberRequest.PrimaryOffer.class,
    com.huawei.bme.cbsinterface.newsubscriber.BatchNewSubscriberRequest.OptionalOffer.class,
    com.huawei.bme.cbsinterface.newsubscriber.NewSubscriberRequest.PrimaryOffer.class,
    com.huawei.bme.cbsinterface.newsubscriber.NewSubscriberExtRequest.PrimaryOffer.class,
    com.huawei.bme.cbsinterface.newsubscriber.NewSubscriberExtRequest.OptionalOffer.class,
    com.huawei.bme.cbsinterface.subscribe.ChangeOptionalOfferExtRequest.OptionalOffer.class,
    com.huawei.bme.cbsinterface.subscribe.ChangeAccountOfferRequest.Offering.class,
    com.huawei.bme.cbsinterface.subscribe.BatchSubscribeRequest.OptionalOffer.class
})
public class OfferOrder {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "SimpleProperty")
    protected List<SimpleProperty> simpleProperty;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the simpleProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleProperty }
     * 
     * 
     */
    public List<SimpleProperty> getSimpleProperty() {
        if (simpleProperty == null) {
            simpleProperty = new ArrayList<SimpleProperty>();
        }
        return this.simpleProperty;
    }

}
