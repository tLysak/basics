package com.brainacad.onesterenko.lesson23;

/**
 * Created by User on 11/07/2016.
 */
 class SubOperation implements Strategy {
    @Override
    public int doOperation(int num1, int num2){
        return num1-num2;
    }
}

