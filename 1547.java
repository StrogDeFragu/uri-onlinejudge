import java.util.Scanner;

/**
 * Created by mathe on 03/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int qt = input.nextInt();
            int s = input.nextInt();

            int valores[] = new int[qt];

            boolean temVencedor = false;
            int posicaoVencedor = -1;
            for (int j = 0; j < valores.length; j++) {
                valores[j] = input.nextInt();
                if (valores[j] == s && posicaoVencedor == -1) {
                    temVencedor = true;
                    posicaoVencedor = j + 1;
                }
            }

            if (temVencedor) {
                System.out.println(posicaoVencedor);
            } else {
                int posicaoMaisPerto = -1;
                int maisPerto = 1000000000;
                for (int j = 0; j < valores.length; j++) {
                    int diferenca = valores[j] - s;
                    if (diferenca < 0) {
                        diferenca *= -1;
                    }

                    if (diferenca < maisPerto) {
                        maisPerto = diferenca;
                        posicaoMaisPerto = j + 1;
                    }
                }

                System.out.println(posicaoMaisPerto);
            }
        }
    }
}