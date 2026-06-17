package logicalQuestions;

public class VowelCount {
    static void main(String[] args) {
        String a="treasure";
        int count=0;
        for(int i=0;i<=a.length()-1;i++){
            char k=a.charAt(i);

            if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
