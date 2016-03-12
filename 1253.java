import java.util.Scanner;

/**
 * Created by mathe on 03/03/2016.
 */
public class Main {
    public static char[] alfabeto = {'A','B','C','D','E','F','G','H','I','J','K','L',
            'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            String palavra = input.next();
            int qtdPosicoes = input.nextInt();

            char array[] = palavra.toCharArray();
            for (int j = 0; j < array.length; j++) {
                if (array[j] != ' ') {
                    int position = getPosicao(array[j]);

                    int proximaPosicao = (position - qtdPosicoes);
                    if (proximaPosicao < 0) {
                        array[j] = alfabeto[(proximaPosicao) + alfabeto.length];
                    } else {
                        array[j] = alfabeto[(proximaPosicao) % alfabeto.length];
                    }
                }
            }

            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "");
            }

            System.out.println();
        }

    }

    private static int getPosicao(Character character) {
        for (int i = 0; i < alfabeto.length; i++) {
            if (character.equals(alfabeto[i])) {
                return i;
            }
        }
        return -1;
    }
}
