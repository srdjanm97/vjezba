package com.company;

import java.util.Scanner;

public class DvaNasumicnaBroja {
    public static void main(String[] args) {
        //dva broja sa ispisom
        int slucajniBroj1 = (int) (Math.random() * 10 + 1);
        int slucajniBroj2 = (int) (Math.random() * 10 + 1);
        int novi1 = slucajniBroj1;
        int novi2 = slucajniBroj2;
        int razlika = slucajniBroj1 - slucajniBroj2;
        System.out.println("Koliko je " + slucajniBroj1 + " - " + slucajniBroj2);

        if (slucajniBroj2 > slucajniBroj1) {
            slucajniBroj1 = novi2;
            slucajniBroj2 = novi1;
            razlika = slucajniBroj1 - slucajniBroj2;
        }

        Scanner unos = new Scanner(System.in);
        int razlikaKorisnika = unos.nextInt();


        if (razlikaKorisnika == razlika) {
            System.out.println("Odgovor koji ste unijeli je tacan");
        } else {
            System.out.println("Odgovor koji ste unijeli nije tacan. " + "Tacan odgovor je " + razlika);
        }
    }
}







