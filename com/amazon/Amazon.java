package com.amazon;

public class Amazon {
    private int productId;
    private String productName;
    private  String productDescription;
    private int price;
    private int rating;
    private EMIOption emi;

    public Amazon(int productId, String product, String productDescription, int price, int rating, EMIOption emi) {
        this.productId = productId;
        this.productName = product;
        this.productDescription = productDescription;
        this.price = price;
        this.rating = rating;
        this.emi = emi;
    }

    public Amazon() {

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public EMIOption getEmi() {
        return emi;
    }

    public void setEmi(EMIOption emi) {
        this.emi = emi;
    }

    public void setEmi(AmazonPay amazonPay) {
        this.emi = new EMIOption(amazonPay);
    }

    public void setEmi(DebitCardEMI debitCardEMI) {
        this.emi = new EMIOption(debitCardEMI);
    }

    public void setEmi(CreditCardEMI creditCardEMI) {
        this.emi = new EMIOption(creditCardEMI);
    }
    public AmazonPay getAmazonPayEmi() {
        return emi != null ? emi.getAmazonPay() : null;
    }

    public DebitCardEMI getDebitCardEmi() {
        return emi != null ? emi.getDebitCardEMI() : null;
    }

    public CreditCardEMI getCreditCardEmi() {
        return emi != null ? emi.getCreditCardEMI() : null;
    }

    @Override
    public String toString() {
        return "Amazon{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", emi=" + emi +
                '}';
    }
}
