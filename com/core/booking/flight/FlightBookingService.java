package com.core.booking.flight;

import java.util.Arrays;
import java.util.Scanner;

public class FlightBookingService {
    public static void main(String[] args) {
        int choice =0;
        int flightUpdateId= 0;
        int flightRemoveId= 0;
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
            System.out.println("1: Display all the flight\n2: update the flight record\n3: delete the record by Id\n4: delete the all records\n5: exit");
            System.out.println("------------------------------------");
            System.out.println("Please enter your choice");
            choice = sc.nextInt();
            System.out.println("-------------------------------------");
            switch (choice) {


                 /*there in this bug code we don't remove the element from the just assign null which record we want to delete,
                 due to array are the fixed size once its initialized then , we can't able to modify the array size
                */
                case 1:
                    if (flights.length>=0){
                    FlightBookingService.DisplayRecords(flights);
                    } else {
                        System.out.println("No record found");
                    }
                    break;

                case 2:
                    System.out.println("Please enter the flightId of record which you want update");
                    flightUpdateId = sc.nextInt();
                    boolean flag=true;
                    for (FlightBooking flight : flights){

                        if(flight !=null && flight.flightId == flightUpdateId){
                            FlightBookingService.updateRecord(flight);
                            flag = false;
                        }

                    }
                    if (flag){
                        System.out.println("entered record not available ");
                    }

                    break;

                case 3:
                    System.out.println("please flight id which record want to remove");
                    flightRemoveId = sc.nextInt();
                    int result=  FlightBookingService.deleteFlightById(flightRemoveId, flights);
                    if(result >=0){
                        flights[result]=null;
                        System.out.println("Record deleted successfully");
                    }
                    else {
                        System.out.println("No such record found");
                    }
                    break;

                case 4 :

                        Arrays.fill(flights, null);

                    System.out.println("all the records deleted successfully");
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

        System.out.println("Current landing to: "+ flight.to);
        System.out.println("Enter the new landing");
        flight.to = sc.nextLine();

        System.out.println("Current seatType: "+ flight.seatType);
        System.out.println("Enter the new seatType ");
        flight.seatType = sc.nextLine();
        System.out.println("Hola! Record updated successfully");


    }

    // deleting the record by flight id
    public static int deleteFlightById(int id , FlightBooking[] flights){
        boolean isAvailable = false;
        int counter=0;
        for (FlightBooking flight: flights){
            if (flight != null && flight.flightId == id){
                isAvailable = true;
                break;
            }
            counter++;
        }
        return isAvailable ? counter : -1;
    }


}

