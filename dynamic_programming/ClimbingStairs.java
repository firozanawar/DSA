package dynamic_programming;

import java.util.HashMap;

/**
 * Leetcode 70 : https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        return totalways(0, n,new HashMap<Integer,Integer>());
    }

    private static int totalways(int currentStair, int targetStair,HashMap<Integer,Integer> memo){

        if(currentStair == targetStair)
            return 1;

        if(currentStair > targetStair)
            return 0;

        int currentKey = currentStair;
        if(memo.containsKey(currentKey)){
            return memo.get(currentKey);
        }

        int oneJump = totalways(currentStair + 1,targetStair,memo);
        int twoJump = totalways(currentStair + 2,targetStair,memo);

        memo.put(currentKey,oneJump +twoJump);
        return oneJump + twoJump;
    }
}
