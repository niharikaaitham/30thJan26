package logicalQuestions;

public class WhiteSpaceCount {
//    static void main(String[] args) {
//        String s="Niha ri ka ";
//        int count=0;
//        for(int i=0;i<=s.length()-1;i++){
//            char k=s.charAt(i);
//           if(k==' ') {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}

    static void main(String[] args) {
        String s = "I love you";
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            char k = s.charAt(i);
            if (k == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}