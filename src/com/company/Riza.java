package com.company;

import java.util.Scanner;

public class Riza {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite tezinu pakovanja jedan ");
        double tezinaPakovanja1 = unos.nextDouble();
        System.out.println("Unesite tezinu pakovanja dva ");
        double tezinaPakovanja2 = unos.nextDouble();
        System.out.println("Unesite cijenu 1");
        double cijena1 = unos.nextDouble();
        System.out.println("Unesite cijenu 2");
        double cijena2 = unos.nextDouble();


        double cijenapoKilogramu1 = tezinaPakovanja1 / cijena1;
        double cijenapoKilogramu2 = tezinaPakovanja2 / cijena2;

        if (cijenapoKilogramu1 > cijenapoKilogramu2) {
            System.out.println("Prvi proizvod je povoljniji");
        } else if (cijenapoKilogramu1 < cijenapoKilogramu2) {
            System.out.println("Drugi proizvod je povoljniji");
        }


    }
}
