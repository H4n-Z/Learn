package Aufgaben.Teil7.aufgabe3;

public class Quadrat extends GeometrischeFigur {
    
    private double Seitenlaenge = 0;

    public Quadrat (double Seitenlaenge) {
        this.Seitenlaenge = Seitenlaenge;
    }

    public double berechneFlaeche() {
        return (Seitenlaenge * Seitenlaenge);
    }

    public double berechneUmfang() {
        return (4 * Seitenlaenge);
    }

    public void Print() {
        System.out.print(" Quadrat:");
        super.print();
    }
}
