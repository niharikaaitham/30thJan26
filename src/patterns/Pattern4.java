package patterns;

public class Pattern4 {
    static void main(String[] args) {
//        *****
//         ****
//          ***
//           **
//            *


        int row = 5;
        int col = 5;
        int star = 5;
        int space = 0;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();
            space++;
            star--;
        }
    }
}
