package arrayStudy;

import java.util.Arrays;

public class SingleArrayTest {
    static void main(String[] args) {
        int numbers[] = {1, 3, 2, 6, 5, 9, 6, 8};
    for(int i=0;i<=numbers.length-1;i++){
        Arrays.sort(numbers);
        System.out.println(numbers[i]);
    }
    }
}

