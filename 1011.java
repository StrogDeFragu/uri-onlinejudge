import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double pi = 3.14159;
        
        int raio = input.nextInt();
        double volume = (4/3.0) * pi * Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f", volume);
        System.out.println();
    }
}
