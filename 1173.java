import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x[] = new int[10];
        
        int n = input.nextInt();
        int c = 0;
        for (int i = 0; i < x.length; i++) {
            x[c] = n;
            
            if (c > 0) {
                x[c] = x[c -1] * 2;
            }
            c++;
        }
       
        for (int i = 0; i < x.length; i++) {
            System.out.println("N[" + i + "]" + " = " + x[i]);
        }
    }
}