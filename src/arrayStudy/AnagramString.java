package arrayStudy;

import java.util.Arrays;

public class AnagramString {
    static void main(String[] args) {
        String a1="Java";
        String b="avaj";
        String a=a1.toLowerCase();
        char[] ar1=a.toCharArray();
        char[] ar2=b.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        Arrays.equals(ar1,ar2);

        if (Arrays.equals(ar1, ar2)) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Strings are not anagram");
        }
    }
}
