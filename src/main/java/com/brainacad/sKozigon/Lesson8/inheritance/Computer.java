package com.brainacad.skozigon.Lesson8.inheritance;

/**
 * Created by skozigon on 13.05.2016.
 */
public class Computer extends Device{

    private int frequency = 25;
    private  int memory = 1024;

    public Computer(double price, long serialNumber, String manufacture) {
        super(price, serialNumber, manufacture);

    }

    String[] string = new String[]{"first", "second", "third"};

    public Computer() {

    }


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
        return String.format("Computer:\t%d%smemory: \t%d",frequency,System.lineSeparator(),memory);
    }
//

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null||getClass()!=obj.getClass()) return true;
        Computer computer = (Computer) obj;

        if((frequency!= computer.frequency) && (memory!=computer.memory)) return false;

        return true;
    }


    @Override
    public String getManufacture() {
        return "Chu Huan Di";
    }

    @Override
    public int hashCode() {
        int result = memory+frequency;
        int str_hash =0;
        for (int i = 0; i <string.length ; i++) {
            str_hash += string[i].hashCode();
        }
        result+=str_hash;
        return 31*result;
    }
}
