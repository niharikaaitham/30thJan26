package loopingStatementsAssignment;

public class NumbersSum {
    //17. Write a program to calculate the sum of first 10 natural numbers using while loop.
    static void main(String[] args) {
        int n = 1;
        while (n <= 10) {
            int sum = n * (n + 1) / 2;
            System.out.println(sum);
            n++;
        }
    }
}



