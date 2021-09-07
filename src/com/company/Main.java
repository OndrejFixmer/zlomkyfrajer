package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int cislo = sc.nextInt();
	float vysledekfrajer = 0;
        for (int i = 0; i < cislo+1; i++) {
            float bum = (float) 1 / i;
            vysledekfrajer += bum;
            System.out.println(1 + "/" + i + "=" + bum);
        }
        System.out.println("cisl: " + vysledekfrajer);
    }
}
