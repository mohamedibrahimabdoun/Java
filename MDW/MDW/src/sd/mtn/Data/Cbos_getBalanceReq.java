package sd.mtn.Data;

public class Cbos_getBalanceReq {
  String sourceIdentifier;
  String pin; 
  Boolean isConsumer;


    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public void setIsConsumer(Boolean isConsumer) {
        this.isConsumer = isConsumer;
    }

    public Boolean getIsConsumer() {
        return isConsumer;
    }
}
