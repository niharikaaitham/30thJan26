package arrayStudy;

public class ArraySample3 {
    static void main(String[] args) {
        //multi dimensional array
        int test[][] = new int[2][2]; //array declaration
        test[0][0] = 1; //array initialization
        test[0][1] = 2;
        test[1][0] = 3;
        test[1][1] = 4;
        for (int i = 0; i <= test.length - 1; i++) {
            for (int j = 0; j <= test.length - 1; j++) {
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }
    }
}
