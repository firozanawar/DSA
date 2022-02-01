package searching_algorithms;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        // Ascending array
        int[] nums = {1, 7, 11, 31, 54, 71, 87, 123};

        // Desending array
        int[] nums1 = {123, 100, 99, 89, 73, 55, 42, 11, 2, 1};
        int target = 123;
        System.out.println(searchUsingBinary(nums, target));
        System.out.println(searchUsingBinary(nums1, target));
    }

    static int searchUsingBinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find weather sorted array is asc or des
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + ((end - start) / 2); // Optimise way of getting the mid
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
