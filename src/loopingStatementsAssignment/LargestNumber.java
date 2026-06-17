package loopingStatementsAssignment;

public class LargestNumber {
    static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 3;
        //largest among three numbers using if-else-if.
        if (a > b && a > c) {
            System.out.println("a is largest");
        } else if (b > c && b > a) {
            System.out.println("b is largest");
        } else {
            System.out.println("c is largest");
        }
    }
}
