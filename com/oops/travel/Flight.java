package com.oops.travel;

public class Flight {
    private int flightId;
    private String airLine;
    private String from;
    private String to;
    private String seatType;

    public  Flight(){
    }

    public Flight(int flightId, String airLine, String from, String to, String seatType) {
        this.flightId = flightId;
        this.airLine = airLine;
        this.from = from;
        this.to = to;
        this.seatType = seatType;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getAirLine() {
        return airLine;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", airLine='" + airLine + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", seatType='" + seatType + '\'' +
                '}';
    }

}
