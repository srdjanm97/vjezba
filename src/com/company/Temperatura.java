package com.company;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        System.out.println("Unesite vrijednost u Celzijusima");
        Scanner unos=new Scanner(System.in);
        double temperatura=unos.nextDouble();
        double temperaturaFarenheit=(9.0/5)*temperatura+32;
        System.out.println("Temperatura u Fahrenheitima iznosi "+temperaturaFarenheit+" Fahrenheita");
    }
}
