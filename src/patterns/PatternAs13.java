package patterns;

public class PatternAs13 {
    static void main(String[] args) {
        //30. Write a program using nested for loops to print a 3×3 grid of stars (* * *).
//       * * *
//       * * *
//       * * *
        int row = 3;
        int star = 3;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
