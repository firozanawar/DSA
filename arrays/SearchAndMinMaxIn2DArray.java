package arrays;

public class SearchAndMinMaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5,},
                {6, 7, 8, 99}
        };

        int target = 77;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    System.out.println("Found");
                    return;
                }
            }
        }
        System.out.println("Not Found");

        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int elemet : ints) {
                if (elemet > max) {
                    max = elemet;
                }
            }
        }
        return max;
    }

    static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int elemet : ints) {
                if (elemet < min) {
                    min = elemet;
                }
            }
        }
        return min;
    }
}
