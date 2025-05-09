package com.booking.flight;

import com.core.booking.flight.FlightBooking;

public class Flight {
    public int flightId;
    public String airLine;
    public String from;
    public String to;
    public String seatType;

    public Flight(){}

    public Flight(int flightId,String airLine, String from, String to, String seatType) {
        this.flightId = flightId;
        this.airLine = airLine;
        this.from = from;
        this.to = to;
        this.seatType = seatType;
    }

    public String flightDetails() {
        return "FlightBoking{" +
                "FlightId= '"+ flightId + '\''+
                "airLine='" + airLine + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", seatType='" + seatType + '\'' +
                '}';
    }
}
