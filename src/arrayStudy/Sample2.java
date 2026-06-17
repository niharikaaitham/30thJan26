package arrayStudy;

import java.util.Arrays;

public class Sample2 {
    static void main(String[] args) {
        int numbers[] = {1, 3, 2, 6, 5, 9, 6, 8};
        System.out.println("Ascending: ");
        for (int i = 0; i <= numbers.length - 1; i++) {
            Arrays.sort(numbers);
            System.out.println(numbers[i]);
        }
        System.out.println("Descending: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            Arrays.sort(numbers);
            System.out.println(numbers[i]);


        }
    }
}
