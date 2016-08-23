package Data_Registration;

import java.util.List;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "NTC_REG_LIMIT_SessionEJB", mappedName = "DataRegistration-Registration-NTC_REG_LIMIT_SessionEJB")
public class NTC_REG_LIMIT_SessionEJBBean implements NTC_REG_LIMIT_SessionEJB {
    @PersistenceContext(unitName="Registration")
    private EntityManager em;

    public NTC_REG_LIMIT_SessionEJBBean() {
    }

    public NtcRegLimit persistNtcRegLimit(NtcRegLimit ntcRegLimit) {
        em.persist(ntcRegLimit);
        return ntcRegLimit;
    }

    public NtcRegLimit mergeNtcRegLimit(NtcRegLimit ntcRegLimit) {
        return em.merge(ntcRegLimit);
    }

    public void removeNtcRegLimit(NtcRegLimit ntcRegLimit) {
        ntcRegLimit = em.find(NtcRegLimit.class, ntcRegLimit.getMaxrownumber());
        em.remove(ntcRegLimit);
    }

    /** <code>select o from NtcRegLimit o</code> */
    public List<NtcRegLimit> getNtcRegLimitFindAll() {
        return em.createNamedQuery("NtcRegLimit.findAll").getResultList();
    }
}
