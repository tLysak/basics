package com.brainacad.onesterenko.lesson23.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 11/07/2016.
 */
 class MyTopic implements Subject {
    private List<Observer> observers;
    private String message;
    public MyTopic(){

        this.observers = new ArrayList<>();
    }
    @Override
    public void register(Observer obj){
        observers.add(obj);
    }
    @Override
    public void unregister (Observer obj){
        observers.remove(obj);
    }
    @Override
    public void notifyObservers(){
        for (Observer obj: observers){
            obj.update(this.message);
        }
    }
    public void postMessage(String msg){
        System.out.println("Message Posted to Topic: " + msg);
        this.message = msg;
        notifyObservers();
    }

}
