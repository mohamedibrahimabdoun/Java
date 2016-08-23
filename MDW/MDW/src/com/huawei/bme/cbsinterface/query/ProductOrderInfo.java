
package com.huawei.bme.cbsinterface.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.SimpleProperty;


/**
 * <p>Java class for ProductOrderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductOrderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId"/>
 *         &lt;element name="ProductOrderKey" type="{http://www.huawei.com/bme/cbsinterface/common}ProductOrderKey"/>
 *         &lt;element name="OfferId" type="{http://www.huawei.com/bme/cbsinterface/common}OfferId"/>
 *         &lt;element name="OfferOrderKey" type="{http://www.huawei.com/bme/cbsinterface/common}OfferOrderKey"/>
 *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *         &lt;element name="ExpireTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *         &lt;element name="Status">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CurCycleStartTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="CurCycleEndTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="BillStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOrderInfo", propOrder = {
    "id",
    "productOrderKey",
    "offerId",
    "offerOrderKey",
    "effectiveTime",
    "expireTime",
    "status",
    "simpleProperty",
    "curCycleStartTime",
    "curCycleEndTime",
    "billStatus"
})
public class ProductOrderInfo {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "ProductOrderKey")
    protected long productOrderKey;
    @XmlElement(name = "OfferId")
    protected int offerId;
    @XmlElement(name = "OfferOrderKey")
    protected long offerOrderKey;
    @XmlElement(name = "EffectiveTime", required = true)
    protected String effectiveTime;
    @XmlElement(name = "ExpireTime", required = true)
    protected String expireTime;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "SimpleProperty")
    protected List<SimpleProperty> simpleProperty;
    @XmlElement(name = "CurCycleStartTime")
    protected String curCycleStartTime;
    @XmlElement(name = "CurCycleEndTime")
    protected String curCycleEndTime;
    @XmlElement(name = "BillStatus")
    protected Integer billStatus;

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
     * Gets the value of the productOrderKey property.
     * 
     */
    public long getProductOrderKey() {
        return productOrderKey;
    }

    /**
     * Sets the value of the productOrderKey property.
     * 
     */
    public void setProductOrderKey(long value) {
        this.productOrderKey = value;
    }

    /**
     * Gets the value of the offerId property.
     * 
     */
    public int getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     */
    public void setOfferId(int value) {
        this.offerId = value;
    }

    /**
     * Gets the value of the offerOrderKey property.
     * 
     */
    public long getOfferOrderKey() {
        return offerOrderKey;
    }

    /**
     * Sets the value of the offerOrderKey property.
     * 
     */
    public void setOfferOrderKey(long value) {
        this.offerOrderKey = value;
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveTime(String value) {
        this.effectiveTime = value;
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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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

    /**
     * Gets the value of the curCycleStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurCycleStartTime() {
        return curCycleStartTime;
    }

    /**
     * Sets the value of the curCycleStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurCycleStartTime(String value) {
        this.curCycleStartTime = value;
    }

    /**
     * Gets the value of the curCycleEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurCycleEndTime() {
        return curCycleEndTime;
    }

    /**
     * Sets the value of the curCycleEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurCycleEndTime(String value) {
        this.curCycleEndTime = value;
    }

    /**
     * Gets the value of the billStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillStatus() {
        return billStatus;
    }

    /**
     * Sets the value of the billStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillStatus(Integer value) {
        this.billStatus = value;
    }

}
