package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cwiczenia_2 {

    public static void main(String[] args) {


//        // Zadanie 1:
//        // 1. Utwórz w main tablice liczb całkowitych i umieść w niej 10 liczb
//        // 2. Wypisz liczby od końca
//
//        //               0  1  2  3  4  5  6  7  8  9
//        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 9; i >= 0; i--) {
//            System.out.println(numbers[i]);
//        }

//        // Zadanie 2:
//        // 1. Utwórz w main tablice stringów i umieść w niej nazwy miesięcy.
//        // 2. Wypisz miesiące parzyste
//
//        String months[] = {"January", "February", "March", "April", "May", "Jun", "July", "August", "September",
//                "October", "November", "December"};
//        for (int i = 1; i < months.length; i += 2) {
//            System.out.println(months[i]);
//        }

//        // Zadanie 3:
//        // 1. Utwórz w main tablice zwierząt (Animal), umieść w niej kilka zwierząt domowych, kilka zwierząt
//        // hodowlanych i 2 ludzi.
//        // 2. Wypisz te zwierzęta, których jedzenie jest zakazane
//
//        String animals[] = {"Kociamber", "Piesior", "Chomikens", "Kokodylen", "Wołowina", "Drób", "Kaczyński",
//                "Morawiecki"};
//        System.out.println(animals[0]);
//        System.out.println(animals[1]);
//        System.out.println(animals[2]);

//        Scanner myObj = new Scanner(System.in);
//
//        System.out.println("Enter numbers:");
//
//        // Numerical input
//        int number = myObj.nextInt();
//
//        // Output input
//        System.out.println("Number: " + number);

//        // initializing unsorted int array
//        int iArr[] = {2, 1, 9, 6, 4};
//
//        // let us print all the elements available in list
//        for (int number : iArr) {
//            System.out.println("Number = " + number);
//        }
//
//        // sorting array
//        Arrays.sort(iArr);
//
//        // let us print all the elements available in list
//        System.out.println("The sorted int array is:");
//        for (int number : iArr) {
//            System.out.println("Number = " + number);
//        }

//        // Zadanie nr 6
//        // zrobiła studentka
//        System.out.println("How many numbers?");
//
//        Scanner myArrLength = new Scanner(System.in);
//        String arrLength = myArrLength.nextLine();
//        int intArrLength = Integer.parseInt(arrLength);
//
//        System.out.println("Enter numbers");
//
//        String[] numbers = new String[intArrLength];
//        Scanner myNumber = new Scanner(System.in);
//        for (int i = 0; i < intArrLength; i++) {
//            numbers[i] = myNumber.nextLine();
//        }
//
//        Arrays.sort(numbers);
//
//        System.out.println("Your sorted array: ");
//        for (int i = 0; i < intArrLength; i++) {
//            System.out.println(numbers[i]);
//        }

//        // Zadanie nr 6 (moja wersja) nie potrzeba dwóch Scanner'ów
//        System.out.println("Ile liczb?");
//
//        Scanner myArrLength = new Scanner(System.in);
//        int arrLength = myArrLength.nextInt();
//
//        System.out.println("Wpisz liczby");
//
//        int[] numbers = new int[arrLength];
//        Scanner myNumber = new Scanner(System.in);
//        for (int i = 0; i < arrLength; i++) {
//            numbers[i] = myNumber.nextInt();
//        }
//
//        Arrays.sort(numbers);
//
//        System.out.println("Posortowane liczby: ");
//        for (int i = 0; i < arrLength; i++) {
//            System.out.println(numbers[i]);
//        }

//        // nędzna próba zadania nr 5
//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Podaj liczby całkowite: ");
//
//        Integer userNumbers = myObj.nextInt();  // Read user input
//        Integer[] numbers = new Integer[10];
//        for (int i = 1; i < userNumbers; i++) {
//            numbers[i] = myObj.nextInt();
//        }
//
//        System.out.println("Liczby użytkownika to: " + userNumbers);  // Output user input

//        Scanner myObj = new Scanner(System.in);
//
//        System.out.println("Enter name, age and salary:");
//
//        // String input
//        String name = myObj.nextLine();
//
//        // Numerical input
//        int age = myObj.nextInt();
//        double salary = myObj.nextDouble();
//
//        // Output input by user
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Salary: " + salary);

//        // deklaracja zmiennych
//        String imie;
//        int wiek;
//        double pensja;
//
//        // inicjalizacja zmiennych, poprzez wczytanie z klawiatury
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Podaj imię: ");
//        imie = scanner.next();
//
//        System.out.println("Podaj wiek: ");
//        wiek = scanner.nextInt();
//
//        System.out.println("Podaj pensję: ");
//        pensja = scanner.nextDouble();
//
//        System.out.println("Imię "+imie);
//        System.out.println("Wiek "+wiek);
//        System.out.println("Pensja "+pensja);
//
//        scanner.nextLine();
//
//        System.out.print("Wprowadź tekst: ");
//        String tekst = scanner.nextLine();
//
//        // obliczenie długości tekstu i przypisanie do zmiennej
//        int dlugoscTekstu = tekst.length();
//
//        // wyświetlenie informacji o długości
//        System.out.println("Podany tekst ma długość: "+dlugoscTekstu);

//        // deklaracja zmiennych
//        String nazwa, marka;
//        double cena;
//        int rokProdukcji;
//
//        // inicjalizacja zmiennych, poprzez wczytanie z klawiatury
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Podaj nazwę modelu samochodu: ");
//        nazwa = scanner.next();
//
//        System.out.println("Podaj markę samochodu : ");
//        marka = scanner.next();
//
//        System.out.println("Podaj cenę samochodu: ");
//        cena = scanner.nextDouble();
//
//        System.out.println("Podaj rok produkcji: ");
//        rokProdukcji = scanner.nextInt();
//
//        System.out.println("");
//        System.out.println("—— samochód ——————-");
//
//        System.out.println("-nazwa: " + nazwa);
//        System.out.println("-marka:  " + marka);
//        System.out.println("-cena:  " + cena);
//        System.out.println("-rok produkcji:  " + rokProdukcji);
//        System.out.println("--------------------------------");
//        System.out.println("");
//
//        scanner.close();

//        // Zadanie. Napisz program, który wyświetli na ekranie liczby podzielne przez 3 od 44 do 15.
//        // Podpowiedź: w celu zmniejszenia wartości zmiennej możesz użyć operatora dekrementacji (i–).
//        for (int i = 44; i >= 15; i--) {
//            if (i % 3 == 0) {
//                System.out.print(i + ", ");
//            }
//        }

//        //rozwiązanie studentki zad 7. (niesprawne)
//        String species;
//        String name;
//        int age;
//        Scanner myObj = new Scanner(System.in);
//        ArrayList<Animal> animalList = new ArrayList<>();
//
//        first:
//        while (true) {
//            System.out.println("Choose:");
//            System.out.println("1. Add animal to the list");
//            System.out.println("2. Show list");
//            System.out.println("3. Close program");
//
//            int userSelection = myObj.nextInt();
//
//            switch (userSelection) {
//                case 1:
//                    System.out.println("Add animal to the list: ");
//                    System.out.println("Species: ");
//                    species = myObj.nextLine();
//                    System.out.println("Name: ");
//                    name = myObj.nextLine();
//                    System.out.println("Age: ");
//                    age = myObj.nextInt();
////                    animalList.add(new Animal(species, name, age));
//                    break;
//                case 2:
//                    System.out.println("List animals ");
//                    for (Animal animal : animalList) {
//                        System.out.println(animal);
//                    }
//                    break;
//                case 3:
//                    break first;
//                default:
//                    System.out.println("You can't choose this character");
//                    break;
//            }
//        }

//        // Nr albumu
//        int a = 23143;
//        int b = 3;
//        System.out.println(a % b);

//        String[][] producersModels = {
//                {"Mercedes", "Klasa A", "Klasa B", "Klasa C", "Klasa S"},
//                {"BMW", "X1", "X3", "X4", "X5"},
//                {"Audi", "e-tron", "A4", "A6", "Q8"},
//                {"Mazda", "2", "3", "6", "CX-3"},
//                {"Toyota", "Supra", "Corolla", "Camry", "Hilux"},
//                {"VW", "Caddy", "Golf", "Bora", "Corrado"},
//                {"Opel", "Corsa", "Astra", "Insignia", "Mokka"},
//        };
        System.out.println();

//        int randomProducer = (int) (Math.random() * (7));
//        String producer = producersModels[randomProducer][0];
//        System.out.println(producer);
//
//        int randomModels = (int) ((Math.random() * (4)) + 1);
//        String models = producersModels[randomProducer][randomModels];
//        System.out.println(models);

//        int cos = (int) (Math.random() * (7));
//        String models = producersModels[3][0];
//        System.out.println(models);

        int randomYearOfProduction = (int)(Math.random() * (20) + 2001); // od 2001 do 2020
        System.out.println(randomYearOfProduction);
//        int randomYearOfProduction2 = (int)(Math.random() * (2) + 2001); // od 2001 do 2002
//        System.out.println(randomYearOfProduction2);


//        int randval = (int) (Math.random() * 2);
//        int randval2 = (int) (Math.random() * 3);
//        System.out.println("Randval " + randval);
//        System.out.println("Randval2 " + randval2);
//        double randomCash = (Math.random() * 300000.0 ) + 10000.0;
//        System.out.println(randomCash);

        Double value;
        value = 250000.0 - (Double.valueOf((2022 - randomYearOfProduction) * 5) * 1000);
        System.out.println(value);

//        int i = 15;
//        System.out.println(i++);
//        System.out.println(i);

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }

//        // pętla nieskończona
//        int i = 0;
//
//        for (;i < 5;) {
//            System.out.println("test");
//        }

        for (int i = 0; i < 3; i++){
            if (i + 3 == 1) {
                System.out.println("Fizz");
            } else if (i - 0 == 2) {
                System.out.println("Bzzz");
            } else {
                System.out.println("nic");
            }
        }

    }
}
