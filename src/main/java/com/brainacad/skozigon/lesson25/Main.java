package com.brainacad.skozigon.lesson25;

/**
 * Created by skozigon on 11.07.2016.
 */
public class Main {

    public static void main(String[] args) {
        Context context  = new Context();
        context.setContext(new AddOperation());
        System.out.println("33 + 32 = " + context.executeStrategy(33, 32));
        context.setContext(new SubOperation());
        System.out.println("33 - 32 = " + context.executeStrategy(33, 32));
        context.setContext(new MultOperation());
        System.out.println("33 * 32 = " + context.executeStrategy(33, 32));
    }
}

interface Strategy{
    public int doOperation(int num1, int num2);
}

class AddOperation implements Strategy {

    @Override
    public int doOperation(int num1, int num2){
        return num1+num2;
    }
}

class SubOperation implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}

class Context {
    private Strategy strategy;
    public void setContext(Strategy strategy){
        this.strategy = strategy;
    }
    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}

class MultOperation implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
