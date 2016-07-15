package com.brainacad.onesterenko.lesson23.observer;

/**
 * Created by User on 11/07/2016.
 */
interface Subject {
    public void register(Observer obj);
    public void unregister(Observer obj);
    public void notifyObservers();
}
interface Observer {
    public void update(String str);
}
