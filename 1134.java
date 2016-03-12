import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdAlcool = 0, qtdGasolina = 0, qtdDiesel = 0;
        
        
        int cod = input.nextInt();
        
        while (cod != 4) {
            switch (cod) {
                case 1:
                    qtdAlcool++;
                    break;
                case 2:
                    qtdGasolina++;
                    break;
                case 3:
                    qtdDiesel++;
                    break;
            }
            cod = input.nextInt();
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + qtdAlcool);
        System.out.println("Gasolina: " + qtdGasolina);
        System.out.println("Diesel: " + qtdDiesel);
    }
}

