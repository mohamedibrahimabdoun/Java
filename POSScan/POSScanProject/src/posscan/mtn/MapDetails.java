package posscan.mtn;

import java.io.Serializable;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name = "MapDetails.findAll", query = "select o from MapDetails o")
})
@Table(name = "MAP_DETAILS")
public class MapDetails implements Serializable {
    @Column(length = 500)
    private String address;
    @Column(length = 100)
    private String classification;
    @Id
    @Column(nullable = false)
    private Long id;
    @Column(length = 30)
    private String imei;
    @Column(length = 50)
    private String latitude;
    @Column(length = 50)
    private String longitude;
    @Column(length = 50)
    private String msisdn;
    @Column(name="OWNER_NAME")
    private String ownerName;
    @Column(name="POS_NAME")
    private String posName;
    @Column(name="POS_TYPE", length = 50)
    private String posType;
    @Column(length = 50)
    private String requestdate;
    @Column(name="SIM_SELLING", length = 10)
    private String simSelling;
    private Timestamp transdate;

    public MapDetails() {
    }

    public MapDetails(String address, String classification, Long id,
                      String imei, String latitude, String longitude,
                      String msisdn, String ownerName, String posName,
                      String posType, String requestdate, String simSelling,
                      Timestamp transdate) {
        this.address = address;
        this.classification = classification;
        this.id = id;
        this.imei = imei;
        this.latitude = latitude;
        this.longitude = longitude;
        this.msisdn = msisdn;
        this.ownerName = ownerName;
        this.posName = posName;
        this.posType = posType;
        this.requestdate = requestdate;
        this.simSelling = simSelling;
        this.transdate = transdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public String getPosType() {
        return posType;
    }

    public void setPosType(String posType) {
        this.posType = posType;
    }

    public String getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(String requestdate) {
        this.requestdate = requestdate;
    }

    public String getSimSelling() {
        return simSelling;
    }

    public void setSimSelling(String simSelling) {
        this.simSelling = simSelling;
    }

    public Timestamp getTransdate() {
        return transdate;
    }

    public void setTransdate(Timestamp transdate) {
        this.transdate = transdate;
    }
}
