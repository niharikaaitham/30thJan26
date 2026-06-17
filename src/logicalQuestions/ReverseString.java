package logicalQuestions;

public class ReverseString {
    static void main(String[] args) {
        String a="Niharika";
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            char k=a.charAt(i);
            rev=rev+k;
        }
        System.out.println(rev);
    }
}



