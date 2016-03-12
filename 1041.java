
import java.util.Scanner;

/**
 * Created by mathe on 03/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        double y = input.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        } else if (x != 0 && y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
    }
}
