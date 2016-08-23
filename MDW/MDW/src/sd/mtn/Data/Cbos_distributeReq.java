package sd.mtn.Data;

public class Cbos_distributeReq{
    String sourceIdentifier;
    Long amount;
    String pin;
    String destIdentifier;
    Boolean cashTransfer;
    String ipin;
    String expDate;

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

    public void setDestIdentifier(String destIdentifier) {
        this.destIdentifier = destIdentifier;
    }

    public String getDestIdentifier() {
        return destIdentifier;
    }

    public void setCashTransfer(Boolean cashTransfer) {
        this.cashTransfer = cashTransfer;
    }

    public Boolean getCashTransfer() {
        return cashTransfer;
    }

    public void setIpin(String ipin) {
        this.ipin = ipin;
    }

    public String getIpin() {
        return ipin;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }
}
