package Aufgaben.InstanceTest;

public class GunAssing {
    public static void main(String[] args) {
        Gun g1 = new Gun();

        g1.setName ("P8");
        g1.setType ("Pistol");
        g1.setCaliber (9);
        g1.setNumber (45678);
        
        System.out.print ("Current Weapon: ");
        System.out.println ("Name: " + g1.getName());
        System.out.println ("Type: " + g1.getType());
        System.out.println ("Caliber: " + g1.getCaliber() + "mm");
        System.out.println ("Registerd under " + g1.getNumber());
    }
}
