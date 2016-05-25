package com.brainacad.agudyma.oop.teststring1;

/**
 * Created by Sidhartha on 22.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "abaracadabra";
        char aCharRA = myStr.charAt(9);
        int  aCharFirstIndex = myStr.indexOf("ra");
        int aCharLastIndex = myStr.lastIndexOf("ra");

        System.out.println(aCharRA +" " +aCharFirstIndex + " " +aCharLastIndex + " " );
    }

}
