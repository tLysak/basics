package com.brainacad.onesterenko.lesson12;

/**
 * Created by user on 01.06.2016.
 */
public class TestStrings3 {
    public static void main(String[] args) {


        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        char[] myStr11 = myStr1.toCharArray();
        char[] myStr22 = myStr2.toCharArray();
        char [] myStr33 = new char[myStr11.length + myStr22.length];
        int a =0;
        for (int i = 0; i < myStr11.length; i++) {
            for (int j = 0; j < myStr22.length; j++) {
                for (int k = 0; k < myStr33.length; k++){
                    if (myStr11[i] == myStr22[j]) {
                        myStr33[k]=myStr11[i];
                    }
                }

            }
        }
        for (a = 0; a < myStr33.length; a++) {
            for (int b = 0; b < myStr22.length; b++) {
                if (myStr33[a] != myStr22[b]){
                    System.out.println(myStr22[b]);
                }
            }
        }
        }
}
