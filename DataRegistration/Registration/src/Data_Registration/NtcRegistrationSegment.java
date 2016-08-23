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
  @NamedQuery(name = "NtcRegistrationSegment.findAll", query = "select o from NtcRegistrationSegment o"),
  @NamedQuery(name = "NtcRegistrationSegment.getcount", query = "select count(o) from NtcRegistrationSegment o where o.status =0 and o.msisdn=:msisdn")
})
@Table(name = "NTC_REGISTRATION_SEGMENT")
public class NtcRegistrationSegment implements Serializable {
    @Id
    @Column(nullable = false)
    private String msisdn;
    private Long status;

    public NtcRegistrationSegment() {
    }

    public NtcRegistrationSegment(String msisdn, Long status) {
        this.msisdn = msisdn;
        this.status = status;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}
