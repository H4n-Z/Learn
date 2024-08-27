public class Aufrufüberschreibenermethoden {
    public static void main(String[] args) {
        Buch buch = new Buch();
        buch.setArtikelnummer("987-2651-3891-56");
        buch.setAutor("Adam Autor");
        buch.setTitel("Buch, Bücher, Büchner");
        buch.setHersteller("v Verlag");

        System.out.println(buch.getBeschreibung())
    }
}
