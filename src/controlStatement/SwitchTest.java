package controlStatement;

public class SwitchTest {
    static void main(String[] args) {
        //1-->jan
        //2-->feb

        int month=4;
        switch(month){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            default:
                System.out.println("enter valid month");
                break;
        }
    }
}
