import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ns[] = new int[n];
        
        String result = "";
        for (int i = 0; i < ns.length; i++) {
            ns[i] = input.nextInt();
            if (ns[i] == 0) {
                result = "NULL";
            } else if (ns[i] % 2 == 0 ) {
                result = "EVEN";
            } else if (ns[i] % 2 != 0) {
                result = "ODD";
            }             
            if (ns[i] > 0) {
                result += " POSITIVE";
            } else if (ns[i] < 0) {
                result += " NEGATIVE";
            }
            
            System.out.println(result);
            result = "";
        }
    }
}