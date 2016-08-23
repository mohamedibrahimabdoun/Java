package sd.mtn.Billing;

import java.util.List;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "TabsSessionEJB", mappedName = "MDW-MDW-TabsSessionEJB")
public class TabsSessionEJBBean implements TabsSessionEJB {
    @PersistenceContext(unitName="MDW")
    private EntityManager em;

    public TabsSessionEJBBean() {
    }

    /** <code>select o from CrmUserEquipments o where o.subno=:v_subno</code> */
    public List<CrmUserEquipments> getCrmUserEquipments(String p_subno) {
        return em.createNamedQuery("CrmUserEquipments.findbysubno").setParameter("v_subno", p_subno).getResultList();
    }
    
  /** <code>select o from CcmGetData o where o.subno=:v_subno</code> */  
  public List<CcmGetData> getCcmGetData(String v_subno) {
      return em.createNamedQuery("CcmGetData.findBySubno").setParameter("p_subno", v_subno).getResultList();
  }
  
  public List<VwMdwPospaidBasciinfo> getPostpaidBasicInfo(String p_subno) {
      return em.createNamedQuery("VwMdwPospaidBasciinfo.findBySubno").setParameter("v_subno", p_subno).getResultList();
  }
  

}
