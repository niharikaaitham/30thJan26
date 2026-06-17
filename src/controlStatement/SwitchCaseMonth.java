package controlStatement;

import java.sql.SQLOutput;

public class SwitchCaseMonth {
    static void main(String[] args) {
        //month 1-->jan
        int month=12;
        switch(month){
            case 1: System.out.println("jan");
            break;
            case 2: System.out.println("feb");
            break;
            case 3: System.out.println("mar");
            break;
            default:  System.out.println("enter valid month");

        }
    }
}
