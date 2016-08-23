
package com.huawei.bme.cbsinterface.common;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirstName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MiddleName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LastName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AccountID" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID" minOccurs="0"/>
 *         &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
 *         &lt;element name="PaidMode" type="{http://www.huawei.com/bme/cbsinterface/common}PaidMode" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BillFlag" type="{http://www.huawei.com/bme/cbsinterface/common}BillFlag" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BillAddress1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BillAddress2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BillAddress3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BillAddress4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BillAddress5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZipCode" type="{http://www.huawei.com/bme/cbsinterface/common}ZipCode" minOccurs="0"/>
 *         &lt;element name="BillLang" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmailBillAddr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SMSBillLang" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SMSBillAddr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BankAcctNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BankID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BankName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BankAcctName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BankAccType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BankAcctActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="CardExpiryDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="SFID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="63"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CCGroup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CCSubGroup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VATNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrintVATNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PPSAcctInitBal" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="PPSAcctCredit" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="POSAcctInitBal" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="POSAcctCredit" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="ContactTel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DCCallForward" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillCycleCredit" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="CreditCtrlMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "firstName",
    "middleName",
    "lastName",
    "accountID",
    "accountCode",
    "paidMode",
    "paymentMethod",
    "billFlag",
    "title",
    "billAddress1",
    "billAddress2",
    "billAddress3",
    "billAddress4",
    "billAddress5",
    "zipCode",
    "billLang",
    "emailBillAddr",
    "smsBillLang",
    "smsBillAddr",
    "bankAcctNo",
    "bankID",
    "bankName",
    "bankAcctName",
    "bankAccType",
    "bankAcctActiveDate",
    "cardExpiryDate",
    "sfid",
    "spid",
    "ccGroup",
    "ccSubGroup",
    "vatNumber",
    "printVATNo",
    "dueDate",
    "ppsAcctInitBal",
    "ppsAcctCredit",
    "posAcctInitBal",
    "posAcctCredit",
    "contactTel",
    "dcCallForward",
    "simpleProperty",
    "billCycleCredit",
    "creditCtrlMode"
})
public class Account {

    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "AccountID")
    protected String accountID;
    @XmlElement(name = "AccountCode")
    protected String accountCode;
    @XmlElementRef(name = "PaidMode", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> paidMode;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElementRef(name = "BillFlag", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<BigInteger> billFlag;
    @XmlElement(name = "Title")
    protected Integer title;
    @XmlElement(name = "BillAddress1")
    protected String billAddress1;
    @XmlElement(name = "BillAddress2")
    protected String billAddress2;
    @XmlElement(name = "BillAddress3")
    protected String billAddress3;
    @XmlElement(name = "BillAddress4")
    protected String billAddress4;
    @XmlElement(name = "BillAddress5")
    protected String billAddress5;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "BillLang")
    protected String billLang;
    @XmlElement(name = "EmailBillAddr")
    protected String emailBillAddr;
    @XmlElement(name = "SMSBillLang")
    protected String smsBillLang;
    @XmlElement(name = "SMSBillAddr")
    protected String smsBillAddr;
    @XmlElement(name = "BankAcctNo")
    protected String bankAcctNo;
    @XmlElement(name = "BankID")
    protected String bankID;
    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "BankAcctName")
    protected String bankAcctName;
    @XmlElement(name = "BankAccType")
    protected String bankAccType;
    @XmlElement(name = "BankAcctActiveDate")
    protected String bankAcctActiveDate;
    @XmlElement(name = "CardExpiryDate")
    protected String cardExpiryDate;
    @XmlElement(name = "SFID")
    protected String sfid;
    @XmlElementRef(name = "SPID", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> spid;
    @XmlElementRef(name = "CCGroup", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> ccGroup;
    @XmlElement(name = "CCSubGroup")
    protected Integer ccSubGroup;
    @XmlElement(name = "VATNumber")
    protected String vatNumber;
    @XmlElementRef(name = "PrintVATNo", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> printVATNo;
    @XmlElementRef(name = "DueDate", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> dueDate;
    @XmlElement(name = "PPSAcctInitBal")
    protected Long ppsAcctInitBal;
    @XmlElement(name = "PPSAcctCredit")
    protected Long ppsAcctCredit;
    @XmlElement(name = "POSAcctInitBal")
    protected Long posAcctInitBal;
    @XmlElement(name = "POSAcctCredit")
    protected Long posAcctCredit;
    @XmlElement(name = "ContactTel")
    protected String contactTel;
    @XmlElementRef(name = "DCCallForward", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> dcCallForward;
    @XmlElement(name = "SimpleProperty")
    protected List<SimpleProperty> simpleProperty;
    @XmlElement(name = "BillCycleCredit")
    protected Long billCycleCredit;
    @XmlElement(name = "CreditCtrlMode")
    protected Integer creditCtrlMode;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
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

    /**
     * Gets the value of the paidMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPaidMode() {
        return paidMode;
    }

    /**
     * Sets the value of the paidMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPaidMode(JAXBElement<Integer> value) {
        this.paidMode = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the billFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getBillFlag() {
        return billFlag;
    }

    /**
     * Sets the value of the billFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setBillFlag(JAXBElement<BigInteger> value) {
        this.billFlag = ((JAXBElement<BigInteger> ) value);
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTitle(Integer value) {
        this.title = value;
    }

    /**
     * Gets the value of the billAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddress1() {
        return billAddress1;
    }

    /**
     * Sets the value of the billAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddress1(String value) {
        this.billAddress1 = value;
    }

    /**
     * Gets the value of the billAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddress2() {
        return billAddress2;
    }

    /**
     * Sets the value of the billAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddress2(String value) {
        this.billAddress2 = value;
    }

    /**
     * Gets the value of the billAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddress3() {
        return billAddress3;
    }

    /**
     * Sets the value of the billAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddress3(String value) {
        this.billAddress3 = value;
    }

    /**
     * Gets the value of the billAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddress4() {
        return billAddress4;
    }

    /**
     * Sets the value of the billAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddress4(String value) {
        this.billAddress4 = value;
    }

    /**
     * Gets the value of the billAddress5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddress5() {
        return billAddress5;
    }

    /**
     * Sets the value of the billAddress5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddress5(String value) {
        this.billAddress5 = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the billLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillLang() {
        return billLang;
    }

    /**
     * Sets the value of the billLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillLang(String value) {
        this.billLang = value;
    }

    /**
     * Gets the value of the emailBillAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailBillAddr() {
        return emailBillAddr;
    }

    /**
     * Sets the value of the emailBillAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailBillAddr(String value) {
        this.emailBillAddr = value;
    }

    /**
     * Gets the value of the smsBillLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSBillLang() {
        return smsBillLang;
    }

    /**
     * Sets the value of the smsBillLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSBillLang(String value) {
        this.smsBillLang = value;
    }

    /**
     * Gets the value of the smsBillAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSBillAddr() {
        return smsBillAddr;
    }

    /**
     * Sets the value of the smsBillAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSBillAddr(String value) {
        this.smsBillAddr = value;
    }

    /**
     * Gets the value of the bankAcctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctNo() {
        return bankAcctNo;
    }

    /**
     * Sets the value of the bankAcctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctNo(String value) {
        this.bankAcctNo = value;
    }

    /**
     * Gets the value of the bankID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankID() {
        return bankID;
    }

    /**
     * Sets the value of the bankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankID(String value) {
        this.bankID = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctName() {
        return bankAcctName;
    }

    /**
     * Sets the value of the bankAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctName(String value) {
        this.bankAcctName = value;
    }

    /**
     * Gets the value of the bankAccType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccType() {
        return bankAccType;
    }

    /**
     * Sets the value of the bankAccType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccType(String value) {
        this.bankAccType = value;
    }

    /**
     * Gets the value of the bankAcctActiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctActiveDate() {
        return bankAcctActiveDate;
    }

    /**
     * Sets the value of the bankAcctActiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctActiveDate(String value) {
        this.bankAcctActiveDate = value;
    }

    /**
     * Gets the value of the cardExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    /**
     * Sets the value of the cardExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpiryDate(String value) {
        this.cardExpiryDate = value;
    }

    /**
     * Gets the value of the sfid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFID() {
        return sfid;
    }

    /**
     * Sets the value of the sfid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFID(String value) {
        this.sfid = value;
    }

    /**
     * Gets the value of the spid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSPID() {
        return spid;
    }

    /**
     * Sets the value of the spid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSPID(JAXBElement<Integer> value) {
        this.spid = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ccGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCCGroup() {
        return ccGroup;
    }

    /**
     * Sets the value of the ccGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCCGroup(JAXBElement<Integer> value) {
        this.ccGroup = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ccSubGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCSubGroup() {
        return ccSubGroup;
    }

    /**
     * Sets the value of the ccSubGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCSubGroup(Integer value) {
        this.ccSubGroup = value;
    }

    /**
     * Gets the value of the vatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATNumber() {
        return vatNumber;
    }

    /**
     * Sets the value of the vatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATNumber(String value) {
        this.vatNumber = value;
    }

    /**
     * Gets the value of the printVATNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrintVATNo() {
        return printVATNo;
    }

    /**
     * Sets the value of the printVATNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrintVATNo(JAXBElement<Integer> value) {
        this.printVATNo = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDueDate(JAXBElement<Integer> value) {
        this.dueDate = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ppsAcctInitBal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPPSAcctInitBal() {
        return ppsAcctInitBal;
    }

    /**
     * Sets the value of the ppsAcctInitBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPPSAcctInitBal(Long value) {
        this.ppsAcctInitBal = value;
    }

    /**
     * Gets the value of the ppsAcctCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPPSAcctCredit() {
        return ppsAcctCredit;
    }

    /**
     * Sets the value of the ppsAcctCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPPSAcctCredit(Long value) {
        this.ppsAcctCredit = value;
    }

    /**
     * Gets the value of the posAcctInitBal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPOSAcctInitBal() {
        return posAcctInitBal;
    }

    /**
     * Sets the value of the posAcctInitBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPOSAcctInitBal(Long value) {
        this.posAcctInitBal = value;
    }

    /**
     * Gets the value of the posAcctCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPOSAcctCredit() {
        return posAcctCredit;
    }

    /**
     * Sets the value of the posAcctCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPOSAcctCredit(Long value) {
        this.posAcctCredit = value;
    }

    /**
     * Gets the value of the contactTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTel() {
        return contactTel;
    }

    /**
     * Sets the value of the contactTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTel(String value) {
        this.contactTel = value;
    }

    /**
     * Gets the value of the dcCallForward property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDCCallForward() {
        return dcCallForward;
    }

    /**
     * Sets the value of the dcCallForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDCCallForward(JAXBElement<Integer> value) {
        this.dcCallForward = ((JAXBElement<Integer> ) value);
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
     * Gets the value of the billCycleCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillCycleCredit() {
        return billCycleCredit;
    }

    /**
     * Sets the value of the billCycleCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillCycleCredit(Long value) {
        this.billCycleCredit = value;
    }

    /**
     * Gets the value of the creditCtrlMode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditCtrlMode() {
        return creditCtrlMode;
    }

    /**
     * Sets the value of the creditCtrlMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditCtrlMode(Integer value) {
        this.creditCtrlMode = value;
    }

}
