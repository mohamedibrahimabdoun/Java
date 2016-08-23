
package com.huawei.bme.cbsinterface.querymgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.RequestHeader;
import com.huawei.bme.cbsinterface.query.QueryLastTranInfoRequest;


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
 *         &lt;element name="QueryLastTranInfoRequest" type="{http://www.huawei.com/bme/cbsinterface/query}QueryLastTranInfoRequest"/>
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
    "queryLastTranInfoRequest"
})
@XmlRootElement(name = "QueryLastTranInfoRequestMsg")
public class QueryLastTranInfoRequestMsg {

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "QueryLastTranInfoRequest", required = true)
    protected QueryLastTranInfoRequest queryLastTranInfoRequest;

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
     * Gets the value of the queryLastTranInfoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link QueryLastTranInfoRequest }
     *     
     */
    public QueryLastTranInfoRequest getQueryLastTranInfoRequest() {
        return queryLastTranInfoRequest;
    }

    /**
     * Sets the value of the queryLastTranInfoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryLastTranInfoRequest }
     *     
     */
    public void setQueryLastTranInfoRequest(QueryLastTranInfoRequest value) {
        this.queryLastTranInfoRequest = value;
    }

}
