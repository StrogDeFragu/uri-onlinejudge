import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        
        while ( x != 0) {
            for (int i = 1; i <= x; i++) {
                if (i == x) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
            }

            x = input.nextInt();
        }
    }
}
