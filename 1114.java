import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int senha = input.nextInt();
            
            if (senha == 2002) {
                System.out.println("Acesso Permitido");
                return;
            }
            
            System.out.println("Senha Invalida");
        }
    }
}
