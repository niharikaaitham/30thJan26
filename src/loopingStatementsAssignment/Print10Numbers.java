package loopingStatementsAssignment;

public class Print10Numbers {
    //12. Write a program to print numbers 10 to 1 in reverse order using for loop.
    static void main(String[] args) {
        for (int number = 10; number >= 1; number--) {
            System.out.println(number);
        }
        System.out.println("Reverse order: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
    }
}

