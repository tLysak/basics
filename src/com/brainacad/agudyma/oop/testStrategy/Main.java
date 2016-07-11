package com.brainacad.agudyma.oop.testStrategy;


/**
 * Created by User on 11/07/2016.
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