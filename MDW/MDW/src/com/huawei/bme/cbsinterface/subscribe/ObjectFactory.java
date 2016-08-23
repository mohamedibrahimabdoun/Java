
package com.huawei.bme.cbsinterface.subscribe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huawei.bme.cbsinterface.subscribe package. 
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

    private final static QName _FamilyNoInfoSubGroupType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "subGroupType");
    private final static QName _FamilyNoInfoPhoneNoOrder_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "phoneNoOrder");
    private final static QName _CallScreenNoInfoListType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "ListType");
    private final static QName _CallScreenNoInfoIRRouteFlag_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "IRRouteFlag");
    private final static QName _CallScreenNoInfoRoutingMethod_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "RoutingMethod");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huawei.bme.cbsinterface.subscribe
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BindProductSubscriberNoRequest }
     * 
     */
    public BindProductSubscriberNoRequest createBindProductSubscriberNoRequest() {
        return new BindProductSubscriberNoRequest();
    }

    /**
     * Create an instance of {@link BatchUnSubscribeRequest }
     * 
     */
    public BatchUnSubscribeRequest createBatchUnSubscribeRequest() {
        return new BatchUnSubscribeRequest();
    }

    /**
     * Create an instance of {@link BatchSubscribeRequest }
     * 
     */
    public BatchSubscribeRequest createBatchSubscribeRequest() {
        return new BatchSubscribeRequest();
    }

    /**
     * Create an instance of {@link BatchSubscribeRequest.OptionalOffer }
     * 
     */
    public BatchSubscribeRequest.OptionalOffer createBatchSubscribeRequestOptionalOffer() {
        return new BatchSubscribeRequest.OptionalOffer();
    }

    /**
     * Create an instance of {@link BundleSubscriber }
     * 
     */
    public BundleSubscriber createBundleSubscriber() {
        return new BundleSubscriber();
    }

    /**
     * Create an instance of {@link ChangeAccountOfferRequest }
     * 
     */
    public ChangeAccountOfferRequest createChangeAccountOfferRequest() {
        return new ChangeAccountOfferRequest();
    }

    /**
     * Create an instance of {@link ChangeAccountOfferRequest.Offering }
     * 
     */
    public ChangeAccountOfferRequest.Offering createChangeAccountOfferRequestOffering() {
        return new ChangeAccountOfferRequest.Offering();
    }

    /**
     * Create an instance of {@link ChangeOptionalOfferRequest }
     * 
     */
    public ChangeOptionalOfferRequest createChangeOptionalOfferRequest() {
        return new ChangeOptionalOfferRequest();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link Service.Property }
     * 
     */
    public Service.Property createServiceProperty() {
        return new Service.Property();
    }

    /**
     * Create an instance of {@link ChangeOptionalOfferExtRequest }
     * 
     */
    public ChangeOptionalOfferExtRequest createChangeOptionalOfferExtRequest() {
        return new ChangeOptionalOfferExtRequest();
    }

    /**
     * Create an instance of {@link ChangeOptionalOfferExtRequest.OptionalOffer }
     * 
     */
    public ChangeOptionalOfferExtRequest.OptionalOffer createChangeOptionalOfferExtRequestOptionalOffer() {
        return new ChangeOptionalOfferExtRequest.OptionalOffer();
    }

    /**
     * Create an instance of {@link OptionalOfferOrder }
     * 
     */
    public OptionalOfferOrder createOptionalOfferOrder() {
        return new OptionalOfferOrder();
    }

    /**
     * Create an instance of {@link HomeZone }
     * 
     */
    public HomeZone createHomeZone() {
        return new HomeZone();
    }

    /**
     * Create an instance of {@link OfferOrderInfo }
     * 
     */
    public OfferOrderInfo createOfferOrderInfo() {
        return new OfferOrderInfo();
    }

    /**
     * Create an instance of {@link com.huawei.bme.cbsinterface.subscribe.Product }
     * 
     */
    public com.huawei.bme.cbsinterface.subscribe.Product createProduct() {
        return new com.huawei.bme.cbsinterface.subscribe.Product();
    }

    /**
     * Create an instance of {@link ChangeOptionalOfferExtResult }
     * 
     */
    public ChangeOptionalOfferExtResult createChangeOptionalOfferExtResult() {
        return new ChangeOptionalOfferExtResult();
    }

    /**
     * Create an instance of {@link ExpireMode }
     * 
     */
    public ExpireMode createExpireMode() {
        return new ExpireMode();
    }

    /**
     * Create an instance of {@link FamilyNoInfo }
     * 
     */
    public FamilyNoInfo createFamilyNoInfo() {
        return new FamilyNoInfo();
    }

    /**
     * Create an instance of {@link ChangeAccountOfferResult }
     * 
     */
    public ChangeAccountOfferResult createChangeAccountOfferResult() {
        return new ChangeAccountOfferResult();
    }

    /**
     * Create an instance of {@link HomeZoneInfo }
     * 
     */
    public HomeZoneInfo createHomeZoneInfo() {
        return new HomeZoneInfo();
    }

    /**
     * Create an instance of {@link ChangeOptionalOfferResult }
     * 
     */
    public ChangeOptionalOfferResult createChangeOptionalOfferResult() {
        return new ChangeOptionalOfferResult();
    }

    /**
     * Create an instance of {@link CallScreen }
     * 
     */
    public CallScreen createCallScreen() {
        return new CallScreen();
    }

    /**
     * Create an instance of {@link CallScreenNoInfo }
     * 
     */
    public CallScreenNoInfo createCallScreenNoInfo() {
        return new CallScreenNoInfo();
    }

    /**
     * Create an instance of {@link EffectMode }
     * 
     */
    public EffectMode createEffectMode() {
        return new EffectMode();
    }

    /**
     * Create an instance of {@link OfferOrder }
     * 
     */
    public OfferOrder createOfferOrder() {
        return new OfferOrder();
    }

    /**
     * Create an instance of {@link BindProductSubscriberNoRequest.BindSubNumber }
     * 
     */
    public BindProductSubscriberNoRequest.BindSubNumber createBindProductSubscriberNoRequestBindSubNumber() {
        return new BindProductSubscriberNoRequest.BindSubNumber();
    }

    /**
     * Create an instance of {@link BatchUnSubscribeRequest.OptionalOffer }
     * 
     */
    public BatchUnSubscribeRequest.OptionalOffer createBatchUnSubscribeRequestOptionalOffer() {
        return new BatchUnSubscribeRequest.OptionalOffer();
    }

    /**
     * Create an instance of {@link BatchSubscribeRequest.OptionalOffer.Product }
     * 
     */
    public BatchSubscribeRequest.OptionalOffer.Product createBatchSubscribeRequestOptionalOfferProduct() {
        return new BatchSubscribeRequest.OptionalOffer.Product();
    }

    /**
     * Create an instance of {@link BundleSubscriber.Product }
     * 
     */
    public BundleSubscriber.Product createBundleSubscriberProduct() {
        return new BundleSubscriber.Product();
    }

    /**
     * Create an instance of {@link ChangeAccountOfferRequest.Offering.Product }
     * 
     */
    public ChangeAccountOfferRequest.Offering.Product createChangeAccountOfferRequestOfferingProduct() {
        return new ChangeAccountOfferRequest.Offering.Product();
    }

    /**
     * Create an instance of {@link ChangeOptionalOfferRequest.OptionalOffer }
     * 
     */
    public ChangeOptionalOfferRequest.OptionalOffer createChangeOptionalOfferRequestOptionalOffer() {
        return new ChangeOptionalOfferRequest.OptionalOffer();
    }

    /**
     * Create an instance of {@link Service.Property.FamilyNo }
     * 
     */
    public Service.Property.FamilyNo createServicePropertyFamilyNo() {
        return new Service.Property.FamilyNo();
    }

    /**
     * Create an instance of {@link Service.Property.SimploProperties }
     * 
     */
    public Service.Property.SimploProperties createServicePropertySimploProperties() {
        return new Service.Property.SimploProperties();
    }

    /**
     * Create an instance of {@link ChangeOptionalOfferExtRequest.OptionalOffer.Product }
     * 
     */
    public ChangeOptionalOfferExtRequest.OptionalOffer.Product createChangeOptionalOfferExtRequestOptionalOfferProduct() {
        return new ChangeOptionalOfferExtRequest.OptionalOffer.Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "subGroupType", scope = FamilyNoInfo.class)
    public JAXBElement<Integer> createFamilyNoInfoSubGroupType(Integer value) {
        return new JAXBElement<Integer>(_FamilyNoInfoSubGroupType_QNAME, Integer.class, FamilyNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "phoneNoOrder", scope = FamilyNoInfo.class)
    public JAXBElement<Integer> createFamilyNoInfoPhoneNoOrder(Integer value) {
        return new JAXBElement<Integer>(_FamilyNoInfoPhoneNoOrder_QNAME, Integer.class, FamilyNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "ListType", scope = CallScreenNoInfo.class)
    public JAXBElement<Integer> createCallScreenNoInfoListType(Integer value) {
        return new JAXBElement<Integer>(_CallScreenNoInfoListType_QNAME, Integer.class, CallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "IRRouteFlag", scope = CallScreenNoInfo.class)
    public JAXBElement<Integer> createCallScreenNoInfoIRRouteFlag(Integer value) {
        return new JAXBElement<Integer>(_CallScreenNoInfoIRRouteFlag_QNAME, Integer.class, CallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "RoutingMethod", scope = CallScreenNoInfo.class)
    public JAXBElement<Integer> createCallScreenNoInfoRoutingMethod(Integer value) {
        return new JAXBElement<Integer>(_CallScreenNoInfoRoutingMethod_QNAME, Integer.class, CallScreenNoInfo.class, value);
    }

}
