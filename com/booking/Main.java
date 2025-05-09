package com.booking;

import com.booking.cab.Cab;
import com.booking.interfaces.CabBooking;
import com.booking.services.CabBookingService;
import com.booking.services.FlightBookingService;
import com.booking.services.HotelBookingService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("---------------------- Welcome to the Booking Application ----------------------");

        do {
            System.out.println("\n----------------- Please select your ride -----------------");
            System.out.println("1: Hotel Booking");
            System.out.println("2: Flight Booking");
            System.out.println("3: Cab Booking");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    new HotelBookingService().welcomeHotelBookingService();

                    break;
                case 2:
                    new FlightBookingService().welcomeToFlightService();
                    break;
                case 3:
                    new CabBookingService().welcomeCabBookingService();
                    break;
                case 4:
                    System.out.println("Thanks for choosing us! Have a great day.");
                    break;
                default:
                    System.out.println("Invalid choice, please enter a number between 1 and 4.");
                    break;
            }
        } while (choice != 4);


    }
}