package Aufgaben.Teil5.aufgabe8;

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
}
