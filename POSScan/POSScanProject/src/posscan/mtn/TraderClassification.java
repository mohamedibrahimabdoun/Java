package posscan.mtn;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name = "TraderClassification.findAll", query = "select o from TraderClassification o")
})
@Table(name = "TRADER_CLASSIFICATION")
public class TraderClassification implements Serializable {
    @Id
    @Column(nullable = false)
    private Long classid;
    private String classname;
    private Long status;

    public TraderClassification() {
    }

    public TraderClassification(Long classid, String classname, Long status) {
        this.classid = classid;
        this.classname = classname;
        this.status = status;
    }

    public Long getClassid() {
        return classid;
    }

    public void setClassid(Long classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}
