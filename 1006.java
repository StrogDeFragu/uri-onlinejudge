import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		double media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		System.out.printf("MEDIA = %.1f", media);
		System.out.println();
	}
}
