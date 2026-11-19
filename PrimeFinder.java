public class PrimeFinder {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 500:");

        // Outer loop goes through numbers from 2 to 500
        for (int i = 2; i <= 500; i++) {
            boolean isPrime = true;

            // Inner loop checks if 'i' is divisible by any number up to its square root
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false; // Found a divisor, so it's not prime
                    break;           // Exit the inner loop early
                }
            }

            // If it's still marked prime, print it
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
