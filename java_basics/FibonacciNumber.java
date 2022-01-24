package java_basics;

public class FibonacciNumber {

    public static void main(String[] args) {
        /**
         * The Fibonacci series is a series where the next term is the sum of the previous two terms.
         * The first two terms of the Fibonacci sequence are 0 followed by 1.
         *
         * Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
         */

        int a = 0;
        int b = 1;

        for (int i = 2; i <= 9; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
