package loopingStatementsAssignment;

public class PrimeNumber {
    //26. Write a program to check whether a number is prime or not using for loop.
    static void main(String[] args) {
        int n = 21;

        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
            System.out.println("Is not a prime number");
        } else {
            System.out.println("Is a prime number");
        }
    }
}

