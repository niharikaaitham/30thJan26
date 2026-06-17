package logicalQuestions;

public class ReverseOddPlacesFromString {
    static void main(String[] args) {
        String s = "My Name Is Niharika";
        String[] s1 = s.split(" ");
        String rev = "";
        for (int i = 0; i <= s1.length - 1; i++) {
            if (i % 2 != 0) {
                String k = s1[i];
                for (int j = s1.length - 1; j >= 0; j--) {
                    rev = rev + k.charAt(j);
                }
                s1[i] = rev;
                rev = "";
            }
        }

        for (int i = 0; i <= s1.length - 1; i++) {
            System.out.println(s1[i] + " ");
        }
    }
    }

