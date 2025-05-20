package com.amazon;

public class DebitCardEMI {
    private String bankName;
    private double EMIPlan;
    private double interestRate;
    private double interestAmount;

    public DebitCardEMI(String bankName, double EMIPlan, double interestRate, double price) {
        this.bankName = bankName;
        this.EMIPlan = EMIPlan;
        this.interestRate = interestRate;
        this.interestAmount = price * EMIPlan * interestRate /100;
    }


}
