package assignment;

public class ReverseNumber {
    static void main(String[] args) {
        String s = "12345";
        String rev = "";
        int i = s.length() - 1;
        while (i >= 0) {
            char b = s.charAt(i);
            rev = rev + b;
            i--;
        }
        System.out.println(rev);
    }
}
