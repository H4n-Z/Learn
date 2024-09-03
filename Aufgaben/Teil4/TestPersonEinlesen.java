package Aufgaben.Teil4;

import java.util.Scanner;

public class TestPersonEinlesen {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        Person refPerson = new Person();

        System.out.print("Bitte den Nachnamen eingeben: ");
        refPerson.setName(scan.nextLine());

        System.out.print("Bitte den Vornamen eingeben: ");
        refPerson.setVorName(scan.nextLine());

        System.out.println(refPerson.getName() + " " + refPerson.getVorName());

        Person refPerson = new Person();

        System.out.print("Bitte den Nachnamen eingeben: ");
        refPerson.setName(scan.nextLine());

        System.out.print("Bitte den Vornamen eingeben: ");
        refPerson.setVorName(scan.nextLine());

        System.out.println(refPerson.getName() + " " + refPerson.getVorName());
    }
}
