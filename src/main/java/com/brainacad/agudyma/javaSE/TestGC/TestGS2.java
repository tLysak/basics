package com.brainacad.agudyma.javaSE.TestGC;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by User on 7/29/2016.
 */
public class TestGS2 {
    public static void main(String[] args) throws InterruptedException {
        Map hashMap = new HashMap();
        Map weakHashMap = new WeakHashMap();
        String keyHashMap = new String("keyHM");
        String keyWeakHashMap = new String("keyWeakHM");
        hashMap.put(keyHashMap,"HashMap");
        weakHashMap.put(keyWeakHashMap,"WeakHashMap");
        System.gc();
        Thread.sleep(2000);
        System.out.println("Before:HM value: " +
        hashMap.get("keyHM")+
                " and Weak HM value: " +
                weakHashMap.get("keyWeakHM"));

        keyHashMap = null;
        keyWeakHashMap = null;
        System.gc();
        Thread.sleep(2000);
        System.out.println("After: HM value: " +
        hashMap.get("keyHM")+
        " and weak HM values: " +
        weakHashMap.get("keyWeakHM"));

    }
}
