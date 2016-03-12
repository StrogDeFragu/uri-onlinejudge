public class Main {
    public static void main(String[] args) {
        int a = 1;
        double s = 0;
        for (int i = 1; i <= 100; i++) {
            s += (double) a / i;
        }

        System.out.printf("%.2f", s);
        System.out.println();
    }
}