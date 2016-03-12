import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        int maiorAB = (a + b + Math.abs(a-b)) / 2;
        int maiorCAB = (maiorAB + c + Math.abs(maiorAB-c)) / 2;
        System.out.println(maiorCAB + " eh o maior");
    }
}