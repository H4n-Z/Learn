package CompactSprint.Sprint3;

import java.util.Scanner;

public class RechnerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        double ergebnis = 0.0f;
        char operator;

        System.out.print("Zahleingabe: ");
        num1 = sc.nextInt();
        System.out.print("Zahleingabe: ");
        num2 = sc.nextInt();
        System.out.print("Rechenoperatoreingabe: ");
        operator = sc.next().charAt(0);
        sc.close();

        try {
            switch(operator) {
                case '+':
                    ergebnis = num1 + num2;
                    System.out.println("Das ergebnis ist " + ergebnis);
                break;
                case '-':
                    ergebnis = num1 - num2;
                    System.out.println("Das ergebnis ist " + ergebnis);
                break;
                case '*':
                    ergebnis = num1 * num2;
                    System.out.println("Das ergebnis ist " + ergebnis);
                break;
                case '/':
                    ergebnis = num1 / num2;
                    System.out.println("Das ergebnis ist " + ergebnis);
                break;
                default:
                    System.out.println("Kein Gültiger Operator");
                break;
            }
        }
        catch(ArithmeticException e) {
            System.out.println("Es wurde durch 0 geteilt");
        }
        catch(Exception e) {
            System.out.println("Something went Wrong");
        }
    }
}
