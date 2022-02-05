package leetcode;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        System.out.println(floorNumber(arr, target));
    }

    // return the index of greatest no <= target
    static int floorNumber(int[] arr, int tar) {
        int start = 0;
        int end = arr.length-1;

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
        return end;
    }
}
