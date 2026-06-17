package exceptionStudy;

public class ExceptionHandling1 {
    static void main(String[] args) {
        System.out.println("hi");
        try{
            System.out.println(10/0);  //identify risky code
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        System.out.println(200);
    }
}
