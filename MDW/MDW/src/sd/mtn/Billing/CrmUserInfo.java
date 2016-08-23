package sd.mtn.Billing;

import java.io.Serializable;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name = "CrmUserInfo.findAll", query = "select o from CrmUserInfo o")
})
@Table(name = "CRM_USER_INFO")
@IdClass(CrmUserInfoPK.class)
public class CrmUserInfo implements Serializable {
    @Column(length = 50)
    private String address;
    @Column(name="ADDRS_AREA", length = 5)
    private String addrsArea;
    @Column(name="ADDRS_BLOCK", length = 3)
    private String addrsBlock;
    @Column(length = 8)
    private String apartment;
    private Timestamp applied;
    @Column(length = 8)
    private String apt;
    @Id
    @Column(nullable = false, length = 4)
    private String area;
    @Column(name="AR_BIN", length = 3)
    private String arBin;
    @Column(name="AR_BIN_BINT", length = 4)
    private String arBinBint;
    @Column(name="AR_FIRST_NAME", length = 15)
    private String arFirstName;
    @Column(name="AR_LAST_NAME", length = 15)
    private String arLastName;
    @Column(name="AR_NAME", length = 72)
    private String arName;
    @Column(name="AR_SECOND_NAME", length = 15)
    private String arSecondName;
    @Column(name="AR_THIRD_NAME", length = 15)
    private String arThirdName;
    @Column(name="AR_TITLE", length = 15)
    private String arTitle;
    @Column(name="BILLING_TEMPLATE", length = 10)
    private String billingTemplate;
    @Column(length = 3)
    private String bin;
    @Column(name="BIN_BINT", length = 4)
    private String binBint;
    @Column(length = 8)
    private String bno;
    @Column(name="BS_FLAG", length = 4)
    private String bsFlag;
    @Column(name="BS_TYPE", length = 5)
    private String bsType;
    @Column(length = 50)
    private String building;
    @Column(name="BUILD_NO", length = 8)
    private String buildNo;
    @Column(name="CALLER_AREA", length = 4)
    private String callerArea;
    @Column(name="CALLER_SUBSCR_TYPE", length = 1)
    private String callerSubscrType;
    @Column(length = 12)
    private String cardno;
    @Column(name="CARD_TYPE", length = 3)
    private String cardType;
    private Timestamp changed;
    @Column(length = 50)
    private String co;
    private Timestamp condate;
    @Column(nullable = false, length = 10)
    private String contrno;
    @Column(name="CONT_SUB", length = 1)
    private String contSub;
    @Column(name="CREATION_DATE")
    private Timestamp creationDate;
    @Column(name="CURR_VOL_INT")
    private Long currVolInt;
    @Column(name="CURR_VOL_LOC")
    private Long currVolLoc;
    @Column(name="CUST_NO", length = 20)
    private String custNo;
    @Column(name="CUST_TYPE", length = 10)
    private String custType;
    @Column(name="DATE_OF_BIRTH")
    private Timestamp dateOfBirth;
    @Column(length = 1)
    private String deposit;
    @Column(length = 1)
    private String dircode;
    @Column(length = 1)
    private String dirrdy;
    private Timestamp discon;
    @Column(name="DOC_COMPLETE", length = 1)
    private String docComplete;
    @Column(length = 4)
    private String exc;
    @Column(name="EXT_RETAILER", length = 4)
    private String extRetailer;
    @Column(name="FIRST_NAME", length = 15)
    private String firstName;
    @Column(name="FLEX_FLD1", length = 256)
    private String flexFld1;
    @Column(name="FLEX_FLD2", length = 256)
    private String flexFld2;
    @Column(name="FLEX_FLD3", length = 256)
    private String flexFld3;
    @Column(name="FLEX_FLD4", length = 256)
    private String flexFld4;
    @Column(name="FLEX_FLD5", length = 256)
    private String flexFld5;
    @Column(length = 3)
    private String gender;
    @Column(length = 8)
    private String groupno;
    @Column(name="ID_NO", length = 32)
    private String idNo;
    @Column(name="ID_TYPE", length = 16)
    private String idType;
    @Column(length = 75)
    private String info;
    @Column(length = 4000)
    private String info2;
    @Column(length = 4000)
    private String info3;
    @Column(name="INT_RETAILER", length = 4)
    private String intRetailer;
    @Column(name="IVR_LANG", length = 3)
    private String ivrLang;
    @Column(length = 50)
    private String lastname;
    private Long lastorder;
    @Column(name="LAST_CALL_DATE")
    private Timestamp lastCallDate;
    @Column(name="LAST_CALL_TIME", length = 6)
    private String lastCallTime;
    @Column(name="LAST_NAME", length = 15)
    private String lastName;
    private Double limit;
    @Column(name="LOCATION_X")
    private Long locationX;
    @Column(name="LOCATION_Y")
    private Long locationY;
    @Column(name="MAIN_SUBNO", length = 1)
    private String mainSubno;
    @Column(name="MNP_SUB", length = 1)
    private String mnpSub;
    @Column(name="MNP_TYPE", length = 7)
    private String mnpType;
    @Column(length = 72)
    private String name;
    @Column(name="NAT_CODE", length = 3)
    private String natCode;
    @Column(name="NEXT_VOL_INT")
    private Long nextVolInt;
    @Column(name="NEXT_VOL_LOC")
    private Long nextVolLoc;
    @Column(name="NUM_CHARGED", length = 1)
    private String numCharged;
    @Column(name="NUM_TYPE", length = 1)
    private String numType;
    @Column(name="OLD_CONTRNO", length = 10)
    private String oldContrno;
    @Column(name="PERSONAL_ID")
    private Long personalId;
    @Column(name="POSTAL_ADR", length = 50)
    private String postalAdr;
    @Column(name="POSTAL_CODE", length = 8)
    private String postalCode;
    @Column(name="POST_AREA", length = 25)
    private String postArea;
    @Column(name="PO_BOX")
    private Long poBox;
    @Column(name="PP_FROM_DATE")
    private Timestamp ppFromDate;
    @Column(name="PREPOST_PAID", length = 4)
    private String prepostPaid;
    @Column(name="PREV_VOL_INT")
    private Long prevVolInt;
    @Column(name="PREV_VOL_LOC")
    private Long prevVolLoc;
    @Column(name="PRI_SEC_TYPE", length = 10)
    private String priSecType;
    @Column(length = 8)
    private String profession;
    @Column(length = 3)
    private String profile;
    @Column(length = 12)
    private String promotion;
    @Column(name="REASON_CODE")
    private Long reasonCode;
    @Column(name="RESERVATION_CODE", length = 4)
    private String reservationCode;
    @Column(name="SCR_CLASS", length = 10)
    private String scrClass;
    @Column(name="SECOND_NAME", length = 15)
    private String secondName;
    @Column(length = 10)
    private String servno;
    @Column(length = 1)
    private String specdeb;
    @Column(name="SP_NO", length = 10)
    private String spNo;
    @Column(nullable = false)
    private Long status;
    @Column(length = 50)
    private String street;
    @Column(name="STREET_NO", length = 8)
    private String streetNo;
    @Id
    @Column(nullable = false, length = 20)
    private String subno;
    @Id
    @Column(name="SUBSCR_TYPE", nullable = false, length = 1)
    private String subscrType;
    @Column(name="SUB_PAY_PRIORITY")
    private Long subPayPriority;
    @Column(name="TARIFF_PROFILE", length = 10)
    private String tariffProfile;
    @Column(name="THIRD_NAME", length = 15)
    private String thirdName;
    @Column(length = 30)
    private String title;
    @Column(name="TRSF_DATE")
    private Timestamp trsfDate;
    @Column(name="ZIP_CODE")
    private Long zipCode;

