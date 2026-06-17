package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {
    static void main(String[] args) {
        Vector<Object> a = new Vector<>();
        a.add("Hi");
        a.add(null);
        a.add(123);
        a.add('S');
        a.add(true);
        a.add(1.12);
        System.out.println(a);
        a.addElement(2); //adds element at the end
        System.out.println(a);
//        a.addFirst(1);
//        System.out.println(a);
//        a.addLast(5);
//        System.out.println(a);
//        a.add(2,"There");
        a.elementAt(5);
        System.out.println(a);
        a.firstElement();
        a.lastElement();
        System.out.println(a);
        a.elementAt(2);
        System.out.println(a);
        a.insertElementAt(88, 2);
        System.out.println(a);
        System.out.println("======for loop===========");
        for (int i = 0; i <= a.size() - 1; i++) {
            System.out.println(a.get(i));
        }
        System.out.println("======for each loop===========");
        for (Object v : a) {
            System.out.println(v);
        }
        System.out.println("====== Iterator ===========");

        Iterator<Object> b = a.iterator();
        while (b.hasNext()) {
            System.out.println(b.next());
        }
        System.out.println("======List Iterator ===========");
        ListIterator<Object> l = a.listIterator();
//while(l.hasNext()){
//    System.out.println(l.next());
        l.next(); //0 index
        l.next(); //1 index
        l.remove(); //removes 2nd index=88
        System.out.println(a);
        //}
        l.next();
        l.set("Niha"); //sets 1st index
        System.out.println(a);
        System.out.println("====== Enumeration ===========");
Enumeration<Object> e=a.elements();
while(e.hasMoreElements()){ //only read
    System.out.println(e.nextElement());
}
    }
}

