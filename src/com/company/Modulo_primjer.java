package com.company;

import java.util.Scanner;

public class Modulo_primjer {
    public static void main(String[] args) {
        System.out.print("Unesite vrijednost u minutama");

        Scanner scanner = new Scanner(System.in);

        int unosSekundi = scanner.nextInt();

        int iznosSekundi = unosSekundi % 60;
        int iznosMinuta = unosSekundi/60;

        System.out.print("Vrijednost iznosi ");
        System.out.print(iznosMinuta);
        System.out.print(" Minuta i ");
        System.out.print(iznosSekundi);
        System.out.print(" Sekundi");

    }
}
