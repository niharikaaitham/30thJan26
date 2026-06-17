package patterns;

public class HollowSquarePattern {
    static void main(String[] args) {
//        * * * * *
//        *       *
//        *       *
//        *       *
//        * * * * *

        int row = 5;
        int star = 5;
        for (int i = 1; i <= row; i++) {  //i-->row;j-->column
            for (int j = 1; j <= star; j++) {
                if (i == 1 || i == row || j == 1 || j == star) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


