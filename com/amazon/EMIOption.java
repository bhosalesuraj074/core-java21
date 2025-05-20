package com.amazon;

public class EMIOption {
private AmazonPay amazonPay;
private DebitCardEMI debitCardEMI;
private CreditCardEMI creditCardEMI;

    public EMIOption(AmazonPay amazonPay) {
        this.amazonPay = amazonPay;
    }

    public EMIOption(DebitCardEMI debitCardEMI) {
        this.debitCardEMI = debitCardEMI;
    }

    public EMIOption(CreditCardEMI creditCardEMI) {
        this.creditCardEMI = creditCardEMI;
    }

    public EMIOption(AmazonPay amazonPay, DebitCardEMI debitCardEMI, CreditCardEMI creditCardEMI) {
        this.amazonPay = amazonPay;
        this.debitCardEMI = debitCardEMI;
        this.creditCardEMI = creditCardEMI;
    }

    public AmazonPay getAmazonPay() {
        return amazonPay;
    }

    public void setAmazonPay(AmazonPay amazonPay) {
        this.amazonPay = amazonPay;
    }

    public DebitCardEMI getDebitCardEMI() {
        return debitCardEMI;
    }

    public void setDebitCardEMI(DebitCardEMI debitCardEMI) {
        this.debitCardEMI = debitCardEMI;
    }

    public CreditCardEMI getCreditCardEMI() {
        return creditCardEMI;
    }

    public void setCreditCardEMI(CreditCardEMI creditCardEMI) {
        this.creditCardEMI = creditCardEMI;
    }

    @Override
    public String toString() {
        return "EMIOption{" +
                "amazonPay=" + amazonPay +
                ", debitCardEMI=" + debitCardEMI +
                ", creditCardEMI=" + creditCardEMI +
                '}';
    }
}
