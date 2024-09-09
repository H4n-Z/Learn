package Aufgaben.Teil5.aufgabe7;

public class TestMedium {
    public static void main (String[] args) {
        Medium m1 = new Medium();
        Buch b1 = new Buch();
        Zeitschrift z1 = new Zeitschrift();
        
        m1.setTitel("Rough Seas");
        m1.setAnzahlExemplare(3);

        b1.setIsbn("678-456-345-78");
        b1.setTitel("Faust");
        b1.setAnzahlExemplare(1);

        z1.setIssn("653-566-897-23");
        z1.setTitel("NRZ");
        z1.setAnzahlExemplare(2);

        System.out.println(b1.getBeschreibung() + ", ISBN: " + b1.getIsbn());
        System.out.println(z1.getBeschreibung() + ", ISSN: " + z1.getIssn());
        System.out.println(m1.getBeschreibung());

    }
}
