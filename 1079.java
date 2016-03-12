import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        double valores[][] = new double[n][3];
        
        double media = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                valores[i][j] = input.nextDouble();
                
                int peso = 0;
                switch (j) {
                    case 0:
                        peso = 2;
                        break;
                    case 1:
                        peso = 3;
                        break;
                    case 2:
                        peso = 5;
                        break;
                }
                
                media += valores[i][j] * peso;
            }
            media /= 10;
            System.out.printf("%.1f\n", media);
            media = 0;
        }
    }
}
