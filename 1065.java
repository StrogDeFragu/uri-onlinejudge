import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double ns[] = new double[5];
        int count = 0;
        for (int i = 0; i < ns.length; i++) {
            ns[i] = input.nextDouble();
            if (ns[i] % 2 == 0) count++;
        }
        System.out.println(count + " valores pares");
    }
}