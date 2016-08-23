
package com.huawei.bme.cbsinterface.querymgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.RequestHeader;
import com.huawei.bme.cbsinterface.query.QueryBalanceRequest;


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
 *         &lt;element name="QueryBalanceRequest" type="{http://www.huawei.com/bme/cbsinterface/query}QueryBalanceRequest"/>
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
    "queryBalanceRequest"
})
@XmlRootElement(name = "QueryBalanceRequestMsg")
public class QueryBalanceRequestMsg {

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "QueryBalanceRequest", required = true)
    protected QueryBalanceRequest queryBalanceRequest;

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
     * Gets the value of the queryBalanceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link QueryBalanceRequest }
     *     
     */
    public QueryBalanceRequest getQueryBalanceRequest() {
        return queryBalanceRequest;
    }

    /**
     * Sets the value of the queryBalanceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryBalanceRequest }
     *     
     */
    public void setQueryBalanceRequest(QueryBalanceRequest value) {
        this.queryBalanceRequest = value;
    }

}
