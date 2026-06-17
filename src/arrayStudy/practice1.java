package arrayStudy;

import java.util.Arrays;

public class practice1 {
    static void main(String[] args) {
        String fruits[] = new String[4];
        fruits[0] = "mango";
        fruits[1] = "apple";
        fruits[2] = "pear";
        fruits[3] = "kiwi";
        System.out.println(fruits[2]);
        System.out.println(fruits.length);
        System.out.println("Ascending: ");

        for (int i = 0; i <= fruits.length - 1; i++) { //for loop to print all at once
            Arrays.sort(fruits);

            System.out.println(fruits[i]);
        }
        System.out.println("Descending: ");

        for (int i = fruits.length - 1; i >= 0; i--) {
            Arrays.sort(fruits);
            System.out.println(fruits[i]);
        }
    }
}
