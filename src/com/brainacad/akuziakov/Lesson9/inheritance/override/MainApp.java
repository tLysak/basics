package com.brainacad.akuziakov.Lesson9.inheritance.override;

import com.brainacad.akuziakov.Lesson8_Jars.Lab2.*;

public class MainApp {
    public static void main(String[] args) {

        Computer myComputer=new Computer();
        System.out.println(myComputer);
        myComputer.view();

        NetworkAdapter myNetworkAdapter=new NetworkAdapter();
        System.out.println(myNetworkAdapter);
    }
}
