package com.brainacad.skozigon.Lesson10.oop.teststring1;

/**
 * Created by skozigon on 22.05.2016.
 */
public class Main {

    static void reverseString(String str){
        String string = "";
        for (int i = str.length()-1; i>=0 ; i--) {
            string+=str.charAt(i);

        }
        System.out.println("Reverse string: " + string);
        return ;
    }

    public static void main(String[] args) {
        String myString = "abracadabra";
        System.out.println("First index of substring <<ra>> is: " + myString.indexOf("ra")) ;
        System.out.println("Last index of substring <<ra>> is: " + myString.lastIndexOf("ra")) ;
        String substring = "";



        for (int i = 2 ; i <=7 ; i++) {
            substring+=myString.charAt(i);
        }
        System.out.println("Substring of myStr from 3 to 7 char index is: " + substring);


        System.out.println("First method reverse string:");
        Main.reverseString(myString);

        System.out.println("Second method reverse string:");
        StringBuilder sb = new StringBuilder();
        sb.append(myString);
        System.out.println("Reverse string: " + sb.reverse());

    }
}
