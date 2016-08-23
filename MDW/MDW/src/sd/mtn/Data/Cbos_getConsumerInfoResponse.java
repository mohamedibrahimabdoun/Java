package sd.mtn.Data;

import weblogic.jdbc.wrapper.Array;

public class Cbos_getConsumerInfoResponse {
    
    
    String fullName;
    String Satatus;
    String[] locks;
    int errorCode;
    String errorDesc;
    String serviceProviderId;
    String email;
    String classOFServiceName;
    String street;
    String City;
    String state;
    String Nationality;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setSatatus(String Satatus) {
        this.Satatus = Satatus;
    }

    public String getSatatus() {
        return Satatus;
    }

    public void setLocks(String[] locks) {
        this.locks = locks;
    }

    public String[] getLocks() {
        return locks;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setServiceProviderId(String serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public String getServiceProviderId() {
        return serviceProviderId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setClassOFServiceName(String classOFServiceName) {
        this.classOFServiceName = classOFServiceName;
    }

    public String getClassOFServiceName() {
        return classOFServiceName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCity() {
        return City;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getNationality() {
        return Nationality;
    }
}
