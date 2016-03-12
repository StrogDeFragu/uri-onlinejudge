import java.util.Scanner;

/**
 * Created by mathe on 03/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int k = input.nextInt();

            int responsaveis[] = new int[k];
            for (int j = 0; j < k; j++) {
                responsaveis[j] = input.nextInt();
            }

            for (int j = 0; j < responsaveis.length; j++) {
                switch (responsaveis[j]) {
                    case 1:
                        System.out.println("Rolien");
                        break;
                    case 2:
                        System.out.println("Naej");
                        break;
                    case 3:
                        System.out.println("Elehcim");
                        break;
                    case 4:
                        System.out.println("Odranoel");
                        break;
                }
            }
        }
    }
}