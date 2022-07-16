package com.company;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Kwota kredytu: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Wpisz wartość z zakresu od 1000 do 1000000");
        }

        while (true) {
            System.out.print("Roczna stopa procentowa: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Wpisz wartość z zakresu od 1 do 30");
        }

        while (true) {
            System.out.print("Okres (Lata): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Wpisz wartość z zakresu od 1 do 30");
        }

        double mortgage = principal
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Miesięczna rata kredytu: " + mortgageFormatted);

//      // 1)
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
//
//        if (number % 5 == 0 && number % 3 == 0)
//            System.out.println("FizzBuzz");
//        else if (number % 5 == 0)
//            System.out.println("Fizz");
//        else if (number % 3 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(number);

//        // 2)
//        int [] numbers = { 2, 3, 5, 1, 4 };
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

//        // write your code here
//        int a = 17;
//        int b = 4;
//        int c = a + b; //=21
//        c = a / b;     //=4
//        System.out.println(c);
//        c = a % b;     //=1 ponieważ 4*4=16 i zostaje reszty 1, reszta z dzielenia.
//        System.out.println(c);

    }
}
