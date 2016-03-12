import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(fatorial(x));
    }
    
    public static int fatorial(int n) {
        
        if (n == 1) {
            return 1;
        }
        
        return n * fatorial(n-1);
        
    }
}