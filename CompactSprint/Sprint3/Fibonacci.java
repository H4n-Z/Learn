package CompactSprint.Sprint3;

public class Fibonacci {
    private int fibo;
    private int f1;
    private int f2;
    private int i;

    public void fiboFolge(int fibo, int f1, int f2, int i) {
        this.fibo = fibo;
        this.f1 = f1;
        this.f2 = f2;
        this.i = i;

        System.out.print("Fibonacci Folge: " + this.f1 + ",");
        System.out.print(" " + this.f2 + ",");

        for(this.i = 0; this.i <= 18; this.i++) {
            this.fibo = this.f1 + this.f2;
            System.out.print(" " + this.fibo + ",");
            this.f1 = this.f2;
            this.f2 = this.fibo;
        }
        System.out.println(" ");
    }
}
