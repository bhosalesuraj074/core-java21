package com.core.booking;

import java.util.Arrays;
import java.util.Scanner;

public class FightBookingService {
    public static void main(String[] args) {
        int choice =0;
        int flightUpdateId= 0;
        FlightBooking flights[] = {
                new FlightBooking(101, "IndiGo", "Mumbai", "Delhi", "Economy"),
                new FlightBooking(102, "Air India", "Bangalore", "Hyderabad", "Business"),
                new FlightBooking(103, "SpiceJet", "Chennai", "Kolkata", "Premium Economy"),
                new FlightBooking(104, "Vistara", "Pune", "Ahmedabad", "First Class"),
                new FlightBooking(105, "GoAir", "Jaipur", "Goa", "Economy"),
                null
        };

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("**************************************************************************************************************");
            System.out.println("1: Display all the flight\n2: update the flight record\n3.delete the record by Id\n4.delete the all records\n5.exit");
            System.out.println("------------------------------------");
            System.out.println("Please enter your choice");
            choice = sc.nextInt();
            System.out.println("-------------------------------------");
            switch (choice) {

                case 1:
                    if (flights.length>=0){
                    FightBookingService.DisplayRecords(flights);
                    }
                    else {
                        System.out.println("No record found");
                    }

                    break;


                case 2:
                    System.out.println("Please enter the flightId of record which you want update");
                    flightUpdateId = sc.nextInt();
                    for (FlightBooking flight : flights){

                        if(flight !=null && flight.flightId == flightUpdateId){
                            FightBookingService.updateRecord(flight);
                        }
                    }

                    break;

                case 3:
                    System.out.println("Deleting the by id");
                    break;
                case 4 :
                    System.out.println("Deleting all the records");
                    break;
                case 5:
                    System.exit(0);
                    System.out.println("exited");
                    return;
            }

        } while (true);

    }
    //1.  Display the all records
    public static void DisplayRecords(FlightBooking []flights){
        System.out.println("Below are the records");
        for (FlightBooking flight: flights){
            if (flight != null) {
                System.out.println(flight.HotelDetails());
            }
        }
    }

    //2. updating the records
    public static void updateRecord(FlightBooking flight){
        Scanner sc =new Scanner(System.in);
        System.out.println("Details of the object");
        System.out.println(flight.HotelDetails());
        /*  this.flightId = flightId;
        this.airLine = airLine;
        this.from =from;
        this.to = to;
        this.seatType = seatType;*/
        System.out.println("Current flightId: "+ flight.flightId);

        System.out.println("Current airLine: "+ flight.airLine);
        System.out.println("Enter the new airLine name");
        flight.airLine = sc.nextLine();

        System.out.println("Current from: "+ flight.from);
        System.out.println("Enter the new  from where takeoff");
        flight.from = sc.nextLine();

        System.out.println("Current to: "+ flight.to);
        System.out.println("Enter the new to takeoff");
        flight.to = sc.nextLine();

        System.out.println("Current seatType: "+ flight.seatType);
        System.out.println("Enter the new seatType ");
        flight.seatType = sc.nextLine();
        System.out.println("Hola! Record updated successfully");


    }


}

