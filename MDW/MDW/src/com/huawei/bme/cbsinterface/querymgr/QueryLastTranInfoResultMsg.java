
package com.huawei.bme.cbsinterface.querymgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.ResultHeader;
import com.huawei.bme.cbsinterface.query.QueryLastTranInfoResult;


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
 *         &lt;element name="ResultHeader" type="{http://www.huawei.com/bme/cbsinterface/common}ResultHeader"/>
 *         &lt;element name="QueryLastTranInfoResult" type="{http://www.huawei.com/bme/cbsinterface/query}QueryLastTranInfoResult"/>
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
    "resultHeader",
    "queryLastTranInfoResult"
})
@XmlRootElement(name = "QueryLastTranInfoResultMsg")
public class QueryLastTranInfoResultMsg {

    @XmlElement(name = "ResultHeader", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "QueryLastTranInfoResult", required = true)
    protected QueryLastTranInfoResult queryLastTranInfoResult;

    /**
     * Gets the value of the resultHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResultHeader }
     *     
     */
    public ResultHeader getResultHeader() {
        return resultHeader;
    }

    /**
     * Sets the value of the resultHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultHeader }
     *     
     */
    public void setResultHeader(ResultHeader value) {
        this.resultHeader = value;
    }

    /**
     * Gets the value of the queryLastTranInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryLastTranInfoResult }
     *     
     */
    public QueryLastTranInfoResult getQueryLastTranInfoResult() {
        return queryLastTranInfoResult;
    }

    /**
     * Sets the value of the queryLastTranInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryLastTranInfoResult }
     *     
     */
    public void setQueryLastTranInfoResult(QueryLastTranInfoResult value) {
        this.queryLastTranInfoResult = value;
    }

}
