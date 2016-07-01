package com.brainacad.tlysak.oop.testthread5;

public class Storage {

    private int state;
    private boolean printed;

    public Storage(final int var) {
        this.state = var;
    }

    public void setState(final int var) {
        state = var;
    }

    public int getState() {
        return state;
    }

    public boolean isPrinted() {
        return printed;
    }

    public void setPrinted(boolean printed) {
        this.printed = printed;
    }
}