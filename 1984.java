import java.util.Scanner;

/**
 * Created by mathe on 02/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String strN = new StringBuilder(String.valueOf(input.nextLong())).reverse().toString();

        System.out.println(strN);
    }
}