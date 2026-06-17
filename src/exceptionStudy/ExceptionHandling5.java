package exceptionStudy;

public class ExceptionHandling5 {
    static void main(String[] args) {
        String a="test";
        try{
            System.out.println(1/0);
            System.out.println(a.charAt(5));
        }
//        catch(ArithmeticException e){
//            System.out.println("Cannot divide by zero");
//        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Check Index");
        }
//        catch(Exception e){
//            System.out.println("Something went wrong");
//        }
        finally {
            System.out.println("Final block executed");
        }
        System.out.println("End of code");
    }
}
