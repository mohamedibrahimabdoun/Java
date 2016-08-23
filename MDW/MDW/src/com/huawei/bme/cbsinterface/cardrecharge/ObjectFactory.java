
package com.huawei.bme.cbsinterface.cardrecharge;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huawei.bme.cbsinterface.cardrecharge package. 
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

    private final static QName _VoucherRechargeEnquiryResultRechargeLogRechargeBonusCurrPrmAcctBalance_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cardrecharge", "CurrPrmAcctBalance");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogLoanPoundage_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cardrecharge", "LoanPoundage");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogNewPOSBalance_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cardrecharge", "NewPOSBalance");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogUserDays_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cardrecharge", "UserDays");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogRechargePenalty_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cardrecharge", "RechargePenalty");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogRechargeTax_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cardrecharge", "RechargeTax");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogCardPinNumber_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cardrecharge", "CardPinNumber");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogOldPOSBalance_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cardrecharge", "OldPOSBalance");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogBalanceValidityPeriod_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cardrecharge", "BalanceValidityPeriod");
    private final static QName _VoucherRechargeEnquiryResultRechargeLogLoanAmount_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cardrecharge", "LoanAmount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huawei.bme.cbsinterface.cardrecharge
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VoucherRechargeResult }
     * 
     */
    public VoucherRechargeResult createVoucherRechargeResult() {
        return new VoucherRechargeResult();
    }

    /**
     * Create an instance of {@link VoucherRechargeEnquiryResult }
     * 
     */
    public VoucherRechargeEnquiryResult createVoucherRechargeEnquiryResult() {
        return new VoucherRechargeEnquiryResult();
    }

    /**
     * Create an instance of {@link VoucherRechargeEnquiryResult.RechargeLog }
     * 
     */
    public VoucherRechargeEnquiryResult.RechargeLog createVoucherRechargeEnquiryResultRechargeLog() {
        return new VoucherRechargeEnquiryResult.RechargeLog();
    }

    /**
     * Create an instance of {@link VoucherRechargeBySeqResult }
     * 
     */
    public VoucherRechargeBySeqResult createVoucherRechargeBySeqResult() {
        return new VoucherRechargeBySeqResult();
    }

    /**
     * Create an instance of {@link VoucherRechargeEnquiryRequest }
     * 
     */
    public VoucherRechargeEnquiryRequest createVoucherRechargeEnquiryRequest() {
        return new VoucherRechargeEnquiryRequest();
    }

    /**
     * Create an instance of {@link VoucherEnquiryBySeqRequest }
     * 
     */
    public VoucherEnquiryBySeqRequest createVoucherEnquiryBySeqRequest() {
        return new VoucherEnquiryBySeqRequest();
    }

    /**
     * Create an instance of {@link BatchDeleteRechageBlackRequest }
     * 
     */
    public BatchDeleteRechageBlackRequest createBatchDeleteRechageBlackRequest() {
        return new BatchDeleteRechageBlackRequest();
    }

    /**
     * Create an instance of {@link VoucherEnquiryByPINResult }
     * 
     */
    public VoucherEnquiryByPINResult createVoucherEnquiryByPINResult() {
        return new VoucherEnquiryByPINResult();
    }

    /**
     * Create an instance of {@link VoucherRechargeRequest }
     * 
     */
    public VoucherRechargeRequest createVoucherRechargeRequest() {
        return new VoucherRechargeRequest();
    }

    /**
     * Create an instance of {@link VoucherRechargeBySeqRequest }
     * 
     */
    public VoucherRechargeBySeqRequest createVoucherRechargeBySeqRequest() {
        return new VoucherRechargeBySeqRequest();
    }

    /**
     * Create an instance of {@link QueryRechgBlackInfoResult }
     * 
     */
    public QueryRechgBlackInfoResult createQueryRechgBlackInfoResult() {
        return new QueryRechgBlackInfoResult();
    }

    /**
     * Create an instance of {@link QueryRechgBlackInfoRequest }
     * 
     */
    public QueryRechgBlackInfoRequest createQueryRechgBlackInfoRequest() {
        return new QueryRechgBlackInfoRequest();
    }

    /**
     * Create an instance of {@link ModifyVoucherStateRequest }
     * 
     */
    public ModifyVoucherStateRequest createModifyVoucherStateRequest() {
        return new ModifyVoucherStateRequest();
    }

    /**
     * Create an instance of {@link VoucherEnquiryByPINRequest }
     * 
     */
    public VoucherEnquiryByPINRequest createVoucherEnquiryByPINRequest() {
        return new VoucherEnquiryByPINRequest();
    }

    /**
     * Create an instance of {@link VoucherEnquiryBySeqResult }
     * 
     */
    public VoucherEnquiryBySeqResult createVoucherEnquiryBySeqResult() {
        return new VoucherEnquiryBySeqResult();
    }

    /**
     * Create an instance of {@link DeleteRechageBlackRequest }
     * 
     */
    public DeleteRechageBlackRequest createDeleteRechageBlackRequest() {
        return new DeleteRechageBlackRequest();
    }

    /**
     * Create an instance of {@link AddRechageBlackRequest }
     * 
     */
    public AddRechageBlackRequest createAddRechageBlackRequest() {
        return new AddRechageBlackRequest();
    }

    /**
     * Create an instance of {@link VoucherRechargeResult.RechargeBonus }
     * 
     */
    public VoucherRechargeResult.RechargeBonus createVoucherRechargeResultRechargeBonus() {
        return new VoucherRechargeResult.RechargeBonus();
    }

    /**
     * Create an instance of {@link VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus }
     * 
     */
    public VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus createVoucherRechargeEnquiryResultRechargeLogRechargeBonus() {
        return new VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus();
    }

    /**
     * Create an instance of {@link VoucherRechargeBySeqResult.RechargeBonus }
     * 
     */
    public VoucherRechargeBySeqResult.RechargeBonus createVoucherRechargeBySeqResultRechargeBonus() {
        return new VoucherRechargeBySeqResult.RechargeBonus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", name = "CurrPrmAcctBalance", scope = VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus.class)
    public JAXBElement<Long> createVoucherRechargeEnquiryResultRechargeLogRechargeBonusCurrPrmAcctBalance(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogRechargeBonusCurrPrmAcctBalance_QNAME, Long.class, VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", name = "LoanPoundage", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Long> createVoucherRechargeEnquiryResultRechargeLogLoanPoundage(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogLoanPoundage_QNAME, Long.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", name = "NewPOSBalance", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Long> createVoucherRechargeEnquiryResultRechargeLogNewPOSBalance(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogNewPOSBalance_QNAME, Long.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", name = "UserDays", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Integer> createVoucherRechargeEnquiryResultRechargeLogUserDays(Integer value) {
        return new JAXBElement<Integer>(_VoucherRechargeEnquiryResultRechargeLogUserDays_QNAME, Integer.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", name = "RechargePenalty", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Long> createVoucherRechargeEnquiryResultRechargeLogRechargePenalty(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogRechargePenalty_QNAME, Long.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", name = "RechargeTax", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Long> createVoucherRechargeEnquiryResultRechargeLogRechargeTax(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogRechargeTax_QNAME, Long.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", name = "CardPinNumber", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<String> createVoucherRechargeEnquiryResultRechargeLogCardPinNumber(String value) {
        return new JAXBElement<String>(_VoucherRechargeEnquiryResultRechargeLogCardPinNumber_QNAME, String.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", name = "OldPOSBalance", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Long> createVoucherRechargeEnquiryResultRechargeLogOldPOSBalance(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogOldPOSBalance_QNAME, Long.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", name = "BalanceValidityPeriod", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Integer> createVoucherRechargeEnquiryResultRechargeLogBalanceValidityPeriod(Integer value) {
        return new JAXBElement<Integer>(_VoucherRechargeEnquiryResultRechargeLogBalanceValidityPeriod_QNAME, Integer.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", name = "LoanAmount", scope = VoucherRechargeEnquiryResult.RechargeLog.class)
    public JAXBElement<Long> createVoucherRechargeEnquiryResultRechargeLogLoanAmount(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogLoanAmount_QNAME, Long.class, VoucherRechargeEnquiryResult.RechargeLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", name = "LoanPoundage", scope = VoucherRechargeResult.class)
    public JAXBElement<Long> createVoucherRechargeResultLoanPoundage(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogLoanPoundage_QNAME, Long.class, VoucherRechargeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", name = "UserDays", scope = VoucherRechargeResult.class)
    public JAXBElement<Integer> createVoucherRechargeResultUserDays(Integer value) {
        return new JAXBElement<Integer>(_VoucherRechargeEnquiryResultRechargeLogUserDays_QNAME, Integer.class, VoucherRechargeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", name = "BalanceValidityPeriod", scope = VoucherRechargeResult.class)
    public JAXBElement<Integer> createVoucherRechargeResultBalanceValidityPeriod(Integer value) {
        return new JAXBElement<Integer>(_VoucherRechargeEnquiryResultRechargeLogBalanceValidityPeriod_QNAME, Integer.class, VoucherRechargeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cardrecharge", name = "LoanAmount", scope = VoucherRechargeResult.class)
    public JAXBElement<Long> createVoucherRechargeResultLoanAmount(Long value) {
        return new JAXBElement<Long>(_VoucherRechargeEnquiryResultRechargeLogLoanAmount_QNAME, Long.class, VoucherRechargeResult.class, value);
    }

}
