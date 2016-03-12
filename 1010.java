import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codPeca1, codPeca2, numPeca1, numPeca2;
        double valorUniPeca1, valorUniPeca2;
        
        codPeca1 = input.nextInt();
        numPeca1 = input.nextInt();
        valorUniPeca1 = input.nextDouble();
        
        codPeca2 = input.nextInt();
        numPeca2 = input.nextInt();
        valorUniPeca2 = input.nextDouble();
        
        double valorPagar = (valorUniPeca1 * numPeca1) + (valorUniPeca2 * numPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);
        System.out.println();
    }
}