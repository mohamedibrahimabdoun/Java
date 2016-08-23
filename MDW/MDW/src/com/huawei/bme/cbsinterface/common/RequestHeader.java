
package com.huawei.bme.cbsinterface.common;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * for user information use(add,modify,delete)
 * 
 * <p>Java class for RequestHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommandId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Version">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TransactionId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SequenceId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RequestType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *               &lt;enumeration value="Event"/>
 *               &lt;enumeration value="Start"/>
 *               &lt;enumeration value="Continue"/>
 *               &lt;enumeration value="Stop"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TenantId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessionEntity" type="{http://www.huawei.com/bme/cbsinterface/common}SessionEntityType" minOccurs="0"/>
 *         &lt;element name="InterFrom" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InterMode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InterMedi" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="23"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="visitArea" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="23"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="currentCell" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="23"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="additionInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="23"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ThirdPartyID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Reserve2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reserve3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="23"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OperatorID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TradePartnerID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="23"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PartnerOperID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="23"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BelToAreaID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SerialNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="23"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Remark" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "RequestHeader", propOrder = {
    "commandId",
    "version",
    "transactionId",
    "sequenceId",
    "requestType",
    "tenantId",
    "language",
    "sessionEntity",
    "interFrom",
    "interMode",
    "interMedi",
    "visitArea",
    "currentCell",
    "additionInfo",
    "thirdPartyID",
    "reserve2",
    "reserve3",
    "partnerID",
    "operatorID",
    "tradePartnerID",
    "partnerOperID",
    "belToAreaID",
    "serialNo",
    "remark"
})
public class RequestHeader {

    @XmlElement(name = "CommandId", required = true)
    protected String commandId;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "TransactionId", required = true)
    protected String transactionId;
    @XmlElement(name = "SequenceId", required = true)
    protected String sequenceId;
    @XmlElement(name = "RequestType", required = true)
    protected String requestType;
    @XmlElement(name = "TenantId")
    protected BigInteger tenantId;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "SessionEntity")
    protected SessionEntityType sessionEntity;
    @XmlElement(name = "InterFrom")
    protected String interFrom;
    @XmlElement(name = "InterMode")
    protected String interMode;
    @XmlElement(name = "InterMedi")
    protected String interMedi;
    protected String visitArea;
    protected String currentCell;
    protected String additionInfo;
    @XmlElement(name = "ThirdPartyID")
    protected String thirdPartyID;
    @XmlElement(name = "Reserve2")
    protected String reserve2;
    @XmlElement(name = "Reserve3")
    protected String reserve3;
    @XmlElement(name = "PartnerID")
    protected String partnerID;
    @XmlElement(name = "OperatorID")
    protected String operatorID;
    @XmlElement(name = "TradePartnerID")
    protected String tradePartnerID;
    @XmlElement(name = "PartnerOperID")
    protected String partnerOperID;
    @XmlElement(name = "BelToAreaID")
    protected String belToAreaID;
    @XmlElement(name = "SerialNo", required = true)
    protected String serialNo;
    @XmlElement(name = "Remark")
    protected String remark;

    /**
     * Gets the value of the commandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandId() {
        return commandId;
    }

    /**
     * Sets the value of the commandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandId(String value) {
        this.commandId = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the sequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceId(String value) {
        this.sequenceId = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the tenantId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTenantId() {
        return tenantId;
    }

    /**
     * Sets the value of the tenantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTenantId(BigInteger value) {
        this.tenantId = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the sessionEntity property.
     * 
     * @return
     *     possible object is
     *     {@link SessionEntityType }
     *     
     */
    public SessionEntityType getSessionEntity() {
        return sessionEntity;
    }

    /**
     * Sets the value of the sessionEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionEntityType }
     *     
     */
    public void setSessionEntity(SessionEntityType value) {
        this.sessionEntity = value;
    }

    /**
     * Gets the value of the interFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterFrom() {
        return interFrom;
    }

    /**
     * Sets the value of the interFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterFrom(String value) {
        this.interFrom = value;
    }

    /**
     * Gets the value of the interMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterMode() {
        return interMode;
    }

    /**
     * Sets the value of the interMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterMode(String value) {
        this.interMode = value;
    }

    /**
     * Gets the value of the interMedi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterMedi() {
        return interMedi;
    }

    /**
     * Sets the value of the interMedi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterMedi(String value) {
        this.interMedi = value;
    }

    /**
     * Gets the value of the visitArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitArea() {
        return visitArea;
    }

    /**
     * Sets the value of the visitArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitArea(String value) {
        this.visitArea = value;
    }

    /**
     * Gets the value of the currentCell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentCell() {
        return currentCell;
    }

    /**
     * Sets the value of the currentCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentCell(String value) {
        this.currentCell = value;
    }

    /**
     * Gets the value of the additionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionInfo() {
        return additionInfo;
    }

    /**
     * Sets the value of the additionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionInfo(String value) {
        this.additionInfo = value;
    }

    /**
     * Gets the value of the thirdPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyID() {
        return thirdPartyID;
    }

    /**
     * Sets the value of the thirdPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyID(String value) {
        this.thirdPartyID = value;
    }

    /**
     * Gets the value of the reserve2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * Sets the value of the reserve2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserve2(String value) {
        this.reserve2 = value;
    }

    /**
     * Gets the value of the reserve3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * Sets the value of the reserve3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserve3(String value) {
        this.reserve3 = value;
    }

    /**
     * Gets the value of the partnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerID() {
        return partnerID;
    }

    /**
     * Sets the value of the partnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerID(String value) {
        this.partnerID = value;
    }

    /**
     * Gets the value of the operatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorID() {
        return operatorID;
    }

    /**
     * Sets the value of the operatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorID(String value) {
        this.operatorID = value;
    }

    /**
     * Gets the value of the tradePartnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradePartnerID() {
        return tradePartnerID;
    }

    /**
     * Sets the value of the tradePartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradePartnerID(String value) {
        this.tradePartnerID = value;
    }

    /**
     * Gets the value of the partnerOperID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerOperID() {
        return partnerOperID;
    }

    /**
     * Sets the value of the partnerOperID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerOperID(String value) {
        this.partnerOperID = value;
    }

    /**
     * Gets the value of the belToAreaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelToAreaID() {
        return belToAreaID;
    }

    /**
     * Sets the value of the belToAreaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelToAreaID(String value) {
        this.belToAreaID = value;
    }

    /**
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
