import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome = input.nextLine();
		double salarioFixo = input.nextDouble();
		double totalVendas = input.nextDouble();
		
		double salarioTotal = salarioFixo + (totalVendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f", salarioTotal);
		System.out.println();
	}
}
