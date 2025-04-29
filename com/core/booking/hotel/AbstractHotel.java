package com.core.booking.hotel;

abstract class AbstractHotel {
    abstract void DisplayRecords(Hotel []hotels);
    abstract Hotel[] insertNewHotel(Hotel [] hotels);
    abstract Hotel setHotelDetails(int count);
    abstract Hotel updateHotelDetails(Hotel h);
    abstract Hotel deleteHotelRecord(Hotel h);
}