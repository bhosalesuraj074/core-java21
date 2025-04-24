package com.core.booking.hotel;

import com.core.booking.flight.FlightBooking;

import java.util.Arrays;
import java.util.Scanner;

public class HotelBookingService {

    public static void main(String[] args) {
        // for getting i/p from the user
        Scanner sc = new Scanner(System.in);
        // for matching switch case
        int choise = 0;

        // dummy hotel object having size 3
        Hotel []hotels= new Hotel[3];
        // default initialization for the hotel object
        Hotel dummyHotels[]  = HotelBookingService.defaultInitialization();
        // Increasing the size of the hotel object with help Arrays class
        hotels = Arrays.copyOf(dummyHotels, dummyHotels.length);
        do{
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println("\n 1: Display Hotels \n 2: Insert new hotel details \n 3: Update hotel details \n 4: Delete hotel record by id \n 5: Delete All hotel records \n 6: exit");
            System.out.println();
            System.out.println("Please enter you choice");
            choise = sc.nextInt();
            switch (choise){

                case 1 :
                         HotelBookingService.DisplayRecords(hotels);
                         break;

                case 2 :
                        hotels = Arrays.copyOf(HotelBookingService.insertNewHotel(hotels), hotels.length+1);
                        break;

                case 3:


            }
        }while (choise != 6);

    }

    public static Hotel[]  defaultInitialization(){
       return  new Hotel[] {
                new Hotel(101, "Grand Palace", "Mumbai", "2025-APRIL", "Deluxe"),
                new Hotel(102, "Ocean View", "Goa", "2025-APR", "Sea View"),
                new Hotel(103, "Mountain Lodge", "Manali", "2025-MAY", "Standard"),
                new Hotel(104, "Royal Stay", "Jaipur", "2025-June", "Suite"),
                new Hotel(105, "Urban Retreat", "Bangalore", "2025-JULY", "Executive"),
        };
    }
// Display the all the records
    public static void DisplayRecords(Hotel []hotels){
        System.out.println("Below are the listed hotels");
        for (Hotel hotel: hotels){
            if (hotel != null) {
                System.out.println(hotel.HotelDetails());
            }
        }
    }

// insert the new records
    public static Hotel[] insertNewHotel(Hotel [] hotels){
        // setting the hotel details by passing the length of array for the id
        Hotel h = setHotelDetails(hotels.length);

        // Increase array size by 1
        int length = hotels.length + 1;
        Hotel[] arr = Arrays.copyOf(hotels, length);

        if (h != null) {
            arr[length - 1] = h;
            System.out.println("Hola! record added successfully");
        }
        else {
            System.out.println("please enter valid details");
            return  hotels;
        }
        return  arr;
    }

    // function get the details of new hotel
    public  static  Hotel setHotelDetails(int count){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the new record");
        Hotel h = new Hotel();
        h.hotelId = 101+count;
        System.out.println("Please enter the hotel name");
        h.hotelName = sc.next();
        System.out.println("Please enter the location");
        h.location = sc.next();
        System.out.println("please enter the check-in date");
        h.checkIn = sc.next();
        System.out.println("please enter the roomType");
        h.roomType = sc.next();
        return h;
    }

    // updating the records by passing the id

}
