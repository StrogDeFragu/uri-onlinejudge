import java.util.Scanner;

/**
 * Created by mathe on 02/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String meses[] = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        System.out.println(meses[n-1]);
    }
}