
import java.util.Scanner;

/**
 * Created by mathe on 02/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char t = input.next().charAt(0);

        double m[][] = new double[12][12];

        for (int lin = 0; lin < m.length; lin++) {
            for (int col = 0; col < m[lin].length; col++) {
                m[lin][col] = input.nextDouble();
            }
        }
        int col = 1;
        int aux = 1;
        switch (t) {

            case 'S':
                double soma = 0;
                col = 1;
                aux = 1;
                for (int lin = 0; lin < m.length; lin++) {
                    for (; col < m[0].length; col++) {
                        soma += m[lin][col];
                    }
                    col = ++aux;
                }
                System.out.printf("%.1f", soma);
                break;
            case 'M':
                double media = 0;
                col = 1;
                aux = 1;
                int c = 0;
                for (int lin = 0; lin < m.length; lin++) {
                    for (; col < m[0].length; col++) {
                        media += m[lin][col];
                        c++;
                    }
                    col = ++aux;
                }
                media /= c;
                System.out.printf("%.1f", media);
                break;
        }
        System.out.println();
    }
}