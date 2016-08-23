package DataRegistration;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
  @NamedQuery(name = "Types.findAll", query = "select o from Types o")
})
public class Types implements Serializable {
    @Column(name="ID_SIDES")
    private Long idSides;
    @Id
    @Column(name="ID_TYPE", nullable = false)
    private Long idType;
    @Column(name="TYPE_NAME", length = 300)
    private String typeName;

    public Types() {
    }

    public Types(Long idSides, Long idType, String typeName) {
        this.idSides = idSides;
        this.idType = idType;
        this.typeName = typeName;
    }

    public Long getIdSides() {
        return idSides;
    }

    public void setIdSides(Long idSides) {
        this.idSides = idSides;
    }

    public Long getIdType() {
        return idType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
