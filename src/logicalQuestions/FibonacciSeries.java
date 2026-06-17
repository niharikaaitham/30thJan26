package logicalQuestions;

public class FibonacciSeries {
    static void main(String[] args) {
        int a = -1, b = 1, c;

        for (int i = 0; i <= 10; i++) {
            c = a + b;  // calculate next term
            System.out.print(c + " ");

            a = b;   // update first term
            b = c;   // update second term
        }
    }
}
