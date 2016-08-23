
package com.huawei.bme.cbsinterface.subscribe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallScreen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallScreen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallScreenType" type="{http://www.huawei.com/bme/cbsinterface/common}CallScreenType" minOccurs="0"/>
 *         &lt;element name="CallScreenNoInfoList" type="{http://www.huawei.com/bme/cbsinterface/subscribe}CallScreenNoInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallScreen", propOrder = {
    "callScreenType",
    "callScreenNoInfoList"
})
public class CallScreen {

    @XmlElement(name = "CallScreenType")
    protected Integer callScreenType;
    @XmlElement(name = "CallScreenNoInfoList")
    protected List<CallScreenNoInfo> callScreenNoInfoList;

    /**
     * Gets the value of the callScreenType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCallScreenType() {
        return callScreenType;
    }

    /**
     * Sets the value of the callScreenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCallScreenType(Integer value) {
        this.callScreenType = value;
    }

    /**
     * Gets the value of the callScreenNoInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callScreenNoInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallScreenNoInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallScreenNoInfo }
     * 
     * 
     */
    public List<CallScreenNoInfo> getCallScreenNoInfoList() {
        if (callScreenNoInfoList == null) {
            callScreenNoInfoList = new ArrayList<CallScreenNoInfo>();
        }
        return this.callScreenNoInfoList;
    }

}
