package Aufgaben.Teil4;

import java.util.Scanner;

public class TestAddiernEinlesen {
    public static void main (String[] args){
        int wert1;
        int wert2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte eine Zahl eingeben: ");
        wert1 = scan.nextInt();
        System.out.print("Bitte eine Zahl eingeben: ");
        wert2 = scan.nextInt();
        scan.close();
        int summe;
        summe = wert1 + wert2;
        System.out.println(wert1 + " + " + wert2 + " = " + summe);
        int produkt;
        produkt = wert1 * wert2;
        System.out.println(wert1 + " * " + wert2 + " = " + produkt);
    }
}
