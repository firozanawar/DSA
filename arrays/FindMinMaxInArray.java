package arrays;

public class FindMinMaxInArray {
    public static void main(String[] args) {

        int[] arr = {18, 12, -7, 3, 2, 28};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    static int max(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
