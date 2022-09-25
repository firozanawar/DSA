package arrays;

/**
 * https://www.youtube.com/watch?v=wvz5Jz_PW_8&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=77
 */
public class MoveZeroesEndofArray {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 4, 12};

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}
