package com.example.observer;
import java.util.Observable;
import java.util.Observer;

public class PhoneObserver implements Observer {

    private String[] phoneList;

    public PhoneObserver(String ... emailList) {
        this.phoneList = emailList;
    }

    @Override
    public void update(Observable observable, Object o) {
        for(String phone : phoneList){
            System.out.println("Send SMS for " + phone);
        }
    }
}
