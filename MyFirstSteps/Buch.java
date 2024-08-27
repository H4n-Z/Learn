public class Buch extends Artikel {
    private Autor autor;
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        thus.autor = autor;
    }
    public String getBeschreibung() {
        return artikelnummer + " : " + hersteller + " ; " + titel + " von " + autor;
    }
    public String getBeschreibung() {
        String beschreibung = super.getBeschreibung();
        return beschreibung + " von " + autor;
    }
}