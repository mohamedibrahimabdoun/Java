
package com.huawei.bme.cbsinterface.submgrt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeMSISDNRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeMSISDNRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *         &lt;element name="NewSubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *         &lt;element name="SCPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CBPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AIP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HandleChargeFlag" type="{http://www.huawei.com/bme/cbsinterface/common}HandleChargeFlag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeMSISDNRequest", propOrder = {
    "subscriberNo",
    "newSubscriberNo",
    "scpid",
    "cbpid",
    "aip",
    "handleChargeFlag"
})
public class ChangeMSISDNRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "NewSubscriberNo", required = true)
    protected String newSubscriberNo;
    @XmlElement(name = "SCPID")
    protected Integer scpid;
    @XmlElement(name = "CBPID")
    protected Integer cbpid;
    @XmlElement(name = "AIP")
    protected Integer aip;
    @XmlElement(name = "HandleChargeFlag")
    protected Integer handleChargeFlag;

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
     * Gets the value of the newSubscriberNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSubscriberNo() {
        return newSubscriberNo;
    }

    /**
     * Sets the value of the newSubscriberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSubscriberNo(String value) {
        this.newSubscriberNo = value;
    }

    /**
     * Gets the value of the scpid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSCPID() {
        return scpid;
    }

    /**
     * Sets the value of the scpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSCPID(Integer value) {
        this.scpid = value;
    }

    /**
     * Gets the value of the cbpid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCBPID() {
        return cbpid;
    }

    /**
     * Sets the value of the cbpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCBPID(Integer value) {
        this.cbpid = value;
    }

    /**
     * Gets the value of the aip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAIP() {
        return aip;
    }

    /**
     * Sets the value of the aip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAIP(Integer value) {
        this.aip = value;
    }

    /**
     * Gets the value of the handleChargeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandleChargeFlag() {
        return handleChargeFlag;
    }

    /**
     * Sets the value of the handleChargeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandleChargeFlag(Integer value) {
        this.handleChargeFlag = value;
    }

}
