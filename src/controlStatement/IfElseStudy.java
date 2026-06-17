package controlStatement;

public class IfElseStudy {
    static void main(String[] args) {
        System.out.println("--------------------------------------------");
        //age=18->Eligible to Vote
        int age = 30;
        if (age >= 18) {
            System.out.println("Eligible to Vote");
        }
        else {
            System.out.println("Not Eligible to Vote");

        }
        System.out.println("--------------------------------------------");

//Country=India --> Nationality is India
        String country = "UK";
        if (country == "India") {
            System.out.println("Nationality is India");
        }
        else {
            System.out.println("Nationality is no1t India");
        }
        System.out.println("--------------------------------------------");

// status = 'P' --> Present
        char status = 'A';
        if (status == 'P') {
            System.out.println("Present");
        }
        else {
            System.out.println("Absent");

        }
        System.out.println("--------------------------------------------");

        boolean hasPassport = false;
        if (hasPassport == true) {
            System.out.println("Can Travel");
        }
        else {
            System.out.println("Cannot Travel");

        }
    }
}
