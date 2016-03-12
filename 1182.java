
import java.util.Scanner;

/**
 * Created by mathe on 02/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int l = input.nextInt();
        char t = input.next().charAt(0);

        double m[][] = new double[12][12];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }

        switch (t) {

            case 'S':
                double soma = 0;
                for (int i = 0; i < m.length; i++) {
                    soma += m[i][l];
                }
                System.out.printf("%.1f", soma);
                break;
            case 'M':
                double media = 0;
                for (int i = 0; i < m.length; i++) {
                    media += m[i][l];
                }
                media /= m.length;
                System.out.printf("%.1f", media);
                break;
        }
        System.out.println();
    }
}