import java.util.Scanner;

/**
 * Created by mathe on 02/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] pares = new int[5];
        int[] impares = new int[5];

        int n;
        int cPares = 0, cImpares = 0;
        for (int i = 0; i < 15; i++) {
            n = input.nextInt();

            if (n % 2 == 0) {
                pares[cPares++] = n;
                if (cPares == pares.length) {
                    imprimirVetor(pares, "par", cPares);
                    cPares = 0;
                }
            } else {
                impares[cImpares++] = n;
                if (cImpares == impares.length) {
                    imprimirVetor(impares, "impar", cImpares);
                    cImpares = 0;
                }
            }
        }

        if (cImpares != 0) {
            imprimirVetor(impares, "impar", cImpares);
        }

        if (cPares != 0) {
            imprimirVetor(pares, "par", cPares);
        }
    }


    public static void imprimirVetor(int[] vetor, String str, int cSize) {
        for (int i = 0; i < cSize; i++) {
            System.out.println(str + "[" + i + "]" + " = " + vetor[i]);
        }
    }
}
