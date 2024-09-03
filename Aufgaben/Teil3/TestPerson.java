package Aufgaben.Teil3;

public class TestPerson {
    public static void main (String[] args){
        Person p1 = new Person();
        
        p1.setVorName ("Max");
        p1.setName ("Mustermann");

        Person p2;

        p2 = new Person();
        p2.setVorName ("Ralf");
        p2.setName ("Meister");

        System.out.println(p1.getName()+" "+p1.getVorName());
        System.out.println(p2.getName()+" "+p2.getVorName());
    }
}
