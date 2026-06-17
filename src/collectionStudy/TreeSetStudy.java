package collectionStudy;

import java.util.TreeSet;

public class TreeSetStudy {
    static void main(String[] args) {
        TreeSet<Integer> a = new TreeSet<>();
        a.add(1);
        // a.add(2); //no duplicates
        //a.add(null); no null values-->gives null pointer exception
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(15);
        a.add(20);
        System.out.println(a); //order on insertion-->Ascending order
        System.out.println(a.ceiling(10));
        System.out.println(a.floor(5));
    }
}
