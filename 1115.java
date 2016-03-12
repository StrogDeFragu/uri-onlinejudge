
import java.util.Scanner;

/**
 * Created by mathe on 03/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        double y = input.nextDouble();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }

            x = input.nextDouble();
            y = input.nextDouble();
        }
    }
}