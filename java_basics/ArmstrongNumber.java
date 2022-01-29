package java_basics;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int numToCheck = number;
        int totalDigits = 0;
        while (numToCheck != 0) {
            numToCheck = numToCheck / 10;
            totalDigits++;
        }
        System.out.println("Total digits is:: " + totalDigits);

        int arm = 0;
        int t2 = number;
        while (t2 != 0) {
            int rem = t2 % 10;
            int mul = 1;
            for (int i = 1; i <= totalDigits; i++) {
                mul = mul * rem;
            }
            arm = arm + mul;
            t2 = t2/10;
        }
        if(number == arm){
            System.out.println(number + " is armstrong");
        }else{
            System.out.println(number + " is not a armstrong");
        }
    }
}
