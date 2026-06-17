package patterns;

public class Pattern10 {
    static void main(String[] args) {
        int row = 4;
        int star = 4;
        int space = 0;
        //char c='A';
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print(star);
            }
            System.out.println();
            space++;
            star--;
        }
    }
}
