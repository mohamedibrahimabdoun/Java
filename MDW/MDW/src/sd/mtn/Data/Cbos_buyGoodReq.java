package sd.mtn.Data;

public class Cbos_buyGoodReq {
  String sourceIdentifier;
  long amount;
  String pin;
  long destIdentifier;
  String transactionName;


    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getAmount() {
        return amount;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public void setDestIdentifier(long destIdentifier) {
        this.destIdentifier = destIdentifier;
    }

    public long getDestIdentifier() {
        return destIdentifier;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public String getTransactionName() {
        return transactionName;
    }
}