    public CrmUserInfo() {
    }

    public CrmUserInfo(String address, String addrsArea, String addrsBlock,
                       String apartment, Timestamp applied, String apt,
                       String arBin, String arBinBint, String arFirstName,
                       String arLastName, String arName, String arSecondName,
                       String arThirdName, String arTitle, String area,
                       String billingTemplate, String bin, String binBint,
                       String bno, String bsFlag, String bsType,
                       String buildNo, String building, String callerArea,
                       String callerSubscrType, String cardType, String cardno,
                       Timestamp changed, String co, Timestamp condate,
                       String contSub, String contrno, Timestamp creationDate,
                       Long currVolInt, Long currVolLoc, String custNo,
                       String custType, Timestamp dateOfBirth, String deposit,
                       String dircode, String dirrdy, Timestamp discon,
                       String docComplete, String exc, String extRetailer,
                       String firstName, String flexFld1, String flexFld2,
                       String flexFld3, String flexFld4, String flexFld5,
                       String gender, String groupno, String idNo,
                       String idType, String info, String info2, String info3,
                       String intRetailer, String ivrLang,
                       Timestamp lastCallDate, String lastCallTime,
                       String lastName, String lastname, Long lastorder,
                       Double limit, Long locationX, Long locationY,
                       String mainSubno, String mnpSub, String mnpType,
                       String name, String natCode, Long nextVolInt,
                       Long nextVolLoc, String numCharged, String numType,
                       String oldContrno, Long personalId, Long poBox,
                       String postArea, String postalAdr, String postalCode,
                       Timestamp ppFromDate, String prepostPaid,
                       Long prevVolInt, Long prevVolLoc, String priSecType,
                       String profession, String profile, String promotion,
                       Long reasonCode, String reservationCode,
                       String scrClass, String secondName, String servno,
                       String spNo, String specdeb, Long status, String street,
                       String streetNo, Long subPayPriority, String subno,
                       String subscrType, String tariffProfile,
                       String thirdName, String title, Timestamp trsfDate,
                       Long zipCode) {
        this.address = address;
        this.addrsArea = addrsArea;
        this.addrsBlock = addrsBlock;
        this.apartment = apartment;
        this.applied = applied;
        this.apt = apt;
        this.arBin = arBin;
        this.arBinBint = arBinBint;
        this.arFirstName = arFirstName;
        this.arLastName = arLastName;
        this.arName = arName;
        this.arSecondName = arSecondName;
        this.arThirdName = arThirdName;
        this.arTitle = arTitle;
        this.area = area;
        this.billingTemplate = billingTemplate;
        this.bin = bin;
        this.binBint = binBint;
        this.bno = bno;
        this.bsFlag = bsFlag;
        this.bsType = bsType;
        this.buildNo = buildNo;
        this.building = building;
        this.callerArea = callerArea;
        this.callerSubscrType = callerSubscrType;
        this.cardType = cardType;
        this.cardno = cardno;
        this.changed = changed;
        this.co = co;
        this.condate = condate;
        this.contSub = contSub;
        this.contrno = contrno;
        this.creationDate = creationDate;
        this.currVolInt = currVolInt;
        this.currVolLoc = currVolLoc;
        this.custNo = custNo;
        this.custType = custType;
        this.dateOfBirth = dateOfBirth;
        this.deposit = deposit;
        this.dircode = dircode;
        this.dirrdy = dirrdy;
        this.discon = discon;
        this.docComplete = docComplete;
        this.exc = exc;
        this.extRetailer = extRetailer;
        this.firstName = firstName;
        this.flexFld1 = flexFld1;
        this.flexFld2 = flexFld2;
        this.flexFld3 = flexFld3;
        this.flexFld4 = flexFld4;
        this.flexFld5 = flexFld5;
        this.gender = gender;
        this.groupno = groupno;
        this.idNo = idNo;
        this.idType = idType;
        this.info = info;
        this.info2 = info2;
        this.info3 = info3;
        this.intRetailer = intRetailer;
        this.ivrLang = ivrLang;
        this.lastCallDate = lastCallDate;
        this.lastCallTime = lastCallTime;
        this.lastName = lastName;
        this.lastname = lastname;
        this.lastorder = lastorder;
        this.limit = limit;
        this.locationX = locationX;
        this.locationY = locationY;
        this.mainSubno = mainSubno;
        this.mnpSub = mnpSub;
        this.mnpType = mnpType;
        this.name = name;
        this.natCode = natCode;
        this.nextVolInt = nextVolInt;
        this.nextVolLoc = nextVolLoc;
        this.numCharged = numCharged;
        this.numType = numType;
        this.oldContrno = oldContrno;
        this.personalId = personalId;
        this.poBox = poBox;
        this.postArea = postArea;
        this.postalAdr = postalAdr;
        this.postalCode = postalCode;
        this.ppFromDate = ppFromDate;
        this.prepostPaid = prepostPaid;
        this.prevVolInt = prevVolInt;
        this.prevVolLoc = prevVolLoc;
        this.priSecType = priSecType;
        this.profession = profession;
        this.profile = profile;
        this.promotion = promotion;
        this.reasonCode = reasonCode;
        this.reservationCode = reservationCode;
        this.scrClass = scrClass;
        this.secondName = secondName;
        this.servno = servno;
        this.spNo = spNo;
        this.specdeb = specdeb;
        this.status = status;
        this.street = street;
        this.streetNo = streetNo;
        this.subPayPriority = subPayPriority;
        this.subno = subno;
        this.subscrType = subscrType;
        this.tariffProfile = tariffProfile;
        this.thirdName = thirdName;
        this.title = title;
        this.trsfDate = trsfDate;
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddrsArea() {
        return addrsArea;
    }

    public void setAddrsArea(String addrsArea) {
        this.addrsArea = addrsArea;
    }

    public String getAddrsBlock() {
        return addrsBlock;
    }

    public void setAddrsBlock(String addrsBlock) {
        this.addrsBlock = addrsBlock;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public Timestamp getApplied() {
        return applied;
    }

    public void setApplied(Timestamp applied) {
        this.applied = applied;
    }

    public String getApt() {
        return apt;
    }

    public void setApt(String apt) {
        this.apt = apt;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArBin() {
        return arBin;
    }

    public void setArBin(String arBin) {
        this.arBin = arBin;
    }

    public String getArBinBint() {
        return arBinBint;
    }

    public void setArBinBint(String arBinBint) {
        this.arBinBint = arBinBint;
    }

    public String getArFirstName() {
        return arFirstName;
    }

    public void setArFirstName(String arFirstName) {
        this.arFirstName = arFirstName;
    }

    public String getArLastName() {
        return arLastName;
    }

    public void setArLastName(String arLastName) {
        this.arLastName = arLastName;
    }

    public String getArName() {
        return arName;
    }

    public void setArName(String arName) {
        this.arName = arName;
    }

    public String getArSecondName() {
        return arSecondName;
    }

    public void setArSecondName(String arSecondName) {
        this.arSecondName = arSecondName;
    }

    public String getArThirdName() {
        return arThirdName;
    }

    public void setArThirdName(String arThirdName) {
        this.arThirdName = arThirdName;
    }

    public String getArTitle() {
        return arTitle;
    }

    public void setArTitle(String arTitle) {
        this.arTitle = arTitle;
    }

    public String getBillingTemplate() {
        return billingTemplate;
    }

    public void setBillingTemplate(String billingTemplate) {
        this.billingTemplate = billingTemplate;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getBinBint() {
        return binBint;
    }

    public void setBinBint(String binBint) {
        this.binBint = binBint;
    }

    public String getBno() {
        return bno;
    }

    public void setBno(String bno) {
        this.bno = bno;
    }

    public String getBsFlag() {
        return bsFlag;
    }

    public void setBsFlag(String bsFlag) {
        this.bsFlag = bsFlag;
    }

    public String getBsType() {
        return bsType;
    }

    public void setBsType(String bsType) {
        this.bsType = bsType;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(String buildNo) {
        this.buildNo = buildNo;
    }

    public String getCallerArea() {
        return callerArea;
    }

    public void setCallerArea(String callerArea) {
        this.callerArea = callerArea;
    }

    public String getCallerSubscrType() {
        return callerSubscrType;
    }

    public void setCallerSubscrType(String callerSubscrType) {
        this.callerSubscrType = callerSubscrType;
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

    public Timestamp getChanged() {
        return changed;
    }

    public void setChanged(Timestamp changed) {
        this.changed = changed;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public Timestamp getCondate() {
        return condate;
    }

    public void setCondate(Timestamp condate) {
        this.condate = condate;
    }

    public String getContrno() {
        return contrno;
    }

    public void setContrno(String contrno) {
        this.contrno = contrno;
    }

    public String getContSub() {
        return contSub;
    }

    public void setContSub(String contSub) {
        this.contSub = contSub;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Long getCurrVolInt() {
        return currVolInt;
    }

    public void setCurrVolInt(Long currVolInt) {
        this.currVolInt = currVolInt;
    }

    public Long getCurrVolLoc() {
        return currVolLoc;
    }

    public void setCurrVolLoc(Long currVolLoc) {
        this.currVolLoc = currVolLoc;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getDircode() {
        return dircode;
    }

    public void setDircode(String dircode) {
        this.dircode = dircode;
    }

    public String getDirrdy() {
        return dirrdy;
    }

    public void setDirrdy(String dirrdy) {
        this.dirrdy = dirrdy;
    }

    public Timestamp getDiscon() {
        return discon;
    }

    public void setDiscon(Timestamp discon) {
        this.discon = discon;
    }

    public String getDocComplete() {
        return docComplete;
    }

    public void setDocComplete(String docComplete) {
        this.docComplete = docComplete;
    }

    public String getExc() {
        return exc;
    }

    public void setExc(String exc) {
        this.exc = exc;
    }

    public String getExtRetailer() {
        return extRetailer;
    }

    public void setExtRetailer(String extRetailer) {
        this.extRetailer = extRetailer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFlexFld1() {
        return flexFld1;
    }

    public void setFlexFld1(String flexFld1) {
        this.flexFld1 = flexFld1;
    }

    public String getFlexFld2() {
        return flexFld2;
    }

    public void setFlexFld2(String flexFld2) {
        this.flexFld2 = flexFld2;
    }

    public String getFlexFld3() {
        return flexFld3;
    }

    public void setFlexFld3(String flexFld3) {
        this.flexFld3 = flexFld3;
    }

    public String getFlexFld4() {
        return flexFld4;
    }

    public void setFlexFld4(String flexFld4) {
        this.flexFld4 = flexFld4;
    }

    public String getFlexFld5() {
        return flexFld5;
    }

    public void setFlexFld5(String flexFld5) {
        this.flexFld5 = flexFld5;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGroupno() {
        return groupno;
    }

    public void setGroupno(String groupno) {
        this.groupno = groupno;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo2() {
        return info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2;
    }

    public String getInfo3() {
        return info3;
    }

    public void setInfo3(String info3) {
        this.info3 = info3;
    }

    public String getIntRetailer() {
        return intRetailer;
    }

    public void setIntRetailer(String intRetailer) {
        this.intRetailer = intRetailer;
    }

    public String getIvrLang() {
        return ivrLang;
    }

    public void setIvrLang(String ivrLang) {
        this.ivrLang = ivrLang;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getLastorder() {
        return lastorder;
    }

    public void setLastorder(Long lastorder) {
        this.lastorder = lastorder;
    }

    public Timestamp getLastCallDate() {
        return lastCallDate;
    }

    public void setLastCallDate(Timestamp lastCallDate) {
        this.lastCallDate = lastCallDate;
    }

    public String getLastCallTime() {
        return lastCallTime;
    }

    public void setLastCallTime(String lastCallTime) {
        this.lastCallTime = lastCallTime;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public Long getLocationX() {
        return locationX;
    }

    public void setLocationX(Long locationX) {
        this.locationX = locationX;
    }

    public Long getLocationY() {
        return locationY;
    }

    public void setLocationY(Long locationY) {
        this.locationY = locationY;
    }

    public String getMainSubno() {
        return mainSubno;
    }

    public void setMainSubno(String mainSubno) {
        this.mainSubno = mainSubno;
    }

    public String getMnpSub() {
        return mnpSub;
    }

    public void setMnpSub(String mnpSub) {
        this.mnpSub = mnpSub;
    }

    public String getMnpType() {
        return mnpType;
    }

    public void setMnpType(String mnpType) {
        this.mnpType = mnpType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNatCode() {
        return natCode;
    }

    public void setNatCode(String natCode) {
        this.natCode = natCode;
    }

    public Long getNextVolInt() {
        return nextVolInt;
    }

    public void setNextVolInt(Long nextVolInt) {
        this.nextVolInt = nextVolInt;
    }

    public Long getNextVolLoc() {
        return nextVolLoc;
    }

    public void setNextVolLoc(Long nextVolLoc) {
        this.nextVolLoc = nextVolLoc;
    }

    public String getNumCharged() {
        return numCharged;
    }

    public void setNumCharged(String numCharged) {
        this.numCharged = numCharged;
    }

    public String getNumType() {
        return numType;
    }

    public void setNumType(String numType) {
        this.numType = numType;
    }

    public String getOldContrno() {
        return oldContrno;
    }

    public void setOldContrno(String oldContrno) {
        this.oldContrno = oldContrno;
    }

    public Long getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Long personalId) {
        this.personalId = personalId;
    }

    public String getPostalAdr() {
        return postalAdr;
    }

    public void setPostalAdr(String postalAdr) {
        this.postalAdr = postalAdr;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostArea() {
        return postArea;
    }

    public void setPostArea(String postArea) {
        this.postArea = postArea;
    }

    public Long getPoBox() {
        return poBox;
    }

    public void setPoBox(Long poBox) {
        this.poBox = poBox;
    }

    public Timestamp getPpFromDate() {
        return ppFromDate;
    }

    public void setPpFromDate(Timestamp ppFromDate) {
        this.ppFromDate = ppFromDate;
    }

    public String getPrepostPaid() {
        return prepostPaid;
    }

    public void setPrepostPaid(String prepostPaid) {
        this.prepostPaid = prepostPaid;
    }

    public Long getPrevVolInt() {
        return prevVolInt;
    }

    public void setPrevVolInt(Long prevVolInt) {
        this.prevVolInt = prevVolInt;
    }

    public Long getPrevVolLoc() {
        return prevVolLoc;
    }

    public void setPrevVolLoc(Long prevVolLoc) {
        this.prevVolLoc = prevVolLoc;
    }

    public String getPriSecType() {
        return priSecType;
    }

    public void setPriSecType(String priSecType) {
        this.priSecType = priSecType;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public Long getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Long reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }

    public String getScrClass() {
        return scrClass;
    }

    public void setScrClass(String scrClass) {
        this.scrClass = scrClass;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getServno() {
        return servno;
    }

    public void setServno(String servno) {
        this.servno = servno;
    }

    public String getSpecdeb() {
        return specdeb;
    }

    public void setSpecdeb(String specdeb) {
        this.specdeb = specdeb;
    }

    public String getSpNo() {
        return spNo;
    }

    public void setSpNo(String spNo) {
        this.spNo = spNo;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getSubno() {
        return subno;
    }

    public void setSubno(String subno) {
        this.subno = subno;
    }

    public String getSubscrType() {
        return subscrType;
    }

    public void setSubscrType(String subscrType) {
        this.subscrType = subscrType;
    }

    public Long getSubPayPriority() {
        return subPayPriority;
    }

    public void setSubPayPriority(Long subPayPriority) {
        this.subPayPriority = subPayPriority;
    }

    public String getTariffProfile() {
        return tariffProfile;
    }

    public void setTariffProfile(String tariffProfile) {
        this.tariffProfile = tariffProfile;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getTrsfDate() {
        return trsfDate;
    }

    public void setTrsfDate(Timestamp trsfDate) {
        this.trsfDate = trsfDate;
    }

    public Long getZipCode() {
        return zipCode;
    }

    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }
}
