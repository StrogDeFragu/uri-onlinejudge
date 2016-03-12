import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by mathe on 03/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, String[]> map = new HashMap<>();

        map.put("tesoura", new String[]{"papel", "lagarto"});
        map.put("papel", new String[] {"pedra", "spock"});
        map.put("pedra", new String[]{"lagarto", "tesoura"});
        map.put("lagarto", new String[]{"spock", "papel"});
        map.put("spock", new String[]{"tesoura", "pedra"});

        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            String op1 = input.next();
            String op2 = input.next();

            String[] ops1 = map.get(op1);
            String[] ops2 = map.get(op2);

            if (op2.equals(ops1[0]) || op2.equals(ops1[1])) {
                System.out.println("rajesh");
            } else if (op1.equals(ops2[0]) || op1.equals(ops2[1])) {
                System.out.println("sheldon");
            } else if (op1.equals(op2)) {
                System.out.println("empate");
            }
        }
    }
}