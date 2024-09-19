package Aufgaben.Teil6.aufgabe5;


public class Zeitschrift extends Medium {
    private String issn;

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getIssn() {
        return issn;
    }

    public String getBeschreibung() {
        return super.getBeschreibung() + " ISSN: " + issn;
    }

    public Zeitschrift(String titel, String unterTitel,int anzahlExemplare, String issn){
        super(titel, unterTitel, anzahlExemplare);
        this.issn = issn;
    }
    public Zeitschrift(String titel,int anzahlExemplare, String issn){
        super(titel, anzahlExemplare);
        this.issn = issn;
    }

}
