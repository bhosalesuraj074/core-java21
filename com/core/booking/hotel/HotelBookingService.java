package com.core.booking.hotel;

import java.util.Arrays;
import java.util.Scanner;


public class HotelBookingService implements HotelDraft {

    public static void main(String[] args) {
        // for getting i/p from the user

        Scanner sc = new Scanner(System.in);
        // for matching switch case
        int choise = 0;
        HotelBookingService HBS= new HotelBookingService();
        // dummy hotel object having size 3
        Hotel []hotels= new Hotel[3];
        // default initialization for the hotel object
        Hotel[] dummyHotels = HotelBookingService.defaultInitialization();
        // Increasing the size of the hotel object with help Arrays class
        hotels = Arrays.copyOf(dummyHotels, dummyHotels.length);
        do{
            printMsg("---------------------------------------------------------------------------------------------");
            printMsg("\n 1: Display Hotels \n 2: Insert new hotel details \n 3: Update hotel details \n 4: Delete hotel record by id \n 5: Delete All hotel records \n 6: exit");
            System.out.println();
            printMsg("Please enter you choice");
            choise = sc.nextInt();
            switch (choise){

                case 1 :
                        HBS.DisplayRecords(hotels);
                        break;

                case 2 :
                        hotels = Arrays.copyOf(HBS.insertNewHotel(hotels), hotels.length+1);
                        break;

                case 3:
                        int updateHotelId=0;
                        boolean flag=false;
                        printMsg("Please enter the hotel id record which you want to update");
                        updateHotelId = sc.nextInt();
                        for (Hotel h : hotels){
                            if(h.hotelId == updateHotelId){
                                System.out.println(HBS.updateHotelDetails(h).HotelDetails());
                                flag = true;
                            }
                        }
                        if (flag) printMsg("Record updated successfully");
                        else printMsg("please enter the valid hotelId");
                        break;

                case 4:
                        int deleteId=0;
                        boolean deleteFlag=false;
                        int counter=0;
                        printMsg("Please enter the record hotel id which you want to delete");
                        deleteId = sc.nextInt();
                        for (Hotel h : hotels){
                            if(h !=null && h.hotelId == deleteId){
                              hotels[counter]= HBS.deleteHotelRecord(h);
                                deleteFlag = true;
                            }
                            counter++;
                        }
                        if (deleteFlag) printMsg("record trashed ...");
                        else printMsg("please enter the valid hotel");
                        break;

                case 5:
                        printMsg("Are you want delete all records if so please type 'yes' ");
                        String isDelete= sc.next();
                        counter=0;
                        if (isDelete.toLowerCase().matches("yes")){
                            for (Hotel h : hotels){
                                hotels[counter]= HBS.deleteHotelRecord(h);
                                counter++;
                            }
                        }else{
                            printMsg("Delete operation cancelled");
                        }
                        break;
                case 6:

                       break;
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
    @Override
    public void DisplayRecords(Hotel []hotels){
        printMsg("Below are the listed hotels");
        for (Hotel hotel: hotels){
            if (hotel != null) {
                printMsg(hotel.HotelDetails());
            }
        }
    }
    
    // insert the new records
    @Override
    public  Hotel[] insertNewHotel(Hotel [] hotels){
        // setting the hotel details by passing the length of array for the id
        Hotel h = setHotelDetails(hotels.length);

        // Increase array size by 1
        int length = hotels.length + 1;
        Hotel[] arr = Arrays.copyOf(hotels, length);
        arr[length - 1] = h;
        printMsg("Hola! record added successfully");
        return  arr;
    }

    // function get the details of new hotel
    @Override
    public   Hotel setHotelDetails(int count){
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

    // updating the records by passing the id
    @Override
    public  Hotel updateHotelDetails(Hotel h){
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
    // delete record by assigning the 'null' value to the hotel object
    @Override
    public  Hotel deleteHotelRecord(Hotel h){
        h=null;
        return h;
    }

    //Printing the msg

    public static void printMsg(String msg){
        System.out.println(msg);
    }
}
