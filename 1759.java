import java.util.Scanner;

public class Main {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (i == n-1) {
                System.out.println("Ho!");
            } else {
                System.out.print("Ho ");
            }
        }
                
    }
}