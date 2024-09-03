package Aufgaben.Teil3;

public class TestPerson {
    public static void main (String[] args){
        Person refPerson = new Person();
        
        refPerson.setVorName ("Max");
        refPerson.setName ("Mustermann");

        System.out.println(refPerson.getName()+" "+refPerson.getVorName());

        refPerson = new Person();
        refPerson.setVorName ("Ralf");
        refPerson.setName ("Meister");

        System.out.println(refPerson.getName()+" "+refPerson.getVorName());
    }
}
