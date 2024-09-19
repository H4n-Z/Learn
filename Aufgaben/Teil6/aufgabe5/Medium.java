package Aufgaben.Teil6.aufgabe5;


public class Medium {
    private String titel;
    private int anzahlExemplare;
    private String unterTitel;

    public Medium(String titel, int anzahlExemplare){
        this(titel, "" ,anzahlExemplare);
    }

    public Medium(String titel, String unterTitel,int anzahlExemplare) {
        this.titel = titel;
        this.unterTitel = unterTitel;
        this.anzahlExemplare = anzahlExemplare;
    }

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
        return "Titel: "+ titel + ", Untertitel: " + unterTitel + ", Bestand: " + anzahlExemplare;
    }
}
