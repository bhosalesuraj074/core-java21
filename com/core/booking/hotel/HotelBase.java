package com.core.booking.hotel;

public class HotelBase {
    public int hotelId;
    public String hotelName;
    public String location;

    public  HotelBase(){}


    public HotelBase(int hotelId, String hotelName, String location) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.location = location;
    }

    public String HotelDetails() {
        return "HotelBase{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
