package logicalQuestions;

import java.util.Scanner;

public class EvenOddNumberUI {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number");
        int number= scanner.nextInt();
        if(number==0){
            System.out.println("Number is zero");
        }
        else if(number%2==0) {
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
