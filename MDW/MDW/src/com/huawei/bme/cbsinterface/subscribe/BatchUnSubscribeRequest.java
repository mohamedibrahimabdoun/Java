
package com.huawei.bme.cbsinterface.subscribe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchUnSubscribeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchUnSubscribeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptionalOffer" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Id" type="{http://www.huawei.com/bme/cbsinterface/common}OfferId"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ValidMode" type="{http://www.huawei.com/bme/cbsinterface/subscribe}EffectMode" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.huawei.com/bme/cbsinterface/common}FileName"/>
 *         &lt;element name="TaskTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchUnSubscribeRequest", propOrder = {
    "optionalOffer",
    "validMode",
    "fileName",
    "taskTime"
})
public class BatchUnSubscribeRequest {

    @XmlElement(name = "OptionalOffer", required = true)
    protected List<BatchUnSubscribeRequest.OptionalOffer> optionalOffer;
    @XmlElement(name = "ValidMode")
    protected EffectMode validMode;
    @XmlElement(name = "FileName", required = true)
    protected String fileName;
    @XmlElement(name = "TaskTime")
    protected String taskTime;

    /**
     * Gets the value of the optionalOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionalOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchUnSubscribeRequest.OptionalOffer }
     * 
     * 
     */
    public List<BatchUnSubscribeRequest.OptionalOffer> getOptionalOffer() {
        if (optionalOffer == null) {
            optionalOffer = new ArrayList<BatchUnSubscribeRequest.OptionalOffer>();
        }
        return this.optionalOffer;
    }

    /**
     * Gets the value of the validMode property.
     * 
     * @return
     *     possible object is
     *     {@link EffectMode }
     *     
     */
    public EffectMode getValidMode() {
        return validMode;
    }

    /**
     * Sets the value of the validMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectMode }
     *     
     */
    public void setValidMode(EffectMode value) {
        this.validMode = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the taskTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskTime() {
        return taskTime;
    }

    /**
     * Sets the value of the taskTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskTime(String value) {
        this.taskTime = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Id" type="{http://www.huawei.com/bme/cbsinterface/common}OfferId"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id"
    })
    public static class OptionalOffer {

        @XmlElement(name = "Id")
        protected int id;

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

    }

}
