package java_basics;

import java.util.Scanner;

public class TempratureCtoF {

    public static void main(String[] args) {

        /**
         * Logic : ((temp in C) * 9 / 5) + 32 = in F
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter temperature in C");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9 / 5) + 32;
        System.out.println("temperature in F is: " + tempF);
    }
}
