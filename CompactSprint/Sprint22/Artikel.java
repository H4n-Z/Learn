package CompactSprint.Sprint22;

public class Artikel {
    private String name = "unbekannt";
    private double preis = 0;
    private int artikelnummer = 0;

    public Artikel(String name, double preis, int artikelnummer) {
        this.name = name;
        this.preis = preis;
        this.artikelnummer = artikelnummer;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }
    public double getPreis() {
        return this.preis;
    }
    public void setArtikelnummer(int artikelnummer) {
        this.artikelnummer = artikelnummer;
    }
    public int getArtikelnummer() {
        return this.artikelnummer;
    }
    public void artikelDetails() {
        System.out.println("Name: " + this.name + " Preis: " + this.preis + " Artikelnummer: " + this.artikelnummer);
    }

}