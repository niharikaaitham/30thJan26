package inheritance1;

public class Alpha {
    private int a = 1;
    protected static int b = 2;
    int c = 3;
    public int d = 4;

    static void main(String[] args) {
        Alpha alpha = new Alpha();
        System.out.println(alpha.a);
        System.out.println(Alpha.b);
        System.out.println(alpha.c);
        System.out.println(alpha.d);
        alpha.test();
        alpha.test1();
        alpha.test2();
        alpha.test3();
    }

    private void test() {
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
