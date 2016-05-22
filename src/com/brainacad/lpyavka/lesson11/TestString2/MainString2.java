package com.brainacad.lpyavka.lesson11.TestString2;

public class MainString2 {
    public static void main(String[] args) {
        String myString1 = "Cartoon";
        String myString2 = "Tomcat";
        char[] cartoon = myString1.toLowerCase().toCharArray();

        StringBuilder newString = new StringBuilder("");
        myString2 = myString2.toLowerCase();
        for (char letter : cartoon) {
            int result = myString2.indexOf(letter);
            if (result == -1) {
                newString.append(letter).append(" ");
            }
        }
        System.out.println("Letters, which are present in \"Cartoon\", but absent in \"tomcat\": "
                + newString.toString());
    }
}
