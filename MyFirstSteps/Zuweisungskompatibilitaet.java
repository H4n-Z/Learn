public class Zuweisungskompatibilitaet {
    public static void main(String[] args) {
        Artikel buch;
        buch = new Buch();

        ---------------------------------
        /*this is wrong because not every Artikel is a Buch*/

        Buch b;
        b = new Artikel();
    }
}
