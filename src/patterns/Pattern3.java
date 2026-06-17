package patterns;

public class Pattern3 {
    static void main(String[] args) {
//     *****
//     ****
//     ***
//     **
//     *
        //row, max columns, stars in 1st line, space on the left side in 1st row
        int row = 5;
        //int col = 5;
        int star = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star--;
        }
    }
}
