package accessSpecifiers;

public class A {

    private int m = 1;
    protected int b = 2;
    int c = 3;
    public int d = 4;

    static void main(String[] args) {
        A a = new A();
        int sum = 10 + a.b;
        int sum1 = 10 + a.m;
        System.out.println(sum);
        System.out.println(sum1);
        test();
        a.test1();
        a.test2();
        a.test3();
    }

    private static void test() {
        System.out.println("private");

    }

    protected void test1() {
        System.out.println("protected");

    }

    void test2() {
        System.out.println("default");

    }

    public void test3() {
        System.out.println("public");

    }
}
