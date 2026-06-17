package logicalQuestions;

public class Palindrome {
    static void main(String[] args) {
    String a="radar";
    String rev="";
    for(int i=a.length()-1;i>=0;i--){
        char t=a.charAt(i);
        rev=rev+t;
    }
    if(a.equals(rev)){
        System.out.println("Palindrome");
    }else {
        System.out.println("Not a Palindrome");
    }
    }
}


