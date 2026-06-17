package logicalQuestions;

import java.util.Scanner;

public class EvenOddScanner {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}
