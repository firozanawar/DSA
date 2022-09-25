package arrays;

/**
 * https://www.youtube.com/watch?v=cgQi0YPBcD0&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=74
 */
public class MinimumValueInArray {

    public static void main(String[] args) {

        int[] arr = {5, 9, 13, 15, 2, 1};

        // Find the min
        int min = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println("Min value is " + min);
    }
}
