package sd.mtn.Data;

public class Postpaid_BillInfo {
  private long cc_limit;      
  private String date1;
  private String due_amt;
  private String due_amt_ar;
  private String invdate;
  private String subno;
  private String tot_due;
  private String tot_due_ar;
  private String unbilled;
  private String unbilled_ar;

    public void setCc_limit(long cc_limit) {
        this.cc_limit = cc_limit;
    }

    public long getCc_limit() {
        return cc_limit;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate1() {
        return date1;
    }

    public void setDue_amt(String due_amt) {
        this.due_amt = due_amt;
    }

    public String getDue_amt() {
        return due_amt;
    }

    public void setDue_amt_ar(String due_amt_ar) {
        this.due_amt_ar = due_amt_ar;
    }

    public String getDue_amt_ar() {
        return due_amt_ar;
    }

    public void setInvdate(String invdate) {
        this.invdate = invdate;
    }

    public String getInvdate() {
        return invdate;
    }

    public void setSubno(String subno) {
        this.subno = subno;
    }

    public String getSubno() {
        return subno;
    }

    public void setTot_due(String tot_due) {
        this.tot_due = tot_due;
    }

    public String getTot_due() {
        return tot_due;
    }

    public void setTot_due_ar(String tot_due_ar) {
        this.tot_due_ar = tot_due_ar;
    }

    public String getTot_due_ar() {
        return tot_due_ar;
    }

    public void setUnbilled(String unbilled) {
        this.unbilled = unbilled;
    }

    public String getUnbilled() {
        return unbilled;
    }

    public void setUnbilled_ar(String unbilled_ar) {
        this.unbilled_ar = unbilled_ar;
    }

    public String getUnbilled_ar() {
        return unbilled_ar;
    }
}
