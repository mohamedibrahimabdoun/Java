package sd.mtn.Data;

public class Postpaid_Equipment {
  private String subno;    
  private String  equipid;
  private String  contrno; 
  private String  changed; 
  private String  billedto;

    public void setSubno(String subno) {
        this.subno = subno;
    }

    public String getSubno() {
        return subno;
    }

    public void setEquipid(String equipid) {
        this.equipid = equipid;
    }

    public String getEquipid() {
        return equipid;
    }

    public void setContrno(String contrno) {
        this.contrno = contrno;
    }

    public String getContrno() {
        return contrno;
    }

    public void setChanged(String changed) {
        this.changed = changed;
    }

    public String getChanged() {
        return changed;
    }

    public void setBilledto(String billedto) {
        this.billedto = billedto;
    }

    public String getBilledto() {
        return billedto;
    }
}
