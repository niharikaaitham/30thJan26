package patterns;

public class PatternAs32 {
    static void main(String[] args) {
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

        //row, max columns, stars in 1st line, space on the left side in 1st row
        int row = 5;
        int n = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            n++;
        }
    }
}

