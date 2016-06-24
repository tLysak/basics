package com.brainacad.agudyma.oop.testThread3;

/**
 * Created by Sidhartha on 24.06.2016.
 */
public class MySumCount extends Thread{
    public  int startIndex;
    public int stopIndex;
    public long resultSum;
    public int [] arrOfInt = new int[1000];

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

    @Override
    public void run(){
        for (int i = 0; i > 10;i++){

            System.out.println(i);
        }
        try{
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public int sumOfArrayElements(){

        return 0;
    }

    public static void main(String[] args) {

    }






}
