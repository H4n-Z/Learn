public class Ifmeth {
    public float berechneSumme(Kunde kunde) {
        float result = artikelSumme;
        if (kunde.isPremiumKunde()) {
            if (anzahlArtikel > 3) {
                result = artikelSumme * 0.88f;
            }
            else {
                result = artikelSumme * 0.9f;
            }
        }
        else {
            if (gutscheinEingeloest) {
                result = artikelSumme * 0.95f;
            }
        }
    }
    return result;
}
