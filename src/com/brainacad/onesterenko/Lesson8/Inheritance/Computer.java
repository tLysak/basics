package com.brainacad.onesterenko.Lesson8.Inheritance;

/**
 * Created by User on 13.05.2016.
 */
public class Computer extends Device {
    int frequency;
    int memory;

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
