package java_basics;

public class NumberOfTimesAdigit {
    public static void main(String[] args) {

        int num = 45535;
        int count = 0;
        while (num > 0) {
            int rim = num % 10; // This will the last digit of number
            if (rim == 5) {
                count++;
            }
            num = num / 10; // This will give the num by last digit removed.
        }
        System.out.println(count);
    }
}
