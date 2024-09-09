package Aufgaben.Teil5.aufgabe5;

public class TestAusleiher {
    public static void main (String[] args) {
        Ausleiher al1 = new Ausleiher();
        al1.setVorName("Max");
        al1.setName("Mustermann");
        al1.setAusleiherNummer(100);

        System.out.println (al1.getVorName() + " " + al1.getName());
        System.out.println ("mit Nummer: " + al1.getAusleiherNummer());
    }
}
