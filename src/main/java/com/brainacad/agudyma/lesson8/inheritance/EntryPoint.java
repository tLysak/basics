//package com.brainacad.agudyma.lesson8.inheritance;
//
//import com.brainacad.tlysak.oop.*;
//
//import java.util.Random;
//
///**
// * Created by User on 16.05.2016.
// */
//public class EntryPoint {
//
//    private static final int RANGE = 9999999;
//
//    public static void main(String[] args) {
//        com.brainacad.tlysak.oop.Computer[] computers = new com.brainacad.tlysak.oop.Computer[]{new com.brainacad.tlysak.oop.Computer(),
//                new com.brainacad.tlysak.oop.Computer(), new com.brainacad.tlysak.oop.Computer(), new com.brainacad.tlysak.oop.Computer()};
//
//        Random random = new Random();
//        for(com.brainacad.tlysak.oop.Computer currentComputer : computers) {
//            currentComputer.setSerialNumber(random.nextInt(RANGE));
//        }
//
//        for(com.brainacad.tlysak.oop.Computer currentComputer : computers) {
//            float currentPrice = currentComputer.getPrice();
//            currentComputer.setPrice(currentPrice * 1.1f);
//        }
//
//        for(com.brainacad.tlysak.oop.Computer currentComputer : computers) {
//            currentComputer.printStateToConsole();
//        }
//
//
//    }
//
//
//}
