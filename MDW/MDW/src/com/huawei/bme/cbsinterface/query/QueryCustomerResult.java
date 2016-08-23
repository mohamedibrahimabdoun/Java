
package com.huawei.bme.cbsinterface.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.acctcredit.CreditType;
import com.huawei.bme.cbsinterface.common.SimpleProperty;
import com.huawei.bme.cbsinterface.subscribe.OfferOrderInfo;


/**
 * <p>Java class for QueryCustomerResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCustomerResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerInfo" type="{http://www.huawei.com/bme/cbsinterface/common}Customer" minOccurs="0"/>
 *                   &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrderInfo">
 *                           &lt;sequence>
 *                             &lt;element name="LevelCode" type="{http://www.huawei.com/bme/cbsinterface/common}OfferLevel"/>
 *                             &lt;element name="OfferType" type="{http://www.huawei.com/bme/cbsinterface/common}OfferType"/>
 *                             &lt;element name="BundleSubscriber" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PrimaryOfferOrderKey" type="{http://www.huawei.com/bme/cbsinterface/common}OfferOrderKey" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AccumulatorList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
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
 *         &lt;element name="Account" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccountKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="AccountInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/common}Account">
 *                           &lt;sequence>
 *                             &lt;element name="IsCustShareAcct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BillingCycleDate" type="{http://www.huawei.com/bme/cbsinterface/query}BillingCycleDate" minOccurs="0"/>
 *                   &lt;element name="BalanceRecordList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Balance" type="{http://www.huawei.com/bme/cbsinterface/query}BalanceType" maxOccurs="unbounded"/>
 *                             &lt;element name="BalanceValidity" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                             &lt;element name="AvailableCredit" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                             &lt;element name="BalanceActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AccountState" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ActiveStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                             &lt;element name="SuspendStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                             &lt;element name="DisableStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OfferList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Offer" type="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrderInfo" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProductList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/query}ProductOrderInfo" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AccountCredit" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="InitialCredit" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="BillCycleCredit" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="TempCreditList" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="Subscriber" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *                   &lt;element name="SubscriberInfo" type="{http://www.huawei.com/bme/cbsinterface/query}SubscriberInfo" minOccurs="0"/>
 *                   &lt;element name="SubscriberState" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="FirstActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *                             &lt;element name="LastRechargeTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *                             &lt;element name="ActiveCAC" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ActiveStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                             &lt;element name="SuspendStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                             &lt;element name="DisableStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                             &lt;element name="LifeCycleState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="DPFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="FraudState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="LossFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="DPEndDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *                             &lt;element name="DPFlag1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="DPFlag2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="LastActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                             &lt;element name="POSUserState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="ETUFraudState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UserGroupList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UserGroup" type="{http://www.huawei.com/bme/cbsinterface/query}UserGroup" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AccumulatorList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id" type="{http://www.huawei.com/bme/cbsinterface/common}ServiceId"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProductList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/query}ProductOrderInfo" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SubAttachedInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="ChgMainProductTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="ChgMainPackageTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="LoanAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                             &lt;element name="LoanPoundage" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                             &lt;element name="ETUReceiveAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                             &lt;element name="ETUGracePeriod" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *                             &lt;element name="UnpaidFee" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ConsumeAccumuList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
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
@XmlType(name = "QueryCustomerResult", propOrder = {
    "customer",
    "account",
    "subscriber"
})
public class QueryCustomerResult {

    @XmlElement(name = "Customer")
    protected QueryCustomerResult.Customer customer;
    @XmlElement(name = "Account")
    protected List<QueryCustomerResult.Account> account;
    @XmlElement(name = "Subscriber")
    protected List<QueryCustomerResult.Subscriber> subscriber;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link QueryCustomerResult.Customer }
     *     
     */
    public QueryCustomerResult.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryCustomerResult.Customer }
     *     
     */
    public void setCustomer(QueryCustomerResult.Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryCustomerResult.Account }
     * 
     * 
     */
    public List<QueryCustomerResult.Account> getAccount() {
        if (account == null) {
            account = new ArrayList<QueryCustomerResult.Account>();
        }
        return this.account;
    }

    /**
     * Gets the value of the subscriber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryCustomerResult.Subscriber }
     * 
     * 
     */
    public List<QueryCustomerResult.Subscriber> getSubscriber() {
        if (subscriber == null) {
            subscriber = new ArrayList<QueryCustomerResult.Subscriber>();
        }
        return this.subscriber;
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
     *         &lt;element name="AccountKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="AccountInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/common}Account">
     *                 &lt;sequence>
     *                   &lt;element name="IsCustShareAcct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BillingCycleDate" type="{http://www.huawei.com/bme/cbsinterface/query}BillingCycleDate" minOccurs="0"/>
     *         &lt;element name="BalanceRecordList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Balance" type="{http://www.huawei.com/bme/cbsinterface/query}BalanceType" maxOccurs="unbounded"/>
     *                   &lt;element name="BalanceValidity" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                   &lt;element name="AvailableCredit" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                   &lt;element name="BalanceActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AccountState" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ActiveStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                   &lt;element name="SuspendStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                   &lt;element name="DisableStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OfferList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Offer" type="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrderInfo" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProductList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/query}ProductOrderInfo" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AccountCredit" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="InitialCredit" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="BillCycleCredit" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="TempCreditList" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
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
        "accountKey",
        "accountInfo",
        "billingCycleDate",
        "balanceRecordList",
        "accountState",
        "offerList",
        "productList",
        "accountCredit"
    })
    public static class Account {

        @XmlElement(name = "AccountKey")
        protected long accountKey;
        @XmlElement(name = "AccountInfo")
        protected QueryCustomerResult.Account.AccountInfo accountInfo;
        @XmlElement(name = "BillingCycleDate")
        protected BillingCycleDate billingCycleDate;
        @XmlElement(name = "BalanceRecordList")
        protected QueryCustomerResult.Account.BalanceRecordList balanceRecordList;
        @XmlElement(name = "AccountState")
        protected QueryCustomerResult.Account.AccountState accountState;
        @XmlElement(name = "OfferList")
        protected QueryCustomerResult.Account.OfferList offerList;
        @XmlElement(name = "ProductList")
        protected QueryCustomerResult.Account.ProductList productList;
        @XmlElement(name = "AccountCredit")
        protected QueryCustomerResult.Account.AccountCredit accountCredit;

        /**
         * Gets the value of the accountKey property.
         * 
         */
        public long getAccountKey() {
            return accountKey;
        }

        /**
         * Sets the value of the accountKey property.
         * 
         */
        public void setAccountKey(long value) {
            this.accountKey = value;
        }

        /**
         * Gets the value of the accountInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCustomerResult.Account.AccountInfo }
         *     
         */
        public QueryCustomerResult.Account.AccountInfo getAccountInfo() {
            return accountInfo;
        }

        /**
         * Sets the value of the accountInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCustomerResult.Account.AccountInfo }
         *     
         */
        public void setAccountInfo(QueryCustomerResult.Account.AccountInfo value) {
            this.accountInfo = value;
        }

        /**
         * Gets the value of the billingCycleDate property.
         * 
         * @return
         *     possible object is
         *     {@link BillingCycleDate }
         *     
         */
        public BillingCycleDate getBillingCycleDate() {
            return billingCycleDate;
        }

        /**
         * Sets the value of the billingCycleDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BillingCycleDate }
         *     
         */
        public void setBillingCycleDate(BillingCycleDate value) {
            this.billingCycleDate = value;
        }

        /**
         * Gets the value of the balanceRecordList property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCustomerResult.Account.BalanceRecordList }
         *     
         */
        public QueryCustomerResult.Account.BalanceRecordList getBalanceRecordList() {
            return balanceRecordList;
        }

        /**
         * Sets the value of the balanceRecordList property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCustomerResult.Account.BalanceRecordList }
         *     
         */
        public void setBalanceRecordList(QueryCustomerResult.Account.BalanceRecordList value) {
            this.balanceRecordList = value;
        }

        /**
         * Gets the value of the accountState property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCustomerResult.Account.AccountState }
         *     
         */
        public QueryCustomerResult.Account.AccountState getAccountState() {
            return accountState;
        }

        /**
         * Sets the value of the accountState property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCustomerResult.Account.AccountState }
         *     
         */
        public void setAccountState(QueryCustomerResult.Account.AccountState value) {
            this.accountState = value;
        }

        /**
         * Gets the value of the offerList property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCustomerResult.Account.OfferList }
         *     
         */
        public QueryCustomerResult.Account.OfferList getOfferList() {
            return offerList;
        }

        /**
         * Sets the value of the offerList property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCustomerResult.Account.OfferList }
         *     
         */
        public void setOfferList(QueryCustomerResult.Account.OfferList value) {
            this.offerList = value;
        }

        /**
         * Gets the value of the productList property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCustomerResult.Account.ProductList }
         *     
         */
        public QueryCustomerResult.Account.ProductList getProductList() {
            return productList;
        }

        /**
         * Sets the value of the productList property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCustomerResult.Account.ProductList }
         *     
         */
        public void setProductList(QueryCustomerResult.Account.ProductList value) {
            this.productList = value;
        }

        /**
         * Gets the value of the accountCredit property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCustomerResult.Account.AccountCredit }
         *     
         */
        public QueryCustomerResult.Account.AccountCredit getAccountCredit() {
            return accountCredit;
        }

        /**
         * Sets the value of the accountCredit property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCustomerResult.Account.AccountCredit }
         *     
         */
        public void setAccountCredit(QueryCustomerResult.Account.AccountCredit value) {
            this.accountCredit = value;
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
         *         &lt;element name="InitialCredit" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="BillCycleCredit" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="TempCreditList" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
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
            "initialCredit",
            "billCycleCredit",
            "tempCreditList"
        })
        public static class AccountCredit {

            @XmlElement(name = "InitialCredit")
            protected List<CreditType> initialCredit;
            @XmlElement(name = "BillCycleCredit")
            protected List<CreditType> billCycleCredit;
            @XmlElement(name = "TempCreditList")
            protected List<CreditType> tempCreditList;

            /**
             * Gets the value of the initialCredit property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the initialCredit property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInitialCredit().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CreditType }
             * 
             * 
             */
            public List<CreditType> getInitialCredit() {
                if (initialCredit == null) {
                    initialCredit = new ArrayList<CreditType>();
                }
                return this.initialCredit;
            }

            /**
             * Gets the value of the billCycleCredit property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the billCycleCredit property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBillCycleCredit().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CreditType }
             * 
             * 
             */
            public List<CreditType> getBillCycleCredit() {
                if (billCycleCredit == null) {
                    billCycleCredit = new ArrayList<CreditType>();
                }
                return this.billCycleCredit;
            }

            /**
             * Gets the value of the tempCreditList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tempCreditList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTempCreditList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CreditType }
             * 
             * 
             */
            public List<CreditType> getTempCreditList() {
                if (tempCreditList == null) {
                    tempCreditList = new ArrayList<CreditType>();
                }
                return this.tempCreditList;
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
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/common}Account">
         *       &lt;sequence>
         *         &lt;element name="IsCustShareAcct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "isCustShareAcct"
        })
        public static class AccountInfo
            extends com.huawei.bme.cbsinterface.common.Account
        {

            @XmlElement(name = "IsCustShareAcct")
            protected Boolean isCustShareAcct;

            /**
             * Gets the value of the isCustShareAcct property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsCustShareAcct() {
                return isCustShareAcct;
            }

            /**
             * Sets the value of the isCustShareAcct property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsCustShareAcct(Boolean value) {
                this.isCustShareAcct = value;
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
         *         &lt;element name="ActiveStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
         *         &lt;element name="SuspendStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
         *         &lt;element name="DisableStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
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
            "activeStop",
            "suspendStop",
            "disableStop"
        })
        public static class AccountState {

            @XmlElement(name = "ActiveStop")
            protected String activeStop;
            @XmlElement(name = "SuspendStop")
            protected String suspendStop;
            @XmlElement(name = "DisableStop")
            protected String disableStop;

            /**
             * Gets the value of the activeStop property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActiveStop() {
                return activeStop;
            }

            /**
             * Sets the value of the activeStop property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActiveStop(String value) {
                this.activeStop = value;
            }

            /**
             * Gets the value of the suspendStop property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuspendStop() {
                return suspendStop;
            }

            /**
             * Sets the value of the suspendStop property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuspendStop(String value) {
                this.suspendStop = value;
            }

            /**
             * Gets the value of the disableStop property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisableStop() {
                return disableStop;
            }

            /**
             * Sets the value of the disableStop property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisableStop(String value) {
                this.disableStop = value;
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
         *         &lt;element name="Balance" type="{http://www.huawei.com/bme/cbsinterface/query}BalanceType" maxOccurs="unbounded"/>
         *         &lt;element name="BalanceValidity" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
         *         &lt;element name="AvailableCredit" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
         *         &lt;element name="BalanceActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
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
            "balance",
            "balanceValidity",
            "availableCredit",
            "balanceActiveDate"
        })
        public static class BalanceRecordList {

            @XmlElement(name = "Balance", required = true)
            protected List<BalanceType> balance;
            @XmlElement(name = "BalanceValidity")
            protected String balanceValidity;
            @XmlElement(name = "AvailableCredit")
            protected Long availableCredit;
            @XmlElement(name = "BalanceActiveDate")
            protected String balanceActiveDate;

            /**
             * Gets the value of the balance property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the balance property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBalance().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BalanceType }
             * 
             * 
             */
            public List<BalanceType> getBalance() {
                if (balance == null) {
                    balance = new ArrayList<BalanceType>();
                }
                return this.balance;
            }

            /**
             * Gets the value of the balanceValidity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBalanceValidity() {
                return balanceValidity;
            }

            /**
             * Sets the value of the balanceValidity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBalanceValidity(String value) {
                this.balanceValidity = value;
            }

            /**
             * Gets the value of the availableCredit property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAvailableCredit() {
                return availableCredit;
            }

            /**
             * Sets the value of the availableCredit property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAvailableCredit(Long value) {
                this.availableCredit = value;
            }

            /**
             * Gets the value of the balanceActiveDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBalanceActiveDate() {
                return balanceActiveDate;
            }

            /**
             * Sets the value of the balanceActiveDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBalanceActiveDate(String value) {
                this.balanceActiveDate = value;
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
         *         &lt;element name="Offer" type="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrderInfo" maxOccurs="unbounded"/>
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
            "offer"
        })
        public static class OfferList {

            @XmlElement(name = "Offer", required = true)
            protected List<OfferOrderInfo> offer;

            /**
             * Gets the value of the offer property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the offer property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOffer().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OfferOrderInfo }
             * 
             * 
             */
            public List<OfferOrderInfo> getOffer() {
                if (offer == null) {
                    offer = new ArrayList<OfferOrderInfo>();
                }
                return this.offer;
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
         *         &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/query}ProductOrderInfo" maxOccurs="unbounded"/>
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
            "product"
        })
        public static class ProductList {

            @XmlElement(name = "Product", required = true)
            protected List<ProductOrderInfo> product;

            /**
             * Gets the value of the product property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the product property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProduct().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProductOrderInfo }
             * 
             * 
             */
            public List<ProductOrderInfo> getProduct() {
                if (product == null) {
                    product = new ArrayList<ProductOrderInfo>();
                }
                return this.product;
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
     *         &lt;element name="CustomerInfo" type="{http://www.huawei.com/bme/cbsinterface/common}Customer" minOccurs="0"/>
     *         &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrderInfo">
     *                 &lt;sequence>
     *                   &lt;element name="LevelCode" type="{http://www.huawei.com/bme/cbsinterface/common}OfferLevel"/>
     *                   &lt;element name="OfferType" type="{http://www.huawei.com/bme/cbsinterface/common}OfferType"/>
     *                   &lt;element name="BundleSubscriber" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PrimaryOfferOrderKey" type="{http://www.huawei.com/bme/cbsinterface/common}OfferOrderKey" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AccumulatorList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
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
        "customerInfo",
        "offer",
        "accumulatorList"
    })
    public static class Customer {

        @XmlElement(name = "CustomerInfo")
        protected com.huawei.bme.cbsinterface.common.Customer customerInfo;
        @XmlElement(name = "Offer")
        protected List<QueryCustomerResult.Customer.Offer> offer;
        @XmlElement(name = "AccumulatorList")
        protected QueryCustomerResult.Customer.AccumulatorList accumulatorList;

        /**
         * Gets the value of the customerInfo property.
         * 
         * @return
         *     possible object is
         *     {@link com.huawei.bme.cbsinterface.common.Customer }
         *     
         */
        public com.huawei.bme.cbsinterface.common.Customer getCustomerInfo() {
            return customerInfo;
        }

        /**
         * Sets the value of the customerInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link com.huawei.bme.cbsinterface.common.Customer }
         *     
         */
        public void setCustomerInfo(com.huawei.bme.cbsinterface.common.Customer value) {
            this.customerInfo = value;
        }

        /**
         * Gets the value of the offer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOffer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueryCustomerResult.Customer.Offer }
         * 
         * 
         */
        public List<QueryCustomerResult.Customer.Offer> getOffer() {
            if (offer == null) {
                offer = new ArrayList<QueryCustomerResult.Customer.Offer>();
            }
            return this.offer;
        }

        /**
         * Gets the value of the accumulatorList property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCustomerResult.Customer.AccumulatorList }
         *     
         */
        public QueryCustomerResult.Customer.AccumulatorList getAccumulatorList() {
            return accumulatorList;
        }

        /**
         * Sets the value of the accumulatorList property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCustomerResult.Customer.AccumulatorList }
         *     
         */
        public void setAccumulatorList(QueryCustomerResult.Customer.AccumulatorList value) {
            this.accumulatorList = value;
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
         *         &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
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
            "accumulator"
        })
        public static class AccumulatorList {

            @XmlElement(name = "Accumulator", required = true)
            protected List<Accumulator> accumulator;

            /**
             * Gets the value of the accumulator property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the accumulator property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAccumulator().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Accumulator }
             * 
             * 
             */
            public List<Accumulator> getAccumulator() {
                if (accumulator == null) {
                    accumulator = new ArrayList<Accumulator>();
                }
                return this.accumulator;
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
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrderInfo">
         *       &lt;sequence>
         *         &lt;element name="LevelCode" type="{http://www.huawei.com/bme/cbsinterface/common}OfferLevel"/>
         *         &lt;element name="OfferType" type="{http://www.huawei.com/bme/cbsinterface/common}OfferType"/>
         *         &lt;element name="BundleSubscriber" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PrimaryOfferOrderKey" type="{http://www.huawei.com/bme/cbsinterface/common}OfferOrderKey" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "levelCode",
            "offerType",
            "bundleSubscriber",
            "primaryOfferOrderKey"
        })
        public static class Offer
            extends OfferOrderInfo
        {

            @XmlElement(name = "LevelCode")
            protected int levelCode;
            @XmlElement(name = "OfferType")
            protected int offerType;
            @XmlElement(name = "BundleSubscriber")
            protected List<QueryCustomerResult.Customer.Offer.BundleSubscriber> bundleSubscriber;
            @XmlElement(name = "PrimaryOfferOrderKey")
            protected Long primaryOfferOrderKey;

            /**
             * Gets the value of the levelCode property.
             * 
             */
            public int getLevelCode() {
                return levelCode;
            }

            /**
             * Sets the value of the levelCode property.
             * 
             */
            public void setLevelCode(int value) {
                this.levelCode = value;
            }

            /**
             * Gets the value of the offerType property.
             * 
             */
            public int getOfferType() {
                return offerType;
            }

            /**
             * Sets the value of the offerType property.
             * 
             */
            public void setOfferType(int value) {
                this.offerType = value;
            }

            /**
             * Gets the value of the bundleSubscriber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bundleSubscriber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBundleSubscriber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link QueryCustomerResult.Customer.Offer.BundleSubscriber }
             * 
             * 
             */
            public List<QueryCustomerResult.Customer.Offer.BundleSubscriber> getBundleSubscriber() {
                if (bundleSubscriber == null) {
                    bundleSubscriber = new ArrayList<QueryCustomerResult.Customer.Offer.BundleSubscriber>();
                }
                return this.bundleSubscriber;
            }

            /**
             * Gets the value of the primaryOfferOrderKey property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getPrimaryOfferOrderKey() {
                return primaryOfferOrderKey;
            }

            /**
             * Sets the value of the primaryOfferOrderKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setPrimaryOfferOrderKey(Long value) {
                this.primaryOfferOrderKey = value;
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
             *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
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
                "subscriberNo"
            })
            public static class BundleSubscriber {

                @XmlElement(name = "SubscriberNo", required = true)
                protected String subscriberNo;

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
     *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
     *         &lt;element name="SubscriberInfo" type="{http://www.huawei.com/bme/cbsinterface/query}SubscriberInfo" minOccurs="0"/>
     *         &lt;element name="SubscriberState" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="FirstActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
     *                   &lt;element name="LastRechargeTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
     *                   &lt;element name="ActiveCAC" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ActiveStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                   &lt;element name="SuspendStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                   &lt;element name="DisableStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                   &lt;element name="LifeCycleState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="DPFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="FraudState" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="LossFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="DPEndDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
     *                   &lt;element name="DPFlag1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="DPFlag2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="LastActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                   &lt;element name="POSUserState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="ETUFraudState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UserGroupList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UserGroup" type="{http://www.huawei.com/bme/cbsinterface/query}UserGroup" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AccumulatorList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id" type="{http://www.huawei.com/bme/cbsinterface/common}ServiceId"/>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProductList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/query}ProductOrderInfo" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SubAttachedInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="ChgMainProductTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="ChgMainPackageTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="LoanAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                   &lt;element name="LoanPoundage" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                   &lt;element name="ETUReceiveAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                   &lt;element name="ETUGracePeriod" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
     *                   &lt;element name="UnpaidFee" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ConsumeAccumuList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
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
        "subscriberNo",
        "subscriberInfo",
        "subscriberState",
        "userGroupList",
        "accumulatorList",
        "service",
        "productList",
        "subAttachedInfo",
        "consumeAccumuList"
    })
    public static class Subscriber {

        @XmlElement(name = "SubscriberNo", required = true)
        protected String subscriberNo;
        @XmlElement(name = "SubscriberInfo")
        protected SubscriberInfo subscriberInfo;
        @XmlElement(name = "SubscriberState")
        protected QueryCustomerResult.Subscriber.SubscriberState subscriberState;
        @XmlElement(name = "UserGroupList")
        protected QueryCustomerResult.Subscriber.UserGroupList userGroupList;
        @XmlElement(name = "AccumulatorList")
        protected QueryCustomerResult.Subscriber.AccumulatorList accumulatorList;
        @XmlElement(name = "Service")
        protected List<QueryCustomerResult.Subscriber.Service> service;
        @XmlElement(name = "ProductList")
        protected QueryCustomerResult.Subscriber.ProductList productList;
        @XmlElement(name = "SubAttachedInfo")
        protected QueryCustomerResult.Subscriber.SubAttachedInfo subAttachedInfo;
        @XmlElement(name = "ConsumeAccumuList")
        protected QueryCustomerResult.Subscriber.ConsumeAccumuList consumeAccumuList;

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
         * Gets the value of the subscriberInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SubscriberInfo }
         *     
         */
        public SubscriberInfo getSubscriberInfo() {
            return subscriberInfo;
        }

        /**
         * Sets the value of the subscriberInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubscriberInfo }
         *     
         */
        public void setSubscriberInfo(SubscriberInfo value) {
            this.subscriberInfo = value;
        }

        /**
         * Gets the value of the subscrbrState property.
         *
         * @return
         * possible object is
         * {@link QueryCustomerResult.Subscriber.SubscriberState}
         *
         */
        public QueryCustomerResult.Subscriber.SubscriberState getSubscriberState() {
            return subscriberState;
        }

        /**
         * Sets the value of the subscrbrState property.
         *
         * @param value
         * allowed object is
         * {@link QueryCustomerResult.Subscriber.SubscriberState}
         *
         */
        public void setSubscriberState(QueryCustomerResult.Subscriber.SubscriberState value) {
            this.subscriberState = value;
        }

        /**
         * Gets the value of the userGroupList property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCustomerResult.Subscriber.UserGroupList }
         *     
         */
        public QueryCustomerResult.Subscriber.UserGroupList getUserGroupList() {
            return userGroupList;
        }

        /**
         * Sets the value of the userGroupList property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCustomerResult.Subscriber.UserGroupList }
         *     
         */
        public void setUserGroupList(QueryCustomerResult.Subscriber.UserGroupList value) {
            this.userGroupList = value;
        }

        /**
         * Gets the value of the accumulatorList property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCustomerResult.Subscriber.AccumulatorList }
         *     
         */
        public QueryCustomerResult.Subscriber.AccumulatorList getAccumulatorList() {
            return accumulatorList;
        }

        /**
         * Sets the value of the accumulatorList property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCustomerResult.Subscriber.AccumulatorList }
         *     
         */
        public void setAccumulatorList(QueryCustomerResult.Subscriber.AccumulatorList value) {
            this.accumulatorList = value;
        }

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueryCustomerResult.Subscriber.Service }
         * 
         * 
         */
        public List<QueryCustomerResult.Subscriber.Service> getService() {
            if (service == null) {
                service = new ArrayList<QueryCustomerResult.Subscriber.Service>();
            }
            return this.service;
        }

        /**
         * Gets the value of the productList property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCustomerResult.Subscriber.ProductList }
         *     
         */
        public QueryCustomerResult.Subscriber.ProductList getProductList() {
            return productList;
        }

        /**
         * Sets the value of the productList property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCustomerResult.Subscriber.ProductList }
         *     
         */
        public void setProductList(QueryCustomerResult.Subscriber.ProductList value) {
            this.productList = value;
        }

        /**
         * Gets the value of the subAttachedInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCustomerResult.Subscriber.SubAttachedInfo }
         *     
         */
        public QueryCustomerResult.Subscriber.SubAttachedInfo getSubAttachedInfo() {
            return subAttachedInfo;
        }

        /**
         * Sets the value of the subAttachedInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCustomerResult.Subscriber.SubAttachedInfo }
         *     
         */
        public void setSubAttachedInfo(QueryCustomerResult.Subscriber.SubAttachedInfo value) {
            this.subAttachedInfo = value;
        }

        /**
         * Gets the value of the consumeAccumuList property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCustomerResult.Subscriber.ConsumeAccumuList }
         *     
         */
        public QueryCustomerResult.Subscriber.ConsumeAccumuList getConsumeAccumuList() {
            return consumeAccumuList;
        }

        /**
         * Sets the value of the consumeAccumuList property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCustomerResult.Subscriber.ConsumeAccumuList }
         *     
         */
        public void setConsumeAccumuList(QueryCustomerResult.Subscriber.ConsumeAccumuList value) {
            this.consumeAccumuList = value;
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
         *         &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
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
            "accumulator"
        })
        public static class AccumulatorList {

            @XmlElement(name = "Accumulator", required = true)
            protected List<Accumulator> accumulator;

            /**
             * Gets the value of the accumulator property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the accumulator property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAccumulator().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Accumulator }
             * 
             * 
             */
            public List<Accumulator> getAccumulator() {
                if (accumulator == null) {
                    accumulator = new ArrayList<Accumulator>();
                }
                return this.accumulator;
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
         *         &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
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
            "accumulator"
        })
        public static class ConsumeAccumuList {

            @XmlElement(name = "Accumulator", required = true)
            protected List<Accumulator> accumulator;

            /**
             * Gets the value of the accumulator property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the accumulator property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAccumulator().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Accumulator }
             * 
             * 
             */
            public List<Accumulator> getAccumulator() {
                if (accumulator == null) {
                    accumulator = new ArrayList<Accumulator>();
                }
                return this.accumulator;
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
         *         &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/query}ProductOrderInfo" maxOccurs="unbounded"/>
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
            "product"
        })
        public static class ProductList {

            @XmlElement(name = "Product", required = true)
            protected List<ProductOrderInfo> product;

            /**
             * Gets the value of the product property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the product property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProduct().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProductOrderInfo }
             * 
             * 
             */
            public List<ProductOrderInfo> getProduct() {
                if (product == null) {
                    product = new ArrayList<ProductOrderInfo>();
                }
                return this.product;
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
         *         &lt;element name="Id" type="{http://www.huawei.com/bme/cbsinterface/common}ServiceId"/>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
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
            "id",
            "status",
            "simpleProperty"
        })
        public static class Service {

            @XmlElement(name = "Id")
            protected int id;
            @XmlElement(name = "Status")
            protected Integer status;
            @XmlElement(name = "SimpleProperty")
            protected List<SimpleProperty> simpleProperty;

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
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setStatus(Integer value) {
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
         *         &lt;element name="ChgMainProductTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="ChgMainPackageTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="LoanAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
         *         &lt;element name="LoanPoundage" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
         *         &lt;element name="ETUReceiveAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
         *         &lt;element name="ETUGracePeriod" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
         *         &lt;element name="UnpaidFee" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
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
        public static class SubAttachedInfo {

            @XmlElementRef(name = "ChgMainProductTimes", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class)
            protected JAXBElement<Integer> chgMainProductTimes;
            @XmlElementRef(name = "ChgMainPackageTimes", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class)
            protected JAXBElement<Integer> chgMainPackageTimes;
            @XmlElementRef(name = "LoanAmout", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class)
            protected JAXBElement<Long> loanAmout;
            @XmlElementRef(name = "LoanPoundage", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class)
            protected JAXBElement<Long> loanPoundage;
            @XmlElementRef(name = "ETUReceiveAmt", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class)
            protected JAXBElement<Long> etuReceiveAmt;
            @XmlElement(name = "ETUGracePeriod")
            protected String etuGracePeriod;
            @XmlElementRef(name = "UnpaidFee", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class)
            protected JAXBElement<Long> unpaidFee;

            /**
             * Gets the value of the chgMainProductTimes property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getChgMainProductTimes() {
                return chgMainProductTimes;
            }

            /**
             * Sets the value of the chgMainProductTimes property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setChgMainProductTimes(JAXBElement<Integer> value) {
                this.chgMainProductTimes = ((JAXBElement<Integer> ) value);
            }

            /**
             * Gets the value of the chgMainPackageTimes property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getChgMainPackageTimes() {
                return chgMainPackageTimes;
            }

            /**
             * Sets the value of the chgMainPackageTimes property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setChgMainPackageTimes(JAXBElement<Integer> value) {
                this.chgMainPackageTimes = ((JAXBElement<Integer> ) value);
            }

            /**
             * Gets the value of the loanAmout property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getLoanAmout() {
                return loanAmout;
            }

            /**
             * Sets the value of the loanAmout property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setLoanAmout(JAXBElement<Long> value) {
                this.loanAmout = ((JAXBElement<Long> ) value);
            }

            /**
             * Gets the value of the loanPoundage property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getLoanPoundage() {
                return loanPoundage;
            }

            /**
             * Sets the value of the loanPoundage property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setLoanPoundage(JAXBElement<Long> value) {
                this.loanPoundage = ((JAXBElement<Long> ) value);
            }

            /**
             * Gets the value of the etuReceiveAmt property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getETUReceiveAmt() {
                return etuReceiveAmt;
            }

            /**
             * Sets the value of the etuReceiveAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setETUReceiveAmt(JAXBElement<Long> value) {
                this.etuReceiveAmt = ((JAXBElement<Long> ) value);
            }

            /**
             * Gets the value of the etuGracePeriod property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getETUGracePeriod() {
                return etuGracePeriod;
            }

            /**
             * Sets the value of the etuGracePeriod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setETUGracePeriod(String value) {
                this.etuGracePeriod = value;
            }

            /**
             * Gets the value of the unpaidFee property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getUnpaidFee() {
                return unpaidFee;
            }

            /**
             * Sets the value of the unpaidFee property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setUnpaidFee(JAXBElement<Long> value) {
                this.unpaidFee = ((JAXBElement<Long> ) value);
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
         *       &lt;all>
         *         &lt;element name="FirstActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
         *         &lt;element name="LastRechargeTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
         *         &lt;element name="ActiveCAC" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ActiveStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
         *         &lt;element name="SuspendStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
         *         &lt;element name="DisableStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
         *         &lt;element name="LifeCycleState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="DPFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="FraudState" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="LossFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="DPEndDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
         *         &lt;element name="DPFlag1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="DPFlag2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="LastActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
         *         &lt;element name="POSUserState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="ETUFraudState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        public static class SubscriberState {

            @XmlElement(name = "FirstActiveDate")
            protected String firstActiveDate;
            @XmlElement(name = "LastRechargeTime")
            protected String lastRechargeTime;
            @XmlElement(name = "ActiveCAC")
            protected String activeCAC;
            @XmlElement(name = "ActiveStop")
            protected String activeStop;
            @XmlElement(name = "SuspendStop")
            protected String suspendStop;
            @XmlElement(name = "DisableStop")
            protected String disableStop;
            @XmlElementRef(name = "LifeCycleState", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class)
            protected JAXBElement<Integer> lifeCycleState;
            @XmlElement(name = "DPFlag", required = true, type = Integer.class, nillable = true)
            protected Integer dpFlag;
            @XmlElement(name = "FraudState", required = true, type = Integer.class, nillable = true)
            protected Integer fraudState;
            @XmlElementRef(name = "LossFlag", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class)
            protected JAXBElement<Integer> lossFlag;
            @XmlElement(name = "DPEndDate")
            protected String dpEndDate;
            @XmlElementRef(name = "DPFlag1", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class)
            protected JAXBElement<Integer> dpFlag1;
            @XmlElementRef(name = "DPFlag2", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class)
            protected JAXBElement<Integer> dpFlag2;
            @XmlElement(name = "LastActiveDate")
            protected String lastActiveDate;
            @XmlElementRef(name = "POSUserState", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class)
            protected JAXBElement<Integer> posUserState;
            @XmlElementRef(name = "ETUFraudState", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class)
            protected JAXBElement<Integer> etuFraudState;

            /**
             * Gets the value of the firstActiveDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstActiveDate() {
                return firstActiveDate;
            }

            /**
             * Sets the value of the firstActiveDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstActiveDate(String value) {
                this.firstActiveDate = value;
            }

            /**
             * Gets the value of the lastRechargeTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastRechargeTime() {
                return lastRechargeTime;
            }

            /**
             * Sets the value of the lastRechargeTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastRechargeTime(String value) {
                this.lastRechargeTime = value;
            }

            /**
             * Gets the value of the activeCAC property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActiveCAC() {
                return activeCAC;
            }

            /**
             * Sets the value of the activeCAC property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActiveCAC(String value) {
                this.activeCAC = value;
            }

            /**
             * Gets the value of the activeStop property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActiveStop() {
                return activeStop;
            }

            /**
             * Sets the value of the activeStop property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActiveStop(String value) {
                this.activeStop = value;
            }

            /**
             * Gets the value of the suspendStop property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuspendStop() {
                return suspendStop;
            }

            /**
             * Sets the value of the suspendStop property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuspendStop(String value) {
                this.suspendStop = value;
            }

            /**
             * Gets the value of the disableStop property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisableStop() {
                return disableStop;
            }

            /**
             * Sets the value of the disableStop property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisableStop(String value) {
                this.disableStop = value;
            }

            /**
             * Gets the value of the lifeCycleState property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getLifeCycleState() {
                return lifeCycleState;
            }

            /**
             * Sets the value of the lifeCycleState property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setLifeCycleState(JAXBElement<Integer> value) {
                this.lifeCycleState = ((JAXBElement<Integer> ) value);
            }

            /**
             * Gets the value of the dpFlag property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDPFlag() {
                return dpFlag;
            }

            /**
             * Sets the value of the dpFlag property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDPFlag(Integer value) {
                this.dpFlag = value;
            }

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
             * Gets the value of the lossFlag property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getLossFlag() {
                return lossFlag;
            }

            /**
             * Sets the value of the lossFlag property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setLossFlag(JAXBElement<Integer> value) {
                this.lossFlag = ((JAXBElement<Integer> ) value);
            }

            /**
             * Gets the value of the dpEndDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDPEndDate() {
                return dpEndDate;
            }

            /**
             * Sets the value of the dpEndDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDPEndDate(String value) {
                this.dpEndDate = value;
            }

            /**
             * Gets the value of the dpFlag1 property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getDPFlag1() {
                return dpFlag1;
            }

            /**
             * Sets the value of the dpFlag1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setDPFlag1(JAXBElement<Integer> value) {
                this.dpFlag1 = ((JAXBElement<Integer> ) value);
            }

            /**
             * Gets the value of the dpFlag2 property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getDPFlag2() {
                return dpFlag2;
            }

            /**
             * Sets the value of the dpFlag2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setDPFlag2(JAXBElement<Integer> value) {
                this.dpFlag2 = ((JAXBElement<Integer> ) value);
            }

            /**
             * Gets the value of the lastActiveDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastActiveDate() {
                return lastActiveDate;
            }

            /**
             * Sets the value of the lastActiveDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastActiveDate(String value) {
                this.lastActiveDate = value;
            }

            /**
             * Gets the value of the posUserState property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getPOSUserState() {
                return posUserState;
            }

            /**
             * Sets the value of the posUserState property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setPOSUserState(JAXBElement<Integer> value) {
                this.posUserState = ((JAXBElement<Integer> ) value);
            }

            /**
             * Gets the value of the etuFraudState property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getETUFraudState() {
                return etuFraudState;
            }

            /**
             * Sets the value of the etuFraudState property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setETUFraudState(JAXBElement<Integer> value) {
                this.etuFraudState = ((JAXBElement<Integer> ) value);
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
         *         &lt;element name="UserGroup" type="{http://www.huawei.com/bme/cbsinterface/query}UserGroup" maxOccurs="unbounded" minOccurs="0"/>
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
            "userGroup"
        })
        public static class UserGroupList {

            @XmlElement(name = "UserGroup")
            protected List<UserGroup> userGroup;

            /**
             * Gets the value of the userGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the userGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUserGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UserGroup }
             * 
             * 
             */
            public List<UserGroup> getUserGroup() {
                if (userGroup == null) {
                    userGroup = new ArrayList<UserGroup>();
                }
                return this.userGroup;
            }

        }

    }

}
