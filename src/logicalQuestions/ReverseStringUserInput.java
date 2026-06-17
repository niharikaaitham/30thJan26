package logicalQuestions;

import java.util.Scanner;

public class ReverseStringUserInput {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the String to be reversed");
String givenString=scanner.next();
String rev="";
    for(int i=givenString.length()-1;i>=0;i--) {
        char k = givenString.charAt(i);
        rev = rev + k;
    }
        System.out.println("Given String is "+givenString);
        System.out.println("Reverse String is "+rev);
    }
}
