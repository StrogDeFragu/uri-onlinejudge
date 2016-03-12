import java.util.Scanner;

/**
 * Created by mathe on 03/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int k = input.nextInt();

            String[] pessoas = new String[k];
            for (int j = 0; j < pessoas.length; j++) {
                pessoas[j] = input.next();
            }

            String pessoa = pessoas[0];
            boolean igual = false;
            for (int j = 0; j < pessoas.length; j++) {
                if (pessoas[j].equals(pessoa)) {
                    igual = true;
                } else {
                    igual = false;
                    break;
                }
            }

            if (igual) {
                System.out.println(pessoas[0]);
            } else {
                System.out.println("ingles");
            }
        }
    }
}