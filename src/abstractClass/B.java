package abstractClass;

public abstract class B extends A { //concrete class
    static void main(String[] args) {
//B b=new B();
    }
    public void show4 () {
            System.out.println("show4 method from concrete class B");
        }
        @Override
    public void show1() {
        System.out.println("show1 method from abstract class A");
    }
    @Override
    public void show3() {
        System.out.println("show3 method from abstract class A");
    }
    public abstract void show5();
}
