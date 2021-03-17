package com.company;

import java.util.Scanner;

public class NasumicniBrojevi {
    public static void main(String[] args) {
        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);
        int zbir = random1 + random2;
        System.out.println("Koliki je zbir " + random1 + " + " + random2);
        Scanner unos = new Scanner(System.in);
        int zbirBrojeva = unos.nextInt();
        if (zbirBrojeva == zbir) {
            System.out.println("Odgovor koji ste unijeli je tacan");
        } else {
            System.out.println("Odgovor koji ste unijeli nije tacan" + " Tacan Odgovor je " + zbir);
        }
    }


}





