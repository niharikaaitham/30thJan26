package exceptionStudy;

public class ExceptionHandling4 {
    static void main(String[] args) {
        String a=null;
        try{
            System.out.println(a.length());
        }
        finally {
            System.out.println("final code executed");
        }
        System.out.println("Hi");
    }
}
