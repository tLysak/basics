package com.brainacad.vmarch.lesson26.labor;


interface Subject {
    public void register(Observer obj);

    public void unregister(Observer obj);

    public void notifyObservers();
}


