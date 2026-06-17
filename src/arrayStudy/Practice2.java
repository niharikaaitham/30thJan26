package arrayStudy;

import java.util.Arrays;

public class Practice2 {
    static void main(String[] args) {
        String names[]={"Niha", "Ramya", "Sonia", "Yashu", "Sahi"};
        System.out.println(names[2]);
        System.out.println("=========================");
        for(int i=0; i<=names.length-1;i++){
            Arrays.sort(names);
            System.out.println(names[i]);
        }
    }
}
