package com.quackology;

public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int numberOfQuacks; // a static variable to keep track

    public QuackCounter (Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}