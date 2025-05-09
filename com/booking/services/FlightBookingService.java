package com.booking.services;

import com.booking.flight.Flight;
import com.booking.interfaces.FlightBooking;

import java.util.Arrays;
import java.util.Scanner;

public class FlightBookingService implements FlightBooking {
    // Switch choice
    static int choice = 0;

    // HotelBookingService object
    static FlightBookingService FBS = new FlightBookingService();

    // Taking user input
    Scanner sc = new Scanner(System.in);

    // Dummy hotel object having size 3
    Flight[] flights = new Flight[3];

    // Default initialization for the hotel object
    Flight[] dummyFlights = FlightBookingService.defaultInitialization();




    public  void welcomeToFlightService(){
        System.out.println("Welcome to Flight Booking!");
        flights = Arrays.copyOf(dummyFlights, dummyFlights.length);
        do {
            printMsg("---------------------------------------------------------");
            printMsg("\n1: Display flights");
            printMsg("2: Insert new flights details");
            printMsg("3: Update flights details");
            printMsg("4: Delete flights record by ID");
            printMsg("5: Delete all flights records");
            printMsg("6: Exit");
            System.out.println();
            printMsg("Please enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    FBS.displayFlight(flights);
                    break;
                case 2:

                     flights = Arrays.copyOf(FBS.insertNewFlight(flights), flights.length+1);
                     break;
                case 3:

                    System.out.println("Please enter the flightId of record which you want update");
                    int flightUpdateId = sc.nextInt();
                    boolean flag=true;
                    for (Flight flight : flights){

                        if(flight !=null && flight.flightId == flightUpdateId){
                            FBS.updateFlightDetails(flight);
                            flag = false;
                        }

                    }
                    if (flag){
                        System.out.println("entered record not available ");
                    }
                      break;

                case 4 :
                    int deleteId;
                    boolean deleteFlag = false;
                    int counter = 0;
                    printMsg("Please enter the Flight Id record you want to delete:");
                    deleteId = sc.nextInt();
                    for (Flight flight : flights){
                        if (flight != null && flight.flightId == deleteId){
                            flights[counter]  = FBS.deleteFlightRecord(flight);
                            deleteFlag = true;

                        }
                        counter++;
                    }
                    if (deleteFlag) printMsg("Flight Record deleted successfully.");
                    else printMsg("Please enter a valid hotel ID.");
                    break;
                case 5:
                    Arrays.fill(flights, null);
                    break;

                case 6:
                    break;
            }
        }while (choice !=6);
        printMsg("Existing from the hotel service");
    }

    public  static  Flight[]  defaultInitialization(){
        return new Flight[] {
                new Flight(101, "IndiGo", "Mumbai", "Delhi", "Economy"),
                new Flight(102, "Air India", "Bangalore", "Hyderabad", "Business"),
                new Flight(103, "SpiceJet", "Chennai", "Kolkata", "Premium Economy"),
                new Flight(104, "Vistara", "Pune", "Ahmedabad", "First Class"),
                new Flight(105, "GoAir", "Jaipur", "Goa", "Economy"),
        };
    }

    public static void printMsg(String str){
        System.out.println(str);
    }


    @Override
    public void displayFlight(Flight[] flights) {
        printMsg("Below are the listed flight");
        for (Flight flight : flights){
            if (flight != null) {
                printMsg(flight.flightDetails());
            }
        }
    }

    @Override
    public Flight[] insertNewFlight(Flight[] flights) {
        // setting the hotel details by passing the length of array for the id
       Flight f = setFlightDetails(flights.length);
        // Increase array size by 1
        int length = flights.length + 1;
        Flight[] arr = Arrays.copyOf(flights, length);
        arr[length - 1] = f;
        printMsg("Hola! record added successfully");
        return  arr;

    }

    @Override
    public Flight setFlightDetails(int count) {
        Flight f = new Flight();
        f.flightId = 101+ count;
        printMsg("please enter the Airlines");
        f.airLine = sc.next();
        printMsg("Please enter the 'from' takeoff");
        f.from = sc.next();
        printMsg("please enter the 'to' land");
        f.to = sc.next();
        printMsg("please enter the seatType");
        f.seatType = sc.next();
        return  f;
    }

    @Override
    public void updateFlightDetails(Flight flight) {
        System.out.println("Details of the object");
        System.out.println(flight.flightDetails());

        System.out.println("Current flightId: "+ flight.flightId);

        System.out.println("Current airLine: "+ flight.airLine);
        System.out.println("Enter the new airLine name");
        flight.airLine = sc.nextLine();

        System.out.println("Current from: "+ flight.from);
        System.out.println("Enter the new  from where takeoff");
        flight.from = sc.nextLine();

        System.out.println("Current landing to: "+ flight.to);
        System.out.println("Enter the new landing");
        flight.to = sc.nextLine();

        System.out.println("Current seatType: "+ flight.seatType);
        System.out.println("Enter the new seatType ");
        flight.seatType = sc.nextLine();
        System.out.println("Hola! Record updated successfully");

    }

    @Override
    public Flight deleteFlightRecord(Flight flight) {
        return null;
    }
}
