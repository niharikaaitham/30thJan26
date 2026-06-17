package controlStatement;

public class Vowels {
    //a,e,i,o,u-->vowels
    //others-->consonants
    static void main(String[] args) {
        char alphabets = 'J';
        if (alphabets == 'A' || alphabets=='E' || alphabets=='I' || alphabets=='O' || alphabets=='U') {
            System.out.println("Vowels");
        }
            else{
                System.out.println("Consonants");
            }
    }
}
