package logicalQuestions;

public class Reverse {
    static void main(String[] args) {
        String a="I love you";
        String[] words=a.split(" ");

        //word in different line
        for(int i=0;i<= words.length-1;i++){
            String word=words[i];
            String rev="";
            for(int j=word.length()-1;j>=0;j--) {
                char k = word.charAt(j);
                 rev = rev + k;
            }
            System.out.println(rev);
        }

    }
}
