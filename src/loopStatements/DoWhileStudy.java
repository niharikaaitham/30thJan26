package loopStatements;

public class DoWhileStudy {
    static void main(String[] args) {
        System.out.println("Printing Welcome Message: ");
        //intitialization=1; condition<=4 ;updation=++
        //print Welcome 4 times
        int i = 1; //initialization
        do {
            System.out.println("Welcome"); //body
            i++;
        } while (i <= 4);
        System.out.println("Table 3: ");
        int a = 3; //initialization
        do {
            System.out.println(a); //printing statement
            a = a + 3;
        } while (a <= 30);
    }
}
