package arrays;

/**
 * https://www.youtube.com/watch?v=Zh8RcXFOKVo&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=81
 */
public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 8, 6, 3, 7};

        int length = arr.length;
        int totalActualLength = findSum(length + 1); // +1 because length starts from 0 to add 1 for no. of elemetns
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Missing No. is: " + (totalActualLength - sum));
    }

    static int findSum(int n) {
        return (n * (n + 1)) / 2;
    }
}
