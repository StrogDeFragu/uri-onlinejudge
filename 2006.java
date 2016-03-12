
import java.util.Scanner;

/**
 * Created by mathe on 02/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        int corretos = 0;
        int vet[] = new int[5];

        for (int j = 0; j < vet.length; j++) {
            vet[j] = input.nextInt();
            if (vet[j] == t) {
                corretos++;
            }
        }

        System.out.println(corretos);
    }
}
