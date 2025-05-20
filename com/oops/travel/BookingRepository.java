package com.oops.travel;

public interface BookingRepository<T> {
    void displayDetails();
    T insertDetails();
    void updateDetails(T h);
    void deleteRecord(int deleteId);
    void deleteAllRecord();
}
