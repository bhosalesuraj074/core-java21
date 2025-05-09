package com.booking.services;

import com.booking.cab.Cab;
import com.booking.interfaces.CabBooking;

public class CabBookingService implements CabBooking {

    public  void welcomeCabBookingService(){
        System.out.println("********* Welcome to Cab Booking! ************");
    }

    @Override
    public void displayCab(Cab[] cabs) {

    }

    @Override
    public Cab[] insertNewCab(Cab[] cab) {
        return new Cab[0];
    }

    @Override
    public Cab setHotelDetails(int count) {
        return null;
    }

    @Override
    public Cab updateHotelDetails(Cab cab) {
        return null;
    }

    @Override
    public Cab deleteHotelRecord(Cab cab) {
        return null;
    }

}
