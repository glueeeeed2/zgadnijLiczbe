package com.example.zgadnij_liczbe;

import java.util.Random;

public class Number {

    private  Random random;
    private  int generatedNumber;

    public Number(Random random) {
        this.random = random;
    }

     void generateRandomNumber() {
        this.generatedNumber = random.nextInt(1,12);
    }

    boolean checkIfSelectedNumberCorrect(int selected) {
        return generatedNumber == selected;
    }


    String showTip(int selected) {
        if (selected > generatedNumber) {
            return "Wieksza liczba!";
        } else {
            return "Mniejsza Liczba";
        }
    }


}
