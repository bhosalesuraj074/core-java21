package com.oops.travel;

public class RecordNotFoundException extends Exception{
    static String msg = "Record Not found Exception";
    public RecordNotFoundException(){
        super(msg);
    }

    public RecordNotFoundException(String userMsg){
        super(userMsg);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
