package mtn.salescare.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name = "NtcRegistrationSegment.findAll", query = "select o from NtcRegistrationSegment o")
})
@Table(name = "NTC_REGISTRATION_SEGMENT")
public class NtcRegistrationSegment implements Serializable {
    private Long hasdata;
  @Id
  @Column(nullable = false)
        
    private String msisdn;
    private Long status;

    public NtcRegistrationSegment() {
    }

    public NtcRegistrationSegment(Long hasdata, String msisdn, Long status) {
        this.hasdata = hasdata;
        this.msisdn = msisdn;
        this.status = status;
    }

    public Long getHasdata() {
        return hasdata;
    }

    public void setHasdata(Long hasdata) {
        this.hasdata = hasdata;
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
