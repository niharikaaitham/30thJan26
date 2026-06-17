package loopStatements;

public class LoanEligibility {
    //8. Write a program using nested if to check loan eligibility:
    //If nationality = "Indian" and age ≥ 21 → Eligible, else Not eligible.
    static void main(String[] args) {
        int age = 50;
        String nationality = "Indian";
        if (nationality == "Indian") {
            System.out.println("Eligible");
            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }
        } else {
            System.out.println("Invalid data");
        }
    }
}
