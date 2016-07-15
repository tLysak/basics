package com.brainacad.agudyma.oop.testString2;

import java.util.Arrays;

/**
 * Created by Sidhartha on 22.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myStr1 = new String("Cartoon");
        String myStr2 = new String("Tomcat");
        if (myStr1 == myStr2) {
            System.out.println("These words are inequal");}
        else System.out.println("These words are not equal");
            int i = 0;
            int n = 0;
            char aChar1 = myStr1.charAt(i);
            char aChar2 = myStr2.charAt(n);


        for (i = 0; i < myStr1.length(); i++) {
            for (n = 0; n < myStr2.length(); n++) {
                if (myStr1.charAt(i) == myStr2.charAt(n)) {
                    System.out.println(myStr1.charAt(i) + " with index " + myStr1.indexOf(myStr1.charAt(i)) +" equals "+ myStr2.charAt(n));
                    ;
                }
//                System.out.println(myStr1.charAt(i) + " with index " + myStr1.indexOf(myStr1.charAt(i)) +" equals "+ myStr2.charAt(n));
            }
        }
        char[] charArray1 = myStr1.toCharArray();
             System.out.println(Arrays.toString(charArray1));
        char[] charArray2 = myStr2.toCharArray();
             System.out.println(Arrays.toString(charArray2));


        for (i = 0; i < charArray1.length; i++) {
            for (n = 0; n < charArray2.length; n++) {
                if (charArray1[i] == charArray2[n] ) {
                    System.out.println(myStr1.charAt(i) + " with index " + myStr1.indexOf(myStr1.charAt(i)) +" equals "+ myStr2.charAt(n) + " with index " + myStr2.indexOf(myStr2.charAt(n)));
                }

            }
        }
    }
}

