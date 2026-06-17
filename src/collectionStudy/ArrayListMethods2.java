package collectionStudy;

import java.util.ArrayList;

public class ArrayListMethods2 {
    static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(0,1);
        a.add(1,2);
        a.add(2,3);
        a.add(3,4);
        a.add(4,5);
        System.out.println(a);
//        a.clear();
//        System.out.println(a);
        a.clone();
        System.out.println(a);
 a.add(5,6);
        System.out.println(a);
        a.addFirst(0);
        System.out.println(a);
a.addLast(7);
        System.out.println(a);

Integer b=a.get(1);
        System.out.println(b);

        Integer c=a.set(0,10);
        System.out.println(c);

    }
}
