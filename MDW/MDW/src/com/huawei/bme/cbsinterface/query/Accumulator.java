
package com.huawei.bme.cbsinterface.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Accumulator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accumulator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CumulateID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CumulateBeginTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *         &lt;element name="CumulateEndTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *         &lt;element name="CumulativeAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Accumulator", propOrder = {
    "cumulateID",
    "cumulateBeginTime",
    "cumulateEndTime",
    "cumulativeAmt"
})
public class Accumulator {

    @XmlElement(name = "CumulateID")
    protected int cumulateID;
    @XmlElement(name = "CumulateBeginTime", required = true)
    protected String cumulateBeginTime;
    @XmlElement(name = "CumulateEndTime", required = true)
    protected String cumulateEndTime;
    @XmlElement(name = "CumulativeAmt")
    protected long cumulativeAmt;

    /**
     * Gets the value of the cumulateID property.
     * 
     */
    public int getCumulateID() {
        return cumulateID;
    }

    /**
     * Sets the value of the cumulateID property.
     * 
     */
    public void setCumulateID(int value) {
        this.cumulateID = value;
    }

    /**
     * Gets the value of the cumulateBeginTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCumulateBeginTime() {
        return cumulateBeginTime;
    }

    /**
     * Sets the value of the cumulateBeginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCumulateBeginTime(String value) {
        this.cumulateBeginTime = value;
    }

    /**
     * Gets the value of the cumulateEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCumulateEndTime() {
        return cumulateEndTime;
    }

    /**
     * Sets the value of the cumulateEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCumulateEndTime(String value) {
        this.cumulateEndTime = value;
    }

    /**
     * Gets the value of the cumulativeAmt property.
     * 
     */
    public long getCumulativeAmt() {
        return cumulativeAmt;
    }

    /**
     * Sets the value of the cumulativeAmt property.
     * 
     */
    public void setCumulativeAmt(long value) {
        this.cumulativeAmt = value;
    }

}
