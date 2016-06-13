package com.brainacad.vmarch.lesson8.incheritance;

public class Computer extends Device {
    private int frequency;
    private int memory;


    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(final int frequency) {
        this.frequency = frequency;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(final int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {

        return "This object is Computer" + memory + frequency;
    }

}
