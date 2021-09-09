package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	double cislo = sc.nextDouble();
	float vysledekfrajer = 0;
        for (int i = 1; i < cislo+1; i++) {
            double bum = (double) 1 / i;
            vysledekfrajer += bum;
            System.out.println(1 + "/" + i + "=" + bum);
        }
        System.out.println("cislo: " + vysledekfrajer);
    }
}
