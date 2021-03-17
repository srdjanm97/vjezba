package com.company;

import java.util.Scanner;

public class Stope {
    public static void main(String[] args) {
        System.out.println("Unesite broj stopa");
        Scanner unos = new Scanner(System.in);
        double unosStopa = unos.nextDouble();
        final double Konstanta_Za_Metar = 0.305;
        double konevrtovaniMetar = unosStopa * Konstanta_Za_Metar;
        System.out.println("Mjera u metrima iznosi " + konevrtovaniMetar + " metara");
    }
}
