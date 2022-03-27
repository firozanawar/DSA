package java_basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World !!");

        // Getting input from the command line while the program.
        //System.out.println(args[0]); // -> This will print whatever input passed in java Main 1 2

        // Getting the input from command line after program start running
        Scanner input = new Scanner(System.in);
        //int var = input.nextInt();
        float var = input.nextFloat();
        System.out.println(var);
    }
}
