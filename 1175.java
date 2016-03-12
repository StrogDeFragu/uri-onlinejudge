import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[20];
        
        for (int i = 0; i < n.length; i++) {
            n[i] = input.nextInt();
        }
        
        int indexFinal = n.length - 1;
        for (int i = 0; i < n.length / 2; i++) {
            int aux = n[i];
            n[i] = n[indexFinal];
            n[indexFinal] = aux;
            indexFinal--;
        }
               
        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "]" + " = " + n[i]);
        }
    }
}