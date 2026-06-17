package stringPackage;

public class StringTest {
    static void main(String[] args) {
//        1. length()
        String a="niha";
        System.out.println(a.length());
//        2. touppercase()
        System.out.println(a.toUpperCase());

//        3. toLowerCase()
        System.out.println(a.toLowerCase());

//        4. equals()
        System.out.println(a.equals("niha"));
//        5. equalsIgnoreCase()
//        6. contains()
        System.out.println(a.contains("ha"));

//        7. isEmpty()
//        8. charAt
        System.out.println(a.charAt(1));

//        9. endsWith
//        10. startsWith
//        11. substring
        String name="Niharika Aitham";
        System.out.println(name.substring(9));
//        12. concat
//        13. indexOf
//        14. lastIndexOf
//        15. replace

    }
}
