package com.brainacad.vmarch.lesson12.TestStrings1;


public class MainTestStrings1 {

    static String reverseString(String a) {

        StringBuffer abs = new StringBuffer(a);
        abs.reverse();
        return abs.toString();
    }

    public static void main(String[] args) {

        String myStr = "abracadabra";
        int raFirst = myStr.indexOf("ra");
        System.out.println("First “ra” substring  of \"abracadabra\" value: " + raFirst);

        int raLast = myStr.lastIndexOf("ra");
        System.out.println("Last “ra” substring  of \"abracadabra\" value: " + raLast);

        String pieceOfLiteral = myStr.substring(3, 7);
        System.out.println("Piece of \"abracadabra\" from 3 to 7 is: " + pieceOfLiteral);

        String reversed = reverseString(myStr);
        System.out.println("Revers of \"abracadabra\" is: " + reversed);

    }
}
