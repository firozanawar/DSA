package RecursionBacktracking;

/**
 * Print Sum of first N numbers
 */
public class ParameterisedandFunctionalRecursion {

    public static void main(String[] args) {
        //sumOfNNumbers1(4, 0);
        System.out.println(sumOfNNumbers2(3, 0));
    }

    // Parameterised way
    public static void sumOfNNumbers1(int i, int sum) {

        if (i < 1) {
            System.out.println(sum);
            return;
        }

        sumOfNNumbers1(i - 1, sum + i);
    }

    // Functional Recursion way
    public static int sumOfNNumbers2(int i, int sum) {

        if (i == 0) return 0;
        return i + sumOfNNumbers2(i - 1, sum);

    }
}
