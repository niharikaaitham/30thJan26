package assignment;

public class PalindromeNumber {
    static void main(String[] args) {
        String a = "1221";
        String rev = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            char b = a.charAt(i);
            rev = rev + b;
        }
        if (a.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
