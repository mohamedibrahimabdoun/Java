package sd.mtn.Billing;

import java.io.Serializable;

public class CrmUserInfoPK implements Serializable {
    private String area;
    private String subno;
    private String subscrType;

    public CrmUserInfoPK() {
    }

    public CrmUserInfoPK(String area, String subno, String subscrType) {
        this.area = area;
        this.subno = subno;
        this.subscrType = subscrType;
    }

    public boolean equals(Object other) {
        if (other instanceof CrmUserInfoPK) {
            final CrmUserInfoPK otherCrmUserInfoPK = (CrmUserInfoPK) other;
            final boolean areEqual =
                (otherCrmUserInfoPK.area.equals(area) && otherCrmUserInfoPK.subno.equals(subno) && otherCrmUserInfoPK.subscrType.equals(subscrType));
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    String getArea() {
        return area;
    }

    void setArea(String area) {
        this.area = area;
    }

    String getSubno() {
        return subno;
    }

    void setSubno(String subno) {
        this.subno = subno;
    }

    String getSubscrType() {
        return subscrType;
    }

    void setSubscrType(String subscrType) {
        this.subscrType = subscrType;
    }
}
