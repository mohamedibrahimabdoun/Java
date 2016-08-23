package sd.mtn.Data;

public class Cbos_stratCashOutReq {
  String sourceIdentifier;
  Long amount;
  String pin;
  String cashOutAt;
  Boolean cashOutAll;

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getAmount() {
        return amount;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public void setCashOutAt(String cashOutAt) {
        this.cashOutAt = cashOutAt;
    }

    public String getCashOutAt() {
        return cashOutAt;
    }

    public void setCashOutAll(Boolean cashOutAll) {
        this.cashOutAll = cashOutAll;
    }

    public Boolean getCashOutAll() {
        return cashOutAll;
    }
}
