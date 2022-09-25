package RecursionBacktracking;

public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println(fun(6));
    }

    static int fun(int i) {
        if (i <= 1) return i;

        return fun(i - 1 ) + fun(i - 2 );
    }
}
