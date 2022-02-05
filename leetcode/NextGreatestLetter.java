package leetcode;

/**
 * 744. Find Smallest Letter Greater Than Target
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */
public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(arr, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2); // Optimise way of getting the mid

            if (target < letters[mid]) {
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
