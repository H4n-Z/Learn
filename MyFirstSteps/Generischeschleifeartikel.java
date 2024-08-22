public class Generischeschleifeartikel {
    for(Artikel artikel : artikelListe) {
        String hersteller = artikel.getHersteller();
        herstellerListe.trageEin(hersteller);
    }
}
