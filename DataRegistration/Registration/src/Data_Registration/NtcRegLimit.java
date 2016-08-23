package Data_Registration;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name = "NtcRegLimit.findAll", query = "select o from NtcRegLimit o")
})
@Table(name = "NTC_REG_LIMIT")
public class NtcRegLimit implements Serializable {
    @Id
    @Column(nullable = false)
    private Long maxrownumber;

    public NtcRegLimit() {
    }

    public NtcRegLimit(Long maxrownumber) {
        this.maxrownumber = maxrownumber;
    }

    public Long getMaxrownumber() {
        return maxrownumber;
    }

    public void setMaxrownumber(Long maxrownumber) {
        this.maxrownumber = maxrownumber;
    }
}
