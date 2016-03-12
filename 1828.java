import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by mathe on 02/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, String[]> map = new HashMap<>();

        map.put("tesoura", new String[]{"papel", "lagarto"});
        map.put("papel", new String[] {"pedra", "Spock"});
        map.put("pedra", new String[]{"lagarto", "tesoura"});
        map.put("lagarto", new String[]{"Spock", "papel"});
        map.put("Spock", new String[]{"tesoura", "pedra"});

        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            String op1 = input.next();
            String op2 = input.next();

            String[] ops1 = map.get(op1);
            String[] ops2 = map.get(op2);

            String resultado = "Caso #" + (i+1) + ": ";
            String situacao = "";
            if (op2.equals(ops1[0]) || op2.equals(ops1[1])) {
                situacao = "Bazinga!";
            } else if (op1.equals(ops2[0]) || op1.equals(ops2[1])) {
                situacao = "Raj trapaceou!";
            } else if (op1.equals(op2)) {
                situacao = "De novo!";
            }

            System.out.println(resultado + situacao);
        }
    }
}
