import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double media = ((n1 * 3.5) + (n2 * 7.5)) / 11;
		System.out.printf("MEDIA = %.5f", media);
		System.out.println();
	}
}
