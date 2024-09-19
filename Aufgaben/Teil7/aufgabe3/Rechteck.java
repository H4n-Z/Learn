package Aufgaben.Teil7.aufgabe3;

public class Rechteck extends GeometrischeFigur {
    
    private double Laenge = 0;
    private double Hoehe = 0;

    public Rechteck(double Laenge, double Hoehe) {
        this.Laenge = Laenge;
        this.Hoehe = Hoehe;
    }

    public double berechneFlaeche() {
        return (Laenge * Hoehe);
    }

    public double berechneUmfang() {
        return (Laenge * 2 + Hoehe * 2);
    }

    public void Print () {
        System.out.print(" Rechteck:");
        super.print();
    }
}
