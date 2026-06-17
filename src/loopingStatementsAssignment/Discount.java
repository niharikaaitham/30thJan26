package loopingStatementsAssignment;

public class Discount {
    //10. Write a program to find the final bill amount after discount:
    //If > 5000 → 20% off, If > 2000 → 10% off, Else no discount.
    static void main(String[] args) {
        int bill = 2001;
        if (bill > 5000) {
            System.out.println("20% off");
        } else if (bill > 2000) {
            System.out.println("10% off");
        } else {
            System.out.println("no discount");
        }
    }
}
