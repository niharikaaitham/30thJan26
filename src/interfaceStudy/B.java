package interfaceStudy;

public class B extends A {
    static void main(String[] args) {
B b=new B();
b.test1();
b.test2();
    }
   final void add() {
        int sum=10;
        System.out.println(sum);
    }
    final void test1() {
        System.out.println("final method test 1 from A class");
    }
    }


