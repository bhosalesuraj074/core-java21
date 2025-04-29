package com.core.booking.hotel;

public class Hotel extends HotelBase{

    public String checkIn;
    public String roomType;

    public  Hotel(){}

    public Hotel(String checkIn, String roomType) {
        this.checkIn = checkIn;
        this.roomType = roomType;
    }

    public Hotel(int hotelId, String hotelName, String location, String checkIn, String roomType ){
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.location = location;
        this.checkIn = checkIn;
        this.roomType = roomType;
    }

    public String HotelDetails() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", location='" + location + '\'' +
                ", checkIn='" + checkIn + '\'' +
                ", room='" + roomType + '\'' +
                '}';
    }
}
