import java.util.*;

public class Challenge16 {
    public static List<Integer> primeFactorization(int N) {
        List<Integer> factors = new ArrayList<>();

        // check divisibility by 2
        while (N % 2 == 0) {
            factors.add(2);
            N /= 2;
        }

        // check odd factors
        for (int i = 3; i * i <= N; i += 2) {
            while (N % i == 0) {
                factors.add(i);
                N /= i;
            }
        }

        // if N is prime and greater than 2
        if (N > 1) {
            factors.add(N);
        }

        return factors;
    }

    public static void main(String[] args) {
        int[] testCases = {30, 49, 19, 64, 123456};

        for (int N : testCases) {
            System.out.println("N = " + N + " -> " + primeFactorization(N));
        }
    }
}
