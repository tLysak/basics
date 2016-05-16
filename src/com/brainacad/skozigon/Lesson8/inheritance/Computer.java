package com.brainacad.skozigon.Lesson8.inheritance;

/**
 * Created by skozigon on 13.05.2016.
 */
public class Computer extends Device{
    private int frequency = 25;
    private  int memory = 1024;

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "Computer:\n" + "frequency: " + frequency + "\nmemory: " + memory;
    }
    @Override
    public boolean equals(Object obj) {
        if (getClass()!= obj.getClass())
            return false;

        return true;
    }

}
