public class Verfuegbarkeitenvonattributen {
    public static void main(String[] args) {
        
        Artikel artikel;
        artikel = new Buch();

        artikel.setTitel("Buch, Bücher, Büchner");
        artikel.setHersteller("V Verlag");
        System.out.println(artikel.getBeschreibung());

        //Aufruf der nächsten methode der unterklasse ist aufgrund des Typs der Variable buch nicht erlaubt!

        artikel.setAutor("Adam Autor");
    }
}
