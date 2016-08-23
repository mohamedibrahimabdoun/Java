package sd.mtn.Billing;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name = "CcmGetData.findAll", query = "select o from CcmGetData o")
//@NamedQuery(name = "CcmGetData.findAll", query = "select o from CcmGetData o where o.subno=:v_subno")
})
@Table(name = "CCM_GET_DATA")
public class CcmGetData implements Serializable {
    @Column(name="CC_LIMIT")
    private Long ccLimit;
    @Column(length = 17)
    private String date1;
    @Column(name="DUE_AMT", length = 11)
    private String dueAmt;
    @Column(name="DUE_AMT_AR", length = 67)
    private String dueAmtAr;
    @Column(length = 15)
    private String invdate;
  @Id
  @Column(name="subno", nullable = false)
    private String subno;
    @Column(name="TOT_DUE", length = 11)
    private String totDue;
    @Column(name="TOT_DUE_AR", length = 67)
    private String totDueAr;
    @Column(length = 11)
    private String unbilled;
    @Column(name="UNBILLED_AR", length = 67)
    private String unbilledAr;

    public CcmGetData() {
    }

    public CcmGetData(Long ccLimit, String date1, String dueAmt,
                      String dueAmtAr, String invdate, String subno,
                      String totDue, String totDueAr, String unbilled,
                      String unbilledAr) {
        this.ccLimit = ccLimit;
        this.date1 = date1;
        this.dueAmt = dueAmt;
        this.dueAmtAr = dueAmtAr;
        this.invdate = invdate;
        this.subno = subno;
        this.totDue = totDue;
        this.totDueAr = totDueAr;
        this.unbilled = unbilled;
        this.unbilledAr = unbilledAr;
    }

    public Long getCcLimit() {
        return ccLimit;
    }

    public void setCcLimit(Long ccLimit) {
        this.ccLimit = ccLimit;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDueAmt() {
        return dueAmt;
    }

    public void setDueAmt(String dueAmt) {
        this.dueAmt = dueAmt;
    }

    public String getDueAmtAr() {
        return dueAmtAr;
    }

    public void setDueAmtAr(String dueAmtAr) {
        this.dueAmtAr = dueAmtAr;
    }

    public String getInvdate() {
        return invdate;
    }

    public void setInvdate(String invdate) {
        this.invdate = invdate;
    }

    public String getSubno() {
        return subno;
    }

    public void setSubno(String subno) {
        this.subno = subno;
    }

    public String getTotDue() {
        return totDue;
    }

    public void setTotDue(String totDue) {
        this.totDue = totDue;
    }

    public String getTotDueAr() {
        return totDueAr;
    }

    public void setTotDueAr(String totDueAr) {
        this.totDueAr = totDueAr;
    }

    public String getUnbilled() {
        return unbilled;
    }

    public void setUnbilled(String unbilled) {
        this.unbilled = unbilled;
    }

    public String getUnbilledAr() {
        return unbilledAr;
    }

    public void setUnbilledAr(String unbilledAr) {
        this.unbilledAr = unbilledAr;
    }
}
