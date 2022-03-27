package java_basics;

public class TypeCostingConversion {

    public static void main(String[] args) {

        /**
         * Rule of conversion rule:
         *  1. Conversion is possible only if both are compatible like int and float.
         *  2. If destination is greater than source space
         *
         * Rule of promotion rule:
         *  All byte, short, char values are promoted into integer value
         *  If any operand is long whole operation will be promoted to long, if float then float if double to double.
         *  All will be converted to bigger one
         */

        // Type casting
        int num = (int)67.75f;
        System.out.println(num); // O/P -> 67

        // Automatic type promotion in expression
        int a = 258;
        byte b = (byte)a;
        System.out.println(b); // O/P -> 2 i.e byte can store 256 only, 258 % 256 = 2

        byte b1 = 40;
        byte b2 = 50;
        byte b3 = 100;
        int c  = (b1 * b2) / b3;
        System.out.println(c); // O/P -> 20

        byte b4 = 50;
        //b4 = b4 * 2; // Compilation error because b4 * 2 become int and that can't stored in byte.

    }
}
