package controlStatement;

public class ElseIfEg2 {
    static void main(String[] args) {
        //marks=10
        // A-->8>= and B<=9
        //B-->7>= and <=8
        //C-->5>= and <=7//D

        int marks = 7;
        if (marks >= 8 && marks <= 9) {
            System.out.println("Grade is A");
        } else if (marks >= 7 && marks <= 8) {
            System.out.println("Grade is B");

        } else if (marks >= 5 && marks <= 7) {
            System.out.println("Grade is B");

        } else {
            System.out.println("Grade is D");

        }
    }
}
