package mtn.salescare.beans;

import java.util.List;

import javax.ejb.Stateless;

import javax.ejb.TransactionAttribute;

import javax.ejb.TransactionAttributeType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "NtcRegistrationSegmentSessionEJB", mappedName = "SalesCare-SalesCareProject-NtcRegistrationSegmentSessionEJB")
public class NtcRegistrationSegmentSessionEJBBean implements NtcRegistrationSegmentSessionEJB {
    @PersistenceContext(unitName="SalesCareProject")
    private EntityManager em;

    public NtcRegistrationSegmentSessionEJBBean() {
    }

    public NtcRegistration persistNtcRegistration(NtcRegistration ntcRegistration) {
        em.persist(ntcRegistration);
        return ntcRegistration;
    }

    public NtcRegistration mergeNtcRegistration(NtcRegistration ntcRegistration) {
        return em.merge(ntcRegistration);
    }

    /** <code>select o from NtcRegistration o</code> */
    public List<NtcRegistration> getNtcRegistrationFindAll() {
        return em.createNamedQuery("NtcRegistration.findAll").getResultList();
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
