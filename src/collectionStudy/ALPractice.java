package collectionStudy;

import java.util.ArrayList;

public class ALPractice {
    static void main(String[] args) {
        ArrayList<Object> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.addFirst(0);
        a.addLast(5);
        System.out.println(a);

        a.clone();
        System.out.println( a.get(2));

        System.out.println(a.size());
        a.add("Niha");
        System.out.println(a);
    }
}
