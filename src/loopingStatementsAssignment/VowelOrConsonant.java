package loopingStatementsAssignment;

public class VowelOrConsonant {
    static void main(String[] args) {
        //a,e,i,o,u-->vowels
        char input = 'e';
        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
            System.out.println("Input is Vowels");
        } else {
            System.out.println("Input is Consonants");
        }
    }
}
