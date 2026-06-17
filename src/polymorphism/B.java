package polymorphism;

public class B extends A{
    static void main(String[] args) {
A a=new A();
a.addition("hi");
a.addition();
B b=new B();
b.addition();
    }
    public void addition() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
    }

        public void addition(int a){
            System.out.println(a);
        }
        public void addition(float b){
            System.out.println(b);
        }
        public void addition(String name){
            System.out.println(name);

        }
}
