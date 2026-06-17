package logicalQuestions;

public class Practice {
    static void main(String[] args) {
        //palindrome
        String s1 = "Radar";
        String rev = "";
        String s = s1.toLowerCase();

        for (int i = s.length() - 1; i >= 0; i--) {
            char k = s.charAt(i);
            rev = rev + k;
        }
        if (s.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}
