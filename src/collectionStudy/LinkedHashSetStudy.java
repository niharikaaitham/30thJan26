package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {
    static void main(String[] args) {
        LinkedHashSet<Integer> a = new LinkedHashSet<>();
        a.add(1);
        a.add(1); //NO DUPLICATES
        a.add(2);
        a.add(null);
        a.add(null); //ONLY 1 NULL VALUE
        a.add(3);
        a.add(4);
        System.out.println(a);

        a.addLast(5);
        a.addFirst(0);
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.getFirst());
        System.out.println(a.getLast());
        System.out.println(a.removeFirst());
        System.out.println(a);
        //a.clear();
        System.out.println(a.equals(1));
        System.out.println(a.clone());
        for (Integer i : a) {
            System.out.println(i);
        }
        System.out.println("====================================");
        Iterator<Integer> it=a.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
