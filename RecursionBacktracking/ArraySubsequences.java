package RecursionBacktracking;

import java.util.ArrayList;

public class ArraySubsequences {

    public static void main(String[] args) {

        // Print all subsequences
        int[] arr = {3, 2, 1};
        //printAllSubsequences(arr);

        // Print all subsequences whos sum is K=2
        int[] arr1 = {1, 2, 1};
        ArrayList<Integer> ds = new ArrayList<>();
        //funAllSubsequencesWithSumK(0, ds, arr1, 0);

        // Print any one subsequence whos sum is K=2
        int[] arr2 = {1, 2, 1};
        ArrayList<Integer> ds2 = new ArrayList<>();
        //funOneSubsequencesWithSumK(0, ds2, arr2, 0);

        // Count all subsequence whos sum is K=2
        int[] arr3 = {1, 2, 1};
        ArrayList<Integer> ds3 = new ArrayList<>();
        System.out.println(funCountSubsequencesWithSumK(0, ds3, arr3, 0));
    }

    static void printAllSubsequences(int[] arr) {
        // Auxiliary space to store each path
        ArrayList<Integer> path = new ArrayList<>();
        funAllSubsequences(0, path, arr, arr.length);
    }

    static void funAllSubsequences(int index, ArrayList<Integer> ds, int[] arr, int n) {

        // base case
        if (index == arr.length) {
            if (ds.size() > 0) {
                System.out.println(ds);
            }
            if (ds.size() == 0) {
                System.out.println("{}");
            }
            return;
        }

        // Pick condition
        ds.add(arr[index]);  // add to array list
        funAllSubsequences(index + 1, ds, arr, n);  // pick an element
        ds.remove(ds.size() - 1);  // remove from array list

        // Don't pick condition
        funAllSubsequences(index + 1, ds, arr, n);  // not pick
    }

    static void funAllSubsequencesWithSumK(int index, ArrayList<Integer> ds, int[] arr, int sum) {
        // base case
        if (index == arr.length) {
            if (sum == 2) { // Here 2 is K=2
                System.out.println(ds);
            }

            return;
        }

        // Pick condition
        ds.add(arr[index]);  // add to array list
        sum = sum + arr[index];
        funAllSubsequencesWithSumK(index + 1, ds, arr, sum);  // pick an element
        ds.remove(ds.size() - 1);  // remove from array list
        sum = sum - arr[index];

        // Don't pick condition
        funAllSubsequencesWithSumK(index + 1, ds, arr, sum);  // not pick
    }

    static boolean funOneSubsequencesWithSumK(int index, ArrayList<Integer> ds, int[] arr, int sum) {
        // base case
        if (index == arr.length) {
            if (sum == 2) { // Here 2 is K=2
                System.out.println(ds);
                return true;
            } else {
                return false;
            }
        }

        // Pick condition
        ds.add(arr[index]);  // add to array list
        sum = sum + arr[index];
        if (funOneSubsequencesWithSumK(index + 1, ds, arr, sum) == true) return true;  // pick an element
        ds.remove(ds.size() - 1);  // remove from array list
        sum = sum - arr[index];

        // Don't pick condition
        if (funOneSubsequencesWithSumK(index + 1, ds, arr, sum) == true) return true;  // not pick
        else return false;
    }

    static int funCountSubsequencesWithSumK(int index, ArrayList<Integer> ds, int[] arr, int sum) {
        // base case
        if (index == arr.length) {
            if (sum == 2) { // Here 2 is K=2
                return 1;
            } else {
                return 0;
            }
        }

        // Pick condition
        ds.add(arr[index]);  // add to array list
        sum = sum + arr[index];
        int left = (funCountSubsequencesWithSumK(index + 1, ds, arr, sum));   // pick an element
        ds.remove(ds.size() - 1);  // remove from array list
        sum = sum - arr[index];

        // Don't pick condition
        int right = (funCountSubsequencesWithSumK(index + 1, ds, arr, sum));  // not pick
        return left + right;
    }
}
