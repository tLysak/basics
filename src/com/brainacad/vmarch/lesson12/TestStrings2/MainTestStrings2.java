package com.brainacad.vmarch.lesson12.TestStrings2;


public class MainTestStrings2 {

    public static void main(String[] args) {

        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        System.out.print("The letters, has \"Cartoon\", but absent \"Tomcat\": ");

        int i, j, b = 0;

        for (i = 0; i < myStr1.length(); i++) {
            int a = 0;

            for (j = 0; j < myStr2.length(); j++) {

                String subStr1 = myStr1.substring(i, i + 1);
                String subStr2 = myStr2.substring(j, j + 1);

                if (subStr1.equalsIgnoreCase(subStr2)) {
                    j = myStr2.length() - 1;

                } else {

                    a++;

                    if (a == myStr2.length()) {

                        if (b > 0) {
                            System.out.print(", ");
                        }

                        System.out.print(subStr1);
                        b++;
                    }
                }
            }
        }
        System.out.println(".");
    }
}