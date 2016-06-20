package com.brainacad.vmarch.lesson12.teststrings3;


public class TestStrings3 {

    public static void uniqueChars(String s) {
        int i;
        int b = 0;
        System.out.print("Unique chars of the " + "\"" + s + "\": ");
        char[] chaMass = s.toCharArray();

        for (i = 0; i < chaMass.length; i++) {
            int j;
            int a = 0;

            String iter1 = String.valueOf(chaMass[i]);

            for (j = 0; j < chaMass.length; j++) {

                String iter2 = String.valueOf(chaMass[j]);

                if (iter1.equalsIgnoreCase(iter2)) {
                    a++;

                    if (j == chaMass.length - 1 && a == 1) {
                        if (b > 0) {
                            System.out.print(", ");
                        }
                        System.out.print(iter1);
                        b++;

                    }
                } else {
                    if (j == chaMass.length - 1 && a == 1) {
                        if (b > 0) {
                            System.out.print(", ");
                        }
                        System.out.print(iter1);
                        b++;
                    }
                }
            }
        }
        System.out.println(".");

    }

}