import java.util.Scanner;

/**
 * Created by mathe on 01/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int v = input.nextInt();

        String hex = Integer.toHexString(v).toUpperCase();

        System.out.println(hex);
    }
}