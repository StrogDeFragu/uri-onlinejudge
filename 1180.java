import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int x[] = new int[n];
        
        int menor = 10000000;
        int posicaoMenor = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = input.nextInt();
            
            if (x[i] < menor) {
                menor = x[i];
                posicaoMenor = i;
            }
        }
        System.out.println("Menor valor: " + menor + "\nPosicao: " + posicaoMenor);
        
    }
}