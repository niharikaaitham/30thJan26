package stringPackage;

public class StringMethods {
    static void main(String[] args) {
        String a = "Niharika"; //a=String object
        //1. length()
        System.out.println(a.length());
        int StringLength = a.length(); //declaration
        System.out.println(StringLength);
        String a1 = "";
        System.out.println(a1.length());

//String a2=null;
//        System.out.println(a2.length()); -->Null pointer exception in this line
        System.out.println("=================================");
//2. touppercase()
        String l1 = "NIHarika";
        String toUpperCase = l1.toUpperCase();
        System.out.println(l1.toUpperCase());
        //3. toLowerCase()
        System.out.println(l1.toLowerCase());
        System.out.println("=================================");

        //4. equals()
        String e1 = "Niha";
        String e2 = "Niha";
        String e3 = new String("Niha");
        String e4 = new String("niha");
        System.out.println(e1.equals(e2)); //checks string content
        System.out.println(e1.equals(e3));
        System.out.println(e3.equals(e4));
        System.out.println("4. equals(): ");
        System.out.println("=================================");

        System.out.println(e1 == e2); //checks memory location
        System.out.println(e1 == e3);
        System.out.println(e3 == e4);
        System.out.println("=================================");

//5. equalsIgnoreCase()
        String e5 = "niha";
        System.out.println("5. equalsIgnoreCase(): ");
        System.out.println(e5.equalsIgnoreCase(e1));
        System.out.println("=================================");
//        6. contains()
        String c1 = "Niharika";
        boolean result = c1.contains("har");
        System.out.println("6. contains()");
        System.out.println("contains: " + result);
        System.out.println("=================================");
//        7. isEmpty()
        String c2 = "";
        String c3 = " "; //length is 0-->true ; calculates space also as 1 character
        System.out.println("7. isEmpty():");
        System.out.println(c2.isEmpty());
        System.out.println(c3.isEmpty());
        System.out.println("7. isBlank()");
        System.out.println(c2.isBlank());
        System.out.println(c3.isBlank());
        System.out.println("=================================");

//        8. charAt
        String c4 = "Sahith Chandan";
        System.out.println("8. charAt");
        System.out.println(c4.charAt(7));
        System.out.println("================================="); //return-->boolean

//        9. endsWith
        System.out.println("9. endsWith");
        System.out.println(c4.endsWith("dan"));
        System.out.println("================================="); //return-->boolean

//        10. startsWith
        System.out.println("10. startsWith");
        System.out.println(c4.startsWith("Sah"));
        System.out.println("================================="); //return-->boolean

//        11. substring
        System.out.println(" 11. substring");
        System.out.println(c4.substring(7));
        System.out.println(c4.substring(0, 14)); //ends+1
        System.out.println("=================================");

//        12. concat
        System.out.println("12. concat");
        System.out.println(c4.concat(" " + "Mekala"));
        System.out.println("=================================");

//        13. indexOf
        System.out.println("13. indexOf:");
        System.out.println(c4.indexOf('h')); //return-->integer
        System.out.println("=================================");

//        14. lastIndexOf -->         String c4 = "Sahith Chandan";
        System.out.println("14. lastIndexOf:");

        System.out.println(c4.lastIndexOf('h'));
        System.out.println("=================================");

//        15. replace
        String k2 = "Minneapolis";
        System.out.println("15. replace:");

        System.out.println(k2.replace("in", "ee"));
        //replaceFirst
        System.out.println(k2.replaceFirst("n", "m"));
    }
}
