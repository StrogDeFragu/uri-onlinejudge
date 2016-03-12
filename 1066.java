import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ns[] = new int[5];
        
        int pares, impares, positivos, negativos;
        
        pares = impares = positivos = negativos = 0;
        for (int i = 0; i < ns.length; i++) {
            ns[i] = input.nextInt();
            
            if (ns[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            
            if (ns[i] > 0) {
                positivos++;
            } else if (ns[i] < 0) {
                negativos++;
            }
        }
        
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

    }
}
