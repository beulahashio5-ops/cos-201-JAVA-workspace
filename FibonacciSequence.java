import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 100;
        List<BigInteger> fibNumbers = generateFibonacci(n);

        // Display the results with their position index
        for (int i = 0; i < fibNumbers.size(); i++) {
            System.out.println("F(" + (i + 1) + ") = " + fibNumbers.get(i));
        }
    }

    public static List<BigInteger> generateFibonacci(int n) {
        List<BigInteger> fibList = new ArrayList<>();
        if (n <= 0) {
            return fibList;
        }

        // First Fibonacci number
        fibList.add(BigInteger.ZERO);
        if (n == 1) {
            return fibList;
        }

        // Second Fibonacci number
        fibList.add(BigInteger.ONE);

        // Generate subsequent numbers using BigInteger addition
        for (int i = 2; i < n; i++) {
            BigInteger nextNum = fibList.get(i - 1).add(fibList.get(i - 2));
            fibList.add(nextNum);
        }

        return fibList;
    }
}
