package com.brainacad.lpyavka.lesson11.TestString2;

public class MainString2 {
    public static void main(String[] args) {
        String myString1 = "Cartoon";
        String myString2 = "Tomcat";
        String[] cartoon = myString1.toLowerCase().split("");

        StringBuilder newString = new StringBuilder("");
        myString2 = myString2.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (String letter : cartoon) {

            //TODO THIS IS NOT MY; REFACTOR
          if(myString2.contains(letter) && !result.toString().contains(letter)) {
              result.append(letter);
          }
        }
        System.out.println("Letters, which are present in \"Cartoon\", but absent in \"tomcat\": "
                + result.toString());
    }
}
