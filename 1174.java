import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a[] = new double[100];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextDouble();
        }
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 10) {
                String n = String.format("%.1f", a[i]);
                System.out.println("A[" + i + "]" + " = " + n);
            }
        }
        
    }
}