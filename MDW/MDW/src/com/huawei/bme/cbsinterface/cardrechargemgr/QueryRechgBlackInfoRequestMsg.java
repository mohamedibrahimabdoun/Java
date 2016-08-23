
package com.huawei.bme.cbsinterface.cardrechargemgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.cardrecharge.QueryRechgBlackInfoRequest;
import com.huawei.bme.cbsinterface.common.RequestHeader;


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
 *         &lt;element name="QueryRechgBlackInfoRequest" type="{http://www.huawei.com/bme/cbsinterface/cardrecharge}QueryRechgBlackInfoRequest"/>
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
    "queryRechgBlackInfoRequest"
})
@XmlRootElement(name = "QueryRechgBlackInfoRequestMsg")
public class QueryRechgBlackInfoRequestMsg {

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "QueryRechgBlackInfoRequest", required = true)
    protected QueryRechgBlackInfoRequest queryRechgBlackInfoRequest;

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
     * Gets the value of the queryRechgBlackInfoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link QueryRechgBlackInfoRequest }
     *     
     */
    public QueryRechgBlackInfoRequest getQueryRechgBlackInfoRequest() {
        return queryRechgBlackInfoRequest;
    }

    /**
     * Sets the value of the queryRechgBlackInfoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRechgBlackInfoRequest }
     *     
     */
    public void setQueryRechgBlackInfoRequest(QueryRechgBlackInfoRequest value) {
        this.queryRechgBlackInfoRequest = value;
    }

}
