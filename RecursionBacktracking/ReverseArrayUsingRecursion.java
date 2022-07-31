package RecursionBacktracking;

public class ReverseArrayUsingRecursion {
    static int[] arr = {1, 2, 3, 4, 5, 9};

    public static void main(String[] args) {
        func(0);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void func(int i) {
        int n = arr.length;
        if (i >= n / 2) return;
        swap(i, n - i - 1);
        func(i + 1);

    }

    static void swap(int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
