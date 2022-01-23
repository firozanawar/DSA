package java_basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World !!");

        // Getting input from the command line while the program.
        //System.out.println(args[0]); // -> This will print whatever input passed

        // Getting the input from command line after running of program
        Scanner input = new Scanner(System.in);
        float var1 = input.nextInt();
        System.out.println(var1);
    }
}
