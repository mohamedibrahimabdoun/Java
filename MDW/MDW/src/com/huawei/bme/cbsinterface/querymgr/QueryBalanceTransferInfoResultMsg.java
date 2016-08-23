
package com.huawei.bme.cbsinterface.querymgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.ResultHeader;
import com.huawei.bme.cbsinterface.query.QueryBalanceTransferInfoResult;


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
 *         &lt;element name="QueryBalanceTransferInfoResult" type="{http://www.huawei.com/bme/cbsinterface/query}QueryBalanceTransferInfoResult"/>
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
    "queryBalanceTransferInfoResult"
})
@XmlRootElement(name = "QueryBalanceTransferInfoResultMsg")
public class QueryBalanceTransferInfoResultMsg {

    @XmlElement(name = "ResultHeader", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "QueryBalanceTransferInfoResult", required = true)
    protected QueryBalanceTransferInfoResult queryBalanceTransferInfoResult;

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
     * Gets the value of the queryBalanceTransferInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryBalanceTransferInfoResult }
     *     
     */
    public QueryBalanceTransferInfoResult getQueryBalanceTransferInfoResult() {
        return queryBalanceTransferInfoResult;
    }

    /**
     * Sets the value of the queryBalanceTransferInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryBalanceTransferInfoResult }
     *     
     */
    public void setQueryBalanceTransferInfoResult(QueryBalanceTransferInfoResult value) {
        this.queryBalanceTransferInfoResult = value;
    }

}
