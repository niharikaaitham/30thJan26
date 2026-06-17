package polymorphism;

public class A {
    static void main(String[] args) {
A a=new A();
a.addition();
a.addition(10);
a.addition(3.5f);
a.addition("niha");
    }
    public void addition() {
        int a = 1;
        int b = 2;
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
