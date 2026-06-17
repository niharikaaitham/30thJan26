package stringPackage;

import java.util.stream.Stream;

public class StringStudy {
    static void main(String[] args) {
//        1. length()
        String a="niha";
        System.out.println(a.length());

//        2. touppercase()
        String toUpperCase=a.toUpperCase();
        System.out.println(toUpperCase);

//        3. toLowerCase()
        String lowerCase=a.toLowerCase();
        System.out.println(lowerCase);

//        4. equals()
        String a1="niha";
        String a2=new String("niha");
        String a3=new String("niha");
        System.out.println(a.equals(a1));
        System.out.println("with new memory location: "); //checks string content
        System.out.println(a.equals(a2));
        System.out.println("checking == with new memory location: "); //checks memory location

        System.out.println((a==a2));
//        5. equalsIgnoreCase()
        System.out.println(a.equalsIgnoreCase(a1));
//        6. contains()

        System.out.println(a.contains(a1));

//        7. isEmpty()
        String a4="";
        String a5=" ";


        System.out.println("7. isEmpty()");
        System.out.println(a4.isEmpty());
        System.out.println(a5.isEmpty());

        System.out.println("7. isBlank()");
        System.out.println(a4.isBlank());
        System.out.println(a5.isBlank());


//        8. charAt
        System.out.println("8. charAt");
        System.out.println(a.charAt(2));
//        9. endsWith
//        10. startsWith
//        11. substring
//        12. concat
//        13. indexOf
//        14. lastIndexOf
//        15. replace
        String s="Homogenious";
        System.out.println(s.replace('o','e'));
        System.out.println(s.replace("Homo","Momo"));

    }
}
