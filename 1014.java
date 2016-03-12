import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distanciaTotal = input.nextInt();
        double y = input.nextDouble();
        
        double consumoMedio = distanciaTotal / y;
        System.out.printf("%.3f km/l\n", consumoMedio);
    }
}