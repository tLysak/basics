package com.brainacad.akuziakov.lesson23.testthread5;

public class Storage {

    private int variable;

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    private boolean isReady;

    public Storage(final int var) {
        this.variable = var;
        isReady=false;
    }

    public void setVariable(final int var) {
        variable = var;
    }

    public int getVariable() {
        return variable;
    }
}
