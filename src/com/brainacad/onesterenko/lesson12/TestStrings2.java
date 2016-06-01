package com.brainacad.onesterenko.lesson12;

/**
 * Created by user on 01.06.2016.
 */
public class TestStrings2 {
    public static void main(String[] args) {


        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        char [] myStr11 = myStr1.toCharArray();
        char [] myStr22 = myStr2.toCharArray();


        for (int i = 0; i < myStr11.length; i++) {
            for (int j =0; j<myStr22.length; j++){
                if (myStr11[i] == myStr22[j]){
                   System.out.println(myStr22[j]);
                }
        }
    }

}
}
