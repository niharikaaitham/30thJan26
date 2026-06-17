package collectionStudy;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {
    static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(null);
        a.add(4);
        System.out.println(a);
        a.add(1, 0);
        System.out.println(a);
        System.out.println(a.get(1));
        System.out.println(a.contains(3));
        a.addFirst(12);
        a.addLast(20);
        a.clone();
        System.out.println(a);
         a.offer(10); //Deque and list methods
        System.out.println(a);
        a.offerFirst(5);
        a.offerLast(6);
        System.out.println(a);
        System.out.println(a.peek()); //retrieves but does not remove
        System.out.println(a.poll()); //
        //pollFirst, pollLast
        System.out.println(a);
        a.pop(); //retrieves and removes first element
        //popFirst, popLast
        System.out.println(a);
       ListIterator<Integer> b= a.listIterator();
       while(b.hasNext()){
           System.out.println(b.next());
       }

    }

}
