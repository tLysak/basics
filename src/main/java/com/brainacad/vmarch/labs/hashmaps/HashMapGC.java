package com.brainacad.vmarch.labs.hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;


public class HashMapGC {
    public static void main(String[] args) throws InterruptedException {

        Map hashMap = new HashMap();

        Map weakHashMap = new WeakHashMap();
        String keyHashMap = new String("keyHM");
        String keyWeakHashMap = new String("keyWeakHM");
        hashMap.put(keyHashMap, "HashMap");
        weakHashMap.put(keyWeakHashMap, "WeakHashMap");
        System.gc();
        Thread.sleep(1000);
        System.out.println("Before: HM value:"
                + hashMap.get("keyHM")
                + " and Weak HM value:" + weakHashMap.get("keyWeakHM"));
        keyHashMap = null;
        keyWeakHashMap = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("After: HM value:"
                + hashMap.get("keyHM")
                + " and Weak HM value:" + weakHashMap.get("keyWeakHM"));

    }
}
