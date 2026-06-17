package controlStatement;

public class ElseIfStudy {
    //marks>=35-->Pass
    //marks>=60-->First Class
    //marks>=75-->Distinction
    //marks<=35-->default condition which is fail

    static void main(String[] args) {
        int marks = 85;
        if (marks >= 35) {
            System.out.println("Pass");
        } else if (marks >= 60) {
            System.out.println("First Class");

        } else if (marks >= 75) {
            System.out.println("Distinction");
        } else {
            System.out.println("Fail");

        }
    }

}
