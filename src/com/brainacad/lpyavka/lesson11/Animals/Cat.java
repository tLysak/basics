package com.brainacad.lpyavka.lesson11.Animals;

abstract class Cat implements Speakable {
    int price;

    public Cat() {

    }

    public  Cat(int price) {
        this.price = price;
    }

    public abstract void doSpeak();

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cat has ");
        sb.append("price= ").append(price);
        sb.append('.');
        return sb.toString();
    }
}

