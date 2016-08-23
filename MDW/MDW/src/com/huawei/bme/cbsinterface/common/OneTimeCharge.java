
package com.huawei.bme.cbsinterface.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ?????CBS?????
 * 
 * <p>Java class for OneTimeCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OneTimeCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ToCredit" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OneTimeFee" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OperationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="SubTradeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="MainProductKey" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId" minOccurs="0"/>
 *                             &lt;element name="AccessMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="ProductKey" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId" minOccurs="0"/>
 *                             &lt;element name="ChargeAmount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                             &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
 *                             &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ToBilling" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubFeeList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SubFeeValue" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID"/>
 *                                       &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
 *                                       &lt;element name="ItemList">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ItemValue" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ItemId">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="32"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Amount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BusiType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Bsno" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Remark" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="128"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TradeTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ToAR" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fee2arRequestValue" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID"/>
 *                             &lt;element name="AcctCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
 *                             &lt;element name="CustId" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerID"/>
 *                             &lt;element name="CustCode" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerCode" minOccurs="0"/>
 *                             &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
 *                             &lt;element name="Msisdn" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
 *                             &lt;element name="TeleType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="InvoiceDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *                             &lt;element name="DueDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *                             &lt;element name="BusiType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Bsno">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="isCustomer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ChannelId" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="32"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Remark" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="128"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Fee2arRequestDetailList">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Fee2arRequestDetailValue" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="orderQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                                 &lt;element name="backQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                                 &lt;element name="salesQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                                 &lt;element name="unitPrice" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *                                                 &lt;element name="charge" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *                                                 &lt;element name="discountAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *                                                 &lt;element name="transDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *                                                 &lt;element name="salesDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *                                                 &lt;element name="feeItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="billCycleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="taxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="glacode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="waiveGlCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="rebateGlcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="rebateAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                                                 &lt;element name="resTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="resModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="resId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="resCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="resAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                                                 &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="spCpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="prmFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="serviceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="feeSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
@XmlType(name = "OneTimeCharge", propOrder = {
    "toCredit",
    "toBilling",
    "toAR"
})
public class OneTimeCharge {

    @XmlElement(name = "ToCredit")
    protected OneTimeCharge.ToCredit toCredit;
    @XmlElement(name = "ToBilling")
    protected OneTimeCharge.ToBilling toBilling;
    @XmlElement(name = "ToAR")
    protected OneTimeCharge.ToAR toAR;

    /**
     * Gets the value of the toCredit property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeCharge.ToCredit }
     *     
     */
    public OneTimeCharge.ToCredit getToCredit() {
        return toCredit;
    }

    /**
     * Sets the value of the toCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeCharge.ToCredit }
     *     
     */
    public void setToCredit(OneTimeCharge.ToCredit value) {
        this.toCredit = value;
    }

    /**
     * Gets the value of the toBilling property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeCharge.ToBilling }
     *     
     */
    public OneTimeCharge.ToBilling getToBilling() {
        return toBilling;
    }

    /**
     * Sets the value of the toBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeCharge.ToBilling }
     *     
     */
    public void setToBilling(OneTimeCharge.ToBilling value) {
        this.toBilling = value;
    }

    /**
     * Gets the value of the toAR property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeCharge.ToAR }
     *     
     */
    public OneTimeCharge.ToAR getToAR() {
        return toAR;
    }

