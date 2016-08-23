package sd.mtn.Billing;

import java.io.Serializable;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries( { @NamedQuery(name = "CrmUserEquipments.findbysubno",
                             query = "select o from CrmUserEquipments o where o.subno=:v_subno") })
@Table(name = "CRM_USER_EQUIPMENTS")
public class CrmUserEquipments implements Serializable {

    //   ,@NamedQuery(name = "CrmUserEquipments.findAll", query = "select o from CrmUserEquipments o ")

    @Column(length = 4)
    private String action;
    @Column(name = "ADD_DEPOSIT")
    private Long addDeposit;
    @Id
    @Column(nullable = false, length = 4)
    private String area;
    private Timestamp billedfrom;
    private Timestamp billedto;
    private Timestamp changed;
    @Id
    @Column(nullable = false, length = 10)
    private String contrno;
    @Id
    @Column(nullable = false, length = 10)
    private String equipid;
    @Column(length = 4)
    private String extn;
    @Column(name = "EX_DEPOSIT")
    private Double exDeposit;
    @Column(name = "FLEX_FLD1", length = 256)
    private String flexFld1;
    @Column(name = "FLEX_FLD2", length = 256)
    private String flexFld2;
    @Column(name = "FLEX_FLD3", length = 256)
    private String flexFld3;
    @Column(name = "FLEX_FLD4", length = 256)
    private String flexFld4;
    @Column(name = "FLEX_FLD5", length = 256)
    private String flexFld5;
    @Column(name = "FRST_INST_AMOUNT")
    private Long frstInstAmount;
    @Column(name = "FRST_PAYM_AMOUNT")
    private Double frstPaymAmount;
    @Column(name = "FRST_PAYM_PERC")
    private Long frstPaymPerc;
    @Column(name = "INET_SERIALNO")
    private Long inetSerialno;
    @Column(length = 40)
    private String info;
    private Long instfee;
    @Column(name = "LAST_BILL_DATE", length = 240)
    private String lastBillDate;
    private Long movefee;
    @Column(name = "NO_OF_INSTLMNTS")
    private Long noOfInstlmnts;
    private Long ordqty;
    @Column(name = "PARENT_EQUIPID", length = 10)
    private String parentEquipid;
    private Long quantity;
    private Long rental;
    private Long seqno;
    @Column(length = 4)
    private String serordno;
    @Column(length = 4)
    private String status;
    @Column(name = "STATUS_DATE")
    private Timestamp statusDate;
    @Column(name = "STATUS_LOGNAME", length = 10)
    private String statusLogname;
    @Column(name = "STATUS_PROG", length = 10)
    private String statusProg;
    @Id
    @Column(nullable = false, length = 20)
    private String subno;
    @Column(name = "SUBSCR_TYPE", nullable = false, length = 1)
    private String subscrType;
    @Column(name = "SUBSIDY_END_DATE")
    private Timestamp subsidyEndDate;
    @Column(name = "SUBSIDY_EQUIPID", length = 10)
    private String subsidyEquipid;
    @Column(name = "SUBSIDY_PKG_START_DATE")
    private Timestamp subsidyPkgStartDate;
    @Column(name = "SUBSIDY_START_DATE")
    private Timestamp subsidyStartDate;
    @Column(name = "TARIFF_PROFILE_STEPPED", length = 5)
    private String tariffProfileStepped;
    @Column(name = "USED_QTY")
    private Long usedQty;

    public CrmUserEquipments() {
    }

