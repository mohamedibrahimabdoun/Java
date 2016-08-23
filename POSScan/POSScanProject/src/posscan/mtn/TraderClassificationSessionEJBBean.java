package posscan.mtn;

import java.util.List;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "TraderClassificationSessionEJB", mappedName = "POSScan-POSScanProject-TraderClassificationSessionEJB")
public class TraderClassificationSessionEJBBean implements TraderClassificationSessionEJB {
    @PersistenceContext(unitName="POSScanProject")
    private EntityManager em;

    public TraderClassificationSessionEJBBean() {
    }

    public TraderClassification persistTraderClassification(TraderClassification traderClassification) {
        em.persist(traderClassification);
        return traderClassification;
    }

    public TraderClassification mergeTraderClassification(TraderClassification traderClassification) {
        return em.merge(traderClassification);
    }

    public void removeTraderClassification(TraderClassification traderClassification) {
        traderClassification = em.find(TraderClassification.class, traderClassification.getClassid());
        em.remove(traderClassification);
    }

    /** <code>select o from TraderClassification o</code> */
    public List<TraderClassification> getTraderClassificationFindAll() {
        return em.createNamedQuery("TraderClassification.findAll").getResultList();
    }
}