    /**
     * Sets the value of the toAR property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeCharge.ToAR }
     *     
     */
    public void setToAR(OneTimeCharge.ToAR value) {
        this.toAR = value;
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
     *       &lt;sequence>
     *         &lt;element name="Fee2arRequestValue" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID"/>
     *                   &lt;element name="AcctCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
     *                   &lt;element name="CustId" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerID"/>
     *                   &lt;element name="CustCode" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerCode" minOccurs="0"/>
     *                   &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
     *                   &lt;element name="Msisdn" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
     *                   &lt;element name="TeleType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="InvoiceDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
     *                   &lt;element name="DueDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
     *                   &lt;element name="BusiType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Bsno">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="isCustomer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ChannelId" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="32"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Remark" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="128"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Fee2arRequestDetailList">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Fee2arRequestDetailValue" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="orderQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                                       &lt;element name="backQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                                       &lt;element name="salesQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                                       &lt;element name="unitPrice" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
     *                                       &lt;element name="charge" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
     *                                       &lt;element name="discountAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
     *                                       &lt;element name="transDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
     *                                       &lt;element name="salesDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
     *                                       &lt;element name="feeItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="billCycleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="taxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="glacode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="waiveGlCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="rebateGlcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="rebateAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                                       &lt;element name="resTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="resModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="resId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="resCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="resAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                                       &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="spCpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="prmFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="serviceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="feeSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "fee2ArRequestValue"
    })
    public static class ToAR {

        @XmlElement(name = "Fee2arRequestValue", required = true)
        protected List<OneTimeCharge.ToAR.Fee2ArRequestValue> fee2ArRequestValue;

        /**
         * Gets the value of the fee2ArRequestValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fee2ArRequestValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFee2ArRequestValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OneTimeCharge.ToAR.Fee2ArRequestValue }
         * 
         * 
         */
        public List<OneTimeCharge.ToAR.Fee2ArRequestValue> getFee2ArRequestValue() {
            if (fee2ArRequestValue == null) {
                fee2ArRequestValue = new ArrayList<OneTimeCharge.ToAR.Fee2ArRequestValue>();
            }
            return this.fee2ArRequestValue;
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
         *       &lt;sequence>
         *         &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID"/>
         *         &lt;element name="AcctCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
         *         &lt;element name="CustId" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerID"/>
         *         &lt;element name="CustCode" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerCode" minOccurs="0"/>
         *         &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
         *         &lt;element name="Msisdn" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
         *         &lt;element name="TeleType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="InvoiceDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
         *         &lt;element name="DueDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
         *         &lt;element name="BusiType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Bsno">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="isCustomer" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ChannelId" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="32"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Remark" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="128"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Fee2arRequestDetailList">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Fee2arRequestDetailValue" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="orderQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                             &lt;element name="backQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                             &lt;element name="salesQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                             &lt;element name="unitPrice" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
         *                             &lt;element name="charge" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
         *                             &lt;element name="discountAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
         *                             &lt;element name="transDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
         *                             &lt;element name="salesDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
         *                             &lt;element name="feeItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="billCycleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="taxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="glacode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="waiveGlCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="rebateGlcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="rebateAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
         *                             &lt;element name="resTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="resModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="resId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="resCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="resAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
         *                             &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="spCpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="prmFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="serviceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="feeSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
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
        @XmlType(name = "", propOrder = {
            "acctId",
            "acctCode",
            "custId",
            "custCode",
            "subId",
            "msisdn",
            "teleType",
            "invoiceDate",
            "dueDate",
            "busiType",
            "bsno",
            "isCustomer",
            "channelId",
            "remark",
            "fee2ArRequestDetailList"
        })
        public static class Fee2ArRequestValue {

            @XmlElement(name = "AcctId", required = true)
            protected String acctId;
            @XmlElement(name = "AcctCode")
            protected String acctCode;
            @XmlElement(name = "CustId", required = true)
            protected String custId;
            @XmlElement(name = "CustCode")
            protected String custCode;
            @XmlElement(name = "SubId")
            protected String subId;
            @XmlElement(name = "Msisdn")
            protected String msisdn;
            @XmlElement(name = "TeleType")
            protected String teleType;
            @XmlElement(name = "InvoiceDate", required = true)
            protected String invoiceDate;
            @XmlElement(name = "DueDate", required = true)
            protected String dueDate;
            @XmlElement(name = "BusiType", required = true)
            protected String busiType;
            @XmlElement(name = "Bsno", required = true)
            protected String bsno;
            @XmlElement(required = true)
            protected String isCustomer;
            @XmlElement(name = "ChannelId")
            protected String channelId;
            @XmlElement(name = "Remark")
            protected String remark;
            @XmlElement(name = "Fee2arRequestDetailList", required = true)
            protected OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList fee2ArRequestDetailList;

            /**
             * Gets the value of the acctId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcctId() {
                return acctId;
            }

            /**
             * Sets the value of the acctId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcctId(String value) {
                this.acctId = value;
            }

            /**
             * Gets the value of the acctCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcctCode() {
                return acctCode;
            }

            /**
             * Sets the value of the acctCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcctCode(String value) {
                this.acctCode = value;
            }

            /**
             * Gets the value of the custId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustId() {
                return custId;
            }

            /**
             * Sets the value of the custId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustId(String value) {
                this.custId = value;
            }

            /**
             * Gets the value of the custCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustCode() {
                return custCode;
            }

            /**
             * Sets the value of the custCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustCode(String value) {
                this.custCode = value;
            }

            /**
             * Gets the value of the subId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubId() {
                return subId;
            }

            /**
             * Sets the value of the subId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubId(String value) {
                this.subId = value;
            }

            /**
             * Gets the value of the msisdn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMsisdn() {
                return msisdn;
            }

            /**
             * Sets the value of the msisdn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMsisdn(String value) {
                this.msisdn = value;
            }

            /**
             * Gets the value of the teleType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTeleType() {
                return teleType;
            }

            /**
             * Sets the value of the teleType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTeleType(String value) {
                this.teleType = value;
            }

            /**
             * Gets the value of the invoiceDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvoiceDate() {
                return invoiceDate;
            }

            /**
             * Sets the value of the invoiceDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvoiceDate(String value) {
                this.invoiceDate = value;
            }

            /**
             * Gets the value of the dueDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDueDate() {
                return dueDate;
            }

            /**
             * Sets the value of the dueDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDueDate(String value) {
                this.dueDate = value;
            }

            /**
             * Gets the value of the busiType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusiType() {
                return busiType;
            }

            /**
             * Sets the value of the busiType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusiType(String value) {
                this.busiType = value;
            }

            /**
             * Gets the value of the bsno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBsno() {
                return bsno;
            }

            /**
             * Sets the value of the bsno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBsno(String value) {
                this.bsno = value;
            }

            /**
             * Gets the value of the isCustomer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsCustomer() {
                return isCustomer;
            }

            /**
             * Sets the value of the isCustomer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsCustomer(String value) {
                this.isCustomer = value;
            }

            /**
             * Gets the value of the channelId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChannelId() {
                return channelId;
            }

            /**
             * Sets the value of the channelId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChannelId(String value) {
                this.channelId = value;
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

            /**
             * Gets the value of the fee2ArRequestDetailList property.
             * 
             * @return
             *     possible object is
             *     {@link OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList }
             *     
             */
            public OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList getFee2ArRequestDetailList() {
                return fee2ArRequestDetailList;
            }

            /**
             * Sets the value of the fee2ArRequestDetailList property.
             * 
             * @param value
             *     allowed object is
             *     {@link OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList }
             *     
             */
            public void setFee2ArRequestDetailList(OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList value) {
                this.fee2ArRequestDetailList = value;
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
             *       &lt;sequence>
             *         &lt;element name="Fee2arRequestDetailValue" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="orderQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *                   &lt;element name="backQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *                   &lt;element name="salesQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *                   &lt;element name="unitPrice" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
             *                   &lt;element name="charge" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
             *                   &lt;element name="discountAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
             *                   &lt;element name="transDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
             *                   &lt;element name="salesDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
             *                   &lt;element name="feeItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="billCycleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="taxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="glacode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="waiveGlCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="rebateGlcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="rebateAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
             *                   &lt;element name="resTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="resModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="resId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="resCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="resAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
             *                   &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="spCpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="prmFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="serviceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="feeSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            @XmlType(name = "", propOrder = {
                "fee2ArRequestDetailValue"
            })
            public static class Fee2ArRequestDetailList {

                @XmlElement(name = "Fee2arRequestDetailValue")
                protected List<OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList.Fee2ArRequestDetailValue> fee2ArRequestDetailValue;

                /**
                 * Gets the value of the fee2ArRequestDetailValue property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the fee2ArRequestDetailValue property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFee2ArRequestDetailValue().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList.Fee2ArRequestDetailValue }
                 * 
                 * 
                 */
                public List<OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList.Fee2ArRequestDetailValue> getFee2ArRequestDetailValue() {
                    if (fee2ArRequestDetailValue == null) {
                        fee2ArRequestDetailValue = new ArrayList<OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList.Fee2ArRequestDetailValue>();
                    }
                    return this.fee2ArRequestDetailValue;
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
                 *         &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="orderQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
                 *         &lt;element name="backQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
                 *         &lt;element name="salesQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
                 *         &lt;element name="unitPrice" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
                 *         &lt;element name="charge" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
                 *         &lt;element name="discountAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
                 *         &lt;element name="transDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
                 *         &lt;element name="salesDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
                 *         &lt;element name="feeItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="billCycleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="taxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="glacode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="waiveGlCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="rebateGlcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="rebateAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
                 *         &lt;element name="resTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="resModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="resId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="resCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="resAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
                 *         &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="spCpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="prmFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="serviceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="feeSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                public static class Fee2ArRequestDetailValue {

                    @XmlElement(required = true)
                    protected String transType;
                    @XmlElement(required = true)
                    protected String productName;
                    protected long orderQty;
                    protected long backQty;
                    protected long salesQty;
                    protected long unitPrice;
                    protected long charge;
                    protected long discountAmt;
                    @XmlElement(required = true)
                    protected String transDate;
                    @XmlElement(required = true)
                    protected String salesDate;
                    @XmlElement(required = true)
                    protected String feeItemCode;
                    protected String billCycleId;
                    protected String taxInclusive;
                    protected String glacode;
                    protected String waiveGlCode;
                    protected String rebateGlcode;
                    protected Long rebateAmt;
                    protected String resTypeId;
                    protected String resModelId;
                    protected String resId;
                    protected String resCode;
                    protected Long resAmout;
                    protected String refNo;
                    protected String feeType;
                    protected String productId;
                    protected String spCpId;
                    protected String serviceId;
                    protected String prmFlag;
                    protected String serviceType;
                    protected String serviceCategory;
                    protected String reasonCode;
                    protected String feeSubType;
                    protected String invoiceType;
                    protected String remark;

                    /**
                     * Gets the value of the transType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTransType() {
                        return transType;
                    }

                    /**
                     * Sets the value of the transType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTransType(String value) {
                        this.transType = value;
                    }

                    /**
                     * Gets the value of the productName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProductName() {
                        return productName;
                    }

                    /**
                     * Sets the value of the productName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProductName(String value) {
                        this.productName = value;
                    }

                    /**
                     * Gets the value of the orderQty property.
                     * 
                     */
                    public long getOrderQty() {
                        return orderQty;
                    }

                    /**
                     * Sets the value of the orderQty property.
                     * 
                     */
                    public void setOrderQty(long value) {
                        this.orderQty = value;
                    }

                    /**
                     * Gets the value of the backQty property.
                     * 
                     */
                    public long getBackQty() {
                        return backQty;
                    }

                    /**
                     * Sets the value of the backQty property.
                     * 
                     */
                    public void setBackQty(long value) {
                        this.backQty = value;
                    }

                    /**
                     * Gets the value of the salesQty property.
                     * 
                     */
                    public long getSalesQty() {
                        return salesQty;
                    }

                    /**
                     * Sets the value of the salesQty property.
                     * 
                     */
                    public void setSalesQty(long value) {
                        this.salesQty = value;
                    }

                    /**
                     * Gets the value of the unitPrice property.
                     * 
                     */
                    public long getUnitPrice() {
                        return unitPrice;
                    }

                    /**
                     * Sets the value of the unitPrice property.
                     * 
                     */
                    public void setUnitPrice(long value) {
                        this.unitPrice = value;
                    }

                    /**
                     * Gets the value of the charge property.
                     * 
                     */
                    public long getCharge() {
                        return charge;
                    }

                    /**
                     * Sets the value of the charge property.
                     * 
                     */
                    public void setCharge(long value) {
                        this.charge = value;
                    }

                    /**
                     * Gets the value of the discountAmt property.
                     * 
                     */
                    public long getDiscountAmt() {
                        return discountAmt;
                    }

                    /**
                     * Sets the value of the discountAmt property.
                     * 
                     */
                    public void setDiscountAmt(long value) {
                        this.discountAmt = value;
                    }

                    /**
                     * Gets the value of the transDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTransDate() {
                        return transDate;
                    }

                    /**
                     * Sets the value of the transDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTransDate(String value) {
                        this.transDate = value;
                    }

                    /**
                     * Gets the value of the salesDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSalesDate() {
                        return salesDate;
                    }

                    /**
                     * Sets the value of the salesDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSalesDate(String value) {
                        this.salesDate = value;
                    }

                    /**
                     * Gets the value of the feeItemCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFeeItemCode() {
                        return feeItemCode;
                    }

                    /**
                     * Sets the value of the feeItemCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFeeItemCode(String value) {
                        this.feeItemCode = value;
                    }

                    /**
                     * Gets the value of the billCycleId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBillCycleId() {
                        return billCycleId;
                    }

                    /**
                     * Sets the value of the billCycleId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBillCycleId(String value) {
                        this.billCycleId = value;
                    }

                    /**
                     * Gets the value of the taxInclusive property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTaxInclusive() {
                        return taxInclusive;
                    }

                    /**
                     * Sets the value of the taxInclusive property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTaxInclusive(String value) {
                        this.taxInclusive = value;
                    }

                    /**
                     * Gets the value of the glacode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGlacode() {
                        return glacode;
                    }

                    /**
                     * Sets the value of the glacode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGlacode(String value) {
                        this.glacode = value;
                    }

                    /**
                     * Gets the value of the waiveGlCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWaiveGlCode() {
                        return waiveGlCode;
                    }

                    /**
                     * Sets the value of the waiveGlCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWaiveGlCode(String value) {
                        this.waiveGlCode = value;
                    }

                    /**
                     * Gets the value of the rebateGlcode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRebateGlcode() {
                        return rebateGlcode;
                    }

                    /**
                     * Sets the value of the rebateGlcode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRebateGlcode(String value) {
                        this.rebateGlcode = value;
                    }

                    /**
                     * Gets the value of the rebateAmt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getRebateAmt() {
                        return rebateAmt;
                    }

                    /**
                     * Sets the value of the rebateAmt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setRebateAmt(Long value) {
                        this.rebateAmt = value;
                    }

                    /**
                     * Gets the value of the resTypeId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getResTypeId() {
                        return resTypeId;
                    }

                    /**
                     * Sets the value of the resTypeId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setResTypeId(String value) {
                        this.resTypeId = value;
                    }

                    /**
                     * Gets the value of the resModelId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getResModelId() {
                        return resModelId;
                    }

                    /**
                     * Sets the value of the resModelId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setResModelId(String value) {
                        this.resModelId = value;
                    }

                    /**
                     * Gets the value of the resId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getResId() {
                        return resId;
                    }

                    /**
                     * Sets the value of the resId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setResId(String value) {
                        this.resId = value;
                    }

                    /**
                     * Gets the value of the resCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getResCode() {
                        return resCode;
                    }

                    /**
                     * Sets the value of the resCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setResCode(String value) {
                        this.resCode = value;
                    }

                    /**
                     * Gets the value of the resAmout property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getResAmout() {
                        return resAmout;
                    }

                    /**
                     * Sets the value of the resAmout property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setResAmout(Long value) {
                        this.resAmout = value;
                    }

                    /**
                     * Gets the value of the refNo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRefNo() {
                        return refNo;
                    }

                    /**
                     * Sets the value of the refNo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRefNo(String value) {
                        this.refNo = value;
                    }

                    /**
                     * Gets the value of the feeType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFeeType() {
                        return feeType;
                    }

                    /**
                     * Sets the value of the feeType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFeeType(String value) {
                        this.feeType = value;
                    }

                    /**
                     * Gets the value of the productId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProductId() {
                        return productId;
                    }

                    /**
                     * Sets the value of the productId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProductId(String value) {
                        this.productId = value;
                    }

                    /**
                     * Gets the value of the spCpId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSpCpId() {
                        return spCpId;
                    }

                    /**
                     * Sets the value of the spCpId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSpCpId(String value) {
                        this.spCpId = value;
                    }

                    /**
                     * Gets the value of the serviceId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getServiceId() {
                        return serviceId;
                    }

                    /**
                     * Sets the value of the serviceId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setServiceId(String value) {
                        this.serviceId = value;
                    }

                    /**
                     * Gets the value of the prmFlag property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPrmFlag() {
                        return prmFlag;
                    }

                    /**
                     * Sets the value of the prmFlag property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPrmFlag(String value) {
                        this.prmFlag = value;
                    }

                    /**
                     * Gets the value of the serviceType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getServiceType() {
                        return serviceType;
                    }

                    /**
                     * Sets the value of the serviceType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setServiceType(String value) {
                        this.serviceType = value;
                    }

                    /**
                     * Gets the value of the serviceCategory property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getServiceCategory() {
                        return serviceCategory;
                    }

                    /**
                     * Sets the value of the serviceCategory property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setServiceCategory(String value) {
                        this.serviceCategory = value;
                    }

                    /**
                     * Gets the value of the reasonCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getReasonCode() {
                        return reasonCode;
                    }

                    /**
                     * Sets the value of the reasonCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setReasonCode(String value) {
                        this.reasonCode = value;
                    }

                    /**
                     * Gets the value of the feeSubType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFeeSubType() {
                        return feeSubType;
                    }

                    /**
                     * Sets the value of the feeSubType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFeeSubType(String value) {
                        this.feeSubType = value;
                    }

                    /**
                     * Gets the value of the invoiceType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInvoiceType() {
                        return invoiceType;
                    }

                    /**
                     * Sets the value of the invoiceType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInvoiceType(String value) {
                        this.invoiceType = value;
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

            }

        }

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
     *       &lt;sequence>
     *         &lt;element name="SubFeeList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SubFeeValue" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID"/>
     *                             &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
     *                             &lt;element name="ItemList">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ItemValue" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ItemId">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;maxLength value="32"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Amount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BusiType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Bsno" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Remark" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="128"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TradeTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subFeeList",
        "busiType",
        "bsno",
        "channelId",
        "remark",
        "tradeTime"
    })
    public static class ToBilling {

        @XmlElement(name = "SubFeeList", required = true)
        protected OneTimeCharge.ToBilling.SubFeeList subFeeList;
        @XmlElement(name = "BusiType")
        protected String busiType;
        @XmlElement(name = "Bsno")
        protected String bsno;
        @XmlElement(name = "ChannelId")
        protected String channelId;
        @XmlElement(name = "Remark")
        protected String remark;
        @XmlElement(name = "TradeTime")
        protected String tradeTime;

        /**
         * Gets the value of the subFeeList property.
         * 
         * @return
         *     possible object is
         *     {@link OneTimeCharge.ToBilling.SubFeeList }
         *     
         */
        public OneTimeCharge.ToBilling.SubFeeList getSubFeeList() {
            return subFeeList;
        }

        /**
         * Sets the value of the subFeeList property.
         * 
         * @param value
         *     allowed object is
         *     {@link OneTimeCharge.ToBilling.SubFeeList }
         *     
         */
        public void setSubFeeList(OneTimeCharge.ToBilling.SubFeeList value) {
            this.subFeeList = value;
        }

        /**
         * Gets the value of the busiType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusiType() {
            return busiType;
        }

        /**
         * Sets the value of the busiType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusiType(String value) {
            this.busiType = value;
        }

        /**
         * Gets the value of the bsno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBsno() {
            return bsno;
        }

        /**
         * Sets the value of the bsno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBsno(String value) {
            this.bsno = value;
        }

        /**
         * Gets the value of the channelId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChannelId() {
            return channelId;
        }

        /**
         * Sets the value of the channelId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChannelId(String value) {
            this.channelId = value;
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

        /**
         * Gets the value of the tradeTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeTime() {
            return tradeTime;
        }

        /**
         * Sets the value of the tradeTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeTime(String value) {
            this.tradeTime = value;
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
         *       &lt;sequence>
         *         &lt;element name="SubFeeValue" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID"/>
         *                   &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
         *                   &lt;element name="ItemList">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ItemValue" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ItemId">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;maxLength value="32"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="Amount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
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
        @XmlType(name = "", propOrder = {
            "subFeeValue"
        })
        public static class SubFeeList {

            @XmlElement(name = "SubFeeValue", required = true)
            protected List<OneTimeCharge.ToBilling.SubFeeList.SubFeeValue> subFeeValue;

            /**
             * Gets the value of the subFeeValue property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the subFeeValue property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubFeeValue().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OneTimeCharge.ToBilling.SubFeeList.SubFeeValue }
             * 
             * 
             */
            public List<OneTimeCharge.ToBilling.SubFeeList.SubFeeValue> getSubFeeValue() {
                if (subFeeValue == null) {
                    subFeeValue = new ArrayList<OneTimeCharge.ToBilling.SubFeeList.SubFeeValue>();
                }
                return this.subFeeValue;
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
             *       &lt;sequence>
             *         &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID"/>
             *         &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
             *         &lt;element name="ItemList">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ItemValue" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ItemId">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;maxLength value="32"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="Amount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
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
            @XmlType(name = "", propOrder = {
                "acctId",
                "subId",
                "itemList"
            })
            public static class SubFeeValue {

                @XmlElement(name = "AcctId", required = true)
                protected String acctId;
                @XmlElement(name = "SubId")
                protected String subId;
                @XmlElement(name = "ItemList", required = true)
                protected OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList itemList;

                /**
                 * Gets the value of the acctId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAcctId() {
                    return acctId;
                }

                /**
                 * Sets the value of the acctId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAcctId(String value) {
                    this.acctId = value;
                }

                /**
                 * Gets the value of the subId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubId() {
                    return subId;
                }

                /**
                 * Sets the value of the subId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubId(String value) {
                    this.subId = value;
                }

                /**
                 * Gets the value of the itemList property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList }
                 *     
                 */
                public OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList getItemList() {
                    return itemList;
                }

                /**
                 * Sets the value of the itemList property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList }
                 *     
                 */
                public void setItemList(OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList value) {
                    this.itemList = value;
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
                 *       &lt;sequence>
                 *         &lt;element name="ItemValue" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ItemId">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;maxLength value="32"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="Amount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
                 *                 &lt;/sequence>
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
                @XmlType(name = "", propOrder = {
                    "itemValue"
                })
                public static class ItemList {

                    @XmlElement(name = "ItemValue", required = true)
                    protected List<OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList.ItemValue> itemValue;

                    /**
                     * Gets the value of the itemValue property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the itemValue property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getItemValue().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList.ItemValue }
                     * 
                     * 
                     */
                    public List<OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList.ItemValue> getItemValue() {
                        if (itemValue == null) {
                            itemValue = new ArrayList<OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList.ItemValue>();
                        }
                        return this.itemValue;
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
                     *       &lt;sequence>
                     *         &lt;element name="ItemId">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;maxLength value="32"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="Amount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "itemId",
                        "amount"
                    })
                    public static class ItemValue {

                        @XmlElement(name = "ItemId", required = true)
                        protected String itemId;
                        @XmlElement(name = "Amount")
                        protected long amount;

                        /**
                         * Gets the value of the itemId property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getItemId() {
                            return itemId;
                        }

                        /**
                         * Sets the value of the itemId property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setItemId(String value) {
                            this.itemId = value;
                        }

                        /**
                         * Gets the value of the amount property.
                         * 
                         */
                        public long getAmount() {
                            return amount;
                        }

                        /**
                         * Sets the value of the amount property.
                         * 
                         */
                        public void setAmount(long value) {
                            this.amount = value;
                        }

                    }

                }

            }

        }

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
     *       &lt;sequence>
     *         &lt;element name="OneTimeFee" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OperationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="SubTradeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="MainProductKey" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId" minOccurs="0"/>
     *                   &lt;element name="AccessMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="ProductKey" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId" minOccurs="0"/>
     *                   &lt;element name="ChargeAmount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                   &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
     *                   &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
     *                 &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "oneTimeFee"
    })
    public static class ToCredit {

        @XmlElement(name = "OneTimeFee", required = true)
        protected List<OneTimeCharge.ToCredit.OneTimeFee> oneTimeFee;

        /**
         * Gets the value of the oneTimeFee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oneTimeFee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOneTimeFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OneTimeCharge.ToCredit.OneTimeFee }
         * 
         * 
         */
        public List<OneTimeCharge.ToCredit.OneTimeFee> getOneTimeFee() {
            if (oneTimeFee == null) {
                oneTimeFee = new ArrayList<OneTimeCharge.ToCredit.OneTimeFee>();
            }
            return this.oneTimeFee;
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
         *       &lt;sequence>
         *         &lt;element name="OperationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="SubTradeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="MainProductKey" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId" minOccurs="0"/>
         *         &lt;element name="AccessMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="ProductKey" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId" minOccurs="0"/>
         *         &lt;element name="ChargeAmount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
         *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
         *         &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "operationID",
            "subTradeType",
            "mainProductKey",
            "accessMode",
            "productKey",
            "chargeAmount",
            "subscriberNo",
            "accountCode"
        })
        public static class OneTimeFee {

            @XmlElement(name = "OperationID")
            protected Integer operationID;
            @XmlElement(name = "SubTradeType")
            protected Integer subTradeType;
            @XmlElement(name = "MainProductKey")
            protected Integer mainProductKey;
            @XmlElement(name = "AccessMode")
            protected Integer accessMode;
            @XmlElement(name = "ProductKey")
            protected Integer productKey;
            @XmlElement(name = "ChargeAmount")
            protected Long chargeAmount;
            @XmlElement(name = "SubscriberNo")
            protected String subscriberNo;
            @XmlElement(name = "AccountCode")
            protected String accountCode;

            /**
             * Gets the value of the operationID property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getOperationID() {
                return operationID;
            }

            /**
             * Sets the value of the operationID property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setOperationID(Integer value) {
                this.operationID = value;
            }

            /**
             * Gets the value of the subTradeType property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSubTradeType() {
                return subTradeType;
            }

            /**
             * Sets the value of the subTradeType property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSubTradeType(Integer value) {
                this.subTradeType = value;
            }

            /**
             * Gets the value of the mainProductKey property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMainProductKey() {
                return mainProductKey;
            }

            /**
             * Sets the value of the mainProductKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMainProductKey(Integer value) {
                this.mainProductKey = value;
            }

            /**
             * Gets the value of the accessMode property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAccessMode() {
                return accessMode;
            }

            /**
             * Sets the value of the accessMode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAccessMode(Integer value) {
                this.accessMode = value;
            }

            /**
             * Gets the value of the productKey property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getProductKey() {
                return productKey;
            }

            /**
             * Sets the value of the productKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setProductKey(Integer value) {
                this.productKey = value;
            }

            /**
             * Gets the value of the chargeAmount property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getChargeAmount() {
                return chargeAmount;
            }

            /**
             * Sets the value of the chargeAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setChargeAmount(Long value) {
                this.chargeAmount = value;
            }

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
             * Gets the value of the accountCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountCode() {
                return accountCode;
            }

            /**
             * Sets the value of the accountCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountCode(String value) {
                this.accountCode = value;
            }

        }

    }

}
