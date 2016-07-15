package com.brainacad.vmarch.lesson17.testenum3;


public class Card {
    String ranc;
    String suit;

    Card(String cardSuit, String cardRank) {
    }

    public String getRanc() {
        return ranc;
    }

    public void setRanc(String ranc) {
        this.ranc = ranc;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {

        for (RancEnum ranc : RancEnum.values()) {
            setRanc(ranc.toString());
            System.out.println();

            for (SuitEnum suit : SuitEnum.values()) {
                setSuit(suit.toString());

                System.out.println(ranc.toString() + "_" + suit.toString());
            }
        }
        System.out.println();
        return "Finish";
    }
}
