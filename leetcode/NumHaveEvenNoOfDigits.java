package leetcode;

/**
 * 1295. Find Numbers with Even Number of Digits
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */
public class NumHaveEvenNoOfDigits {
    public static void main(String[] args) {

        int[] arr = {12, 345, 2, 6, 7896, 999898};
        System.out.println(NoOfDigits(arr));

//        System.out.println(noOfDigit(123));
//        System.out.println(noOfDigit2(123122));
    }

    static int NoOfDigits(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        if (noOfDigit2(num) % 2 == 0) {
            return true;
        }
        return false;
    }

    private static int noOfDigit(int num) {
        if (num == 0) return 1;
        if (num < 0) num = num * -1;
        int digit = 0;
        while (num > 0) {
            digit++;
            num = num / 10;
        }
        return digit;
    }

    private static int noOfDigit2(int num) {
        if (num == 0) return 1;
        if (num < 0) num = num * -1;
        int digit = (int) (Math.log10(num) + 1);
        return digit;
    }
}
