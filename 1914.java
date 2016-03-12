import java.util.Scanner;

/**
 * Created by mathe on 02/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qt = input.nextInt();

        for (int i = 0; i < qt; i++) {
            String jogador1 = input.next();
            String opcao1 = input.next();
            String jogador2 = input.next();
            String opcao2 = input.next();

            int n1 = input.nextInt();
            int n2 = input.nextInt();

            int soma = n1 + n2;
            if (soma % 2 == 0 && opcao1.equals("PAR") || soma % 2 != 0 && opcao1.equals("IMPAR")) {
                System.out.println(jogador1);
            } else {
                System.out.println(jogador2);
            }
        }
    }
}
