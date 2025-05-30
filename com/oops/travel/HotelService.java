package com.oops.travel;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelService implements BookingRepository<Hotel> {
    ArrayList<Hotel> hotels = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int choice = 0;

    void hotelOperation() {
        defaultInitilization();
        System.out.println("----------------Welcome to Hotel service-----------------------");
        do {

            System.out.println("\n1: Display Hotels");
            System.out.println("2: Insert new hotel details");
            System.out.println("3: Update hotel details");
            System.out.println("4: Delete hotel record by ID");
            System.out.println("5: Delete all hotel records");
            System.out.println("6: Exit");
            System.out.println("**************************************************************************************");
            System.out.println("Please enter your Choice");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    displayDetails();
                    break;
                case 2:
                    hotels.add(insertDetails());
                    break;
                case 3:
                    System.out.println("Please Enter the Hotel Id which you want update");
                    int hotelId = sc.nextInt();
                    Hotel updateHotel = hotels.get(hotelId - 101);
                    updateDetails(updateHotel);
                    break;

                case 4:
                    System.out.println("Please enter the record you want delete");
                    int deleteId = sc.nextInt() - 101;
                    try {
                        if (deleteId > hotels.size()) {
                            throw new RecordNotFoundException("");
                        } else {
                            deleteRecord(deleteId);
                        }
                    } catch (RecordNotFoundException | ArrayIndexOutOfBoundsException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 5:
                    try {
                        if (hotels.isEmpty()) {
                            throw new RecordNotFoundException("There no record available ");
                        } else {
                            deleteAllRecord();
                        }
                    } catch (RecordNotFoundException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 6:
                    break;


                default:
                    System.out.println("Please enter the valid Choice");
                    break;
            }
        } while (choice != 6);
    }

    public void defaultInitilization() {
        hotels.add(new Hotel(101, "Grand Palace", "Mumbai", "Deluxe", "2025-APRIL"));
        hotels.add(new Hotel(102, "Ocean View", "Goa", "Sea View", "2025-APR"));
        hotels.add(new Hotel(103, "Mountain Lodge", "Manali", "Standard", "2025-MAY"));
    }

    @Override
    public void displayDetails() {
        try {
            if (hotels.isEmpty()) {
                throw new RecordNotFoundException("Record not available !!!");
            } else {
                System.out.println("Below are the Available hotels");
                for (Hotel hotel : hotels) {
                    System.out.println(hotel);
                }
            }
        } catch (RecordNotFoundException rec) {
            System.out.println(rec.getMessage());
        }
    }

    @Override
    public Hotel insertDetails() {
        System.out.println("Enter the new hotel details");
        Hotel h = new Hotel();
        int id = hotels.size() + 101;
        h.setHotelId(id);
        System.out.println("Please enter the Hotel Name");
        h.setHotelName(sc.next());
        System.out.println("Please enter the location");
        h.setLocation(sc.next());
        System.out.println("Please enter the check-in date");
        h.setCheckIn(sc.next());
        System.out.println("Please enter the room type");
        h.setRoomType(sc.next());
        return h;
    }

    @Override
    public void updateDetails(Hotel updatehotel) {
        System.out.println("Current hotel name: " + updatehotel.getHotelName());
        System.out.println("Enter new hotel name");
        updatehotel.setHotelName(sc.next());
        System.out.println("Current Location: " + updatehotel.getLocation());
        System.out.println("Please enter the new hotel location");
        updatehotel.setLocation(sc.next());
        System.out.println("Current check-in date: " + updatehotel.getCheckIn());
        System.out.println("please enter the new check-date");
        updatehotel.setCheckIn(sc.next());
        System.out.println("Current hotel room type: " + updatehotel.getRoomType());
        System.out.println("Please enter the new hotel room-type");
        updatehotel.setRoomType(sc.next());

        System.out.println("Hotel details updated successfully");
    }

    @Override
    public void deleteRecord(int deleteId) {
        hotels.remove(deleteId);
        System.out.println("Hotel removed...!");

    }

    @Override
    public void deleteAllRecord() {
        System.out.println("Are you sure, if so type 'yes' ");
        String flag = sc.next().toLowerCase();
        if (flag.matches("yes")) {
            hotels.clear();
            System.out.println("Removed all hotels details");
        } else
            System.out.println("Delete operation cancelled");
    }
}
