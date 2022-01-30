package searching_algorithms;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {

        int[] nums = {1, 7, 11, 31, 87, 65, 123, 34, 12, 2};
        int target = 65;
        System.out.println(linearSearch(nums, target));
        System.out.println(linearSearchInRage(nums, target,1,5));
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return Integer.MAX_VALUE;
    }

    static int linearSearchInRage(int[] arr, int target,int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return Integer.MAX_VALUE;
    }
}
