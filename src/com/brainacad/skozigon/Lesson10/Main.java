package com.brainacad.skozigon.Lesson10;

import java.util.Arrays;
import java.util.Comparator;

class CatComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        SiamCat siamCat1 = (SiamCat) o1;
        SiamCat siamCat2 = (SiamCat) o2;
        if (siamCat1.prise < siamCat2.prise) return -1;
        if (siamCat1.prise > siamCat2.prise) return 1;
        return 0;
    }
}

class SiamCat extends Cat {
    SiamCat(int prise) {
        this.prise = prise;
    }

    @Override
    public void doSpeak() {
        System.out.println("Speak like a siam cat " + prise);
    }
}

public class Main {
    public static void main(String[] args) {
        Cat[] cat = {new SiamCat(100), new SiamCat(150), new SiamCat(200), new SiamCat(50), new SiamCat(5), new SiamCat(75)};

        CatComparator comparator = new CatComparator();

        Arrays.sort(cat, comparator);
        for (Cat sp : cat) {
            sp.doSpeak();
        }
    }
}
