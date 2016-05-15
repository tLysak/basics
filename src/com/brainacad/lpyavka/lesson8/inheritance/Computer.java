package com.brainacad.lpyavka.lesson8.inheritance;

public class Computer extends Device {
    private int frequency = 500;
    private int memory = 489;

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
        return "Computer: " +
                "frequency= " + frequency +
                ", memory= " + memory +
                ". " + super.toString();
    }
}
