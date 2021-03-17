package com.company;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner unos=new Scanner(System.in);
        System.out.println("Unesite tezinu");
        double tezina=unos.nextDouble();
        System.out.println("Unesite visinu u metrima");
        double visina=unos.nextDouble();
      double bmi=tezina/(Math.pow(visina,2));
        if(bmi<18.5) {
            System.out.println("Pothranjenost");
        }
        else if (bmi<25){
            System.out.println("Normalan BMI");

        }
        else if (bmi<30){
            System.out.println("gOJAZNOST");


        }
        else if (bmi>=30){
            System.out.println("pRETILOST");

        }
    }
}
