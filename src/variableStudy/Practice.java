package variableStudy;

public class Practice {
    int a=10;
    int b=20; //global variables
    static int c=100;
    static void main(String[] args) {
        Practice practice=new Practice();  //non-static object
        addition(); // static method calling
        practice.sub(); //non-static method calling
        Practice practice1=new Practice(); //non-static new object
        practice1.details(1,2); //non-static with parameters

        Practice2 practice2=new Practice2(); //non-static object creation from another class
        Practice2.testStatic(); //another class static method calling
practice2.testNonStatic(); //another class non-static method calling
    }
    public static void addition(){
        int a=1;
        int b=2;
        int sum=a+b;
        System.out.println(sum);
    }
    public void sub() {
        int a=1;
        int b=2;
        int sub = this.b - a; //TO CALL GLOBAL VARIABLE
        System.out.println(sub);
    }
    public void details(int a, int b) {

        System.out.println(a);
        System.out.println(b);

    }
    }

