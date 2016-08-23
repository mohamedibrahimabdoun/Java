
package com.huawei.bme.cbsinterface.acctcredit;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huawei.bme.cbsinterface.acctcredit package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huawei.bme.cbsinterface.acctcredit
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryAcctCreditResult }
     * 
     */
    public QueryAcctCreditResult createQueryAcctCreditResult() {
        return new QueryAcctCreditResult();
    }

    /**
     * Create an instance of {@link QueryAcctCreditRequest }
     * 
     */
    public QueryAcctCreditRequest createQueryAcctCreditRequest() {
        return new QueryAcctCreditRequest();
    }

    /**
     * Create an instance of {@link CreditType }
     * 
     */
    public CreditType createCreditType() {
        return new CreditType();
    }

    /**
     * Create an instance of {@link ManAcctCreditRequest }
     * 
     */
    public ManAcctCreditRequest createManAcctCreditRequest() {
        return new ManAcctCreditRequest();
    }

}
