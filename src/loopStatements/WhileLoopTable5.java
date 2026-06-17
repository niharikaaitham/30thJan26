package loopStatements;

import java.sql.SQLOutput;

public class WhileLoopTable5 {
    static void main(String[] args) {
        System.out.println("5 table: ");
        int a=5;
        while(a<=50){
            System.out.println(a);
            a=a+5;
        }
        System.out.println("Reverse 5 table: ");

        int i=50;
        while(i>=5){
            System.out.println(i);
            i=i-5;
        }
    }
}
