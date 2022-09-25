package takeuforward.learnthebasics;

import java.util.Scanner;

public class UserInputOutput {

    public static void main(String[] args) {

        // Output
        System.out.println("Hello World");
        System.out.print("Hi I am Firoz, ");
        System.out.println("I am an Engineer");

        // Input
        Scanner sc = new Scanner(System.in);
        int value1= sc.nextInt();
        System.out.println("Entered int value is "+value1);

        // Similarly, we can use nextLong(), nextFloat(), nextDouble(), and next() methods to get long, float, double,
        // and string input respectively from the user.
        System.out.print("Enter text: ");
        String myString = sc.next();
        System.out.println("Text entered = " + myString);

        // closing the scanner object
        sc.close();
    }
}
