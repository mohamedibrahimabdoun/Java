
package com.huawei.bme.cbsinterface.acctcredit;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAcctCreditResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAcctCreditResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InitialCredit" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillCycleCredit" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TempCreditList" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAcctCreditResult", propOrder = {
    "initialCredit",
    "billCycleCredit",
    "tempCreditList"
})
public class QueryAcctCreditResult {

    @XmlElement(name = "InitialCredit")
    protected List<CreditType> initialCredit;
    @XmlElement(name = "BillCycleCredit")
    protected List<CreditType> billCycleCredit;
    @XmlElement(name = "TempCreditList")
    protected List<CreditType> tempCreditList;

    /**
     * Gets the value of the initialCredit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initialCredit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitialCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditType }
     * 
     * 
     */
    public List<CreditType> getInitialCredit() {
        if (initialCredit == null) {
            initialCredit = new ArrayList<CreditType>();
        }
        return this.initialCredit;
    }

    /**
     * Gets the value of the billCycleCredit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billCycleCredit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillCycleCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditType }
     * 
     * 
     */
    public List<CreditType> getBillCycleCredit() {
        if (billCycleCredit == null) {
            billCycleCredit = new ArrayList<CreditType>();
        }
        return this.billCycleCredit;
    }

    /**
     * Gets the value of the tempCreditList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tempCreditList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTempCreditList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditType }
     * 
     * 
     */
    public List<CreditType> getTempCreditList() {
        if (tempCreditList == null) {
            tempCreditList = new ArrayList<CreditType>();
        }
        return this.tempCreditList;
    }

}
