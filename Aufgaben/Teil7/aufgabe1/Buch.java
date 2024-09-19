package Aufgaben.Teil7.aufgabe1;

public class Buch extends Medium {
    private String isbn;
    private static int bestand = 0;

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public static int getBestand() {
        return bestand;
    }

    public String getBeschreibung() {
        return super.getBeschreibung() + " ISBN: " + isbn;
    }

    public Buch(String titel, String unterTitel, int anzahlExemplare, String isbn){
        super(titel, unterTitel, anzahlExemplare);
        this.isbn = isbn;
        bestand++;
    }
    public Buch(String titel, int anzahlExemplare, String isbn){
        super(titel, "", anzahlExemplare);
        this.isbn = isbn;
    }
}
