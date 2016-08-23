
package com.huawei.bme.cbsinterface.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huawei.bme.cbsinterface.query package. 
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

    private final static QName _SubscriberInfoComponentId_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/query", "ComponentId");
    private final static QName _QueryCustomerResultSubscriberSubAttachedInfoLoanPoundage_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/query", "LoanPoundage");
    private final static QName _QueryCustomerResultSubscriberSubAttachedInfoUnpaidFee_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/query", "UnpaidFee");
    private final static QName _QueryCustomerResultSubscriberSubAttachedInfoChgMainProductTimes_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/query", "ChgMainProductTimes");
    private final static QName _QueryCustomerResultSubscriberSubAttachedInfoLoanAmout_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/query", "LoanAmout");
    private final static QName _QueryCustomerResultSubscriberSubAttachedInfoETUReceiveAmt_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/query", "ETUReceiveAmt");
    private final static QName _QueryCustomerResultSubscriberSubAttachedInfoChgMainPackageTimes_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/query", "ChgMainPackageTimes");
    private final static QName _QueryCustomerResultSubscriberSubscriberStateLifeCycleState_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/query", "LifeCycleState");
    private final static QName _QueryCustomerResultSubscriberSubscriberStateLossFlag_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/query", "LossFlag");
    private final static QName _QueryCustomerResultSubscriberSubscriberStateDPFlag1_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/query", "DPFlag1");
    private final static QName _QueryCustomerResultSubscriberSubscriberStateETUFraudState_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/query", "ETUFraudState");
    private final static QName _QueryCustomerResultSubscriberSubscriberStatePOSUserState_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/query", "POSUserState");
    private final static QName _QueryCustomerResultSubscriberSubscriberStateDPFlag2_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/query", "DPFlag2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huawei.bme.cbsinterface.query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryCustomerResult }
     * 
     */
    public QueryCustomerResult createQueryCustomerResult() {
        return new QueryCustomerResult();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Subscriber }
     * 
     */
    public QueryCustomerResult.Subscriber createQueryCustomerResultSubscriber() {
        return new QueryCustomerResult.Subscriber();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Account }
     * 
     */
    public QueryCustomerResult.Account createQueryCustomerResultAccount() {
        return new QueryCustomerResult.Account();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Customer }
     * 
     */
    public QueryCustomerResult.Customer createQueryCustomerResultCustomer() {
        return new QueryCustomerResult.Customer();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Customer.Offer }
     * 
     */
    public QueryCustomerResult.Customer.Offer createQueryCustomerResultCustomerOffer() {
        return new QueryCustomerResult.Customer.Offer();
    }

    /**
     * Create an instance of {@link QueryLastTranInfoResult }
     * 
     */
    public QueryLastTranInfoResult createQueryLastTranInfoResult() {
        return new QueryLastTranInfoResult();
    }

    /**
     * Create an instance of {@link QueryProductOrderResult }
     * 
     */
    public QueryProductOrderResult createQueryProductOrderResult() {
        return new QueryProductOrderResult();
    }

    /**
     * Create an instance of {@link QueryProductOrderResult.ServiceTariff }
     * 
     */
    public QueryProductOrderResult.ServiceTariff createQueryProductOrderResultServiceTariff() {
        return new QueryProductOrderResult.ServiceTariff();
    }

    /**
     * Create an instance of {@link QueryProductOrderResult.ServiceTariff.FavoriteCountry }
     * 
     */
    public QueryProductOrderResult.ServiceTariff.FavoriteCountry createQueryProductOrderResultServiceTariffFavoriteCountry() {
        return new QueryProductOrderResult.ServiceTariff.FavoriteCountry();
    }

    /**
     * Create an instance of {@link QueryLastTranInfoRequest }
     * 
     */
    public QueryLastTranInfoRequest createQueryLastTranInfoRequest() {
        return new QueryLastTranInfoRequest();
    }

    /**
     * Create an instance of {@link QueryBalanceTransferInfoResult }
     * 
     */
    public QueryBalanceTransferInfoResult createQueryBalanceTransferInfoResult() {
        return new QueryBalanceTransferInfoResult();
    }

    /**
     * Create an instance of {@link QueryBalanceRequest }
     * 
     */
    public QueryBalanceRequest createQueryBalanceRequest() {
        return new QueryBalanceRequest();
    }

    /**
     * Create an instance of {@link QueryProductOrderRequest }
     * 
     */
    public QueryProductOrderRequest createQueryProductOrderRequest() {
        return new QueryProductOrderRequest();
    }

    /**
     * Create an instance of {@link QueryBalanceTransferInfoRequest }
     * 
     */
    public QueryBalanceTransferInfoRequest createQueryBalanceTransferInfoRequest() {
        return new QueryBalanceTransferInfoRequest();
    }

    /**
     * Create an instance of {@link QuerySubCosIDRequest }
     * 
     */
    public QuerySubCosIDRequest createQuerySubCosIDRequest() {
        return new QuerySubCosIDRequest();
    }

    /**
     * Create an instance of {@link QueryBalanceResult }
     * 
     */
    public QueryBalanceResult createQueryBalanceResult() {
        return new QueryBalanceResult();
    }

    /**
     * Create an instance of {@link QueryCustomerRequest }
     * 
     */
    public QueryCustomerRequest createQueryCustomerRequest() {
        return new QueryCustomerRequest();
    }

    /**
     * Create an instance of {@link QuerySubCosIDResult }
     * 
     */
    public QuerySubCosIDResult createQuerySubCosIDResult() {
        return new QuerySubCosIDResult();
    }

    /**
     * Create an instance of {@link BalanceType }
     * 
     */
    public BalanceType createBalanceType() {
        return new BalanceType();
    }

    /**
     * Create an instance of {@link UserGroup }
     * 
     */
    public UserGroup createUserGroup() {
        return new UserGroup();
    }

    /**
     * Create an instance of {@link Accumulator }
     * 
     */
    public Accumulator createAccumulator() {
        return new Accumulator();
    }

    /**
     * Create an instance of {@link BillingCycleDate }
     * 
     */
    public BillingCycleDate createBillingCycleDate() {
        return new BillingCycleDate();
    }

    /**
     * Create an instance of {@link SubscriberInfo }
     * 
     */
    public SubscriberInfo createSubscriberInfo() {
        return new SubscriberInfo();
    }

    /**
     * Create an instance of {@link ProductOrderInfo }
     * 
     */
    public ProductOrderInfo createProductOrderInfo() {
        return new ProductOrderInfo();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Subscriber.SubscriberState }
     * 
     */
    public QueryCustomerResult.Subscriber.SubscriberState createQueryCustomerResultSubscriberSubscriberState() {
        return new QueryCustomerResult.Subscriber.SubscriberState();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Subscriber.UserGroupList }
     * 
     */
    public QueryCustomerResult.Subscriber.UserGroupList createQueryCustomerResultSubscriberUserGroupList() {
        return new QueryCustomerResult.Subscriber.UserGroupList();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Subscriber.AccumulatorList }
     * 
     */
    public QueryCustomerResult.Subscriber.AccumulatorList createQueryCustomerResultSubscriberAccumulatorList() {
        return new QueryCustomerResult.Subscriber.AccumulatorList();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Subscriber.Service }
     * 
     */
    public QueryCustomerResult.Subscriber.Service createQueryCustomerResultSubscriberService() {
        return new QueryCustomerResult.Subscriber.Service();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Subscriber.ProductList }
     * 
     */
    public QueryCustomerResult.Subscriber.ProductList createQueryCustomerResultSubscriberProductList() {
        return new QueryCustomerResult.Subscriber.ProductList();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Subscriber.SubAttachedInfo }
     * 
     */
    public QueryCustomerResult.Subscriber.SubAttachedInfo createQueryCustomerResultSubscriberSubAttachedInfo() {
        return new QueryCustomerResult.Subscriber.SubAttachedInfo();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Subscriber.ConsumeAccumuList }
     * 
     */
    public QueryCustomerResult.Subscriber.ConsumeAccumuList createQueryCustomerResultSubscriberConsumeAccumuList() {
        return new QueryCustomerResult.Subscriber.ConsumeAccumuList();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Account.AccountInfo }
     * 
     */
    public QueryCustomerResult.Account.AccountInfo createQueryCustomerResultAccountAccountInfo() {
        return new QueryCustomerResult.Account.AccountInfo();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Account.BalanceRecordList }
     * 
     */
    public QueryCustomerResult.Account.BalanceRecordList createQueryCustomerResultAccountBalanceRecordList() {
        return new QueryCustomerResult.Account.BalanceRecordList();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Account.AccountState }
     * 
     */
    public QueryCustomerResult.Account.AccountState createQueryCustomerResultAccountAccountState() {
        return new QueryCustomerResult.Account.AccountState();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Account.OfferList }
     * 
     */
    public QueryCustomerResult.Account.OfferList createQueryCustomerResultAccountOfferList() {
        return new QueryCustomerResult.Account.OfferList();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Account.ProductList }
     * 
     */
    public QueryCustomerResult.Account.ProductList createQueryCustomerResultAccountProductList() {
        return new QueryCustomerResult.Account.ProductList();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Account.AccountCredit }
     * 
     */
    public QueryCustomerResult.Account.AccountCredit createQueryCustomerResultAccountAccountCredit() {
        return new QueryCustomerResult.Account.AccountCredit();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Customer.AccumulatorList }
     * 
     */
    public QueryCustomerResult.Customer.AccumulatorList createQueryCustomerResultCustomerAccumulatorList() {
        return new QueryCustomerResult.Customer.AccumulatorList();
    }

    /**
     * Create an instance of {@link QueryCustomerResult.Customer.Offer.BundleSubscriber }
     * 
     */
    public QueryCustomerResult.Customer.Offer.BundleSubscriber createQueryCustomerResultCustomerOfferBundleSubscriber() {
        return new QueryCustomerResult.Customer.Offer.BundleSubscriber();
    }

    /**
     * Create an instance of {@link QueryLastTranInfoResult.ChargeInfo }
     * 
     */
    public QueryLastTranInfoResult.ChargeInfo createQueryLastTranInfoResultChargeInfo() {
        return new QueryLastTranInfoResult.ChargeInfo();
    }

    /**
     * Create an instance of {@link QueryProductOrderResult.FreeResource }
     * 
     */
    public QueryProductOrderResult.FreeResource createQueryProductOrderResultFreeResource() {
        return new QueryProductOrderResult.FreeResource();
    }

    /**
     * Create an instance of {@link QueryProductOrderResult.ServiceTariff.LoyaltyNumber }
     * 
     */
    public QueryProductOrderResult.ServiceTariff.LoyaltyNumber createQueryProductOrderResultServiceTariffLoyaltyNumber() {
        return new QueryProductOrderResult.ServiceTariff.LoyaltyNumber();
    }

    /**
     * Create an instance of {@link QueryProductOrderResult.ServiceTariff.FavoriteCountry.CountryRate }
     * 
     */
    public QueryProductOrderResult.ServiceTariff.FavoriteCountry.CountryRate createQueryProductOrderResultServiceTariffFavoriteCountryCountryRate() {
        return new QueryProductOrderResult.ServiceTariff.FavoriteCountry.CountryRate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/query", name = "ComponentId", scope = SubscriberInfo.class)
    public JAXBElement<Integer> createSubscriberInfoComponentId(Integer value) {
        return new JAXBElement<Integer>(_SubscriberInfoComponentId_QNAME, Integer.class, SubscriberInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/query", name = "LoanPoundage", scope = QueryCustomerResult.Subscriber.SubAttachedInfo.class)
    public JAXBElement<Long> createQueryCustomerResultSubscriberSubAttachedInfoLoanPoundage(Long value) {
        return new JAXBElement<Long>(_QueryCustomerResultSubscriberSubAttachedInfoLoanPoundage_QNAME, Long.class, QueryCustomerResult.Subscriber.SubAttachedInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/query", name = "UnpaidFee", scope = QueryCustomerResult.Subscriber.SubAttachedInfo.class)
    public JAXBElement<Long> createQueryCustomerResultSubscriberSubAttachedInfoUnpaidFee(Long value) {
        return new JAXBElement<Long>(_QueryCustomerResultSubscriberSubAttachedInfoUnpaidFee_QNAME, Long.class, QueryCustomerResult.Subscriber.SubAttachedInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/query", name = "ChgMainProductTimes", scope = QueryCustomerResult.Subscriber.SubAttachedInfo.class)
    public JAXBElement<Integer> createQueryCustomerResultSubscriberSubAttachedInfoChgMainProductTimes(Integer value) {
        return new JAXBElement<Integer>(_QueryCustomerResultSubscriberSubAttachedInfoChgMainProductTimes_QNAME, Integer.class, QueryCustomerResult.Subscriber.SubAttachedInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/query", name = "LoanAmout", scope = QueryCustomerResult.Subscriber.SubAttachedInfo.class)
    public JAXBElement<Long> createQueryCustomerResultSubscriberSubAttachedInfoLoanAmout(Long value) {
        return new JAXBElement<Long>(_QueryCustomerResultSubscriberSubAttachedInfoLoanAmout_QNAME, Long.class, QueryCustomerResult.Subscriber.SubAttachedInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/query", name = "ETUReceiveAmt", scope = QueryCustomerResult.Subscriber.SubAttachedInfo.class)
    public JAXBElement<Long> createQueryCustomerResultSubscriberSubAttachedInfoETUReceiveAmt(Long value) {
        return new JAXBElement<Long>(_QueryCustomerResultSubscriberSubAttachedInfoETUReceiveAmt_QNAME, Long.class, QueryCustomerResult.Subscriber.SubAttachedInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/query", name = "ChgMainPackageTimes", scope = QueryCustomerResult.Subscriber.SubAttachedInfo.class)
    public JAXBElement<Integer> createQueryCustomerResultSubscriberSubAttachedInfoChgMainPackageTimes(Integer value) {
        return new JAXBElement<Integer>(_QueryCustomerResultSubscriberSubAttachedInfoChgMainPackageTimes_QNAME, Integer.class, QueryCustomerResult.Subscriber.SubAttachedInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/query", name = "UnpaidFee", scope = QueryBalanceResult.class)
    public JAXBElement<Long> createQueryBalanceResultUnpaidFee(Long value) {
        return new JAXBElement<Long>(_QueryCustomerResultSubscriberSubAttachedInfoUnpaidFee_QNAME, Long.class, QueryBalanceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/query", name = "LifeCycleState", scope = QueryCustomerResult.Subscriber.SubscriberState.class)
    public JAXBElement<Integer> createQueryCustomerResultSubscriberSubscriberStateLifeCycleState(Integer value) {
        return new JAXBElement<Integer>(_QueryCustomerResultSubscriberSubscriberStateLifeCycleState_QNAME, Integer.class, QueryCustomerResult.Subscriber.SubscriberState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/query", name = "LossFlag", scope = QueryCustomerResult.Subscriber.SubscriberState.class)
    public JAXBElement<Integer> createQueryCustomerResultSubscriberSubscriberStateLossFlag(Integer value) {
        return new JAXBElement<Integer>(_QueryCustomerResultSubscriberSubscriberStateLossFlag_QNAME, Integer.class, QueryCustomerResult.Subscriber.SubscriberState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/query", name = "DPFlag1", scope = QueryCustomerResult.Subscriber.SubscriberState.class)
    public JAXBElement<Integer> createQueryCustomerResultSubscriberSubscriberStateDPFlag1(Integer value) {
        return new JAXBElement<Integer>(_QueryCustomerResultSubscriberSubscriberStateDPFlag1_QNAME, Integer.class, QueryCustomerResult.Subscriber.SubscriberState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/query", name = "ETUFraudState", scope = QueryCustomerResult.Subscriber.SubscriberState.class)
    public JAXBElement<Integer> createQueryCustomerResultSubscriberSubscriberStateETUFraudState(Integer value) {
        return new JAXBElement<Integer>(_QueryCustomerResultSubscriberSubscriberStateETUFraudState_QNAME, Integer.class, QueryCustomerResult.Subscriber.SubscriberState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/query", name = "POSUserState", scope = QueryCustomerResult.Subscriber.SubscriberState.class)
    public JAXBElement<Integer> createQueryCustomerResultSubscriberSubscriberStatePOSUserState(Integer value) {
        return new JAXBElement<Integer>(_QueryCustomerResultSubscriberSubscriberStatePOSUserState_QNAME, Integer.class, QueryCustomerResult.Subscriber.SubscriberState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/query", name = "DPFlag2", scope = QueryCustomerResult.Subscriber.SubscriberState.class)
    public JAXBElement<Integer> createQueryCustomerResultSubscriberSubscriberStateDPFlag2(Integer value) {
        return new JAXBElement<Integer>(_QueryCustomerResultSubscriberSubscriberStateDPFlag2_QNAME, Integer.class, QueryCustomerResult.Subscriber.SubscriberState.class, value);
    }

}
