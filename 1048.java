import java.util.Scanner;

public class Main {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double salario = input.nextDouble();
        double reajuste = 0;
        int percentualReajuste;
        
        
        if (salario > 0 && salario <= 400) {
            reajuste = salario * 0.15;
            percentualReajuste = 15;
        } else if (salario <= 800) {
            reajuste = salario * 0.12;
            percentualReajuste = 12;
        } else if (salario <= 1200) {
            reajuste = salario * 0.10;
            percentualReajuste = 10;
        } else if (salario <= 2000) {
            reajuste = salario * 0.07;
            percentualReajuste = 7;
        } else {
            reajuste = salario * 0.04;
            percentualReajuste = 4;
        }
        
        System.out.printf("Novo salario: %.2f\n", (salario + reajuste));
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + percentualReajuste + " %"); 
    }
}