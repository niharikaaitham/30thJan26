package constructorStudy;

public class B {
    int a = 1;
    int b = 2;

    static void main(String[] args) {
        B b=new B();
        B b1=new B(5,6);
        b1.c();
        b.c();

    }

    public B() {
        int sum = a + b;
        System.out.println(a);
        System.out.println(b);

        System.out.println(sum);
    }

    public B(int x, int y) {
        a = x;
        b = y;
        System.out.println(x);
        System.out.println(y);
    }

        public void c(){
            int sum1=a+b;
            System.out.println(sum1);

        }


}
