package CompactSprint.Sprint3;
import java.util.Scanner;

public class Rechner {
    private int num1;
    private int num2;
    private char operator;
    private int ergebnis;
    
    Scanner sc = new Scanner(System.in);

    public void eingabeAufforderung(int num1, int num2, char operator, int ergebnis) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
        this.ergebnis = ergebnis;
    }

    public void setNum1(int num1){
         System.out.print("Nummer1: ");
        this.num1 = sc.nextInt();
    }
    public void setNum2(int num2){
        System.out.print("Nummer2: ");
        this.num2 = sc.nextInt();
    }
    public void setOperator(char operator) {
        System.out.print("Rechenoperator: ");
        this.operator = sc.next().charAt(0);
    }
    public int newCalculate(){
        switch (this.operator) {
        case '+':
                this.ergebnis = this.num1 + this.num2;
         case '-':
                this.ergebnis = this.num1 - this.num2;
        case '*':
                this.ergebnis = this.num1 * this.num2;
        case '/':
                this.ergebnis = this.num1 / this.num2;
        break;
        }
        return this.ergebnis;
    }
    public void ergebnisAusgabe() {
        System.out.println("Ergebnis: " + this.ergebnis);
    }

}

    
