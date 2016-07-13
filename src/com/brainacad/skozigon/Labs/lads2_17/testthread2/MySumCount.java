package com.brainacad.skozigon.Labs.lads2_17.testthread2;


/**
 * Created by skozigon on 22.06.2016.
 */
public class MySumCount extends Thread{
    private int startIndex;
    private int stopIndex;

    private int arr[];

    private long resultSum;


    @Override
    public void run() {
        for (int i = startIndex; i < (stopIndex-startIndex-1); i++) {
            resultSum+=arr[i];
        }

    }

    public long getResultSum() {
        return resultSum;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }


}
