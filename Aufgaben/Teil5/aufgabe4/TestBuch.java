package Aufgaben.Teil5.aufgabe4;

public class TestBuch {
    public static void main (String[] args) {
        Buch b1 = new Buch();
        b1.setTitel("Faust I");
        b1.setIsbn("978-3-15-000001-4");
        b1.setAnzahlExemplare(2);

        System.out.println ("Buch Titel : " + b1.getTitel());
        System.out.println ("ISBN : " + b1.getIsbn());
        System.out.println ("Exemplar Anzahl: " + b1.getAnzahlExemplare());
    }
}
