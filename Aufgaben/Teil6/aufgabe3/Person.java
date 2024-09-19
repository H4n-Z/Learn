package Aufgaben.Teil6.aufgabe3;

import java.util.Scanner;

public class Person {
    private String vorname;
    private String name;

    public void setName (String name){
        this.name = name;
    }

    public void setVorName (String vorname){
        this.vorname = vorname;
    }

    public String getName (){
        return name;
    }

    public String getVorName (){
        return vorname;
    }

    public Person() {
        name = "Unbekannt";
        vorname = "Unbekannt";
    }

    public Person(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public String getBeschreibung() {
        return "Name: " + name + " Vorname: " + vorname;
    }

    public Person (Scanner scan) {
        System.out.print("Vorname: ");
        vorname = scan.nextLine();
        System.out.print("Name: ");
        name = scan.nextLine();
    }

}
