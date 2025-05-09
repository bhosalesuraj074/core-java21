package com.oops.travel;

public class Hotel {
    private int hotelId;
    private String hotelName;
    private String location;
    private String checkIn;
    private String roomType;

    public Hotel(){}
    public Hotel(int hotelId, String hotelName, String location, String roomType, String checkIn) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.location = location;
        this.roomType = roomType;
        this.checkIn = checkIn;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", location='" + location + '\'' +
                ", checkIn='" + checkIn + '\'' +
                ", roomType='" + roomType + '\'' +
                '}';
    }
}
