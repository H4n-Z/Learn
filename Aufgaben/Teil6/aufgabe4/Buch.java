package Aufgaben.Teil6.aufgabe4;

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

    public Buch(String titel, int anzahlExemplare, String isbn){
        super(titel, anzahlExemplare);
        this.isbn = isbn;
    }
}
