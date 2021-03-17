package com.company;

import java.util.Scanner;

public class BrojBodova {
    public static void main(String[] args) {
        System.out.println("Unesite broj bodova");
        Scanner unos = new Scanner(System.in);
        int brojBodova = unos.nextInt();

        if (brojBodova >= 90) {
            System.out.println("Ocjena je deset");
        }
        if (brojBodova >= 80 && brojBodova < 90) {
            System.out.println("Ocjena je devet");
        }
        if (brojBodova >= 70 && brojBodova < 80) {
            System.out.println("Ocjena je osam");
        }
        if (brojBodova >= 60 && brojBodova < 70) {
            System.out.println("Ocjena je sedam");
        }
        if (brojBodova >= 50 && brojBodova < 60) {
            System.out.println("Ocjena je sest");
        }


        if (brojBodova < 50) {
            System.out.println("Korisnik nije polozio ispit");
        }
    }
}
