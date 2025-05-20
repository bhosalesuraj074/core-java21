package com.oops.travel;



import java.util.ArrayList;
import java.util.Scanner;

public class FlightService implements BookingRepository<Flight> {
    ArrayList<Flight> flights = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int choice = 0;

    public void flightOperation() {
        defaultInitialization();
        System.out.println("----------------Welcome to Flight service-----------------------");
        do {

            System.out.println("\n1: Display Flight");
            System.out.println("2: Insert new flight details");
            System.out.println("3: Update flight details");
            System.out.println("4: Delete flight record by ID");
            System.out.println("5: Delete all flight records");
            System.out.println("6: Exit");
            System.out.println("**************************************************************************************");
            System.out.println("Please enter your Choice");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    displayDetails();
                    break;

                case 2:
                    flights.add(insertDetails());
                    break;

                case 3:
                    System.out.println("Please Enter the Hotel Id which you want update");
                    int flightId = sc.nextInt();
                    Flight updatedFlight = flights.get(flightId -101);
                    updateDetails(updatedFlight);
                    break;

                case 4:
                    System.out.println("Please enter the record you want delete");
                    int deleteId = sc.nextInt() - 101;
                    try {
                        if (deleteId > flights.size()) {
                            throw new RecordNotFoundException("Flight Not found exception");
                        } else {
                            deleteRecord(deleteId);
                        }
                    } catch (RecordNotFoundException | ArrayIndexOutOfBoundsException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 5:
                    deleteAllRecord();
                    break;

                case 6:
                    break;

            }
        }while (choice != 6) ;
    }

    @Override
    public void displayDetails() {
        System.out.println("Below aew the flight available");
        for(Flight flight: flights){
            System.out.println(flight.toString());
        }
    }

    @Override
    public Flight insertDetails() {
        System.out.println("Enter the new flight details");
        Flight f = new Flight();
        f.setFlightId(flights.size() + 101);
        System.out.println("Please enter the Airline name");
        f.setAirLine(sc.next());
        System.out.println("Please enter the 'from' takeoff");
        f.setFrom(sc.next());
        System.out.println("please enter the 'to' land");
        f.setTo(sc.next());
        System.out.println("Please enter the seatType");
        f.setSeatType(sc.next());
        return f;
    }

    @Override
    public void updateDetails(Flight flight) {
        System.out.println("Details of the object");
        System.out.println(flight.toString());

        System.out.println("Current flightId: "+ flight.getFlightId());

        System.out.println("Current airLine: "+ flight.getAirLine());
        System.out.println("Enter the new airLine name");
        flight.setAirLine(sc.next());

        System.out.println("Current from: "+ flight.getFrom());
        System.out.println("Enter the new  from where takeoff");
        flight.setFrom(sc.next());

        System.out.println("Current landing to: "+ flight.getTo());
        System.out.println("Enter the new landing");
        flight.setTo(sc.next());

        System.out.println("Current seatType: "+ flight.getSeatType());
        System.out.println("Enter the new seatType ");
        flight.setSeatType(sc.next());

        System.out.println("Hola! Record updated successfully");
    }

    @Override
    public void deleteRecord(int deleteId) {
        flights.remove(deleteId);
        System.out.println("Flight record removed...!");

    }

    @Override
    public void deleteAllRecord() {
        System.out.println("Are you sure, if so type 'yes' ");
        String flag = sc.next().toLowerCase();
        if (flag.matches("yes")) {
            flights.clear();
            System.out.println("Removed all hotels details");
        } else
            System.out.println("Delete operation cancelled");
    }

    public void defaultInitialization(){

                flights.add(new Flight(101, "IndiGo", "Mumbai", "Delhi", "Economy"));
                flights.add(new Flight(102, "Air India", "Bangalore", "Hyderabad", "Business"));
                flights.add(new Flight(103, "SpiceJet", "Chennai", "Kolkata", "Premium Economy"));
                flights.add(new Flight(104, "Vistara", "Pune", "Ahmedabad", "First Class"));
                flights.add(new Flight(105, "GoAir", "Jaipur", "Goa", "Economy"));


    }
}
