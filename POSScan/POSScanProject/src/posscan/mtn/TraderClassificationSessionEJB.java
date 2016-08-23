package posscan.mtn;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface TraderClassificationSessionEJB {
    TraderClassification persistTraderClassification(TraderClassification traderClassification);

    TraderClassification mergeTraderClassification(TraderClassification traderClassification);

    void removeTraderClassification(TraderClassification traderClassification);

    List<TraderClassification> getTraderClassificationFindAll();
}
