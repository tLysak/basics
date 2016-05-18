package com.brainacad.lpyavka.lesson9;

public class Computer extends Device {
    private int frequency;
    private int memory;

    public Computer() {
        System.out.println("We are in computer, child, constructor");
    }

    static {
        System.out.println("We are in a static block, child, computer");
    }

    {
        System.out.println("We are in non static block, child, computer");
    }

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
    public String getManufacturer() {
        return "NEW MANUFACTURER";
    }

    @Override
    public String toString() {
        return "Computer{" +
                "frequency=" + frequency +
                ", memory=" + memory +
                "} " + super.toString();
//        return String.format("Computer{" +%s + )
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Computer computer = (Computer) obj;
//        if ((frequency != computer.frequency) && (memory != computer.memory)) return false;
//        return true;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        if (!super.equals(o)) return false;

        Computer computer = (Computer) o;

        if (frequency != computer.frequency) return false;
        if (memory != computer.memory) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + frequency;
        result = 31 * result + memory;
        return result;
    }


//    @Override
//    public int hashCode() {
//        int result = frequency;
//        result = 31 * result + memory;
//        return result;
//    }

}

