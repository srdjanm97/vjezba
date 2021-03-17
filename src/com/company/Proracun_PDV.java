package com.company;

import java.util.Scanner;

public class Proracun_PDV {
    public static void main(String[] args) {
        double stopaPDVa = 1.17;
        System.out.print("Unesite cijenu");
        Scanner unos = new Scanner(System.in);

        double cijena_proizvoda = unos.nextDouble();
        double cijena_sa_PDV = cijena_proizvoda * stopaPDVa;

        System.out.print("Cijena sa PDV-om iznosi");
        System.out.print(cijena_sa_PDV);

    }
}
