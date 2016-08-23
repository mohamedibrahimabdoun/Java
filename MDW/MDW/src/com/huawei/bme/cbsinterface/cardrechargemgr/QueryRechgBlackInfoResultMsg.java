
package com.huawei.bme.cbsinterface.cardrechargemgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.cardrecharge.QueryRechgBlackInfoResult;
import com.huawei.bme.cbsinterface.common.ResultHeader;


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
 *         &lt;element name="QueryRechgBlackInfoResult" type="{http://www.huawei.com/bme/cbsinterface/cardrecharge}QueryRechgBlackInfoResult"/>
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
    "queryRechgBlackInfoResult"
})
@XmlRootElement(name = "QueryRechgBlackInfoResultMsg")
public class QueryRechgBlackInfoResultMsg {

    @XmlElement(name = "ResultHeader", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "QueryRechgBlackInfoResult", required = true)
    protected QueryRechgBlackInfoResult queryRechgBlackInfoResult;

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
     * Gets the value of the queryRechgBlackInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryRechgBlackInfoResult }
     *     
     */
    public QueryRechgBlackInfoResult getQueryRechgBlackInfoResult() {
        return queryRechgBlackInfoResult;
    }

    /**
     * Sets the value of the queryRechgBlackInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRechgBlackInfoResult }
     *     
     */
    public void setQueryRechgBlackInfoResult(QueryRechgBlackInfoResult value) {
        this.queryRechgBlackInfoResult = value;
    }

}
