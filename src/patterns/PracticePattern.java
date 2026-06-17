package patterns;

public class PracticePattern {
    static void main(String[] args) {
        //A
//        A B
//        A B C
//        A B C D
//        A B C D E
        int row = 5;
        int col = 5;
        for (int i = 0; i <= row; i++) {
            char ch='A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}

