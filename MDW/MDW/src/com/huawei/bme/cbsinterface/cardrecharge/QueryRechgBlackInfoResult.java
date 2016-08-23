
package com.huawei.bme.cbsinterface.cardrecharge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryRechgBlackInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryRechgBlackInfoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="FraudState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FraudTimes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FraudTimesDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryRechgBlackInfoResult", propOrder = {

})
public class QueryRechgBlackInfoResult {

    @XmlElement(name = "FraudState", required = true, type = Integer.class, nillable = true)
    protected Integer fraudState;
    @XmlElement(name = "FraudTimes", required = true, type = Integer.class, nillable = true)
    protected Integer fraudTimes;
    @XmlElement(name = "FraudTimesDay", required = true, type = Integer.class, nillable = true)
    protected Integer fraudTimesDay;

    /**
     * Gets the value of the fraudState property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFraudState() {
        return fraudState;
    }

    /**
     * Sets the value of the fraudState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFraudState(Integer value) {
        this.fraudState = value;
    }

    /**
     * Gets the value of the fraudTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFraudTimes() {
        return fraudTimes;
    }

    /**
     * Sets the value of the fraudTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFraudTimes(Integer value) {
        this.fraudTimes = value;
    }

    /**
     * Gets the value of the fraudTimesDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFraudTimesDay() {
        return fraudTimesDay;
    }

    /**
     * Sets the value of the fraudTimesDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFraudTimesDay(Integer value) {
        this.fraudTimesDay = value;
    }

}
