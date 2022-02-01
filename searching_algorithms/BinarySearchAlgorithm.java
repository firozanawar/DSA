package searching_algorithms;

public class BinarySearchAlgorithm {

    public static void main(String[] args) {

        int[] nums = {1, 7, 11, 31, 54, 71, 87,123};
        int target = 12;
        System.out.println(searchUsingBinary(nums, target));
    }

    static int searchUsingBinary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + ((end-start)/2); // Optimise way of getting the mid
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
