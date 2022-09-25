package arrays;

/**
 * Q : https://www.youtube.com/watch?v=PkrEpxfhSao&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=72
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 7, 9, 12, 21};
        reverseArray(myArray, 0, myArray.length - 1);

        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
