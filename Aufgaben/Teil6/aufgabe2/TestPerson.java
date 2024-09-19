package Aufgaben.Teil6.aufgabe2;
import java.util.Scanner;

public class TestPerson {
    public static void main (String[] args) {
        Person p1 = new Person();
        System.out.println(p1.getBeschreibung());

        Person p2 = new Person("Krautwurst", "Rheiner");
        System.out.println(p2.getBeschreibung());

        Scanner scan = new Scanner(System.in);

        Person p3 = new Person(scan);
        System.out.println("Person 3: " + p3.getBeschreibung());

        Person p4 = new Person(scan);
        System.out.println("Person 4: " + p4.getBeschreibung());

    }
}
