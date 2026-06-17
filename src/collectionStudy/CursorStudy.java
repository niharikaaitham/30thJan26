package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CursorStudy {
    static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        System.out.println(arrayList);
//        System.out.println("=============== for ====================");
//        for (int i = 0; i <= arrayList.size() - 1; i++) {
//            System.out.println(arrayList.get(i));
//        }
//        System.out.println("==============for each======================");
//        for (Integer al : arrayList) { //al-->variable; arraylist-->object
//            System.out.println(al);
//        }
//        System.out.println("============== iterator ======================");

//        Iterator<Integer> it = arrayList.iterator(); //it-->variable; iterator-->interface
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        /*it.remove(); -->gives IllegalStateException as we
        have moved the cursor till the end and there is no element next */
//        System.out.println("============== List iterator ======================");

        ListIterator<Integer> lit = arrayList.listIterator();
//        while (lit.hasNext()) {
//            System.out.println(lit.next());
//        }
        lit.next();
        lit.next();
        lit.set(200);
        System.out.println(arrayList);


//        System.out.println("============== Previous iterator ======================");
//
//        while (lit.hasPrevious()) {
//            System.out.println(lit.previous());
        }
    }

