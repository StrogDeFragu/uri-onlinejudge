import java.util.Scanner;

public class Main {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int rodadas = input.nextInt();
        
        int pontosA = 0, pontosB = 0;
        while (rodadas != 0) {
            for (int i = 0; i < rodadas; i++) {
                int a = input.nextInt();
                int b = input.nextInt();
            
                if ( a > b) 
                    pontosA++;
                else if ( b > a ) 
                    pontosB++;
            }
            
            System.out.println(pontosA + " " + pontosB);
            pontosA = pontosB = 0;
            rodadas = input.nextInt();
        }
    }
}