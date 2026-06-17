package controlStatement;

public class StarPattern {
    static void main(String[] args) {
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
        int row=5;
        int col=5;
        int star=1;

        for(int i=1;i<=row;i++) {
            for (int k = 1; k <= star; k++) {
                System.out.print("* ");
            }
            System.out.println();
            star++;
        }

    }
}
