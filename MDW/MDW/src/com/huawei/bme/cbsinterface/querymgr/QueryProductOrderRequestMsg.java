
package com.huawei.bme.cbsinterface.querymgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.RequestHeader;
import com.huawei.bme.cbsinterface.query.QueryProductOrderRequest;


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
 *         &lt;element name="RequestHeader" type="{http://www.huawei.com/bme/cbsinterface/common}RequestHeader"/>
 *         &lt;element name="QueryProductOrderRequest" type="{http://www.huawei.com/bme/cbsinterface/query}QueryProductOrderRequest"/>
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
    "requestHeader",
    "queryProductOrderRequest"
})
@XmlRootElement(name = "QueryProductOrderRequestMsg")
public class QueryProductOrderRequestMsg {

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "QueryProductOrderRequest", required = true)
    protected QueryProductOrderRequest queryProductOrderRequest;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
    }

    /**
     * Gets the value of the queryProductOrderRequest property.
     * 
     * @return
     *     possible object is
     *     {@link QueryProductOrderRequest }
     *     
     */
    public QueryProductOrderRequest getQueryProductOrderRequest() {
        return queryProductOrderRequest;
    }

    /**
     * Sets the value of the queryProductOrderRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryProductOrderRequest }
     *     
     */
    public void setQueryProductOrderRequest(QueryProductOrderRequest value) {
        this.queryProductOrderRequest = value;
    }

}
