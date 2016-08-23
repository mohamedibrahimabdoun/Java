package Data_Registration;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface NTC_REG_LIMIT_SessionEJB {
    NtcRegLimit persistNtcRegLimit(NtcRegLimit ntcRegLimit);

    NtcRegLimit mergeNtcRegLimit(NtcRegLimit ntcRegLimit);

    void removeNtcRegLimit(NtcRegLimit ntcRegLimit);

    List<NtcRegLimit> getNtcRegLimitFindAll();
}
