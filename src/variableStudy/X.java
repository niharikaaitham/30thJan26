package variableStudy;

public class X {
    int m=10; //global variables
   private int n=20;
   protected static int p=1;


     protected static void addition(){
        int a=1;
        int b=2; //local variables
         // static int c=1; not allowed as static is always a global variable

        int sum=a+b;
        System.out.println("sum of protected method is "+sum);
        }
 static void subtract() {
     int sub = 10 - p;
     System.out.println("sub of default method id "+sub);
 }

    public void testMethod(){
         System.out.println("public test");

     }
     }



