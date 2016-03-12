import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        if (a > b) {
            for (int i = b+1; i < a; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        } else if (a < b) {
            for (int i = a+1; i < b; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }  
            }
        }
    }
}
