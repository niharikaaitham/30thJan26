package logicalQuestions;

import java.util.Scanner;

public class UserInput {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Name");
        String name = scanner.next();
        System.out.println("Entered Name is " + name);
        System.out.println("Please enter your rollnumber");
        int rollNumber = scanner.nextInt();
        System.out.println("Entered Rollnumber is " + rollNumber);
        System.out.println("Please enter your marks");
        float marks = scanner.nextFloat();
        System.out.println("Entered marks are " + marks);
    }
}
