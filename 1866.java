import java.util.Scanner;

/**
 * Created by mathe on 02/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c = input.nextInt();

        int s = 1;
        for (int i = 0; i < c; i++) {
            int a = input.nextInt();

            if (a % 2 == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
    }
}