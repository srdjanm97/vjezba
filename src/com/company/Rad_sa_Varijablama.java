package com.company;

import java.util.Scanner;

public class Rad_sa_Varijablama {
    public static void main(String[] args) {
        double povrsina;
        double poluprecnik;

        System.out.print("Unesite vrijednost poluprecnika");
        Scanner unos = new Scanner(System.in);

        double Pi = 3.14;
        poluprecnik = unos.nextDouble();
        povrsina =poluprecnik*poluprecnik*3.14;
        System.out.print(povrsina);
    }
}
