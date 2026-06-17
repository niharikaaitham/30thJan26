package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HastSetStudy {
    static void main(String[] args) {
        HashSet<String> a = new HashSet<>();
        a.add("Hi");
        a.add("Hi");
        a.add(null);
        a.add(null);
        a.add("Niha");
        a.add("Aitham");
        a.add("test");
        System.out.println(a);
a.remove("test");
        System.out.println(a);
        System.out.println("size is "+a.size());
//        for(int i=0;i<=a.size()-1;i++){
//            System.out.println(a); //cannot retrieve single data
//        }
//        a.clear();
        System.out.println(a.contains("Niha"));
        System.out.println(a.isEmpty());
        System.out.println("=============Advanced for loop============");
        for(String s:a){
            System.out.println(s);
        }
        System.out.println("=============Iterator============");
        Iterator<String> i=a.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}

