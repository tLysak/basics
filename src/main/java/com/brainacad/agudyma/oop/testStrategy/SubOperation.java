package com.brainacad.agudyma.oop.testStrategy;

/**
 * Created by User on 11/07/2016.
 */
public class SubOperation implements Strategy {


        @Override
        public int doOperation(int num1, int num2) {
            return num1 - num2;
        }
    }

