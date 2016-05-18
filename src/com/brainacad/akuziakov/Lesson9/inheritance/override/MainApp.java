package com.brainacad.akuziakov.Lesson9.inheritance.override;

import com.brainacad.akuziakov.Lesson8_Jars.Lab2.*;

public class MainApp {
    public static void main(String[] args) {

        Computer myComputer=new Computer();
        System.out.println(myComputer);
        myComputer.view();

        NetworkAdapter myNetworkAdapter=new NetworkAdapter();
        System.out.println(myNetworkAdapter);

        Computer computer1=new Computer("Dell",1,500,4,2800);
        Computer computer2=new Computer("Samsung",2,500,2,2200);
        System.out.println(computer1.equals(computer2));
        computer1=computer2;
        System.out.println(computer1.equals(computer2));
    }
}
