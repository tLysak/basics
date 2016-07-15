package com.brainacad.skozigon.Labs.lads2_17.testthread7;//package com.brainacad.skozigon.Labs.lads2_17.testthread7;
//
///**
// * Created by skozigon on 29.06.2016.
// */
//public class DiningHall extends  Thread{
//    static int pizzaNum;
//    static int studentID;
//
//
//    public void makePizza() {
//        pizzaNum++;
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void run() {
//        public void servePizza () {
//            String result;
//            if (pizzaNum > 0) {
//                result = "Served ";
//                pizzaNum--;
//            } else result = "Starved ";
//            System.out.println(result + studentID);
//            studentID++;
//        }
//    }
//
//
//    public static void main(String[] args) {
//        DiningHall d = new DiningHall();
//        for (int i = 0; i < 10; i++)
//            d.makePizza();
//        for (int i = 0; i < 20; i++)
//            d.servePizza();
//    }
//}
//
