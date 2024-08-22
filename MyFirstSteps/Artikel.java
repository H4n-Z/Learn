public class Artikel {
    protected String hersteller;
    protected String titel;
    protected String artikelnummer;
    public String getBeschreibung() {
        return artikelnummer + ":" + hersteller + ";" + titel;
    }
}