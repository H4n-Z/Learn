public class ifelseverzweigung {
    public void pruefeAltersfreigabe(int alterDesKunden) {

        if (alterDesKunden >= 18) {
            System.out.println("Kunde ist volljährig");
        }
        else if (alterDesKunden >= 16) {
            System.out.println("Kunde ist nicht volljährig aber mindestens 16 Jahre alt");
        }
        else {
            System.out.println("Kunde ist Jünger als 16 Jahre alt");
        }
    }
}
