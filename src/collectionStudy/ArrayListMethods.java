package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;

//collection-->list set queue
//list-->arraylist, vector, linkedList
//iterators-->cursor, iterator, listIterator,enumeration

public class ArrayListMethods {
    static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>(); //object creation with capacity 10
        boolean result=arrayList.add(1);
        System.out.println(result);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);
        arrayList.add(0,0);
        System.out.println(arrayList);
        arrayList.addFirst(9);
        System.out.println(arrayList);
        arrayList.addLast(4);
        System.out.println(arrayList);
        arrayList.clear();

        arrayList.clone();
        System.out.println();

        Iterator<Integer> it = arrayList.iterator();

while(it.hasNext()){
    it.next();
    it.remove();
}
    }
}
