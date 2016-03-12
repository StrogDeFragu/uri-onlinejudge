import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x[] = new int[10];
        
        for (int i = 0; i < x.length; i++) {
            int n = input.nextInt();
                       
            if (n == 0 || n < 0) {
                x[i] = 1;
            } else {
                x[i] = n;
            }
        }
        
        for (int i = 0; i < x.length; i++) {
            System.out.println("X[" + i + "]" + " = " + x[i]);
        }
    }
}