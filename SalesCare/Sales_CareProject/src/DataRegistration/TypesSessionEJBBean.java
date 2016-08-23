package DataRegistration;

import java.util.List;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "TypesSessionEJB", mappedName = "SalesCare-Sales_CareProject-TypesSessionEJB")
public class TypesSessionEJBBean implements TypesSessionEJB {
    @PersistenceContext(unitName="Sales_CareProject")
    private EntityManager em;

    public TypesSessionEJBBean() {
    }

    public Types persistTypes(Types types) {
        em.persist(types);
        return types;
    }

    public Types mergeTypes(Types types) {
        return em.merge(types);
    }

    public void removeTypes(Types types) {
        types = em.find(Types.class, types.getIdType());
        em.remove(types);
    }

    /** <code>select o from Types o</code> */
    public List<Types> getTypesFindAll() {
        return em.createNamedQuery("Types.findAll").getResultList();
    }
}
