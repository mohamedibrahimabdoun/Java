package Data_Registration;

import java.math.BigDecimal;

import java.util.List;

import javax.ejb.Stateless;

import javax.ejb.TransactionAttribute;

import javax.ejb.TransactionAttributeType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "NtcRegistrationSegmentSessionEJBBean", mappedName = "DataRegistration-Registration-NtcRegistrationSegmentSessionEJBBean")
public class NtcRegistrationSegmentSessionEJBBeanBean implements NtcRegistrationSegmentSessionEJBBean {
    @PersistenceContext(unitName="Registration")
    private EntityManager em;

    public NtcRegistrationSegmentSessionEJBBeanBean() {
    }

    public NtcRegistrationSegment persistNtcRegistrationSegment(NtcRegistrationSegment ntcRegistrationSegment) {
        em.persist(ntcRegistrationSegment);
        return ntcRegistrationSegment;
    }

    public NtcRegistrationSegment mergeNtcRegistrationSegment(NtcRegistrationSegment ntcRegistrationSegment) {
        return em.merge(ntcRegistrationSegment);
    }

    /** <code>select o from NtcRegistrationSegment o</code> */
    public List<NtcRegistrationSegment> getNtcRegistrationSegmentFindAll() {
        return em.createNamedQuery("NtcRegistrationSegment.findAll").getResultList();
    }

    public String IsRegistered(String MSISDN) {
      
      Long ntc_count= (Long)em.createNamedQuery("NtcRegistrationSegment.getcount").setParameter("msisdn", MSISDN).getSingleResult();
         
          //System.out.print("ntc_count is :" + ntc_count);
        return Long.toString (ntc_count);
    }
     
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public int UpdateSegment(String MSISDN) {
        //o from NtcRegistrationSegment o // '" +1+ "' 
      int x=     em.createQuery( "Update NtcRegistrationSegment o set o.status=1 " +
          "where o.msisdn=:p_msisdn").setParameter("p_msisdn", MSISDN).executeUpdate();
      return x;
    }

    public String ValidateMSISDN_Vs_Serail(String msisdn, String Serial_PUK) {
    //  em.createQuery( "");
  
      //FN_DATAREG_ANDROID_VALIDATION
      String result = (String) em.createNativeQuery("SELECT  ACTIVATION.FN_DATAREG_ANDROID_VALIDATION(?1,?2) FROM DUAL")
                    .setParameter(1, msisdn)
                    .setParameter(2, Serial_PUK)
                    .getSingleResult(); 
      return result;
    }

    public String CheckSResitrationStatus(String MSISDN) {
      //String sup_name ="Tortuga Trading";
              String result = (String) em.createNativeQuery("SELECT  ACTIVATION.FN_CHECK_CONTRACT(?1) FROM DUAL")
                            .setParameter(1, MSISDN)
                            .getSingleResult(); 
        return result;
    }

}
