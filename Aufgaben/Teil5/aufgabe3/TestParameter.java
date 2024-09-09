package Aufgaben.Teil5.aufgabe3;
 
public class TestParameter {
    public static void main (String[] args) {
        Person p1 = new Person();
        p1.setName ("Mustermann");
        p1.setVorName ("Max");

        System.out.print ("Ausgabe Person vor Methodenaufruf: ");
        System.out.println (p1.getName() + " " + p1.getVorName());
        veraendertePerson (p1);
        System.out.print ("Ausgabe Person nach Methodenaufruf: ");
        System.out.println (p1.getName() + " " + p1.getVorName());
    }

    public static void veraendertePerson (Person ref) {
        ref.setName ("Weihnachtsmann");
        System.out.print ("Ausgabe der Person in der Methode: ");
        System.out.println (ref.getName() + " " + ref.getVorName());
    }
}
