package Data_Registration;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface TypesSessionEJB {
    Types persistTypes(Types types);

    Types mergeTypes(Types types);

    void removeTypes(Types types);

    List<Types> getTypesFindAll(); 
}
