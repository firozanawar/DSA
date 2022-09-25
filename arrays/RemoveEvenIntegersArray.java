package arrays;

/**
 * Q : https://www.youtube.com/watch?v=5rWEio2KoZM&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=71
 */
public class RemoveEvenIntegersArray {

    public static void main(String[] args) {
        int[] myArray = {1, 3, 4, 2, 21, 7, 9, 15};

        int oddCount = 0;
        int dx = 0;

        for (int k : myArray) {
            if (k % 2 != 0) {  // Check weather is ODD or not.
                oddCount++;
            }
        }

        int[] resultArray = new int[oddCount];
        for (int k : myArray) {
            if (k % 2 != 0) {
                resultArray[dx] = k;
                dx++;
            }
        }

        for (int i : resultArray) {
            System.out.print(i + " ");
        }
    }
}
