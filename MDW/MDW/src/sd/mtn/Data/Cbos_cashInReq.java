package sd.mtn.Data;

public class Cbos_cashInReq {
    String managerMSISDN;
    String amount;
    String pin;
    String destConsumerIdentifier;

    public void setManagerMSISDN(String managerMSISDN) {
        this.managerMSISDN = managerMSISDN;
    }

    public String getManagerMSISDN() {
        return managerMSISDN;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public void setDestConsumerIdentifier(String destConsumerIdentifier) {
        this.destConsumerIdentifier = destConsumerIdentifier;
    }

    public String getDestConsumerIdentifier() {
        return destConsumerIdentifier;
    }
}
