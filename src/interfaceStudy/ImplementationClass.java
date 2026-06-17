package interfaceStudy;

public abstract class ImplementationClass implements MyInterface{
    static void main(String[] args) {
//        ImplementationClass myClass=new ImplementationClass();
//        myClass.test1();
//        myClass.test2();
//        myClass.test3();
    }
    @Override
    public void test1() {
System.out.println("interface method test1 implemented in implementation class");
    }

    @Override
    public void test2() {
        System.out.println("interface method test2 implemented in implementation class");

    }

    @Override
    public void test3() {
        System.out.println("interface method test3 implemented in implementation class");

    }
    public abstract void test4();
}

