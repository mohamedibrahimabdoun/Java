
package com.huawei.bme.cbsinterface.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryBalanceTransferInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryBalanceTransferInfoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MostTimesPerDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MostSumPerDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MostTimesPerMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MostSumPerMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TranTimesCurDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TransumCurDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TranTimesCurMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TranSumCurMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryBalanceTransferInfoResult", propOrder = {
    "mostTimesPerDay",
    "mostSumPerDay",
    "mostTimesPerMonth",
    "mostSumPerMonth",
    "tranTimesCurDay",
    "transumCurDay",
    "tranTimesCurMonth",
    "tranSumCurMonth"
})
public class QueryBalanceTransferInfoResult {

    @XmlElement(name = "MostTimesPerDay")
    protected int mostTimesPerDay;
    @XmlElement(name = "MostSumPerDay")
    protected int mostSumPerDay;
    @XmlElement(name = "MostTimesPerMonth")
    protected int mostTimesPerMonth;
    @XmlElement(name = "MostSumPerMonth")
    protected int mostSumPerMonth;
    @XmlElement(name = "TranTimesCurDay")
    protected int tranTimesCurDay;
    @XmlElement(name = "TransumCurDay")
    protected int transumCurDay;
    @XmlElement(name = "TranTimesCurMonth")
    protected int tranTimesCurMonth;
    @XmlElement(name = "TranSumCurMonth")
    protected int tranSumCurMonth;

    /**
     * Gets the value of the mostTimesPerDay property.
     * 
     */
    public int getMostTimesPerDay() {
        return mostTimesPerDay;
    }

    /**
     * Sets the value of the mostTimesPerDay property.
     * 
     */
    public void setMostTimesPerDay(int value) {
        this.mostTimesPerDay = value;
    }

    /**
     * Gets the value of the mostSumPerDay property.
     * 
     */
    public int getMostSumPerDay() {
        return mostSumPerDay;
    }

    /**
     * Sets the value of the mostSumPerDay property.
     * 
     */
    public void setMostSumPerDay(int value) {
        this.mostSumPerDay = value;
    }

    /**
     * Gets the value of the mostTimesPerMonth property.
     * 
     */
    public int getMostTimesPerMonth() {
        return mostTimesPerMonth;
    }

    /**
     * Sets the value of the mostTimesPerMonth property.
     * 
     */
    public void setMostTimesPerMonth(int value) {
        this.mostTimesPerMonth = value;
    }

    /**
     * Gets the value of the mostSumPerMonth property.
     * 
     */
    public int getMostSumPerMonth() {
        return mostSumPerMonth;
    }

    /**
     * Sets the value of the mostSumPerMonth property.
     * 
     */
    public void setMostSumPerMonth(int value) {
        this.mostSumPerMonth = value;
    }

    /**
     * Gets the value of the tranTimesCurDay property.
     * 
     */
    public int getTranTimesCurDay() {
        return tranTimesCurDay;
    }

    /**
     * Sets the value of the tranTimesCurDay property.
     * 
     */
    public void setTranTimesCurDay(int value) {
        this.tranTimesCurDay = value;
    }

    /**
     * Gets the value of the transumCurDay property.
     * 
     */
    public int getTransumCurDay() {
        return transumCurDay;
    }

    /**
     * Sets the value of the transumCurDay property.
     * 
     */
    public void setTransumCurDay(int value) {
        this.transumCurDay = value;
    }

    /**
     * Gets the value of the tranTimesCurMonth property.
     * 
     */
    public int getTranTimesCurMonth() {
        return tranTimesCurMonth;
    }

    /**
     * Sets the value of the tranTimesCurMonth property.
     * 
     */
    public void setTranTimesCurMonth(int value) {
        this.tranTimesCurMonth = value;
    }

    /**
     * Gets the value of the tranSumCurMonth property.
     * 
     */
    public int getTranSumCurMonth() {
        return tranSumCurMonth;
    }

    /**
     * Sets the value of the tranSumCurMonth property.
     * 
     */
    public void setTranSumCurMonth(int value) {
        this.tranSumCurMonth = value;
    }

}
