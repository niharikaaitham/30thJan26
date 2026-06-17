package logicalQuestions;

public class PalindromeTest {
    static void main(String[] args) {
        String a="kadak";
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            char k=a.charAt(i);
            rev=rev+k;
        }
        System.out.println(rev);
        if(a.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
    }