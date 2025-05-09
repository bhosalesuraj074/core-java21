package com.booking.interfaces;

import com.booking.cab.Cab;
import com.core.booking.hotel.Hotel;

public interface CabBooking {

    //printing all cab the details
    void displayCab(Cab []cabs);

    // insert new cab details
    Cab[] insertNewCab(Cab[] cab);

    //Taking cab details from the user
    Cab setHotelDetails(int count);

    //updating cab details
    Cab updateHotelDetails(Cab cab);

    //Deleting the record
    Cab deleteHotelRecord(Cab cab);


}
