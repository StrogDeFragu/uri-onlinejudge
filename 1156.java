public class Main {
    public static void main(String[] args) {
        double s = 0;

        for (int dividendo = 1, divisor = 1; dividendo <= 39; dividendo += 2, divisor *= 2) {
            s += (double) dividendo / divisor;
        }

        System.out.printf("%.2f", s);
        System.out.println();
    }
}