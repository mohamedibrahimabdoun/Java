
package com.huawei.bme.cbsinterface.querymgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.common.ResultHeader;
import com.huawei.bme.cbsinterface.query.QuerySubCosIDResult;


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
 *         &lt;element name="QuerySubCosIDResult" type="{http://www.huawei.com/bme/cbsinterface/query}QuerySubCosIDResult"/>
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
    "querySubCosIDResult"
})
@XmlRootElement(name = "QuerySubCosIDResultMsg")
public class QuerySubCosIDResultMsg {

    @XmlElement(name = "ResultHeader", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "QuerySubCosIDResult", required = true)
    protected QuerySubCosIDResult querySubCosIDResult;

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
     * Gets the value of the querySubCosIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySubCosIDResult }
     *     
     */
    public QuerySubCosIDResult getQuerySubCosIDResult() {
        return querySubCosIDResult;
    }

    /**
     * Sets the value of the querySubCosIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySubCosIDResult }
     *     
     */
    public void setQuerySubCosIDResult(QuerySubCosIDResult value) {
        this.querySubCosIDResult = value;
    }

}
