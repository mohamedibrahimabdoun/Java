package posscan.mtn;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface BrandsSessionEJB {
    Brands persistBrands(Brands brands);

    Brands mergeBrands(Brands brands);

    void removeBrands(Brands brands);
    
  public List<Brands> getBrandsFindAll();
}
