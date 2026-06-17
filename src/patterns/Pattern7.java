package patterns;

public class Pattern7 {
    static void main(String[] args) {
//           *
//          ***
//         *****
//        *******


        int row=4;
        int star=1;
        int space=3;


        for(int i=1;i<=row;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            System.out.println();
            star=star+2;
            space--;
        }


//
//        int row = 4;
//        // int col = 7;
//        int star = 1;
//        int space = 3;
//        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= space; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= star; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            space--;
//            star = star + 2;
        }
    }

