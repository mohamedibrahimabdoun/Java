
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
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
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
 *         &lt;element name="CustomerID" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerID" minOccurs="0"/>
 *         &lt;element name="CustomerCode" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerCode" minOccurs="0"/>
 *         &lt;element name="IdType" type="{http://www.huawei.com/bme/cbsinterface/common}IDType" minOccurs="0"/>
 *         &lt;element name="IdCode" type="{http://www.huawei.com/bme/cbsinterface/common}IDNumber" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.huawei.com/bme/cbsinterface/common}Gender" minOccurs="0"/>
 *         &lt;element name="Birthday" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.huawei.com/bme/cbsinterface/common}Title" minOccurs="0"/>
 *         &lt;element name="Salary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HomeAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="254"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Grade" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerGrade" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.huawei.com/bme/cbsinterface/common}Email" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.huawei.com/bme/cbsinterface/common}ZipCode" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.huawei.com/bme/cbsinterface/common}Country" minOccurs="0"/>
 *         &lt;element name="NativePlace" type="{http://www.huawei.com/bme/cbsinterface/common}AreaCode" minOccurs="0"/>
 *         &lt;element name="NationType" type="{http://www.huawei.com/bme/cbsinterface/common}NationType" minOccurs="0"/>
 *         &lt;element name="JobType" type="{http://www.huawei.com/bme/cbsinterface/common}JobType" minOccurs="0"/>
 *         &lt;element name="Education" type="{http://www.huawei.com/bme/cbsinterface/common}Education" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://www.huawei.com/bme/cbsinterface/common}MaritalStatus" minOccurs="0"/>
 *         &lt;element name="Skill" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="254"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SocialNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CreditGrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreditAmount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="CustomerState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ContactNumber1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContactNumber2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContactNumber3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContactNumber4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContactNumber5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SystemNofityNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="23"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HomePhone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WorkPhone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
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
 *         &lt;element name="PostAddress1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PostAddress2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PostAddress3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PostAddress4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PostAddress5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Remark" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="254"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LangType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "Customer", propOrder = {
    "firstName",
    "middleName",
    "lastName",
    "customerID",
    "customerCode",
    "idType",
    "idCode",
    "gender",
    "birthday",
    "title",
    "salary",
    "homeAddress",
    "grade",
    "email",
    "zipCode",
    "country",
    "nativePlace",
    "nationType",
    "jobType",
    "education",
    "maritalStatus",
    "skill",
    "socialNo",
    "creditGrade",
    "creditAmount",
    "customerState",
    "contactNumber1",
    "contactNumber2",
    "contactNumber3",
    "contactNumber4",
    "contactNumber5",
    "systemNofityNumber",
    "homePhone",
    "workPhone",
    "belToAreaID",
    "postAddress1",
    "postAddress2",
    "postAddress3",
    "postAddress4",
    "postAddress5",
    "remark",
    "langType",
    "timeZone",
    "simpleProperty"
})
public class Customer {

    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "CustomerCode")
    protected String customerCode;
    @XmlElementRef(name = "IdType", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<BigInteger> idType;
    @XmlElement(name = "IdCode")
    protected String idCode;
    @XmlElementRef(name = "Gender", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<BigInteger> gender;
    @XmlElement(name = "Birthday")
    protected String birthday;
    @XmlElementRef(name = "Title", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<BigInteger> title;
    @XmlElementRef(name = "Salary", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> salary;
    @XmlElement(name = "HomeAddress")
    protected String homeAddress;
    @XmlElementRef(name = "Grade", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> grade;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElementRef(name = "Country", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> country;
    @XmlElementRef(name = "NativePlace", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> nativePlace;
    @XmlElementRef(name = "NationType", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> nationType;
    @XmlElementRef(name = "JobType", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> jobType;
    @XmlElementRef(name = "Education", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> education;
    @XmlElementRef(name = "MaritalStatus", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> maritalStatus;
    @XmlElement(name = "Skill")
    protected String skill;
    @XmlElement(name = "SocialNo")
    protected String socialNo;
    @XmlElementRef(name = "CreditGrade", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> creditGrade;
    @XmlElementRef(name = "CreditAmount", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Long> creditAmount;
    @XmlElementRef(name = "CustomerState", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> customerState;
    @XmlElement(name = "ContactNumber1")
    protected String contactNumber1;
    @XmlElement(name = "ContactNumber2")
    protected String contactNumber2;
    @XmlElement(name = "ContactNumber3")
    protected String contactNumber3;
    @XmlElement(name = "ContactNumber4")
    protected String contactNumber4;
    @XmlElement(name = "ContactNumber5")
    protected String contactNumber5;
    @XmlElement(name = "SystemNofityNumber")
    protected String systemNofityNumber;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "WorkPhone")
    protected String workPhone;
    @XmlElement(name = "BelToAreaID")
    protected String belToAreaID;
    @XmlElement(name = "PostAddress1")
    protected String postAddress1;
    @XmlElement(name = "PostAddress2")
    protected String postAddress2;
    @XmlElement(name = "PostAddress3")
    protected String postAddress3;
    @XmlElement(name = "PostAddress4")
    protected String postAddress4;
    @XmlElement(name = "PostAddress5")
    protected String postAddress5;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElementRef(name = "LangType", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> langType;
    @XmlElementRef(name = "TimeZone", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class)
    protected JAXBElement<Integer> timeZone;
    @XmlElement(name = "SimpleProperty")
    protected List<SimpleProperty> simpleProperty;

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
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the customerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Sets the value of the customerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setIdType(JAXBElement<BigInteger> value) {
        this.idType = ((JAXBElement<BigInteger> ) value);
    }

    /**
     * Gets the value of the idCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCode() {
        return idCode;
    }

    /**
     * Sets the value of the idCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCode(String value) {
        this.idCode = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setGender(JAXBElement<BigInteger> value) {
        this.gender = ((JAXBElement<BigInteger> ) value);
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setTitle(JAXBElement<BigInteger> value) {
        this.title = ((JAXBElement<BigInteger> ) value);
    }

    /**
     * Gets the value of the salary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSalary(JAXBElement<Integer> value) {
        this.salary = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the homeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * Sets the value of the homeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeAddress(String value) {
        this.homeAddress = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGrade(JAXBElement<Integer> value) {
        this.grade = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCountry(JAXBElement<Integer> value) {
        this.country = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nativePlace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNativePlace() {
        return nativePlace;
    }

    /**
     * Sets the value of the nativePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNativePlace(JAXBElement<Integer> value) {
        this.nativePlace = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNationType() {
        return nationType;
    }

    /**
     * Sets the value of the nationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNationType(JAXBElement<Integer> value) {
        this.nationType = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setJobType(JAXBElement<Integer> value) {
        this.jobType = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the education property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEducation() {
        return education;
    }

    /**
     * Sets the value of the education property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEducation(JAXBElement<Integer> value) {
        this.education = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaritalStatus(JAXBElement<Integer> value) {
        this.maritalStatus = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the skill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkill() {
        return skill;
    }

    /**
     * Sets the value of the skill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkill(String value) {
        this.skill = value;
    }

    /**
     * Gets the value of the socialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialNo() {
        return socialNo;
    }

    /**
     * Sets the value of the socialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialNo(String value) {
        this.socialNo = value;
    }

    /**
     * Gets the value of the creditGrade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCreditGrade() {
        return creditGrade;
    }

    /**
     * Sets the value of the creditGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCreditGrade(JAXBElement<Integer> value) {
        this.creditGrade = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the creditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCreditAmount() {
        return creditAmount;
    }

    /**
     * Sets the value of the creditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCreditAmount(JAXBElement<Long> value) {
        this.creditAmount = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the customerState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCustomerState() {
        return customerState;
    }

    /**
     * Sets the value of the customerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCustomerState(JAXBElement<Integer> value) {
        this.customerState = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the contactNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumber1() {
        return contactNumber1;
    }

    /**
     * Sets the value of the contactNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumber1(String value) {
        this.contactNumber1 = value;
    }

    /**
     * Gets the value of the contactNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumber2() {
        return contactNumber2;
    }

    /**
     * Sets the value of the contactNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumber2(String value) {
        this.contactNumber2 = value;
    }

    /**
     * Gets the value of the contactNumber3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumber3() {
        return contactNumber3;
    }

    /**
     * Sets the value of the contactNumber3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumber3(String value) {
        this.contactNumber3 = value;
    }

    /**
     * Gets the value of the contactNumber4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumber4() {
        return contactNumber4;
    }

    /**
     * Sets the value of the contactNumber4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumber4(String value) {
        this.contactNumber4 = value;
    }

    /**
     * Gets the value of the contactNumber5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumber5() {
        return contactNumber5;
    }

    /**
     * Sets the value of the contactNumber5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumber5(String value) {
        this.contactNumber5 = value;
    }

    /**
     * Gets the value of the systemNofityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemNofityNumber() {
        return systemNofityNumber;
    }

    /**
     * Sets the value of the systemNofityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemNofityNumber(String value) {
        this.systemNofityNumber = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
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
     * Gets the value of the postAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddress1() {
        return postAddress1;
    }

    /**
     * Sets the value of the postAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAddress1(String value) {
        this.postAddress1 = value;
    }

    /**
     * Gets the value of the postAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddress2() {
        return postAddress2;
    }

    /**
     * Sets the value of the postAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAddress2(String value) {
        this.postAddress2 = value;
    }

    /**
     * Gets the value of the postAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddress3() {
        return postAddress3;
    }

    /**
     * Sets the value of the postAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAddress3(String value) {
        this.postAddress3 = value;
    }

    /**
     * Gets the value of the postAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddress4() {
        return postAddress4;
    }

    /**
     * Sets the value of the postAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAddress4(String value) {
        this.postAddress4 = value;
    }

    /**
     * Gets the value of the postAddress5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddress5() {
        return postAddress5;
    }

    /**
     * Sets the value of the postAddress5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAddress5(String value) {
        this.postAddress5 = value;
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
     * Gets the value of the langType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLangType() {
        return langType;
    }

    /**
     * Sets the value of the langType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLangType(JAXBElement<Integer> value) {
        this.langType = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTimeZone(JAXBElement<Integer> value) {
        this.timeZone = ((JAXBElement<Integer> ) value);
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
