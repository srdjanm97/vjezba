package com.company;

import java.util.Scanner;

public class CijenaVoznje {
    public static void main(String[] args) {
        System.out.println("Unesite distancu, potrosnju i cijenu po litri");
        Scanner unos = new Scanner(System.in);

        double distanca = unos.nextDouble();
        double potrosnja = unos.nextDouble();
        double cijenaPoLitru = unos.nextDouble();
        double cijenaVoznje = (distanca / 100) * potrosnja * cijenaPoLitru;
        System.out.println("Cijena Voznje iznosi " + cijenaVoznje);


    }
}