    public CrmUserEquipments(String action, Long addDeposit, String area,
                             Timestamp billedfrom, Timestamp billedto,
                             Timestamp changed, String contrno, String equipid,
                             Double exDeposit, String extn, String flexFld1,
                             String flexFld2, String flexFld3, String flexFld4,
                             String flexFld5, Long frstInstAmount,
                             Double frstPaymAmount, Long frstPaymPerc,
                             Long inetSerialno, String info, Long instfee,
                             String lastBillDate, Long movefee,
                             Long noOfInstlmnts, Long ordqty,
                             String parentEquipid, Long quantity, Long rental,
                             Long seqno, String serordno, String status,
                             Timestamp statusDate, String statusLogname,
                             String statusProg, String subno,
                             String subscrType, Timestamp subsidyEndDate,
                             String subsidyEquipid,
                             Timestamp subsidyPkgStartDate,
                             Timestamp subsidyStartDate,
                             String tariffProfileStepped, Long usedQty) {
        this.action = action;
        this.addDeposit = addDeposit;
        this.area = area;
        this.billedfrom = billedfrom;
        this.billedto = billedto;
        this.changed = changed;
        this.contrno = contrno;
        this.equipid = equipid;
        this.exDeposit = exDeposit;
        this.extn = extn;
        this.flexFld1 = flexFld1;
        this.flexFld2 = flexFld2;
        this.flexFld3 = flexFld3;
        this.flexFld4 = flexFld4;
        this.flexFld5 = flexFld5;
        this.frstInstAmount = frstInstAmount;
        this.frstPaymAmount = frstPaymAmount;
        this.frstPaymPerc = frstPaymPerc;
        this.inetSerialno = inetSerialno;
        this.info = info;
        this.instfee = instfee;
        this.lastBillDate = lastBillDate;
        this.movefee = movefee;
        this.noOfInstlmnts = noOfInstlmnts;
        this.ordqty = ordqty;
        this.parentEquipid = parentEquipid;
        this.quantity = quantity;
        this.rental = rental;
        this.seqno = seqno;
        this.serordno = serordno;
        this.status = status;
        this.statusDate = statusDate;
        this.statusLogname = statusLogname;
        this.statusProg = statusProg;
        this.subno = subno;
        this.subscrType = subscrType;
        this.subsidyEndDate = subsidyEndDate;
        this.subsidyEquipid = subsidyEquipid;
        this.subsidyPkgStartDate = subsidyPkgStartDate;
        this.subsidyStartDate = subsidyStartDate;
        this.tariffProfileStepped = tariffProfileStepped;
        this.usedQty = usedQty;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Long getAddDeposit() {
        return addDeposit;
    }

    public void setAddDeposit(Long addDeposit) {
        this.addDeposit = addDeposit;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Timestamp getBilledfrom() {
        return billedfrom;
    }

    public void setBilledfrom(Timestamp billedfrom) {
        this.billedfrom = billedfrom;
    }

    public Timestamp getBilledto() {
        return billedto;
    }

    public void setBilledto(Timestamp billedto) {
        this.billedto = billedto;
    }

    public Timestamp getChanged() {
        return changed;
    }

    public void setChanged(Timestamp changed) {
        this.changed = changed;
    }

    public String getContrno() {
        return contrno;
    }

    public void setContrno(String contrno) {
        this.contrno = contrno;
    }

    public String getEquipid() {
        return equipid;
    }

    public void setEquipid(String equipid) {
        this.equipid = equipid;
    }

    public String getExtn() {
        return extn;
    }

    public void setExtn(String extn) {
        this.extn = extn;
    }

    public Double getExDeposit() {
        return exDeposit;
    }

    public void setExDeposit(Double exDeposit) {
        this.exDeposit = exDeposit;
    }

    public String getFlexFld1() {
        return flexFld1;
    }

    public void setFlexFld1(String flexFld1) {
        this.flexFld1 = flexFld1;
    }

    public String getFlexFld2() {
        return flexFld2;
    }

    public void setFlexFld2(String flexFld2) {
        this.flexFld2 = flexFld2;
    }

    public String getFlexFld3() {
        return flexFld3;
    }

    public void setFlexFld3(String flexFld3) {
        this.flexFld3 = flexFld3;
    }

    public String getFlexFld4() {
        return flexFld4;
    }

    public void setFlexFld4(String flexFld4) {
        this.flexFld4 = flexFld4;
    }

    public String getFlexFld5() {
        return flexFld5;
    }

    public void setFlexFld5(String flexFld5) {
        this.flexFld5 = flexFld5;
    }

    public Long getFrstInstAmount() {
        return frstInstAmount;
    }

    public void setFrstInstAmount(Long frstInstAmount) {
        this.frstInstAmount = frstInstAmount;
    }

    public Double getFrstPaymAmount() {
        return frstPaymAmount;
    }

    public void setFrstPaymAmount(Double frstPaymAmount) {
        this.frstPaymAmount = frstPaymAmount;
    }

    public Long getFrstPaymPerc() {
        return frstPaymPerc;
    }

    public void setFrstPaymPerc(Long frstPaymPerc) {
        this.frstPaymPerc = frstPaymPerc;
    }

    public Long getInetSerialno() {
        return inetSerialno;
    }

    public void setInetSerialno(Long inetSerialno) {
        this.inetSerialno = inetSerialno;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Long getInstfee() {
        return instfee;
    }

    public void setInstfee(Long instfee) {
        this.instfee = instfee;
    }

    public String getLastBillDate() {
        return lastBillDate;
    }

    public void setLastBillDate(String lastBillDate) {
        this.lastBillDate = lastBillDate;
    }

    public Long getMovefee() {
        return movefee;
    }

    public void setMovefee(Long movefee) {
        this.movefee = movefee;
    }

    public Long getNoOfInstlmnts() {
        return noOfInstlmnts;
    }

    public void setNoOfInstlmnts(Long noOfInstlmnts) {
        this.noOfInstlmnts = noOfInstlmnts;
    }

    public Long getOrdqty() {
        return ordqty;
    }

    public void setOrdqty(Long ordqty) {
        this.ordqty = ordqty;
    }

    public String getParentEquipid() {
        return parentEquipid;
    }

    public void setParentEquipid(String parentEquipid) {
        this.parentEquipid = parentEquipid;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getRental() {
        return rental;
    }

    public void setRental(Long rental) {
        this.rental = rental;
    }

    public Long getSeqno() {
        return seqno;
    }

    public void setSeqno(Long seqno) {
        this.seqno = seqno;
    }

    public String getSerordno() {
        return serordno;
    }

    public void setSerordno(String serordno) {
        this.serordno = serordno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Timestamp statusDate) {
        this.statusDate = statusDate;
    }

    public String getStatusLogname() {
        return statusLogname;
    }

    public void setStatusLogname(String statusLogname) {
        this.statusLogname = statusLogname;
    }

    public String getStatusProg() {
        return statusProg;
    }

    public void setStatusProg(String statusProg) {
        this.statusProg = statusProg;
    }

    public String getSubno() {
        return subno;
    }

    public void setSubno(String subno) {
        this.subno = subno;
    }

    public String getSubscrType() {
        return subscrType;
    }

    public void setSubscrType(String subscrType) {
        this.subscrType = subscrType;
    }

    public Timestamp getSubsidyEndDate() {
        return subsidyEndDate;
    }

    public void setSubsidyEndDate(Timestamp subsidyEndDate) {
        this.subsidyEndDate = subsidyEndDate;
    }

    public String getSubsidyEquipid() {
        return subsidyEquipid;
    }

    public void setSubsidyEquipid(String subsidyEquipid) {
        this.subsidyEquipid = subsidyEquipid;
    }

    public Timestamp getSubsidyPkgStartDate() {
        return subsidyPkgStartDate;
    }

    public void setSubsidyPkgStartDate(Timestamp subsidyPkgStartDate) {
        this.subsidyPkgStartDate = subsidyPkgStartDate;
    }

    public Timestamp getSubsidyStartDate() {
        return subsidyStartDate;
    }

    public void setSubsidyStartDate(Timestamp subsidyStartDate) {
        this.subsidyStartDate = subsidyStartDate;
    }

    public String getTariffProfileStepped() {
        return tariffProfileStepped;
    }

    public void setTariffProfileStepped(String tariffProfileStepped) {
        this.tariffProfileStepped = tariffProfileStepped;
    }

    public Long getUsedQty() {
        return usedQty;
    }

    public void setUsedQty(Long usedQty) {
        this.usedQty = usedQty;
    }


}
