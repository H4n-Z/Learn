package CompactSprint.Sprint3;

public class SiebenZahler {
    private int zahl = 0;
    private int allezahlen = 0;

    public void zahlenFunktion(int zahl, int allezahlen) {
        this.zahl = zahl;
        this.allezahlen = allezahlen;

        System.out.print("Zahlen die Durch 7 teilbar sind: ");
        for(this.zahl = 0; this.zahl < 100; this.zahl = this.zahl + 7) {
            System.out.print(" " + this.zahl + ",");
            this.allezahlen = this.allezahlen + this.zahl;
        }

        System.out.println("");
        System.out.println("Summe Aller Zahlen: " + this.allezahlen);
        
    }

}
