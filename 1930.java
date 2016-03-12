import java.util.Scanner;

/**
 * Created by mathe on 02/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int t3 = input.nextInt();
        int t4 = input.nextInt();

        int qtd1 = (t1 + t2) - 1;
        int qtd2 = (qtd1 + t3) - 1;
        int qtd3 = (qtd2 + t4) - 1;

        System.out.println(qtd3);
    }
}
