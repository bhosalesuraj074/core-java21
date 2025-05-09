package com.booking.services;

import com.booking.hotel.Hotel;
import com.booking.interfaces.HotelBooking;
import java.util.Scanner;
import java.util.Arrays;


public class HotelBookingService implements HotelBooking {
    // Switch choice
    static int choice = 0;

    // HotelBookingService object
   static HotelBookingService HBS = new HotelBookingService();

    // Taking user input
    Scanner sc = new Scanner(System.in);

    // Dummy hotel object having size 3
    Hotel[] hotels = new Hotel[3];

    // Default initialization for the hotel object
    Hotel[] dummyHotels = HotelBookingService.defaultInitialization();




    public void welcomeHotelBookingService() {
        hotels = Arrays.copyOf(dummyHotels, dummyHotels.length);
        System.out.println("Welcome to Hotel Booking!");

        do {
            printMsg("---------------------------------------------------------");
            printMsg("\n1: Display Hotels");
            printMsg("2: Insert new hotel details");
            printMsg("3: Update hotel details");
            printMsg("4: Delete hotel record by ID");
            printMsg("5: Delete all hotel records");
            printMsg("6: Exit");

            System.out.println();
            printMsg("Please enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printMsg("Welcome to Display Hotels!");
                    HBS.DisplayRecords(hotels);
                    break;

                case 2:
                    printMsg("Welcome to Insert New Hotel!");
                    hotels = Arrays.copyOf(HBS.insertNewHotel(hotels), hotels.length + 1);
                    break;

                case 3:
                    printMsg("Welcome to Update Hotel!");
                    int updateHotelId;
                    boolean flag = false;
                    printMsg("Please enter the hotel ID record you want to update:");
                    updateHotelId = sc.nextInt();

                    for (Hotel h : hotels) {
                        if (h.hotelId == updateHotelId) {
                            System.out.println(HBS.updateHotelDetails(h).hotelDetails());
                            flag = true;
                        }
                    }
                    if (flag) printMsg("Record updated successfully.");
                    else printMsg("Please enter a valid hotel ID.");
                    break;

                case 4:
                    printMsg("Welcome to Delete Hotel Record!");
                    int deleteId;
                    boolean deleteFlag = false;
                    int counter = 0;
                    printMsg("Please enter the hotel ID record you want to delete:");
                    deleteId = sc.nextInt();
                    for (Hotel h : hotels) {
                        if (h != null && h.hotelId == deleteId) {
                            hotels[counter] = HBS.deleteHotelRecord(h);
                            deleteFlag = true;
                        }
                        counter++;
                    }
                    if (deleteFlag) printMsg("Record deleted successfully.");
                    else printMsg("Please enter a valid hotel ID.");
                    break;

                case 5:
                    printMsg("Welcome to Delete All Hotel Records!");
                    printMsg("Are you sure you want to delete all records? Type 'yes' to confirm:");
                    String isDelete = sc.next();
                    counter = 0;

                    if (isDelete.equalsIgnoreCase("yes")) {
                        for (Hotel h : hotels) {
                            hotels[counter] = HBS.deleteHotelRecord(h);
                            counter++;
                        }
                        printMsg("All records deleted successfully.");
                    } else {
                        printMsg("Delete operation canceled.");
                    }
                    break;

                case 6:
                    printMsg("Thank you for choosing US!! \n Hotel Booking Service!");
                    break;

                default:
                    printMsg("Invalid choice, please select a number between 1 and 6.");
                    break;
            }
        } while (choice != 6);
    }

    public static Hotel[] defaultInitialization() {
        return new Hotel[]{
                new Hotel(101, "Grand Palace", "Mumbai", "2025-APRIL", "Deluxe"),
                new Hotel(102, "Ocean View", "Goa", "2025-APR", "Sea View"),
                new Hotel(103, "Mountain Lodge", "Manali", "2025-MAY", "Standard"),
                new Hotel(104, "Royal Stay", "Jaipur", "2025-June", "Suite"),
                new Hotel(105, "Urban Retreat", "Bangalore", "2025-JULY", "Executive"),
        };
    }

    public static void printMsg(String str) {
        System.out.println(str);
    }

    @Override
    public void DisplayRecords(Hotel[] hotels) {
        printMsg("Below are the listed hotels");
        for (Hotel hotel : hotels){
            if (hotel != null) {
                printMsg(hotel.hotelDetails());
            }
        }
    }

    @Override
    public Hotel[] insertNewHotel(Hotel[] hotels) {
        // setting the hotel details by passing the length of array for the id
       Hotel h = setHotelDetails(hotels.length);

        // Increase array size by 1
        int length = hotels.length + 1;
        Hotel[] arr = Arrays.copyOf(hotels, length);
        arr[length - 1] = h;
        printMsg("Hola! record added successfully");
        return  arr;
    }

    @Override
    public Hotel updateHotelDetails(Hotel h) {
        Scanner sc = new Scanner(System.in);
        printMsg("Current Hotel Name: "+ h.hotelName);
        printMsg("Enter new hotel Name");
        h.hotelName= sc.next();

        printMsg("Current Hotel location: "+ h.location);
        System.out.println("Enter new hotel location");
        h.location= sc.next();

        printMsg("Current check-in: "+ h.hotelName);
        System.out.println("Enter new check-in date");
        h.checkIn= sc.next();

        printMsg("Current Room type: "+ h.hotelName);
        printMsg("Enter new Room type");
        h.roomType= sc.next();

        return h;
    }

    @Override
    public Hotel deleteHotelRecord(Hotel h) {
        h=null;
        return h;
    }
    public Hotel setHotelDetails(int count){
        Scanner sc =new Scanner(System.in);
        printMsg("Please enter the new record");
        Hotel h = new Hotel();
        h.hotelId = 101+count;
        printMsg("Please enter the hotel name");
        h.hotelName = sc.next();
        printMsg("Please enter the location");
        h.location = sc.next();
        printMsg("please enter the check-in date");
        h.checkIn = sc.next();
        printMsg("please enter the roomType");
        h.roomType = sc.next();
        return h;
    }
}