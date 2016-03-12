import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int x = input.nextInt();
            int y = input.nextInt();
            
            if (x == y) return;
            
            String resultado = (x > y)? "Decrescente":"Crescente";
            System.out.println(resultado);
        }
    }
}