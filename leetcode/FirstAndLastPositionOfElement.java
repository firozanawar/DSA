package leetcode;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
 */
public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {

        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(searchPositions(arr, target)[0]);
        System.out.println(searchPositions(arr, target)[1]);
    }

    static int[] searchPositions(int[] arr, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        return ans;
    }

    static int search(int[] arr, int target, boolean isFirstPosition) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isFirstPosition) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }
}
