package dynamic_programming;

import java.util.HashMap;

/**
 * Leetcode 509 : https://leetcode.com/problems/fibonacci-number/
 */
public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int n) {
        return nthFibo(n,new HashMap<Integer,Integer>());
    }

    private static int nthFibo(int n,HashMap<Integer,Integer> memo){

        if(n == 0) return 0; // f(0) -> 0
        if(n == 1) return 1;  // f(0) -> 1

        // Param getting changing
        int currentkey = n;
        if(memo.containsKey(currentkey))
            return memo.get(currentkey);

        int a =  nthFibo(n-1,memo);
        int b =  nthFibo(n-2,memo);
        memo.put(currentkey,a +b);

        return a +b;
    }
}
