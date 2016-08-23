
package com.huawei.bme.cbsinterface.subscribe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallScreenNoInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallScreenNoInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callScreenNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="effectiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="expireDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="weekStart" type="{http://www.huawei.com/bme/cbsinterface/common}Week" minOccurs="0"/>
 *         &lt;element name="weekStop" type="{http://www.huawei.com/bme/cbsinterface/common}Week" minOccurs="0"/>
 *         &lt;element name="routeNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IRRouteFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RoutingMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ListType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallScreenNoInfo", propOrder = {
    "callScreenNo",
    "effectiveDate",
    "expireDate",
    "weekStart",
    "weekStop",
    "routeNumber",
    "irRouteFlag",
    "routingMethod",
    "listType"
})
public class CallScreenNoInfo {

    @XmlElement(required = true)
    protected String callScreenNo;
    protected String effectiveDate;
    protected String expireDate;
    protected String weekStart;
    protected String weekStop;
    protected String routeNumber;
    @XmlElementRef(name = "IRRouteFlag", namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", type = JAXBElement.class)
    protected JAXBElement<Integer> irRouteFlag;
    @XmlElementRef(name = "RoutingMethod", namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", type = JAXBElement.class)
    protected JAXBElement<Integer> routingMethod;
    @XmlElementRef(name = "ListType", namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", type = JAXBElement.class)
    protected JAXBElement<Integer> listType;

    /**
     * Gets the value of the callScreenNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallScreenNo() {
        return callScreenNo;
    }

    /**
     * Sets the value of the callScreenNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallScreenNo(String value) {
        this.callScreenNo = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the weekStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekStart() {
        return weekStart;
    }

    /**
     * Sets the value of the weekStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekStart(String value) {
        this.weekStart = value;
    }

    /**
     * Gets the value of the weekStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekStop() {
        return weekStop;
    }

    /**
     * Sets the value of the weekStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekStop(String value) {
        this.weekStop = value;
    }

    /**
     * Gets the value of the routeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteNumber() {
        return routeNumber;
    }

    /**
     * Sets the value of the routeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteNumber(String value) {
        this.routeNumber = value;
    }

    /**
     * Gets the value of the irRouteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIRRouteFlag() {
        return irRouteFlag;
    }

    /**
     * Sets the value of the irRouteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIRRouteFlag(JAXBElement<Integer> value) {
        this.irRouteFlag = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the routingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRoutingMethod() {
        return routingMethod;
    }

    /**
     * Sets the value of the routingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRoutingMethod(JAXBElement<Integer> value) {
        this.routingMethod = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the listType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getListType() {
        return listType;
    }

    /**
     * Sets the value of the listType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setListType(JAXBElement<Integer> value) {
        this.listType = ((JAXBElement<Integer> ) value);
    }

}
