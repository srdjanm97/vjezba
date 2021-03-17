package com.company;

import com.sun.source.util.DocTreePathScanner;

import java.util.Scanner;

public class KonvertorNovca {
    public static void main(String[] args) {
        System.out.println("Unesite iznos u funtama");

        final double kursFunte = 2.2;
        Scanner unos = new Scanner(System.in);
        double pound = unos.nextDouble();
        double KM = pound * kursFunte;
        if (pound >= 0) {

            System.out.println("Iznos u KM iznosi " + KM);
        } else {
            System.out.println("Unos nije dobar");
        }
    }
}



