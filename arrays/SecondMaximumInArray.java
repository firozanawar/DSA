package arrays;

/**
 * Q : https://www.youtube.com/watch?v=UULE-HyfERc&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=77
 */
public class SecondMaximumInArray {

    public static void main(String[] args) {
        int[] arr = {12, 34, 33, 34, 49,1, 2, 9};

        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        // Find the 2nd max
        for (int i : arr) {
            if (i > max) {
                second_max = max;
                max = i;
            }else if(i > second_max && i != max){
                second_max = i;
            }
        }
        System.out.println("2nd max value is "+second_max);
    }
}
