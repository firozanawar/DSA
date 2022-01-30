package strings;

public class SearchingInString {
    public static void main(String[] args) {
        String name  = "firoz";
        char target  = 'f';

        /*for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == target){
                System.out.println("found");
                return;
            }
        }*/

        // OR
        for (char ch: name.toCharArray()) {
            if(ch == target){
                System.out.println("found");
                return;
            }
        }
        System.out.println("Not found");
    }
}
