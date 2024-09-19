package Aufgaben.Teil7.aufgabe3;

public class TestGeometrischeFiguren {
    
    public static void main (String[] args) {

        GeometrischeFigur[] arr = new GeometrischeFigur[3];
        arr[0] = new Kreis(10);
        arr[1] = new Quadrat(8);
        arr[2] = new Rechteck(5, 10);
    

    for (GeometrischeFigur ref: arr ) {
        ref.print();
    }
    }
}

