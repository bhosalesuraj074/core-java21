package com.core.booking;

public class FlightBooking {
    public int flightId;
    public String airLine;
    public String from;
    public String to;
    public String seatType;

    public FlightBooking(){}

    public FlightBooking(int flightId,String airLine, String from, String to, String seatType){
        this.flightId = flightId;
        this.airLine = airLine;
        this.from =from;
        this.to = to;
        this.seatType = seatType;
    }
    public FlightBooking(FlightBooking[]fBooking){
    }

    public String HotelDetails() {
        return "FlightBoking{" +
                "FlightId= '"+ flightId + '\''+
                "airLine='" + airLine + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", seatType='" + seatType + '\'' +
                '}';
    }
}
