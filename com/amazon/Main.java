package com.amazon;

public class Main {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        //int productId, String productName, String productDescription, int price, int rating, EMIOption emi
        amazon.setProductId(101);
        amazon.setProductName("NNEX by BAJAJ Glyde A70 BLDC 1200 MM");
        amazon.setProductDescription("BEE 5 Star Rated Premium Ceiling Fan with Remote | 20% Higher Air Thrust* | Airfluence™ Al Blades | 2-Yr Warranty | 5-Yr Motor Warranty 【Mist Brown】");
        amazon.setPrice(4599);
        amazon.setRating(4);
        AmazonPay amazonPay = new AmazonPay(6, 15, amazon.getPrice());
        amazon.setEmi(amazonPay);

        System.out.println(amazon);
    }
}
