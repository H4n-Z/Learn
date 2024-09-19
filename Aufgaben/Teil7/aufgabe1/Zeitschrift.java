package Aufgaben.Teil7.aufgabe1;


public class Zeitschrift extends Medium {
    private String issn;
    private static int bestand = 0;

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getIssn() {
        return issn;
    }

    public static int getBestand() {
        return bestand;
    }

    public String getBeschreibung() {
        return super.getBeschreibung() + " ISSN: " + issn;
    }

    public Zeitschrift(String titel, String unterTitel,int anzahlExemplare, String issn){
        super(titel, unterTitel, anzahlExemplare);
        this.issn = issn;
        bestand++;
    }
    public Zeitschrift(String titel,int anzahlExemplare, String issn){
        super(titel, anzahlExemplare);
        this.issn = issn;
    }

}
