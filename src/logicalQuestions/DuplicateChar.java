package logicalQuestions;

public class DuplicateChar {
    static void main(String[] args) {
        String a = "automation"; //2times duplicate
        String a1 = a.toLowerCase();
        char ar[] = a1.toCharArray();
        int count = 0;
        for (int i = 0; i <= ar.length - 1; i++) {
            for (int j = i + 1; j <= ar.length - 1; j++) {
                if (ar[i] == ar[j]) {
                    System.out.println(ar[i]);
                }
            }
        }
        }
    }

