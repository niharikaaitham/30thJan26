package patterns;

public class Pattern8 {
    static void main(String[] args) {
//          *
//         * *
//        * * *
//       * * * *
        //row=4; star in 1st row=1; col=4; spaces in 1st row=3

        int row = 4;
        int star = 1;
        int space = 3;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("* ");
            }
            System.out.println();
            star++;
            space--;

//        int row = 4;
//        int star = 1;
//        int space = 3;
//        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= space; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= star; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//            star++;
//            space--;
        }
    }
}
