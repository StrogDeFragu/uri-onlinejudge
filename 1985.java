import java.util.Scanner;

/**
 * Created by mathe on 02/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p = input.nextInt();

        double valorCompra = 0;
        for (int i = 0; i < p; i++) {
            int codProd = input.nextInt();
            int qtd = input.nextInt();

            valorCompra += getPreco(codProd) * qtd;
        }

        System.out.printf("%.2f", valorCompra);
        System.out.println();
    }

    static double getPreco(int codProd) {
        double preco = 0.0;
        switch (codProd) {

            case 1001:
                preco = 1.50;
                break;
            case 1002:
                preco = 2.50;
                break;
            case 1003:
                preco = 3.50;
                break;
            case 1004:
                preco = 4.50;
                break;
            case 1005:
                preco = 5.50;
                break;
        }

        return preco;
    }
}
