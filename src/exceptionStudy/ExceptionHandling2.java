package exceptionStudy;

public class ExceptionHandling2 {
    static void main(String[] args) {
        System.out.println("hi");
        String a=null;
       try{
           System.out.println(a.charAt(5));
       }catch(NullPointerException e){
            System.out.println("Object cannot be null");
        }catch(StringIndexOutOfBoundsException e){
           System.out.println("Check Index");
       }
        System.out.println(100);
    }
}
