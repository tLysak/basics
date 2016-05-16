package com.brainacad.agudyma.lesson8.inheritance;

/**
 * Created by User on 16.05.2016.
 */
public class Main {
    public static void main(String[] args) {
            Computer myComputer1 = new Computer();
            Computer myComputer2 = new Computer();
        //// TODO: 16.05.2016 different values in myComputer1 and myComputer2 
        
        if (myComputer1 == myComputer2)
            System.out.println("true");
        else
            System.out.println("false");

        System.out.println(myComputer1.equals(myComputer2));

            System.out.println(myComputer1.hashCode());

            System.out.println(myComputer2.hashCode());

        if (myComputer1.hashCode() == myComputer2.hashCode())
            System.out.println("Contract is implemented");
        else
            System.out.println("Contract is not implemented");
    }
}
