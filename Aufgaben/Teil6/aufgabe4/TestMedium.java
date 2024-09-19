package Aufgaben.Teil6.aufgabe4;

public class TestMedium {
    public static void main (String[] args) {
        Medium m1 = new Medium("Harper Sky", 30);
        Zeitschrift z1 = new Zeitschrift("Fazust II", 5, "456-987-456-90");
        Buch b1 = new Buch("Die Drei ???", 3, "564-789-341-81");
        
        Medium[] arr = new Medium[3];
        arr [0] = m1;
        arr [1] = b1;
        arr [2] = z1;

        for (Medium ref : arr) {
            System.out.println(ref.getBeschreibung());
        }
    }
}
