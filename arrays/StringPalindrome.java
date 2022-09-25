package arrays;

/**
 * https://www.youtube.com/watch?v=Q485CWk_QWk&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=83
 */
public class StringPalindrome {

    public static void main(String[] args) {

        String str = "ada";
        System.out.println("Is palindrome: " + isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start > end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
