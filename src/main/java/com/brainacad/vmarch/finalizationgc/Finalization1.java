package com.brainacad.vmarch.finalizationgc;


public class Finalization1 {
    long someinfo;

    public Finalization1(long someinfo) {
        this.someinfo = someinfo;
    }

    @Override
    public String toString() {
        return "Finalization info: " + someinfo;
    }

    protected void finalize() {
        System.out.println("finalize invoked");
    }
}
