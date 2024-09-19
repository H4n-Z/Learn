package Aufgaben.Teil6.aufgabe3;
import java.util.Scanner;

public class Ausleiher extends Person {
    private int ausleiherNummer;

    public int getAusleiherNummer() {

        return ausleiherNummer;
    }

    public void setAusleiherNummer(int ausleiherNummer) {

        this.ausleiherNummer = ausleiherNummer;
    }

    public Ausleiher (String name, String vorname, int ausleiherNummer) {
        super(name, vorname);
        this.ausleiherNummer = ausleiherNummer;
    }

    public Ausleiher (Scanner scan) {
        super(scan);
        System.out.print("AusleiherNummer: ");
        ausleiherNummer = scan.nextInt();
        scan.nextLine();
    }

    public String getBeschreibung() {
        return super.getBeschreibung()+ " AusleiherNummer: " + ausleiherNummer; 
    }
}
