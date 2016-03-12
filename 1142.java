import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int seq = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(seq + " ");
				seq++;
			}
			seq++;
			System.out.println("PUM");			
		}
	}
}