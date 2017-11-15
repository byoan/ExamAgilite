package com.yoan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Saisissez le numéro du client concerné par la commande :");
	    int numClient = sc.nextInt();

	    System.out.println("Client choisi : " + numClient);
    }
}
