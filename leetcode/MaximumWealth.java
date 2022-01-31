package leetcode;

/**
 * 1672. Richest Customer Wealth
 * https://leetcode.com/problems/richest-customer-wealth/
 */
public class MaximumWealth {

    public static void main(String[] args) {
        int[][] input = {
                {1, 2, 2}, {3, 2, 11}
        };
        System.out.println(maxWealth(input));
    }

    static int maxWealth(int[][] accounts) {
        int maxSum = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int rowSum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowSum = rowSum + accounts[person][account];
            }
            if (rowSum > maxSum) {
                maxSum = rowSum;
            }
        }
        return maxSum;
    }
}
