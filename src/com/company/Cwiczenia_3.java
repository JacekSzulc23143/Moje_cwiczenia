package com.company;

public class Cwiczenia_3 {

    public static void main(String[] args) {

        int probability;
        int randomDamagedPart;

        System.out.println();
        System.out.println("(1)");
        probability = (int) (Math.random() * (10));
        if (probability == 1) {
            System.out.println("Marian nie stanął na wysokości zadania, zleć naprawę innemu mechanikowi.");
            System.out.println("Losowa liczba to: " + probability);
        } else {
            System.out.println("Marian naprawił samochód.");
            System.out.println("=========================");
        }

        System.out.println();

        System.out.println("(2)");
        probability = (int) (Math.random() * (10));
        if (probability == 1 || probability == 2) {
            System.out.println("Jurek nie stanął na wysokości zadania, zleć naprawę innemu mechanikowi.");
            System.out.println("Losowa liczba to: " + probability);
        } else {
            System.out.println("Jurek naprawił samochód.");
            System.out.println("=========================");
        }

        System.out.println();

        System.out.println("(3)");
        probability = (int) (Math.random() * (5));
        if (probability == 1) {
            System.out.println("Grzegorz nie stanął na wysokości zadania, zleć naprawę innemu mechanikowi.");
            System.out.println("Losowa liczba to: " + probability);
        } else {
            System.out.println("Grzegorz naprawił samochód.");
            System.out.println("=========================");
        }

//        randomDamagedPart = (int) (Math.random() * (20)); // losowanie uszkodzonej części samochodu
//        System.out.println(randomDamagedPart);
    }
}
