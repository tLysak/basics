package com.brainacad.agudyma.oop.TestObserver;

/**
 * Created by User on 11/07/2016.
 */

interface Subject {
    public void register(Observer obj);
    public void unregister(Observer obj);
    public void notifyObservers();
}