package com.oops.travel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choise = 0 ;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Please enter the choice for the travel mode");
            System.out.println("1. Flight");
            System.out.println("2. Hotel");
            System.out.println("3. Cab");
            choise = sc.nextInt();

            switch (choise) {
                case 1:
                    new FlightService().flightOperation();
                    break;
                case 2:
                    new HotelService().hotelOperation();
                    break;
                case 3:
//                     new CabService();
                    break;
            }
        } while (choise != 4);
    }
}

