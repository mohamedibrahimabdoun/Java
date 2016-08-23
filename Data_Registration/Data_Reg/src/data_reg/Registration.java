package data_reg;

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
    @Column(name="FIRST_NAME", length = 500)
    private String firstName;
    @Id
    @Column(nullable = false)
    private Long id;
    @Column(name="ID_TYPE")
    private Long idType;
    private byte[] image;
    @Column(name="IMAGE_NAME", length = 150)
    private String imageName;
    @Column(name="IMAGE_PATH", length = 4000)
    private String imagePath;
    @Column(length = 50)
    private String imsi;
    @Column(name="LAST_NAME", length = 500)
    private String lastName;
    @Column(length = 10)
    private String msisdn;
    @Column(length = 4000)
    private String name;
    @Column(name="SECOND_NAME", length = 500)
    private String secondName;
    @Column(name="THIRD_NAME", length = 500)
    private String thirdName;
    private Timestamp transdate;

    public Registration() {
    }

    public Registration(String firstName, Long id, Long idType,
                        String imageName, String imagePath, String imsi,
                        String lastName, String msisdn, String name,
                        String secondName, String thirdName,
                        Timestamp transdate) {
        this.firstName = firstName;
        this.id = id;
        this.idType = idType;
        this.imageName = imageName;
        this.imagePath = imagePath;
        this.imsi = imsi;
        this.lastName = lastName;
        this.msisdn = msisdn;
        this.name = name;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.transdate = transdate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public Timestamp getTransdate() {
        return transdate;
    }

    public void setTransdate(Timestamp transdate) {
        this.transdate = transdate;
    }
}
