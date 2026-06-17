package loopingStatementsAssignment;

public class StudentGrade {
    //Write a program to display the grade of a student based on marks:
    //>=90 → A+, >=75 → A, >=60 → B, >=40 → C, else Fail.
    static void main(String[] args) {
        int a = 65;
        if (a >= 90) {
            System.out.println("A+");
        } else if (a >= 75) {
            System.out.println("A");

        } else if (a >= 60) {
            System.out.println("B");

        } else if (a >= 40) {
            System.out.println("C");

        } else {
            System.out.println("Fail");
        }
    }
}
