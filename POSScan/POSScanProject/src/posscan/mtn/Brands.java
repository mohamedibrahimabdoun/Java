package posscan.mtn;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
  @NamedQuery(name = "Brands.findAll", query = "select o from Brands o")
})
public class Brands implements Serializable {
    private String brand;
    @Id
    @Column(nullable = false)
    private Long brid;
    private Long status;

    public Brands() {
    }

    public Brands(String brand, Long brid, Long status) {
        this.brand = brand;
        this.brid = brid;
        this.status = status;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getBrid() {
        return brid;
    }

    public void setBrid(Long brid) {
        this.brid = brid;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}
