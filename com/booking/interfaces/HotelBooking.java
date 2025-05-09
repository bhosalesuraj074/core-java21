package com.booking.interfaces;
import com.booking.hotel.Hotel;

public interface HotelBooking {
    // Displaying all the records
    void DisplayRecords(Hotel[] hotels);

    // Insert new hotel details
    Hotel[] insertNewHotel(Hotel [] hotels);

    //Taking hotel details from the user
    Hotel setHotelDetails(int count);

    //updating hotel details
    Hotel updateHotelDetails(Hotel h);

    //Deleting the record
    Hotel deleteHotelRecord(Hotel h);
}
