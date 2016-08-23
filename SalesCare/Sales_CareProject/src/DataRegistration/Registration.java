package DataRegistration;

import java.io.Serializable;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
  @NamedQuery(name = "Registration.findAll", query = "select o from Registration o")
})
public class Registration implements Serializable {
    @Column(length = 500)
    private String address;
    @Column(name="BACK_IMAGE")
    private byte[] backImage;
    @Column(name="BACK_IMAGENAME", length = 150)
    private String backImagename;
    @Column(name="FRONT_IMAGE")
    private byte[] frontImage;
    @Column(name="FRONT_IMAGENAME", length = 150)
    private String frontImagename;
    @Id
    @Column(nullable = false)
    private Long id;
    @Column(name="ID_TYPE")
    private Long idType;
    @Column(length = 50)
    private String imsi;
    @Column(length = 10)
    private String msisdn;
    @Column(length = 500)
    private String name;
    @Column(length = 500)
    private String serail;
    private Timestamp transdate;

    public Registration() {
    }

    public Registration(String address, String backImagename,
                        String frontImagename, Long id, Long idType,
                        String imsi, String msisdn, String name, String serail,
                        Timestamp transdate) {
        this.address = address;
        this.backImagename = backImagename;
        this.frontImagename = frontImagename;
        this.id = id;
        this.idType = idType;
        this.imsi = imsi;
        this.msisdn = msisdn;
        this.name = name;
        this.serail = serail;
        this.transdate = transdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getBackImage() {
        return backImage;
    }

    public void setBackImage(byte[] backImage) {
        this.backImage = backImage;
    }

    public String getBackImagename() {
        return backImagename;
    }

    public void setBackImagename(String backImagename) {
        this.backImagename = backImagename;
    }

    public byte[] getFrontImage() {
        return frontImage;
    }

    public void setFrontImage(byte[] frontImage) {
        this.frontImage = frontImage;
    }

    public String getFrontImagename() {
        return frontImagename;
    }

    public void setFrontImagename(String frontImagename) {
        this.frontImagename = frontImagename;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdType() {
        return idType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerail() {
        return serail;
    }

    public void setSerail(String serail) {
        this.serail = serail;
    }

    public Timestamp getTransdate() {
        return transdate;
    }

    public void setTransdate(Timestamp transdate) {
        this.transdate = transdate;
    }
}
