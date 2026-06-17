package assignment;

public class ReverseString2 {
    static void main(String[] args) {
        String a="Yashri";
       // maxIndex=String.length-1
        String reverse="";
        for(int i=a.length()-1;i>=0;i--) {
            char t = a.charAt(i);
            reverse = reverse + t;
        }
        System.out.println(reverse);
    }
}
