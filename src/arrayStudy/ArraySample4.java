package arrayStudy;

public class ArraySample4 {
    static void main(String[] args) {
        String subject[][] = {{"aa", "ab", "ac"}, {"ba", "bb", "bc"}}; //{}-->rows
        for (int i = 0; i <= subject.length - 1; i++) {
            for (int j = 0; j <= subject[0].length - 1; j++) {
                System.out.print(subject[i][j] + " ");
            }
            System.out.println();
        }
    }
}
