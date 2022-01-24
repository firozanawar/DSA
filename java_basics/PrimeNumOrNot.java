package java_basics;

import java.util.Scanner;

public class PrimeNumOrNot {
    public static void main(String[] args) {

        /**
         * A prime number is a number that is divisible by only two numbers: 1 and itself.
         * So, if any number is divisible by any other number, it is not a prime number.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = input.nextInt();

        int count = 0;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0)
            System.out.println(number + " is a Prime number");
        else
            System.out.println(number + "Not a Prime number");
    }
}
