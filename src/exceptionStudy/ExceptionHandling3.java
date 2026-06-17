package exceptionStudy;

public class ExceptionHandling3 {
    static void main(String[] args) {
        String a=null;
        try{
            System.out.println(10/0);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Check Index");
        }
//        catch(ArithmeticException e){
//            System.out.println("Divide by zero not possible");
//        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
