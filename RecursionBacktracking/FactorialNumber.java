package RecursionBacktracking;

public class FactorialNumber {

    public static void main(String[] args) {
        //factorialUsingParameterized(4, 1);
        System.out.println(factorial(4, 1));

    }

    public static int factorialUsingParameterized(int i, int n) {
        if (i < 1) {
            System.out.println(n);
            return n;
        }

        return factorialUsingParameterized(i - 1, n * i);
    }

    public static int factorial(int i, int n) {
        if (i == 0) return 1;
        return i * factorial(i - 1, n);
    }
}
