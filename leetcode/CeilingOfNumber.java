package leetcode;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 14;

        System.out.println(ceilingNumber(arr, target));
    }

    // return the index of smallest no >= target
    static int ceilingNumber(int[] arr, int tar) {
        int start = 0;
        int end = arr.length-1;

        // if the target is greater than the greatest number in array
        if(tar > arr[arr.length-1]) return -1;

        while (start <= end) {
            int mid = start + ((end-start)/2); // Optimise way of getting the mid

            if (tar > arr[mid]) {
                start = mid + 1;
            } else if (tar < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
