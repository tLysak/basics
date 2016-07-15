package com.brainacad.lpyavka.lesson11.Animals;

import java.util.Comparator;

/**
 * Created by Sony on 22.05.2016.
 */
public class SiamCatComparator implements Comparator<SiamCat> {

    @Override
    public int compare(SiamCat cat1, SiamCat cat2) {
        return cat1.price -cat2.price;
    }
}
