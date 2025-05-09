package com.booking.interfaces;
import com.booking.flight.Flight;

public interface FlightBooking {
    //printing all Flight the details
    void displayFlight(Flight[] flight);

    // insert new Flight details
    Flight[] insertNewFlight(Flight[] flight);

    //Taking Flight details from the user
    Flight setFlightDetails(int count);

    //updating Flight details
    void updateFlightDetails(Flight flight);

    //Deleting the record
    Flight deleteFlightRecord(Flight flight);

}
