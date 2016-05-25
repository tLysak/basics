package com.brainacad.lpyavka.lesson11.TestString;

public class MainString {
    public static void main(String[] args) {
        String myString = "abracadabra";
        int value1 = myString.indexOf("ra");
        System.out.println("Index of the first “ra” substring  of \"abracadabra\" is " + value1 + ".");

        int value2 = myString.lastIndexOf("ra");
        System.out.println("Index of the last “ra” substring of  \"abracadabra\" is " + value2 + ".");

        String substring1 = myString.substring(3, 7);
        System.out.println("Substring of \"abracadabra\" from 3 to 7 char index is " + substring1 + ".");

        System.out.println(" \"abracadabra\" reversed to " + reverseString(myString));
    }

    static String reverseString(String str) {
        char[] letters = str.toCharArray();
        StringBuilder newStr = new StringBuilder("");
        for (int i = letters.length - 1; i >= 0; i--) {
            newStr.append(letters[i]);
        }
        return newStr.toString();
    }
}
