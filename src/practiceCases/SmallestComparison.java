package practiceCases;

public class SmallestComparison {
    static void main(String[] args) {
        //smallest of 3 numbers
        int a = 6;
        int b = 2;
        int c = 3;

        if (a < b && a < c) {
            System.out.println("a is smallest");
        } else if (b < c && b < a) {
            System.out.println("b is smallest");

        } else {
            System.out.println("c is smallest");

        }
    }
}
