package controlStatement;

public class IfStudy {
    static void main(String[] args) {
        System.out.println("--------------------------------------------");
        //age=18->Eligible to Vote
        int age = 30;
        if (age >= 18) {
            System.out.println("Eligible to Vote");
        }
        System.out.println("--------------------------------------------");

//Country=India --> Nationality is India
        String country = "India";
        if (country == "India") {
            System.out.println("Nationality is India");
        }
        System.out.println("--------------------------------------------");

// status = 'P' --> Present
        char status = 'P';
        if (status == 'P') {
            System.out.println("Present");
        }
        System.out.println("--------------------------------------------");

        boolean hasPassport = false;
        if (hasPassport == true) {
            System.out.println("Can Travel");
        }

        }
    }
