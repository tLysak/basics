package com.brainacad.lpyavka.lesson11.Animals;

public class SiamCat extends Cat implements Comparable<SiamCat>{

    public SiamCat(int price) {
        this.price = price;
    }

    @Override
    public void doSpeak() {
        System.out.println("Speak like Siam cat.");
    }

    @Override
    public int compareTo(SiamCat  that) {
        SiamCat siamCat = that;
        if (this.price < siamCat.price) {
            return -1;
        } else if (this.price > siamCat.price) {
            return 1;
        } else {
            return 0;
        }
    }
}

