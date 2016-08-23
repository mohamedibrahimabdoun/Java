
package com.huawei.bme.cbsinterface.subscribe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BindProductSubscriberNoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BindProductSubscriberNoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *         &lt;element name="BindSubNumber" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *                   &lt;element name="SubscriberNoType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="IMSI" type="{http://www.huawei.com/bme/cbsinterface/common}IMSI" minOccurs="0"/>
 *                   &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="ProductID" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId"/>
 *                   &lt;element name="ApplyTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *                   &lt;element name="ExpireTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BindProductSubscriberNoRequest", propOrder = {
    "subscriberNo",
    "bindSubNumber"
})
public class BindProductSubscriberNoRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "BindSubNumber", required = true)
    protected List<BindProductSubscriberNoRequest.BindSubNumber> bindSubNumber;

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
     * Gets the value of the bindSubNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindSubNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindSubNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BindProductSubscriberNoRequest.BindSubNumber }
     * 
     * 
     */
    public List<BindProductSubscriberNoRequest.BindSubNumber> getBindSubNumber() {
        if (bindSubNumber == null) {
            bindSubNumber = new ArrayList<BindProductSubscriberNoRequest.BindSubNumber>();
        }
        return this.bindSubNumber;
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
     *       &lt;all>
     *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
     *         &lt;element name="SubscriberNoType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="IMSI" type="{http://www.huawei.com/bme/cbsinterface/common}IMSI" minOccurs="0"/>
     *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="ProductID" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId"/>
     *         &lt;element name="ApplyTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
     *         &lt;element name="ExpireTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class BindSubNumber {

        @XmlElement(name = "SubscriberNo", required = true)
        protected String subscriberNo;
        @XmlElement(name = "SubscriberNoType")
        protected Integer subscriberNoType;
        @XmlElement(name = "IMSI")
        protected String imsi;
        @XmlElement(name = "OperationType")
        protected int operationType;
        @XmlElement(name = "ProductID")
        protected int productID;
        @XmlElement(name = "ApplyTime")
        protected String applyTime;
        @XmlElement(name = "ExpireTime")
        protected String expireTime;

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
         * Gets the value of the subscriberNoType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSubscriberNoType() {
            return subscriberNoType;
        }

        /**
         * Sets the value of the subscriberNoType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSubscriberNoType(Integer value) {
            this.subscriberNoType = value;
        }

        /**
         * Gets the value of the imsi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIMSI() {
            return imsi;
        }

        /**
         * Sets the value of the imsi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIMSI(String value) {
            this.imsi = value;
        }

        /**
         * Gets the value of the operationType property.
         * 
         */
        public int getOperationType() {
            return operationType;
        }

        /**
         * Sets the value of the operationType property.
         * 
         */
        public void setOperationType(int value) {
            this.operationType = value;
        }

        /**
         * Gets the value of the productID property.
         * 
         */
        public int getProductID() {
            return productID;
        }

        /**
         * Sets the value of the productID property.
         * 
         */
        public void setProductID(int value) {
            this.productID = value;
        }

        /**
         * Gets the value of the applyTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplyTime() {
            return applyTime;
        }

        /**
         * Sets the value of the applyTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplyTime(String value) {
            this.applyTime = value;
        }

        /**
         * Gets the value of the expireTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpireTime() {
            return expireTime;
        }

        /**
         * Sets the value of the expireTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpireTime(String value) {
            this.expireTime = value;
        }

    }

}
