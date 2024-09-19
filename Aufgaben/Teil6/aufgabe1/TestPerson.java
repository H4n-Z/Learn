package Aufgaben.Teil6.aufgabe1;

public class TestPerson {
    public static void main (String[] args) {
        Person p1 = new Person();
        System.out.println(p1.getBeschreibung());

        Person p2 = new Person("Krautwurst", "Rheiner");
        System.out.println(p2.getBeschreibung());
    }
}
