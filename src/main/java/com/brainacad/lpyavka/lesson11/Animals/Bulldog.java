package com.brainacad.lpyavka.lesson11.Animals;

public class Bulldog extends Dog {
    public Bulldog(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void doSpeak() {
        System.out.println("Bark as a bulldog.");
    }
}
