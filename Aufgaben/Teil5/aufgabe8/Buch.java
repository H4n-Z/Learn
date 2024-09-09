package Aufgaben.Teil5.aufgabe8;

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
}
