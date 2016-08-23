package sd.mtn.Data;

public class Cbos_moneyTransferReq {
String consumerIdentifier;
Long amount;
String pin;
String destIdentifier;

    public void setConsumerIdentifier(String consumerIdentifier) {
        this.consumerIdentifier = consumerIdentifier;
    }

    public String getConsumerIdentifier() {
        return consumerIdentifier;
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
}
