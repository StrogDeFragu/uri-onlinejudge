import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[1000];
        
        int t = input.nextInt();
        
        int index = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = index++;
            if ( index == t) {
                index = 0;
            }
            System.out.println("N[" + i + "] = " + n[i]);
        }
        
        
    }
}