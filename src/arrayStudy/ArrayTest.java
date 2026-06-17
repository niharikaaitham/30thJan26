package arrayStudy;

import java.util.Arrays;

public class ArrayTest {
    static void main(String[] args) {
        String names[]={"Niha", "yashu", "Sahith"};
        System.out.println(names[2]);

    for(int i=0; i<=names.length-1;i++) {

        Arrays.sort(names);
        System.out.println(names[i]);
    }
    }
}
