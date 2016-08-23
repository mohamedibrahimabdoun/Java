package mtn.salescare.beans;

import java.io.Serializable;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries( { @NamedQuery(name = "NtcRegistration.findAll",
                             query = "select o from NtcRegistration o") })
@Table(name = "NTC_REGISTRATION")
public class NtcRegistration implements Serializable {
    @Column(length = 20)
    private String accountid;
    @Column(length = 1000)
    private String address;
    @Column(name = "BACK_IMAGE")
    private byte[] backImage;
    @Column(name = "BACK_IMAGENAME", length = 150)
    private String backImagename;
    @Column(length = 100)
    private String customerid;
    @Column(length = 100)
    private String datasource;
    @Column(length = 100)
    private String digit;
    @Column(length = 200)
    private String firstname;
    @Column(name = "FRONT_IMAGE")
    private byte[] frontImage;
    @Column(name = "FRONT_IMAGENAME", length = 150)
    private String frontImagename;
    @Id
    @Column(nullable = false)
    private Long id;
    @Column(name = "ID_TYPE")
    private Long idType;
    @Column(length = 100)
    private String imei;
    @Column(length = 50)
    private String imsi;
    private Long incentive;
    @Column(name = "IP_ADDRESS", length = 500)
    private String ipAddress;
    @Column(length = 100)
    private String latitude;
    @Column(length = 100)
    private String longitude;
    @Column(length = 30)
    private String msisdn;
    @Column(length = 500)
    private String name;
    @Column(name = "NEW_MSISDN", length = 10)
    private String newMsisdn;
    private Long reqstatus;
    private Timestamp requestdate;
    @Column(length = 100)
    private String resultcode;
    @Column(length = 100)
    private String resultdescr;
    @Column(length = 200)
    private String secondname;
    @Column(length = 30)
    private String sender;
    @Column(length = 500)
    private String serail;
    @Column(name = "SIGNATURE_IMAGE")
    private byte[] signatureImage;
    @Column(length = 200)
    private String smstext;
    @Column(length = 50)
    private String source;
    private Long status;
    @Column(length = 200)
    private String surname;
    private Timestamp tac;
    private Long tid;
    @Column(length = 100)
    private String transserial;
    @Column(length = 500)
    private String unnamed2;
    private Long validated;
    @Column(name = "VALUDATED_BY", length = 150)
    private String valudatedBy;
    private byte[] video;

    public NtcRegistration() {
    }

    public NtcRegistration(String accountid, String address,
                           String backImagename, String customerid,
                           String datasource, String digit, String firstname,
                           String frontImagename, Long id, Long idType,
                           String imei, String imsi, Long incentive,
                           String ipAddress, String latitude, String longitude,
                           String msisdn, String name, String newMsisdn,
                           Long reqstatus, Timestamp requestdate,
                           String resultcode, String resultdescr,
                           String secondname, String sender, String serail,
                           String smstext, String source, Long status,
                           String surname, Timestamp tac, Long tid,
                           String transserial, String unnamed2, Long validated,
                           String valudatedBy) {
        this.accountid = accountid;
        this.address = address;
        this.backImagename = backImagename;
        this.customerid = customerid;
        this.datasource = datasource;
        this.digit = digit;
        this.firstname = firstname;
        this.frontImagename = frontImagename;
        this.id = id;
        this.idType = idType;
        this.imei = imei;
        this.imsi = imsi;
        this.incentive = incentive;
        this.ipAddress = ipAddress;
        this.latitude = latitude;
        this.longitude = longitude;
        this.msisdn = msisdn;
        this.name = name;
        this.newMsisdn = newMsisdn;
        this.reqstatus = reqstatus;
        this.requestdate = requestdate;
        this.resultcode = resultcode;
        this.resultdescr = resultdescr;
        this.secondname = secondname;
        this.sender = sender;
        this.serail = serail;
        this.smstext = smstext;
        this.source = source;
        this.status = status;
        this.surname = surname;
        this.tac = tac;
        this.tid = tid;
        this.transserial = transserial;
        this.unnamed2 = unnamed2;
        this.validated = validated;
        this.valudatedBy = valudatedBy;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
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

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public String getDigit() {
        return digit;
    }

    public void setDigit(String digit) {
        this.digit = digit;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public Long getIncentive() {
        return incentive;
    }

    public void setIncentive(Long incentive) {
        this.incentive = incentive;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNewMsisdn() {
        return newMsisdn;
    }

    public void setNewMsisdn(String newMsisdn) {
        this.newMsisdn = newMsisdn;
    }

    public Long getReqstatus() {
        return reqstatus;
    }

    public void setReqstatus(Long reqstatus) {
        this.reqstatus = reqstatus;
    }

    public Timestamp getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(Timestamp requestdate) {
        this.requestdate = requestdate;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getResultdescr() {
        return resultdescr;
    }

    public void setResultdescr(String resultdescr) {
        this.resultdescr = resultdescr;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSerail() {
        return serail;
    }

    public void setSerail(String serail) {
        this.serail = serail;
    }

    public byte[] getSignatureImage() {
        return signatureImage;
    }

    public void setSignatureImage(byte[] signatureImage) {
        this.signatureImage = signatureImage;
    }

    public String getSmstext() {
        return smstext;
    }

    public void setSmstext(String smstext) {
        this.smstext = smstext;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Timestamp getTac() {
        return tac;
    }

    public void setTac(Timestamp tac) {
        this.tac = tac;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getTransserial() {
        return transserial;
    }

    public void setTransserial(String transserial) {
        this.transserial = transserial;
    }

    public String getUnnamed2() {
        return unnamed2;
    }

    public void setUnnamed2(String unnamed2) {
        this.unnamed2 = unnamed2;
    }

    public Long getValidated() {
        return validated;
    }

    public void setValidated(Long validated) {
        this.validated = validated;
    }

    public String getValudatedBy() {
        return valudatedBy;
    }

    public void setValudatedBy(String valudatedBy) {
        this.valudatedBy = valudatedBy;
    }

    public byte[] getVideo() {
        return video;
    }

    public void setVideo(byte[] video) {
        this.video = video;
    }
}
