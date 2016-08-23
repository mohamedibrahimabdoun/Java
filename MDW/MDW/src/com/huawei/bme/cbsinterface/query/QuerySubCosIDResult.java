
package com.huawei.bme.cbsinterface.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySubCosIDResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySubCosIDResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subcosid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySubCosIDResult", propOrder = {
    "subcosid"
})
public class QuerySubCosIDResult {

    protected int subcosid;

    /**
     * Gets the value of the subcosid property.
     * 
     */
    public int getSubcosid() {
        return subcosid;
    }

    /**
     * Sets the value of the subcosid property.
     * 
     */
    public void setSubcosid(int value) {
        this.subcosid = value;
    }

}
