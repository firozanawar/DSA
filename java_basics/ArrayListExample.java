package java_basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //arrayList();

        multiDimArrayList();
    }

    static void arrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(14);
        list.add(14);
        list.set(0, 99);
        System.out.println(list.contains(99));
        list.remove(3);
        System.out.println(list.get(2));
        System.out.println(list);
    }

    private static void multiDimArrayList() {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mulArray = new ArrayList<>();

        // Initialize the internal array
        for (int i = 0; i < 3; i++) {
            mulArray.add(new ArrayList<>());
        }

        // Add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mulArray.get(i).add(in.nextInt());
            }
        }

        System.out.println(mulArray);
    }
}
