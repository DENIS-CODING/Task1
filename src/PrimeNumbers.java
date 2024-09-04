// Простые числа до заданного числа
public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 40;
        System.out.println("Простые числа до " + n + ":");
        for (int i = 1; i < n; ++i) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); ++j) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " ");
            }
        }
    }
}
