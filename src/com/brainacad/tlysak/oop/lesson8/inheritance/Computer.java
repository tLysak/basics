package com.brainacad.tlysak.oop.lesson8.inheritance;

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

}
