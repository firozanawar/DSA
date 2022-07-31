package RecursionBacktracking;

public class CheckStringPalindrome {

    static String str = "MADAM";

    public static void main(String[] args) {
        System.out.println(check(0));
    }
    static boolean check(int i) {
        int n = str.length();
        if (i >= n / 2) return true;
        if (str.toCharArray()[i] != str.toCharArray()[n - i - 1]) return false;
        return check(i + 1);
    }
}
