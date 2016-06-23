package com.brainacad.vmarch.lesson13.wrapperdemo1;


public class MainWrapper1 {

    public static void main(String[] args) {
        Integer a1 = 20;
        Integer a2 = new Integer(20);
        Integer a3 = Integer.valueOf(20);
        Integer a4 = Integer.valueOf("20");

        if (a1 == a2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        if (a2 == a3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (a1 == a4) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (a3 == a4) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        if (a1.equals(a2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (a2.equals(a3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (a1.equals(a4)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (a3.equals(a4)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        int a = a1.compareTo(a2);
        System.out.println(a);

        a = a2.compareTo(a3);
        System.out.println(a);

        a = a1.compareTo(a4);
        System.out.println(a);

        a = a3.compareTo(a4);
        System.out.println(a);

    }


}
