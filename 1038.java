import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cod = input.nextInt();
        int qtItem = input.nextInt();
        
        double preco = 0.0;
        switch (cod) {
            
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
        }
        System.out.printf("Total: R$ %.2f\n", (qtItem * preco));
    }
}
