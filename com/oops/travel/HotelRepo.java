package com.oops.travel;

public interface HotelRepo {
    void displayDetails();
    Hotel insertDetails();
    void updateDetails(Hotel h);
    void deleteRecord(int deleteId);
    void deleteAllRecord();

}
