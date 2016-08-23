package sd.mtn.Billing;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name = "VwMdwPospaidBasciinfo.findBySubno", query = "select o from VwMdwPospaidBasciinfo o where o.subno=:v_subno")
})
@Table(name = "VW_MDW_POSPAID_BASCIINFO")
public class VwMdwPospaidBasciinfo implements Serializable {
    @Column(nullable = false, length = 12)
    private String cardno;
    @Column(name="CARD_TYPE", nullable = false, length = 4)
    private String cardType;
    @Column(nullable = false, length = 10)
    private String contrno;
    @Column(name="ICC_NUMBER", nullable = false, length = 20)
    private String iccNumber;
    @Column(name="IMSI_NUMBER", nullable = false, length = 15)
    private String imsiNumber;
    @Column(length = 8)
    private String pin2;
    @Column(name="PIN_CODE", length = 8)
    private String pinCode;
    @Column(name="PREPOST_PAID", length = 4)
    private String prepostPaid;
    @Column(name="PUK2_CODE", length = 8)
    private String puk2Code;
    @Column(name="PUK_CODE", length = 8)
    private String pukCode;
    @Column(nullable = false)
    private Long status;
   //@Id
   // @Column(nullable = false, length = 20)
  @Id
  @Column(name="subno", nullable = false)
    private String subno;
    @Column(name="TARIFF_PROFILE", length = 10)
    private String tariffProfile;
  @Column(name="FLEX_FLD3")
    private String FLEX_FLD3;

    public VwMdwPospaidBasciinfo() {
    }

    public VwMdwPospaidBasciinfo(String cardType, String cardno,
                                 String contrno, String iccNumber,
                                 String imsiNumber, String pin2,
                                 String pinCode, String prepostPaid,
                                 String puk2Code, String pukCode, Long status,
                                 String subno, String tariffProfile) {
        this.cardType = cardType;
        this.cardno = cardno;
        this.contrno = contrno;
        this.iccNumber = iccNumber;
        this.imsiNumber = imsiNumber;
        this.pin2 = pin2;
        this.pinCode = pinCode;
        this.prepostPaid = prepostPaid;
        this.puk2Code = puk2Code;
        this.pukCode = pukCode;
        this.status = status;
        this.subno = subno;
        this.tariffProfile = tariffProfile;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getContrno() {
        return contrno;
    }

    public void setContrno(String contrno) {
        this.contrno = contrno;
    }

    public String getIccNumber() {
        return iccNumber;
    }

    public void setIccNumber(String iccNumber) {
        this.iccNumber = iccNumber;
    }

    public String getImsiNumber() {
        return imsiNumber;
    }

    public void setImsiNumber(String imsiNumber) {
        this.imsiNumber = imsiNumber;
    }

    public String getPin2() {
        return pin2;
    }

    public void setPin2(String pin2) {
        this.pin2 = pin2;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getPrepostPaid() {
        return prepostPaid;
    }

    public void setPrepostPaid(String prepostPaid) {
        this.prepostPaid = prepostPaid;
    }

    public String getPuk2Code() {
        return puk2Code;
    }

    public void setPuk2Code(String puk2Code) {
        this.puk2Code = puk2Code;
    }

    public String getPukCode() {
        return pukCode;
    }

    public void setPukCode(String pukCode) {
        this.pukCode = pukCode;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getSubno() {
        return subno;
    }

    public void setSubno(String subno) {
        this.subno = subno;
    }

    public String getTariffProfile() {
        return tariffProfile;
    }

    public void setTariffProfile(String tariffProfile) {
        this.tariffProfile = tariffProfile;
    }

    public void setFLEX_FLD3(String FLEX_FLD3) {
        this.FLEX_FLD3 = FLEX_FLD3;
    }

    public String getFLEX_FLD3() {
        return FLEX_FLD3;
    }
}
