package inheritance1;

public class Beta {
    static void main(String[] args) {
        Alpha alpha = new Alpha();
        alpha.test1();
        alpha.test2();
        alpha.test3();
        System.out.println(Alpha.b);
        System.out.println(alpha.c);
        System.out.println(alpha.d);
    }
}
