package logicalQuestions;

public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence = "Java Selenium Testing";
        String[] words = sentence.split(" "); //{"java", "Selenium", "Testing"}

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String rev = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                rev=rev+word.charAt(j);
            }

            System.out.println(rev);
        }
    }
}
