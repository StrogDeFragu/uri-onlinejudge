
import java.util.Scanner;

public class Main {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int qtdGrenais = 0;
        int vitoriasInter = 0, vitoriasGremio = 0, empates = 0;
        int opcao = 0;
        while (opcao != 2) {
            int golsInter = input.nextInt();
            int golsGremio = input.nextInt();
            
            if (golsInter > golsGremio) 
                vitoriasInter++;
            else if (golsGremio > golsInter) 
                vitoriasGremio++;
            else 
                empates++;
            
            qtdGrenais++;
            
            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = input.nextInt();
        }
        
        System.out.println(qtdGrenais + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empates);
        
        String mensagem;
        if (vitoriasInter > vitoriasGremio) {
            mensagem = "Inter venceu mais";
        } else if (vitoriasGremio > vitoriasInter) {
            mensagem = "Gremio venceu mais";
        } else {
            mensagem = "Nao houve vencedor";
        }
        
        System.out.println(mensagem);
    }
}