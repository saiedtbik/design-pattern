package com.example.observer;

import java.util.Observable;

public class MessageSubject extends Observable {

    public void sendMessage(String message){
        setChanged();
        notifyObservers(message);
    }
}
