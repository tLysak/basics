package com.brainacad.agudyma.oop.testStrategy;

/**
 * Created by User on 11/07/2016.
 */
public class Context {
    private Strategy strategy;
    public void setContext(Strategy strategy){
        this.strategy = strategy; }
    public int executeStrategy(int num1, int num2){ return strategy.doOperation(num1, num2);
    }

}
