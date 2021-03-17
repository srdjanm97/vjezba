package com.company;

import java.util.Scanner;

public class SabiranjeCifri {
    public static void main(String[] args) {
        System.out.println("Unesite broj izmedju 0 i 999");
        Scanner unos = new Scanner(System.in);
        int cifra = unos.nextInt();

        int zadnjiBroj = cifra % 10;
        int prviBroj = cifra / 100;
        int drugiBroj = (cifra / 10) % 10;

        int zbir = prviBroj + drugiBroj + zadnjiBroj;
        System.out.println("Zbir cifara " + prviBroj + " + " + drugiBroj + "+" + zadnjiBroj + " = " + zbir);

    }
}
