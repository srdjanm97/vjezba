package com.company;

import java.util.Scanner;

public class UstedaMjesecna {
    public static void main(String[] args) {
        //Upit korisniku
        System.out.println("Unesite sumu zeljenu sumu novca");
        //unos od strane korisnika
        Scanner unos = new Scanner(System.in);
        double sumaNovca = unos.nextDouble();
        //deklarisanje konstante
        final double mjesecnaKamata = (0.05 / 12);
        //Izracun mjesecne ustede
        double prviMjesec = sumaNovca * (1 + mjesecnaKamata);
        double drugiMjesec = (sumaNovca + prviMjesec) * (1 + mjesecnaKamata);
        double treciMjesec = (sumaNovca + drugiMjesec) * (1 + mjesecnaKamata);
        double cetvrtiMjesec = (sumaNovca + treciMjesec) * (1 + mjesecnaKamata);
        double petiMjesec = (sumaNovca + cetvrtiMjesec) * (1 + mjesecnaKamata);
        double sestiMjesec = (sumaNovca + petiMjesec) * (1 + mjesecnaKamata);
// Ispis na konzoli
        System.out.println("Usteda nakon sestog mjeseca iznosi " + sestiMjesec);

    }
}
