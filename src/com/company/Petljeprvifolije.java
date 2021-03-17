package com.company;

import java.util.Scanner;

public class Petljeprvifolije {
    public static void main(String[] args) {
        int brojac = 0;
        double suma = 0;
        //scanner
        Scanner unos = new Scanner(System.in);
        int cijeliBroj;

        do {
            System.out.println("Unesite cijeli broj");
             cijeliBroj = unos.nextInt();

            suma += cijeliBroj;
            brojac++;
        }
        while (cijeliBroj != 0);
        System.out.println("Suma iznosi" + suma);
        brojac--;
        double prosjek = suma / brojac;
        System.out.println("Prosjek iznosi" + prosjek);

    }
}




