package Aufgaben.Teil6.aufgabe5;


public class TestMedium {
    public static void main (String[] args) {
        Medium m1 = new Medium("Harper Sky", 30);
        Zeitschrift z1 = new Zeitschrift("Fazust II",5, "456-987-456-90");
        Buch b1 = new Buch("Die Drei ???",3, "564-789-341-81");
        Buch b2 = new Buch("Geigen", "Geschichte des Instruments", 5, "567-789-456-78");
        Zeitschrift z2 = new Zeitschrift("VRR", "Raue zeiten", 5, "567-789-456-78");
        
        Medium[] arr = new Medium[5];
        arr [0] = m1;
        arr [1] = b1;
        arr [2] = b2;
        arr [3] = z1;
        arr [4] = z2;

        for (Medium ref : arr) {
            System.out.println(ref.getBeschreibung());
        }
    }
}
