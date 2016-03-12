import java.util.Scanner;

public class Main {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int m = input.nextInt();
        
        String soma;
        String novaStr;
        while ( n != 0 && m != 0 ) {  
            soma = n + m + "";
            novaStr = "";
            for (int i = 0; i < soma.length(); i++) {
                if (soma.charAt(i) != '0') {
                    novaStr += soma.charAt(i);
                }
            }
            System.out.println(novaStr);

            n = input.nextInt();
            m = input.nextInt();            
        }
    }
}