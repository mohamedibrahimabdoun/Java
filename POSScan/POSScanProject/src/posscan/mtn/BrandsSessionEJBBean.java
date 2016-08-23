package posscan.mtn;

import java.util.List;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "BrandsSessionEJB", mappedName = "POSScan-POSScanProject-BrandsSessionEJB")
public class BrandsSessionEJBBean implements BrandsSessionEJB {
    @PersistenceContext(unitName="POSScanProject")
    private EntityManager em;

    public BrandsSessionEJBBean() {
    }

    public Brands persistBrands(Brands brands) {
        em.persist(brands);
        return brands;
    }

    public Brands mergeBrands(Brands brands) {
        return em.merge(brands);
    }

    public void removeBrands(Brands brands) {
        brands = em.find(Brands.class, brands.getBrid());
        em.remove(brands);
    }
    
  /** <code>select o from Brands o</code> */
  public List<Brands> getBrandsFindAll() {
      return em.createNamedQuery("Brands.findAll").getResultList();
  }
}
