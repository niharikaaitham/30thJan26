package thisAndSuperKeyword;

public class ClassA {
    int a=100; //global variable

    static void main(String[] args) {
ClassA classA=new ClassA();
classA.display();
    }
    public void display(){
        int a=1;
        int sum=10+a;
        int sum1=this.a+1;
        System.out.println(sum);
        System.out.println(sum1);

    }
//    thisAndSuperKeyword.ClassA.this' cannot be referenced from a static context
//    public static void display1(){
//        int a=1;
//        int sum=10+a;
//        int sum1=this.a+1;
//        System.out.println(sum);
//        System.out.println(sum1);
//
//    }
}
