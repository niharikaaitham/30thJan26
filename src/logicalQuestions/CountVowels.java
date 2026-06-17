package logicalQuestions;

public class CountVowels {
    static void main(String[] args) {
        String a = "Velocity";
        //a e i o u
        int count = 0;
        String b="";

        for (int i = 0; i <= a.length() - 1; i++) { //i=0-->v
            char k = a.charAt(i);
            if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u') {
                    count++;
                System.out.println("vowel found is "+k);
//                continue;
                }

//            b=b+k;
            }
//            System.out.println("string without vowels is "+b);
            System.out.println("Number of vowels in string are "+count);

    }
    }

