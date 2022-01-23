package java_basics;

import java.util.Scanner;

public class LeapYearOrNot {

    /**
     * A leap year is exactly divisible by 4 except for century years (years ending with 00).
     * The century year is a leap year only if it is perfectly divisible by 400.
     *
     * OR
     *
     * Check if the year is divisible by 4 but not 100, DISPLAY "leap year"
     * Check if the year is divisible by 400, DISPLAY "leap year"
     * Otherwise, DISPLAY "not leap year"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year");
        int year = input.nextInt();

        // Approach 1
        boolean leap = false;
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400 then it is a leap year
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }

        if (leap) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        // Approach 2
        /*if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");*/
    }
}
