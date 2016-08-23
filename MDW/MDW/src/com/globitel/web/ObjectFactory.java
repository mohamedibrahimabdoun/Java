
package com.globitel.web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.globitel.web package. 
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

    private final static QName _DisableCampaign_QNAME = new QName("http://web.globitel.com/", "disableCampaign");
    private final static QName _CreateCampaignResponse_QNAME = new QName("http://web.globitel.com/", "createCampaignResponse");
    private final static QName _EnableCampaignResponse_QNAME = new QName("http://web.globitel.com/", "enableCampaignResponse");
    private final static QName _EnableCampaign_QNAME = new QName("http://web.globitel.com/", "enableCampaign");
    private final static QName _DeleteCampaignResponse_QNAME = new QName("http://web.globitel.com/", "deleteCampaignResponse");
    private final static QName _AddMSISDN_QNAME = new QName("http://web.globitel.com/", "addMSISDN");
    private final static QName _AddMSISDNResponse_QNAME = new QName("http://web.globitel.com/", "addMSISDNResponse");
    private final static QName _CreateCampaign_QNAME = new QName("http://web.globitel.com/", "createCampaign");
    private final static QName _DeleteCampaign_QNAME = new QName("http://web.globitel.com/", "deleteCampaign");
    private final static QName _DisableCampaignResponse_QNAME = new QName("http://web.globitel.com/", "disableCampaignResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.globitel.web
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnableCampaign }
     * 
     */
    public EnableCampaign createEnableCampaign() {
        return new EnableCampaign();
    }

    /**
     * Create an instance of {@link EnableCampaignResponse }
     * 
     */
    public EnableCampaignResponse createEnableCampaignResponse() {
        return new EnableCampaignResponse();
    }

    /**
     * Create an instance of {@link CreateCampaignResponse }
     * 
     */
    public CreateCampaignResponse createCreateCampaignResponse() {
        return new CreateCampaignResponse();
    }

    /**
     * Create an instance of {@link DisableCampaign }
     * 
     */
    public DisableCampaign createDisableCampaign() {
        return new DisableCampaign();
    }

    /**
     * Create an instance of {@link AddMSISDN }
     * 
     */
    public AddMSISDN createAddMSISDN() {
        return new AddMSISDN();
    }

    /**
     * Create an instance of {@link DeleteCampaignResponse }
     * 
     */
    public DeleteCampaignResponse createDeleteCampaignResponse() {
        return new DeleteCampaignResponse();
    }

    /**
     * Create an instance of {@link DisableCampaignResponse }
     * 
     */
    public DisableCampaignResponse createDisableCampaignResponse() {
        return new DisableCampaignResponse();
    }

    /**
     * Create an instance of {@link DeleteCampaign }
     * 
     */
    public DeleteCampaign createDeleteCampaign() {
        return new DeleteCampaign();
    }

    /**
     * Create an instance of {@link CreateCampaign }
     * 
     */
    public CreateCampaign createCreateCampaign() {
        return new CreateCampaign();
    }

    /**
     * Create an instance of {@link AddMSISDNResponse }
     * 
     */
    public AddMSISDNResponse createAddMSISDNResponse() {
        return new AddMSISDNResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisableCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.globitel.com/", name = "disableCampaign")
    public JAXBElement<DisableCampaign> createDisableCampaign(DisableCampaign value) {
        return new JAXBElement<DisableCampaign>(_DisableCampaign_QNAME, DisableCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.globitel.com/", name = "createCampaignResponse")
    public JAXBElement<CreateCampaignResponse> createCreateCampaignResponse(CreateCampaignResponse value) {
        return new JAXBElement<CreateCampaignResponse>(_CreateCampaignResponse_QNAME, CreateCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnableCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.globitel.com/", name = "enableCampaignResponse")
    public JAXBElement<EnableCampaignResponse> createEnableCampaignResponse(EnableCampaignResponse value) {
        return new JAXBElement<EnableCampaignResponse>(_EnableCampaignResponse_QNAME, EnableCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnableCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.globitel.com/", name = "enableCampaign")
    public JAXBElement<EnableCampaign> createEnableCampaign(EnableCampaign value) {
        return new JAXBElement<EnableCampaign>(_EnableCampaign_QNAME, EnableCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.globitel.com/", name = "deleteCampaignResponse")
    public JAXBElement<DeleteCampaignResponse> createDeleteCampaignResponse(DeleteCampaignResponse value) {
        return new JAXBElement<DeleteCampaignResponse>(_DeleteCampaignResponse_QNAME, DeleteCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMSISDN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.globitel.com/", name = "addMSISDN")
    public JAXBElement<AddMSISDN> createAddMSISDN(AddMSISDN value) {
        return new JAXBElement<AddMSISDN>(_AddMSISDN_QNAME, AddMSISDN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMSISDNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.globitel.com/", name = "addMSISDNResponse")
    public JAXBElement<AddMSISDNResponse> createAddMSISDNResponse(AddMSISDNResponse value) {
        return new JAXBElement<AddMSISDNResponse>(_AddMSISDNResponse_QNAME, AddMSISDNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.globitel.com/", name = "createCampaign")
    public JAXBElement<CreateCampaign> createCreateCampaign(CreateCampaign value) {
        return new JAXBElement<CreateCampaign>(_CreateCampaign_QNAME, CreateCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.globitel.com/", name = "deleteCampaign")
    public JAXBElement<DeleteCampaign> createDeleteCampaign(DeleteCampaign value) {
        return new JAXBElement<DeleteCampaign>(_DeleteCampaign_QNAME, DeleteCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisableCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.globitel.com/", name = "disableCampaignResponse")
    public JAXBElement<DisableCampaignResponse> createDisableCampaignResponse(DisableCampaignResponse value) {
        return new JAXBElement<DisableCampaignResponse>(_DisableCampaignResponse_QNAME, DisableCampaignResponse.class, null, value);
    }

}
