package com.amazon;

public class CreditCardEMI {
    private String bankName;
    private double EMIPlan;
    private double interestRate;
    private double interestAmount;

    public CreditCardEMI(String bankName, double EMIPlan, double interestRate, double price) {
        this.bankName = bankName;
        this.EMIPlan = EMIPlan;
        this.interestRate = interestRate;
        this.interestAmount = price * interestRate * EMIPlan /100;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getEMIPlan() {
        return EMIPlan;
    }

    public void setEMIPlan(int EMIPlan) {
        this.EMIPlan = EMIPlan;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(double interestAmount) {
        this.interestAmount = interestAmount;
    }

    @Override
    public String toString() {
        return "CreditCardEMI{" +
                "bankName='" + bankName + '\'' +
                ", EMIPlan=" + EMIPlan +
                ", interestRate=" + interestRate +
                ", interestAmount=" + interestAmount +
                '}';
    }
}
