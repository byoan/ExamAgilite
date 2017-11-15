package com.yoan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    HashMap<Integer, String> mapNames = new HashMap<Integer, String>();
	    HashMap<Integer, Integer> mapPrices = new HashMap<Integer, Integer>();

        mapNames.put(1, "Clean Architecture");
        mapNames.put(2, "Java Passion");
        mapNames.put(3, "Avatar");
        mapNames.put(4, "Avatar");
        mapNames.put(5, "Kahuna");
        mapNames.put(6, "Trajan");
	    mapPrices.put(1, 40);
	    mapPrices.put(2, 20);

	    // Premier est le Bray, 2eme est le DVD
	    mapPrices.put(3, 15);
	    mapPrices.put(4, 7);
	    mapPrices.put(5, 15);
	    mapPrices.put(6, 45);

	    System.out.println("Saisissez le numéro du client concerné par la commande :");
	    int numClient = sc.nextInt();

	    System.out.println("Client choisi : " + numClient);

	    System.out.println("Choisissez une catégorie en saisissant son chiffre : ");
	    System.out.println("1. Livre");
	    System.out.println("2. Film");
	    System.out.println("3. Jeux de société");

	    int idCat = sc.nextInt();
        System.out.println("Catégorie choisie : " + idCat);

	    System.out.println("Choisissez un produit en saisissant son chiffre : ");
        if (idCat == 1) {
            System.out.println("1. Clean Architecture : 40€/unité");
            System.out.println("2. Java Passion : 20€/unité");
        } else if(idCat == 2) {
            System.out.println("3. Avatar (BRay) : 15€/unité");
            System.out.println("4. Avatar (DVD) : 7€/unité");
        } else if (idCat == 3) {
            System.out.println("5. Kahuna : 15€/unité");
            System.out.println("6. Trajan : 45€/unité");
        }

	    int idObject = sc.nextInt();

	    System.out.println("Combien en voulez vous ?");

	    int quantity = sc.nextInt();
	    int total = mapPrices.get(idObject) * quantity;
	    System.out.println("Objets choisis : " + quantity + "x " + mapNames.get(idObject).toString() + " pour un prix de " + total+ "€");

    }
}
