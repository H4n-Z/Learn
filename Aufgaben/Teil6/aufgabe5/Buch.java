package Aufgaben.Teil6.aufgabe5;

public class Buch extends Medium {
    String isbn;

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBeschreibung() {
        return super.getBeschreibung() + " ISBN: " + isbn;
    }

    public Buch(String titel, String unterTitel, int anzahlExemplare, String isbn){
        super(titel, unterTitel, anzahlExemplare);
        this.isbn = isbn;
    }
    public Buch(String titel, int anzahlExemplare, String isbn){
        super(titel, "", anzahlExemplare);
        this.isbn = isbn;
    }
}
