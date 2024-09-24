package CompactSprint.Sprint2;

public class Artikel {
    
    private String name;
    private double preis;
    private int artikelnummer;

    public Artikel(String name, double preis, int artikelnummer) {
        this.name = name;
        this.preis = preis;
        this.artikelnummer = artikelnummer;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }
    public void setArtikelnummer(int artikelnummer) {
        this.artikelnummer = artikelnummer;
    }
    public String getName() {
        return this.name;
    }
    public double getPreis() {
        return this.preis;
    }
    public int getArtikelnummer() {
        return this.artikelnummer;
    }
    public void artikelDetails() {

        System.out.println("Name: " + this.name + " Preis: " + this.preis + " artikelnummer: " + this.artikelnummer);
    }
}
