package Aufgaben.Teil5.aufgabe8;

public class Medium {
    public String titel;
    public int anzahlExemplare;

    public void setTitel(String titel) {
        this.titel = titel;
    }
    public void setAnzahlExemplare(int anzahlExemplare) {
        this.anzahlExemplare = anzahlExemplare;
    }

    public String getTitel() {
        return titel;
    }
    public int getAnzahlExemplare() {
        return anzahlExemplare;
    }

    public String getBeschreibung() {
        return "Titel: "+ titel + ", Bestand: " + anzahlExemplare;
    }
}
