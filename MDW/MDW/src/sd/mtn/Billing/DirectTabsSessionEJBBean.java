package sd.mtn.Billing;

import java.util.List;

import javax.ejb.Stateless;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "DirectTabsSessionEJB", mappedName = "MDW-MDW-DirectTabsSessionEJB")
public class DirectTabsSessionEJBBean implements DirectTabsSessionEJB {
    @PersistenceContext(unitName="TABS")
    private EntityManager em;

    public DirectTabsSessionEJBBean() {
    }

    /** <code>select o from CrmUserInfo o</code> */
    public List<CrmUserInfo> getCrmUserInfoFindAll() {
        return em.createNamedQuery("CrmUserInfo.findAll").getResultList();
    }
    
    
  @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
  public int changepostpaidLang(String p_subno,String p_lang){
  
        int x=     em.createQuery( "Update CrmUserInfo o set o.flexFld3='" + p_lang +
            "' where o.subno=:v_subno").setParameter("v_subno", p_subno).executeUpdate();
        
        return x;
      }
}
