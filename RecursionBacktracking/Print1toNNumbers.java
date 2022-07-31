package RecursionBacktracking;

public class Print1toNNumbers {

    public static int count = 0;

    public static void main(String[] args) {
        //print();
        //printUsingRecursion(1,5);
        //printUsingBackTracking(3, 3);
        printNto1UsingBackTracking(1, 3);
    }

    public static void print() {
        if (count == 3) return;
        System.out.println(count);
        count++;
        print();
    }

    // Print 1,2,3 using Recursion
    public static void printUsingRecursion(int i, int n) {

        if (i > n) return;
        System.out.println(i);
        printUsingRecursion(i + 1, n);
    }

    // Print 1,2,3 using Backtracking
    public static void printUsingBackTracking(int i, int n) {
        if (i < 1) return;
        printUsingBackTracking(i - 1, n);
        System.out.println(i);
    }

    // Print 3,2,1 using Backtracking
    public static void printNto1UsingBackTracking(int i, int n) {
        if (i > n) return;
        printNto1UsingBackTracking(i + 1, n);
        System.out.println(i);
    }
}
