public class TestKinosaal {
    public static void main (String[] args){
        Kinosaal k1 = new Kinosaal();
        k1.setAnzahlSitzplaetzeSaal(50);
        System.out.println("Kino " + k1.getSaalNummer() + " mit " + k1.getAnzahlSitzplaetzeSaal() + " Sitzplaetzen Erzeugt.");

        System.out.println("Anzahl Kinosaele:       " + Kinosaal.getAnzahlKinosaele());
        System.out.println("Anzahl Kinositzplaetze: " + Kinosaal.getAnzahlSitzplaetzeKino());

        Kinosaal k2 = new Kinosaal();
        k2.setAnzahlSitzplaetzeSaal(150);
        System.out.println("Kino " + k2.getSaalNummer() + " mit " + k2.getAnzahlSitzplaetzeSaal() + " Sitzplaetzen Erzeugt.");

        System.out.println("\nUmbau des Kinosaals 1 von 50 auf 80 Plaetze");
        k1.setAnzahlSitzplaetzeSaal(80);
        System.out.println("Anzahl Kinosaele:       " + Kinosaal.getAnzahlKinosaele());
        System.out.println("Anzahl Kinositzplaetze: " + Kinosaal.getAnzahlSitzplaetzeKino());
    }
}
