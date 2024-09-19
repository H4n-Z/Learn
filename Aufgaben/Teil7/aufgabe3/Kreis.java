package Aufgaben.Teil7.aufgabe3;

public class Kreis extends GeometrischeFigur {
    
    private double KreisRadius = 0;

    public Kreis (double KreisRadius) {
        this.KreisRadius = KreisRadius;
    }

    public double berechneFlaeche() {
        return (KreisRadius * KreisRadius * Math.PI);
    }

    public double berechneUmfang() {
        return (2 * Math.PI * KreisRadius);
    }

    public void Print () {
        System.out.print(" Kreis:");
        super.print();
    }
}
