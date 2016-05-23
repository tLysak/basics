package com.brainacad.skozigon.Lesson10.oop.tetstring2;

/**
 * Created by skozigon on 23.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        myStr1 = myStr1.toLowerCase();
        myStr2 = myStr2.toLowerCase();
        char c ;

        System.out.println("First method:");

        for (int i = 0; i <myStr1.length() ; i++) {
            c = myStr1.charAt(i);
            for (int j = 0; j <myStr2.length() ; j++) {
                if(c == myStr2.charAt(j)){
                    System.out.print(c + " ");
                }
            }
        }
        System.out.println("\nSecond method:");
        StringBuilder sb = new StringBuilder();
        char[] myString1 = new char[myStr1.length()];
        char[] myString2 = new char[myStr2.length()];
        myString1 = myStr1.toCharArray();
        myString2 = myStr2.toCharArray();


        for (int i = 0; i < myString1.length; i++) {
            for (int j = 0; j <myString2.length ; j++) {
                if(myString1[i] == myString2[j]){
                    sb.append(myString1[i]);
                }
            }
        }

        System.out.println(sb);

        System.out.println("\nThird method:");

        StringBuilder sb2 = new StringBuilder();
        for (char ch : myString1) {
            int result = myStr2.indexOf(ch);
            if (result >=0) {
                sb2.append(ch);
            }
        }
        System.out.println(sb2);
    }
}
