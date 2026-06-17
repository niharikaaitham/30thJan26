package casting;

public class CastingStudy {
    static void main(String[] args) {
//      Implicit Casting

        byte a = 10; //1byte
        System.out.println(a);
        int b = a; //4bytes
        System.out.println(b);

//      Explicit Casting

        double c = a;
        System.out.println(c);
        double m = 12.123d;
        System.out.println(m);
        short n=(short) m;
        System.out.println(n);

    }
}
