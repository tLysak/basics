package com.brainacad.lpyavka.lesson11.Animals;

public abstract class Dog implements Speakable {
    int price;
    double weight;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog has ");
        sb.append("price=").append(price);
        sb.append(" and weight=").append(weight);
        sb.append('.');
        return sb.toString();
    }
}
