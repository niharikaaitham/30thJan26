package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VS2 {
    static void main(String[] args) {
        Vector<Object> a = new Vector<>();
        a.add("Hi");
        a.add(null);
        a.add(1);
        a.add('A');
        a.add(true);
        a.add(1.12);
        System.out.println(a);
        System.out.println("====== for loop ========");
        for (int i = 0; i <= a.size() - 1; i++) {
            System.out.println(a.get(i));
        }
        System.out.println("======advanced for loop========");
        for (Object b : a) {   //read only
            System.out.println(b);
        }
        System.out.println("====== Iterator ========");

        Iterator<Object> c = a.iterator();
//        while (c.hasNext()) {
//            System.out.println(c.next());
//        }
        c.next();
        c.next();
        c.next();
        System.out.println("====== Remove ========");

        c.remove();
        System.out.println(a);
        System.out.println("====== Add ========");
        a.add(1, "There");
        System.out.println(a);
        System.out.println("====== List Iterator ========");
        ListIterator<Object> l = a.listIterator();
        l.next();
        l.next();
        l.set(100);
        System.out.println(a);
        System.out.println("====== Enumeration ========");
        Enumeration<Object> e = a.elements();
//  while(e.hasMoreElements())
//      System.out.println(e.nextElement());
//        e.nextElement();
//        e.nextElement();
//        boolean result = e.equals(2);
//        System.out.println(result);
    }
}
