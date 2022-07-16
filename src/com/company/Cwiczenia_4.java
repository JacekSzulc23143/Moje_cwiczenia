package com.company;

public class Cwiczenia_4 {

    public static void main(String[] args) {

        String[] firstNames = {"Jacek", "Przemek", "Robert", "Paweł", "Piotr", "Rafał", "Tomasz", "Karol", "Arek",
                "Bartosz", "Marek", "Darek", "Filip", "Roland", "Michał", "Maciej", "Józef", "Ryszard", "Roman",
                "Joanna", "Anna", "Julia", "Patrycja", "Weronika", "Marta", "Sylwia", "Alicja", "Adrianna", "Agnieszka",
                "Aleksandra", "Jagoda", "Barbara", "Monika", "Oliwia", "Martyna", "Ewa", "Renata", "Teresa", "Katarzyna",
                "Inez"};
        String[] lastNames = {"Szulc", "Kowalski", "Kamiński", "Brzozowski", "Pepliński", "Figurski", "Karabin", "Armata",
                "Woźniak", "Komenda", "Krawczyk", "Wiśniewski", "Piwowski", "Nowak", "Szymański", "Wójcik", "Kowalczyk",
                "Lewandowski", "Dąbrowski", "Kozłowski", "Jankowski", "Mazur", "Kaczmarek", "Grabowski", "Zieliński",
                "Rutkowski", "Jarząbek", "Baran", "Ostrowski", "Marciniak", "Michalak", "Bąk", "Zawadzki", "Dudek",
                "Jakubowski", "Pietrzak", "Wilk", "Ryba", "Belka", "Stella"};

        // Case "5". Generator klientów.
        int randomFirstName, randomLastName;
        String name;
        Double randomCash;
        randomFirstName = (int) ((Math.random() * (firstNames.length))); // generowanie imienia
        randomLastName = (int) ((Math.random() * (lastNames.length))); // generowanie nazwiska
        randomCash = (Math.random() * 300000.0) + 10000.0; // losowanie ilości pieniędzy
        randomCash *= 100;
        randomCash = Double.parseDouble(String.valueOf(Math.round(randomCash))); // powoduje losowanie pieniędzy do
        // jednej cyfry po przecinku
        randomCash /= 100;
        name = firstNames[randomFirstName] + " " + lastNames[randomLastName];
        System.out.println("Losowe imię i nazwisko to: " + name);
        System.out.println("Losowe pieniądze to: " + randomCash);
    }
}