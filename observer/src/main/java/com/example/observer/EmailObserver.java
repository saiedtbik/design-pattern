package com.example.observer;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
public class EmailObserver implements Observer {

    private String[] emailList;

    public EmailObserver(String ... emailList) {
        this.emailList = emailList;
    }

    @Override
    public void update(Observable observable, Object o) {
        for(String email : emailList){
            System.out.println("Send Email for " + email);
        }
    }
}
