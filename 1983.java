import java.util.Scanner;

/**
 * Created by mathe on 02/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        double maiorMedia = 0.0;
        int matriculaEscolhido = 0;
        for (int i = 0; i < n; i++) {
            int matricula = input.nextInt();
            double media = input.nextDouble();

            if (media > maiorMedia) {
                maiorMedia = media;
                matriculaEscolhido = matricula;
            }
        }

        if (maiorMedia >= 8) {
            System.out.println(matriculaEscolhido);
        } else {
            System.out.println("Minimum note not reached");
        }
    }
}