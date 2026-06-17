package interfaceStudy;

public class A {

    static void main(String[] args) {

        final int a = 1;
        System.out.println(a);

        int b = 2;
        System.out.println(b);

        b = 10 + b;
        System.out.println(b);
    }

    void test1() {
        System.out.println("final method test 1 from A class");
    }

    void test2() {
        System.out.println("non static method test 2 from A class");
    }
}


