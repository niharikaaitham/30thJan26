package loopingStatementsAssignment;

public class VotingEligibility {
    static void main(String[] args) {
        //“Eligible for voting” if age ≥ 18, otherwise prints “Not eligible”.
        int age = 40;
        if (age >= 18) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible");
        }
    }
}
