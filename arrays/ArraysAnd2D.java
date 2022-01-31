package arrays;

import java.util.Arrays;

public class ArraysAnd2D {
    public static void main(String[] args) {

        //print1DArray();
        print12Array();
    }

    static void print1DArray() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        for (int var : arr) {
            System.out.print(var + " ");
        }

        System.out.println("");
        arr[2] = 99;
        System.out.println(Arrays.toString(arr));
    }

    private static void print12Array() {
        int[][] arr = new int[3][3];
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5,},
                {6, 7, 8, 9}
        };

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("");

        for (int[] ints : arr1) {
            for (int col = 0; col < ints.length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }
        System.out.println("");

        // or
        for (int row = 0; row < arr1.length; row++) {
            System.out.println(Arrays.toString(arr1[row]));
        }
    }

    static void swap(int[] arr, int index1, int index2) {

    }
}
