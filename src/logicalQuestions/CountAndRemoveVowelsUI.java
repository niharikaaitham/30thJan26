package logicalQuestions;

import java.util.Scanner;

public class CountAndRemoveVowelsUI {
    static void main(String[] args) {
        //a e i o u
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the string name ");
    String givenString1= scanner.next();
    String givenString=givenString1.toLowerCase();
    String output="";
    int count=0;
    for(int i=0;i<=givenString.length()-1;i++){
        char k=givenString.charAt(i);
if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u'){
    count++;
    System.out.println("vowel found is "+k);
    continue;
}
output=output+k;
    }
        System.out.println("string without vowels is "+output);
        System.out.println("Number of vowels in string are "+count);
    }
}
