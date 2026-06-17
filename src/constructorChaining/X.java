package constructorChaining;

public class X {
    int a=10;
    public X() {
        this(1);
        System.out.println("without parameter X class");

    }

    public X(int m) {
        this("name");
        System.out.println("with int parameter from X class");

        System.out.println(a);

    }

    public X(String b) {
        System.out.println("with string parameter from X class");

        System.out.println(a);
    }

    static void main(String[] args) {
        X x = new X();
    }
}
