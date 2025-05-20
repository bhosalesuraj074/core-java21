package com.amazon;

public class AmazonPay {
    private int EMIPlan;
    private double interest;
    private double price;
    private double interestAmount;

    public AmazonPay(int EMIPlan, double interest, double price) {
        this.EMIPlan = EMIPlan;
        this.interest = interest;
        this.price = price;
        this.interestAmount = (price * interest * EMIPlan) / (100 * 12);
    }

    public int getEMIPlan() {
        return EMIPlan;
    }

    public void setEMIPlan(int EMIPlan) {
        this.EMIPlan = EMIPlan;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(double interestAmount) {
        this.interestAmount = interestAmount;
    }

    @Override
    public String toString() {
        return "AmazonPay {" +
                "Price = " + price +
                ", EMI Plan = " + EMIPlan + " months" +
                ", Interest Rate = " + interest + "%" +
                ", Interest Amount = " + interestAmount +
                ", Total Payable = " + (price + interestAmount) +
                ", Monthly EMI = " + ((price + interestAmount) / EMIPlan) +
                " }";
    }
}
