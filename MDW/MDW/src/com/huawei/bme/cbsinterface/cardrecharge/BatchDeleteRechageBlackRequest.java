
package com.huawei.bme.cbsinterface.cardrecharge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchDeleteRechageBlackRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchDeleteRechageBlackRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileName" type="{http://www.huawei.com/bme/cbsinterface/common}FileName"/>
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "BatchDeleteRechageBlackRequest", propOrder = {
    "fileName",
    "operationType",
    "taskTime"
})
public class BatchDeleteRechageBlackRequest {

    @XmlElement(name = "FileName", required = true)
    protected String fileName;
    @XmlElement(name = "OperationType")
    protected Integer operationType;
    @XmlElement(name = "TaskTime")
    protected String taskTime;

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
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperationType(Integer value) {
        this.operationType = value;
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

}
