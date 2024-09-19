package Aufgaben.Teil7.aufgabe3;

public abstract class GeometrischeFigur {

    public abstract double berechneFlaeche();

    public abstract double berechneUmfang();

    public void print() {
        System.out.println("Flaecheninhalt: " + berechneFlaeche() + " Umfang: " + berechneUmfang());
    }
    
}