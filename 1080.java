import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ns[] = new int[100];
        
        int maior = 0;
        int posicaoMaior = 0;
        for (int i = 1; i <= ns.length; i++) {
            ns[i-1] = input.nextInt();
            
            if (ns[i-1] > maior) {
                maior = ns[i-1];
                posicaoMaior = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicaoMaior);
    }
}
