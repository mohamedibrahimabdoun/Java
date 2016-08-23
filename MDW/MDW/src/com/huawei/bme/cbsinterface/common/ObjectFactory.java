
package com.huawei.bme.cbsinterface.common;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huawei.bme.cbsinterface.common package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CustomerLangType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "LangType");
    private final static QName _CustomerCountry_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "Country");
    private final static QName _CustomerNationType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "NationType");
    private final static QName _CustomerCreditAmount_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "CreditAmount");
    private final static QName _CustomerTitle_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "Title");
    private final static QName _CustomerIdType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "IdType");
    private final static QName _CustomerCreditGrade_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "CreditGrade");
    private final static QName _CustomerCustomerState_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "CustomerState");
    private final static QName _CustomerGrade_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "Grade");
    private final static QName _CustomerNativePlace_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "NativePlace");
    private final static QName _CustomerGender_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "Gender");
    private final static QName _CustomerJobType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "JobType");
    private final static QName _CustomerEducation_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "Education");
    private final static QName _CustomerSalary_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "Salary");
    private final static QName _CustomerTimeZone_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "TimeZone");
    private final static QName _CustomerMaritalStatus_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "MaritalStatus");
    private final static QName _AcctChgRecTypeMinMeasureId_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "MinMeasureId");
    private final static QName _ResultHeaderOrderId_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "OrderId");
    private final static QName _AccountPrintVATNo_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "PrintVATNo");
    private final static QName _AccountSPID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "SPID");
    private final static QName _AccountDueDate_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "DueDate");
    private final static QName _AccountPaidMode_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "PaidMode");
    private final static QName _AccountCCGroup_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "CCGroup");
    private final static QName _AccountDCCallForward_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "DCCallForward");
    private final static QName _AccountBillFlag_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/common", "BillFlag");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huawei.bme.cbsinterface.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OneTimeCharge }
     * 
     */
    public OneTimeCharge createOneTimeCharge() {
        return new OneTimeCharge();
    }

    /**
     * Create an instance of {@link OneTimeCharge.ToAR }
     * 
     */
    public OneTimeCharge.ToAR createOneTimeChargeToAR() {
        return new OneTimeCharge.ToAR();
    }

    /**
     * Create an instance of {@link OneTimeCharge.ToAR.Fee2ArRequestValue }
     * 
     */
    public OneTimeCharge.ToAR.Fee2ArRequestValue createOneTimeChargeToARFee2ArRequestValue() {
        return new OneTimeCharge.ToAR.Fee2ArRequestValue();
    }

    /**
     * Create an instance of {@link OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList }
     * 
     */
    public OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList createOneTimeChargeToARFee2ArRequestValueFee2ArRequestDetailList() {
        return new OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList();
    }

    /**
     * Create an instance of {@link OneTimeCharge.ToBilling }
     * 
     */
    public OneTimeCharge.ToBilling createOneTimeChargeToBilling() {
        return new OneTimeCharge.ToBilling();
    }

    /**
     * Create an instance of {@link OneTimeCharge.ToBilling.SubFeeList }
     * 
     */
    public OneTimeCharge.ToBilling.SubFeeList createOneTimeChargeToBillingSubFeeList() {
        return new OneTimeCharge.ToBilling.SubFeeList();
    }

    /**
     * Create an instance of {@link OneTimeCharge.ToBilling.SubFeeList.SubFeeValue }
     * 
     */
    public OneTimeCharge.ToBilling.SubFeeList.SubFeeValue createOneTimeChargeToBillingSubFeeListSubFeeValue() {
        return new OneTimeCharge.ToBilling.SubFeeList.SubFeeValue();
    }

    /**
     * Create an instance of {@link OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList }
     * 
     */
    public OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList createOneTimeChargeToBillingSubFeeListSubFeeValueItemList() {
        return new OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList();
    }

    /**
     * Create an instance of {@link OneTimeCharge.ToCredit }
     * 
     */
    public OneTimeCharge.ToCredit createOneTimeChargeToCredit() {
        return new OneTimeCharge.ToCredit();
    }

    /**
     * Create an instance of {@link ResultHeader }
     * 
     */
    public ResultHeader createResultHeader() {
        return new ResultHeader();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link BAScenario }
     * 
     */
    public BAScenario createBAScenario() {
        return new BAScenario();
    }

    /**
     * Create an instance of {@link BADelivery }
     * 
     */
    public BADelivery createBADelivery() {
        return new BADelivery();
    }

    /**
     * Create an instance of {@link Subscriber }
     * 
     */
    public Subscriber createSubscriber() {
        return new Subscriber();
    }

    /**
     * Create an instance of {@link BindSubscriberNo }
     * 
     */
    public BindSubscriberNo createBindSubscriberNo() {
        return new BindSubscriberNo();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link SessionEntityType }
     * 
     */
    public SessionEntityType createSessionEntityType() {
        return new SessionEntityType();
    }

    /**
     * Create an instance of {@link BAAddrInfo }
     * 
     */
    public BAAddrInfo createBAAddrInfo() {
        return new BAAddrInfo();
    }

    /**
     * Create an instance of {@link SimpleProperty }
     * 
     */
    public SimpleProperty createSimpleProperty() {
        return new SimpleProperty();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link AcctChgRecType }
     * 
     */
    public AcctChgRecType createAcctChgRecType() {
        return new AcctChgRecType();
    }

    /**
     * Create an instance of {@link OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList.Fee2ArRequestDetailValue }
     * 
     */
    public OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList.Fee2ArRequestDetailValue createOneTimeChargeToARFee2ArRequestValueFee2ArRequestDetailListFee2ArRequestDetailValue() {
        return new OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList.Fee2ArRequestDetailValue();
    }

    /**
     * Create an instance of {@link OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList.ItemValue }
     * 
     */
    public OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList.ItemValue createOneTimeChargeToBillingSubFeeListSubFeeValueItemListItemValue() {
        return new OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList.ItemValue();
    }

    /**
     * Create an instance of {@link OneTimeCharge.ToCredit.OneTimeFee }
     * 
     */
    public OneTimeCharge.ToCredit.OneTimeFee createOneTimeChargeToCreditOneTimeFee() {
        return new OneTimeCharge.ToCredit.OneTimeFee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "LangType", scope = Customer.class)
    public JAXBElement<Integer> createCustomerLangType(Integer value) {
        return new JAXBElement<Integer>(_CustomerLangType_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "Country", scope = Customer.class)
    public JAXBElement<Integer> createCustomerCountry(Integer value) {
        return new JAXBElement<Integer>(_CustomerCountry_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "NationType", scope = Customer.class)
    public JAXBElement<Integer> createCustomerNationType(Integer value) {
        return new JAXBElement<Integer>(_CustomerNationType_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "CreditAmount", scope = Customer.class)
    public JAXBElement<Long> createCustomerCreditAmount(Long value) {
        return new JAXBElement<Long>(_CustomerCreditAmount_QNAME, Long.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "Title", scope = Customer.class)
    public JAXBElement<BigInteger> createCustomerTitle(BigInteger value) {
        return new JAXBElement<BigInteger>(_CustomerTitle_QNAME, BigInteger.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "IdType", scope = Customer.class)
    public JAXBElement<BigInteger> createCustomerIdType(BigInteger value) {
        return new JAXBElement<BigInteger>(_CustomerIdType_QNAME, BigInteger.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "CreditGrade", scope = Customer.class)
    public JAXBElement<Integer> createCustomerCreditGrade(Integer value) {
        return new JAXBElement<Integer>(_CustomerCreditGrade_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "CustomerState", scope = Customer.class)
    public JAXBElement<Integer> createCustomerCustomerState(Integer value) {
        return new JAXBElement<Integer>(_CustomerCustomerState_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "Grade", scope = Customer.class)
    public JAXBElement<Integer> createCustomerGrade(Integer value) {
        return new JAXBElement<Integer>(_CustomerGrade_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "NativePlace", scope = Customer.class)
    public JAXBElement<Integer> createCustomerNativePlace(Integer value) {
        return new JAXBElement<Integer>(_CustomerNativePlace_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "Gender", scope = Customer.class)
    public JAXBElement<BigInteger> createCustomerGender(BigInteger value) {
        return new JAXBElement<BigInteger>(_CustomerGender_QNAME, BigInteger.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "JobType", scope = Customer.class)
    public JAXBElement<Integer> createCustomerJobType(Integer value) {
        return new JAXBElement<Integer>(_CustomerJobType_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "Education", scope = Customer.class)
    public JAXBElement<Integer> createCustomerEducation(Integer value) {
        return new JAXBElement<Integer>(_CustomerEducation_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "Salary", scope = Customer.class)
    public JAXBElement<Integer> createCustomerSalary(Integer value) {
        return new JAXBElement<Integer>(_CustomerSalary_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "TimeZone", scope = Customer.class)
    public JAXBElement<Integer> createCustomerTimeZone(Integer value) {
        return new JAXBElement<Integer>(_CustomerTimeZone_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "MaritalStatus", scope = Customer.class)
    public JAXBElement<Integer> createCustomerMaritalStatus(Integer value) {
        return new JAXBElement<Integer>(_CustomerMaritalStatus_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "MinMeasureId", scope = AcctChgRecType.class)
    public JAXBElement<Integer> createAcctChgRecTypeMinMeasureId(Integer value) {
        return new JAXBElement<Integer>(_AcctChgRecTypeMinMeasureId_QNAME, Integer.class, AcctChgRecType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "OrderId", scope = ResultHeader.class)
    public JAXBElement<Long> createResultHeaderOrderId(Long value) {
        return new JAXBElement<Long>(_ResultHeaderOrderId_QNAME, Long.class, ResultHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "PrintVATNo", scope = Account.class)
    public JAXBElement<Integer> createAccountPrintVATNo(Integer value) {
        return new JAXBElement<Integer>(_AccountPrintVATNo_QNAME, Integer.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "SPID", scope = Account.class)
    public JAXBElement<Integer> createAccountSPID(Integer value) {
        return new JAXBElement<Integer>(_AccountSPID_QNAME, Integer.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "DueDate", scope = Account.class)
    public JAXBElement<Integer> createAccountDueDate(Integer value) {
        return new JAXBElement<Integer>(_AccountDueDate_QNAME, Integer.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "PaidMode", scope = Account.class)
    public JAXBElement<Integer> createAccountPaidMode(Integer value) {
        return new JAXBElement<Integer>(_AccountPaidMode_QNAME, Integer.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "CCGroup", scope = Account.class)
    public JAXBElement<Integer> createAccountCCGroup(Integer value) {
        return new JAXBElement<Integer>(_AccountCCGroup_QNAME, Integer.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "DCCallForward", scope = Account.class)
    public JAXBElement<Integer> createAccountDCCallForward(Integer value) {
        return new JAXBElement<Integer>(_AccountDCCallForward_QNAME, Integer.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/common", name = "BillFlag", scope = Account.class)
    public JAXBElement<BigInteger> createAccountBillFlag(BigInteger value) {
        return new JAXBElement<BigInteger>(_AccountBillFlag_QNAME, BigInteger.class, Account.class, value);
    }

}
