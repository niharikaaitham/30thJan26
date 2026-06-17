package assignment;

public class WhiteSpaceCount {
    static void main(String[] args) {
        String a="engineering";
        int counter=0;
        for(int i=0;i<=a.length()-1;i++){
            char temp=a.charAt(i);
            if (temp=='e'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
