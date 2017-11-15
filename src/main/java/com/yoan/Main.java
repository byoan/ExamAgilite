package com.yoan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Saisissez un entier :");
	    int entier = sc.nextInt();

	    System.out.println("Saisissez une chaîne : ");
        sc.nextLine();
	    String str = sc.nextLine();
	    System.out.println("Fin");
    }
}
