public class NewBook {
    public static void main(String[] args) {
        Buch buch = new Buch();
        buch.setAutor("Adam Autor");
        buch.setTitel("Buch, Bücher, Büchner");
        buch.setHersteller("V Verlag");

        System.out.println(buch.getBeschreibung());
    }
}
