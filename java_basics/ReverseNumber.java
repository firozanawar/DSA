package java_basics;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 124569;
        int ans = 0;
        while (num > 0) {
            int rem = num % 10; // This will the last digit of number
            num = num / 10;  // This will give the num by last digit removed.
            ans = ans * 10 + rem; // Main logic
        }
        System.out.println(ans);
    }
}
